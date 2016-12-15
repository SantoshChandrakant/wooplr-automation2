/*****************************************************************************

 ****************************************************************************/

/*
 * User: Arjun
 * Date: May 5, 2011
 */

package com.ubiquity.app.entity.fashionlooks;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.cache.CacheException;

import org.apache.log4j.Logger;

import com.google.appengine.api.memcache.Expiration;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceException;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.ubiquity.common.jaxb.ecomm.EntityConstants;

public class CacheSupport {
	/**
	 * Comment *
	 */

	static final Logger logger = Logger.getLogger(CacheSupport.class);

	// nameSpace will allow to partition the cache - for JDOs, wepages , tags
	// etc.

	private static MemcacheService cacheInit(String nameSpace) {
		MemcacheService memcache = MemcacheServiceFactory.getMemcacheService(nameSpace);
		return memcache;
	}

	public static Object cacheGet(String nameSpace, Object id) {
		MemcacheService memcache = cacheInit(nameSpace);
		return memcache.get(id);
	}

	public static Map<? extends Serializable, Object> cacheGetAll(String nameSpace, List idList) {
		MemcacheService memcache = cacheInit(nameSpace);
		return memcache.getAll(idList);
	}

	public static void cacheDelete(String nameSpace, Object id, Boolean toRedis) {

		MemcacheService memcache = cacheInit(nameSpace);
		System.out.println("Deleting from Memcache - Step 1 ");
		memcache.delete(id);

		// if(toRedis){
		// System.out.println("Deleting from Redis - Step 2 ");
		// RedisCacheManager.deleteRedisCacheKey(nameSpace+"_"+id);
		// }
	}

	public static void cacheDeleteAll(String nameSpace, List ids, Boolean toRedis) {

		MemcacheService memcache = cacheInit(nameSpace);
		System.out.println("Deleting from Memcache - Step 1 ");
		memcache.deleteAll(ids);

		// if(toRedis){
		// System.out.println("Deleting from Redis - Step 2 ");
		// RedisCacheManager.deleteRedisCacheKey(nameSpace+"_"+id);
		// }
	}

	public static void cachePurge(String nameSpace) {
		MemcacheService memcache = cacheInit(nameSpace);
		// memcache.clearAll();
	}

	public static void cachePutExp(String nameSpace, Object id, Serializable o, long exp, Boolean toRedis)
			throws CacheException {
		MemcacheService memcache = cacheInit(nameSpace);
		try {
			// System.out.println("Putting into Cache namesapce = " + nameSpace
			// + " id " + id + " object = " + o + " expiration= " + exp);
			if (exp > 0L) {
				memcache.put(id, o, Expiration.onDate(new Date(new Date().getTime() + exp)));
			} else {
				memcache.put(id, o, Expiration
						.onDate(new Date(new Date().getTime() + Long.valueOf(EntityConstants.CACHE_TIME_OUT))));
			}
		} catch (MemcacheServiceException e) {
			logger.error("Exception caught", e);
			// throw new CacheException(Status.CONNECTOR_ERROR_INTERNAL,
			// StatusCode.PRODUCT_PERSISTENCE_FAILED, e);
		} catch (Exception e) {
			logger.error("Exception caught", e);
			// throw new CacheException(Status.CONNECTOR_ERROR_INTERNAL,
			// StatusCode.PRODUCT_PERSISTENCE_FAILED, e);
		}

	}

	public static void cachePutExp(String namespace, Map<String, Serializable> objMap, long exp) throws CacheException {
		MemcacheService memcache = cacheInit(namespace);
		try {
			System.out.println("Putting into Cache " + objMap + " expiration= " + exp);
			if (exp > 0L) {
				memcache.putAll(objMap, Expiration.onDate(new Date(new Date().getTime() + exp)));
			} else {
				memcache.putAll(objMap);
			}
		} catch (MemcacheServiceException e) {
			logger.error("Exception caught", e);
			// throw new CacheException(Status.CONNECTOR_ERROR_INTERNAL,
			// StatusCode.PRODUCT_PERSISTENCE_FAILED, e);
		} catch (Exception e) {
			logger.error("Exception caught", e);
			// throw new CacheException(Status.CONNECTOR_ERROR_INTERNAL,
			// StatusCode.PRODUCT_PERSISTENCE_FAILED, e);
		}

	}

	public static void cachePut(String nameSpace, Object id, Serializable o, Boolean toRedis) throws CacheException {
		cachePutExp(nameSpace, id, o, EntityConstants.CACHE_TIME_OUT, toRedis);
	}

	public static void cachePut(String nameSpace, Object id, Serializable o, long expirationInMillis, Boolean toRedis)
			throws CacheException {
		cachePutExp(nameSpace, id, o, expirationInMillis, toRedis);
	}

}
