// package com.ubiquity.app.entity.fashionlooks;
//
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Date;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;
// import java.util.Random;
// import java.util.Set;
//
// import org.apache.log4j.Logger;
//
// import com.google.appengine.api.modules.ModulesService;
// import com.google.appengine.api.modules.ModulesServiceFactory;
// import com.google.appengine.api.search.StatusCode;
// import com.google.appengine.api.taskqueue.QueueFactory;
// import com.google.appengine.api.taskqueue.TaskOptions;
// import com.ubiquity.common.jaxb.ecomm.EcommProductLimitedJAXB;
// import com.ubiquity.common.jaxb.ecomm.EcommerceProductJAXB;
// import com.ubiquity.common.jaxb.ecomm.EntityConstants;
// import com.ubiquity.common.jaxb.ecomm.report.StringUtils;
// import com.ubiquity.common.jaxb.stream.FashionItemEcommSmallProductJAXB;
// import com.ubiquity.common.jaxb.stream.FashionItemJAXB;
// import com.ubiquity.common.jaxb.stream.FashionLookBareJAXB;
// import com.ubiquity.common.jaxb.stream.FashionLookLimitedJAXB;
// import com.ubiquity.common.jaxb.stream.GenericStreamEntry;
// import com.ubiquity.common.jaxb.stream.StreamEcommProductJAXB;
//
/// *** Created by abhishek on 4/7/15. */
//
// public class FashionLookBO {
// private static Logger logger =
// Logger.getLogger(FashionLookBO.class.getName());
// public static final int FASHION_LOOK_SIMILAR_ITEM_MAX_COUNT = 10;
// private static EsEcommProductSearch esEcommProductSearch = new
// EsEcommProductSearch();
//
// public static int follow(Long entityId, User user) throws DataBaseException {
// Long followId = null;
// // if (!UserFollowBO.getIsEntityFollowedByUser(user.getId(), entityId))
// // {
// followId = UserFollowBO.follow(entityId, user.getId(),
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
// if (Constants.SINGLE_BOOST_MONSTER_FLAG) {
// Random randomno = new Random();
// int boostcount = 1 + randomno.nextInt(3);
// CommonUtils.loveMonsterCallForEntity(0L, entityId,
// EntityConstants.WooplrEntity.USER.getEntityType(),
// String.valueOf(boostcount));
// }
// // }
// return UserFollowBO.getFollowerCount(entityId,
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
// }
//
// public static int unfollow(Long entityId, User user) throws DataBaseException
// {
//
// Long followId = UserFollowBO.unFollow(user.getId(), entityId,
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
//
// // TODO: PMUNDHRA - To ensure that the unfollow operation succeeded,
// // check the followId return parameter. If it is null, the count must
// // not change.
// if (followId == null) {
// logger.warn("Did not find a UserFollow entry for [User: " + user.getId() + ",
// Look: " + entityId
// + "]. Aborting the unfollow operation");
// }
// // TODO: PMUNDHRA - Why adding this call again. We must be having the
// // count already. All we need to do is to decrement.
// return UserFollowBO.getFollowerCount(entityId,
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
// }
//
// public static Long saveFashionLook(FashionLook fashionLook) {
// Boolean flag = false;
// Long lookId = null;
// Long startTime = new Date().getTime();
// logger.info("Calling fashionLooksProduct saving function");
// try {
// // check for duplicate look in DB by given userid and image pid
// FashionLook look =
// FashionLookDAO.getFashionLookByUserIdAndImagePid(fashionLook.getUserId(),
// fashionLook.getOrphanImageId());
//
// if (look != null)
// return look.getId();
//
// FashionLook savedLook = FashionLookDAO.saveFashionLookDAO(fashionLook);
// if (savedLook != null) {
// flag = true;
// lookId = savedLook.getId();
// BackendUtil.callBackGroundTask(savedLook.getId(),
// EntityConstants.FASHION_LOOK, savedLook.getId(),
// EntityConstants.FASHION_LOOK, savedLook.getUserId(),
// EntityConstants.USER_TYPE);
//
// }
// // added from background task
// try {
// EntityStatisticsBO.updateEntityStatistics(savedLook.getId(),
// EntityConstants.FASHION_LOOK,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, 1);
// EntityStatisticsBO.updateEntityStatistics(fashionLook.getUserId(),
// EntityConstants.USER_TYPE,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, 1);
//
// } catch (Exception e) {
// logger.error(e);
// }
//
// User lookOwner = UserBO.getUserById(fashionLook.getUserId());
// if (FeatureConstants.newLookUserFollowNotification && savedLook != null &&
// lookOwner != null
// &&
// !EntityConstants.Gender.male.name().equalsIgnoreCase(lookOwner.getGender())
// &&
// !EntityConstants.UserStatus.SPAM.name().equalsIgnoreCase(lookOwner.getStatus())
// &&
// !EntityConstants.UserStatus.BLOCKED.name().equalsIgnoreCase(lookOwner.getStatus()))
// {
// try {
// com.google.appengine.api.taskqueue.Queue queue =
// QueueFactory.getQueue("background-task");
// ModulesService modulesService = ModulesServiceFactory.getModulesService();
// String backendAddress =
// modulesService.getVersionHostname("wooplr-backend-new",
// modulesService.getCurrentVersion());
// if (!StringUtils.isNullOrEmpty(backendAddress)) {
// queue.add(TaskOptions.Builder.withUrl("/notification-to-followers.do")
// .param("lookId", String.valueOf(savedLook.getId())).header("Host",
// backendAddress)
// .method(TaskOptions.Method.POST));
// } else {
// queue.add(TaskOptions.Builder.withUrl("/notification-to-followers.do")
// .param("lookId", String.valueOf(savedLook.getId())).header("Host",
// backendAddress)
// .method(TaskOptions.Method.POST));
// }
//
// } catch (Exception e) {
// logger.error("user object update :", e);
// }
// }
//
// } catch (DataBaseException e) {
// logger.info("Error while retriving data from database, saveFashionLook ");
// }
// Long endTime = new Date().getTime();
// System.out.println("Time taken for saveFashionLook execution : " + (endTime -
// startTime));
//
// // if(addLookToTrendingQueue(fashionLook) != null) {
// // logger.info("successfully look added to trending queue");
// // }else {
// // logger.info("look not been added to trending queue");
// // }
// // moved from background task
// CacheSupport.cacheDelete(MemcacheNamespaceConstants.NAMESPACE_USER_PROFILE_SNAPSHOT,
// fashionLook.getUserId().toString(), true);
//
// return lookId;
// }
//
// public static Long updateFashionLookCreateDate(Long lookId, Date createDate)
// {
// Long flag = null;
// try {
// flag = FashionLookDAO.updateFashionLookCreateDateDAO(lookId, createDate);
// // SearchIndexCRUDBO.create(lookId, EntityConstants.FASHION_LOOK,
// // new Date(), SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(lookId);
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionLook");
// }
// return flag;
// }
//
// public static Long updateFashionLook(Long itemId, FashionLook fashionLook) {
// Long flag = null;
// try {
// flag = FashionLookDAO.updateFashionLookDAO(itemId, fashionLook);
// if (flag != null && addLookToTrendingQueue(fashionLook) != null) {
// logger.info("successfully look added to trending queue");
// } else {
// logger.info("look not been added to trending queue");
// }
// JAXBStreamCacheManager.updateCacheStreamLook(fashionLook);
// // SearchIndexCRUDBO.create(fashionLook.getId(),
// // EntityConstants.FASHION_LOOK, new Date(),
// // SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(itemId);
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionLook");
// }
// return flag;
// }
//
// public static Long updateFashionLookText(Long itemId, FashionLook
// fashionLook, String oldLookText) {
// Long flag = 0L;
// try {
// List<String> lookTags = buildTagsFromLookText(fashionLook.getLookText());
// List<String> oldLookTags = buildTagsFromLookText(oldLookText);
//
// Set<String> tags = new HashSet<String>();
// if (fashionLook.getLookTags() != null &&
// !fashionLook.getLookTags().isEmpty()) {
// tags.addAll(fashionLook.getLookTags());
// }
// if (oldLookTags != null && !oldLookTags.isEmpty()) {
// tags.removeAll(oldLookTags);
// }
// if (lookTags != null && !lookTags.isEmpty())
// tags.addAll(lookTags);
//
// List<String> updatedlookTags = new ArrayList<String>(tags);
// flag = FashionLookDAO.updateFashionLookText(itemId,
// fashionLook.getLookText(), updatedlookTags);
//
// fashionLook.setLookTags(updatedlookTags);
// JAXBStreamCacheManager.updateCacheStreamLook(fashionLook);
// // SearchIndexCRUDBO.create(itemId, EntityConstants.FASHION_LOOK,
// // new Date(), SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(itemId);
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionLook");
// }
// return flag;
// }
//
// public static Long updateFashionLook2(Long itemId, FashionLook fashionLook) {
// Long flag = null;
// try {
// flag = FashionLookDAO.updateFashionLook(itemId, fashionLook);
// if (flag != null && addLookToTrendingQueue(fashionLook) != null) {
// logger.info("successfully look added to trending queue");
// } else {
// logger.info("look not been added to trending queue");
// }
// JAXBStreamCacheManager.updateCacheStreamLook(fashionLook);
// // SearchIndexCRUDBO.create(fashionLook.getId(),
// // EntityConstants.FASHION_LOOK, new Date(),
// // SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(itemId);
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionLook");
// }
// return flag;
// }
//
// public static void updateFashionLookTags(Long lookId, List<String> tags) {
// try {
// FashionLookDAO.updateFashionLook(lookId, tags);
// JAXBStreamCacheManager.updateCacheStreamLook(getFashionLook(lookId));
// // SearchIndexCRUDBO.create(lookId, EntityConstants.FASHION_LOOK,
// // new Date(), SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(lookId);
// } catch (DataBaseException e) {
// logger.info("Error while update tags", e);
// }
// }
//
// public static Boolean deleteFashionLook(Long lookId, Long userId) {
// Boolean resultStatus = false;
// try {
// FashionLook fashionLook = FashionLookBO.getFashionLook(lookId);
//
// if (fashionLook.getUserId().longValue() == userId.longValue()) {
//
// JAXBStreamCacheManager.invalidateFashionLookCacheKeys(lookId, userId);
//
// // Delete all associated entry where look is used
// // Delete look from collections
// ThemeCollectionBO.deleteLookFromCollection(lookId);
//
// resultStatus = FashionLookDAO.deleteFashionLookDAO(lookId);
// FashionItemBO.deleteFashionItemByLookId(lookId);
// try {
// GlobalActivityLogBO.deleteLogByActionEntityId(lookId);
// } catch (Exception e) {
// logger.error("Error occured in Global Activity for lookId:" + lookId, e);
// }
//
// FashionLookEntityIndexer fashionLookEntityIndexer = new
// FashionLookEntityIndexer();
// fashionLookEntityIndexer.deleteIndexedEntity(lookId);
//
// if (lookId != null) {
// EsEntityIndexer.FASHION_LOOKS.getEntityIndexer().deleteEntityFromIndex(lookId);
// }
//
// try {
// EntityStatisticsBO.updateEntityStatistics(lookId,
// EntityConstants.FASHION_LOOK,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, -1);
// EntityStatisticsBO.updateEntityStatistics(fashionLook.getUserId(),
// EntityConstants.USER_TYPE,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, -1);
//
// } catch (Exception e) {
// logger.error(e);
// }
//
// logger.info("Successfully called deleteFashionLook ");
// return resultStatus;
// } else {
// return false;
// }
// } catch (DataBaseException e) {
// logger.info("Error while deleteFashionLook");
// }
// return false;
// }
//
// public static Boolean deleteFashionLook(Long lookId, Long userId, Boolean
// isAdmin) {
// Boolean resultStatus = false;
// try {
// FashionLook fashionLook = FashionLookBO.getFashionLook(lookId);
//
// if (fashionLook != null) {
// if ((fashionLook.getUserId().longValue() == userId.longValue()) || isAdmin) {
//
// ThemeCollectionBO.deleteLookFromCollection(lookId);
//
// List<FashionTagItem> tagList =
// FashionLookBO.getFashionTagItemsForLookId(lookId);
// if (tagList != null) {
// for (FashionTagItem tagItem : tagList) {
// FashionItemBO.deleteFashionItem(tagItem.getId(), lookId);
// }
// }
// JAXBStreamCacheManager.invalidateFashionLookCacheKeys(lookId, userId);
//
// resultStatus = FashionLookDAO.deleteFashionLookDAO(lookId);
// try {
// GlobalActivityLogBO.deleteLogByActionEntityId(lookId);
// } catch (Exception e) {
// logger.error("Error occured in Global Activity for lookId:" + lookId, e);
// }
//
// FashionLookEntityIndexer fashionLookEntityIndexer = new
// FashionLookEntityIndexer();
// fashionLookEntityIndexer.deleteIndexedEntity(lookId);
//
// if (lookId != null) {
// EsEntityIndexer.FASHION_LOOKS.getEntityIndexer().deleteEntityFromIndex(lookId);
// }
//
// UserFollowBO.unFollow(lookId, EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
//
// try {
// EntityStatisticsBO.updateEntityStatistics(lookId,
// EntityConstants.FASHION_LOOK,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, -1);
// EntityStatisticsBO.updateEntityStatistics(fashionLook.getUserId(),
// EntityConstants.USER_TYPE,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT, -1);
//
// } catch (Exception e) {
// logger.error(e);
// }
//
// TrendingLogDAO.deleteEntityFromTrending(lookId);
// logger.info("Successfully called deleteFashionLook ");
// return resultStatus;
// } else {
// return false;
// }
// } else {
// return false;
// }
// } catch (DataBaseException e) {
// logger.info("Error while deleteFashionLook");
// }
// return false;
// }
//
// public static FashionLook getFashionLook(Long lookId) {
// FashionLook fashionLook = null;
// try {
// fashionLook = FashionLookDAO.getFashionLookById(lookId);
// logger.info("Successfully called getFashionLook ");
// } catch (DataBaseException e) {
// logger.info("Error while deleteFashionLook");
// }
// return fashionLook != null ? fashionLook : null;
// }
//
// public static Map<Long, FashionLook> getFashionLook(List<Long> lookIds) {
// try {
// return FashionLookDAO.getFashionLookById(lookIds);
// } catch (DataBaseException e) {
// logger.info("Error while deleteFashionLook");
// }
// return null;
// }
//
// public static void updateFashionLook(Long lookId, Boolean verify) {
// try {
// FashionLook fashionLook = FashionLookDAO.updateFashionLook(lookId, verify);
// JAXBStreamCacheManager.invalidateFashionLookCacheKeys(lookId,
// fashionLook.getUserId());
//
// if (fashionLook != null) {
//
// // post style miles for look creation
// if (FeatureConstants.user_challenges) {
// if (verify) {
// EntityStatisticsBO.updateEntityStatistics(fashionLook.getUserId(),
// EntityConstants.USER_TYPE,
// EntityConstants.EntityStatisticType.RECOMMENDATION_COUNT_CHALLENGES, 1);
// Map<String, String> params = new HashMap<>();
// params.put("userId", String.valueOf(fashionLook.getUserId()));
// params.put("activityType", String.valueOf(
// EntityConstants.ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue()));
// TaskEnqueueUtil.pushTask("background-task", "/user-challenges-rewards.do",
// params);
// }
// }
// }
//
// } catch (DataBaseException e) {
// logger.error("Error occurred..", e);
// }
// }
//
// public static FashionLook bindFashionObjectValues(String userTagItem, String
// curatedTagItem, String userMerchant,
// String curatedMerchant, String userBrand, String curatedBrand, Long lookId,
// Double itemRadius, int xPos,
// int yPos, String category, String subCategory, String subCategory2) {
// FashionLook FashionLook = new FashionLook();
// FashionLook.setUserTagItem(userTagItem);
//
// return FashionLook;
//
// }
//
// public static Boolean fieldValidation(FashionLook FashionLook) {
//
// return true;
// }
//
// public static List<GenericStreamEntry> getFashionLooks(Long timeStamp, Long
// pageNumber, Boolean after, Long count,
// Long loggedInUser) {
// // List<GenericStreamEntry> fashionLookGenericlist = new
// // ArrayList<GenericStreamEntry>();
//
// RestServerFilter filters = new
// RestServerFilter(RestFilterConstants.ORDERBY_TIME, null, loggedInUser, null,
// null, null, timeStamp == null ? null : timeStamp, pageNumber, count, null,
// null, null, null,
// EntityConstants.ActivityStatus.ACTIVE, after, null, null, null, null, 0.0,
// 0.0, null);
//
// List<GenericStreamEntry> streamEntries = null;
// RestStreamComponent components = new RestStreamComponent();
// RestParameters parameters = new RestParameters(filters, components);
// parameters.setVersion("v2");
// /*
// * System.out.println(
// * "ReviewJAXBUtils: started getAllReviewStream() - category = " +
// * category);
// */
// try {
// if (!parameters.getFilter().isParsed())
// RestFilterServerParser.parseFilterQualifiers(parameters.getFilter());
// } catch (Exception e) {
// logger.error(e);
// }
//
// // return GlobalStreamBO.getLooksStream(parameters);
// return GlobalStreamBO.getLooksStream_New(parameters);// added new by
// // Debasish
// }
//
// public static List<FashionLook> getFashionLookForIndexing(Long indexLevel,
// Long maxCount, Date startDate)
// throws DataBaseException {
// return FashionLookDAO.getFashionLookForIndexing(indexLevel, maxCount,
// startDate);
// }
//
// public static void updateIndexLevel(long key, long indexLevel) {
// FashionLookDAO.updateIndexLevel(key, indexLevel);
// }
//
// public static void updateIndexLevel(FashionLook entity, long indexLevel) {
// FashionLookDAO.updateIndexLevel(entity, indexLevel);
// }
//
// public static void updateIndexLevel(List<Long> ids, long indexLevel) {
// FashionLookDAO.updateIndexLevel(ids, indexLevel);
// }
//
// public static Long saveFashionItem(FashionTagItem fashionTagItem, Long
// lookId, Long productId) {
// long startTime = System.currentTimeMillis();
// Boolean flag = false;
// Long fashionItemId = 0L;
// Long fashionLooksProductId = 0L;
// logger.info("Calling fashionLooksProduct saving function");
// try {
//
// // FashionTagItem tagItem =
// // FashionItemDAO.getFashionItemByLookIdAndTagDetails(lookId,
// // fashionTagItem.getUserTagItem(),
// // fashionTagItem.getUserBrandMerchant());
//
// FashionTagItem tagItem = null;
// if (!StringUtils.isNullOrEmpty(fashionTagItem.getUserTagItem()))
// tagItem =
// FashionItemDAO.getFashionItemByLookIdAndTagName(fashionTagItem.getLooksId(),
// fashionTagItem.getUserTagItem());
// else if (!StringUtils.isNullOrEmpty(fashionTagItem.getCuratedTagItem()))
// tagItem =
// FashionItemDAO.getFashionItemByLookIdAndCuratedTagName(fashionTagItem.getLooksId(),
// fashionTagItem.getCuratedTagItem());
//
// if (tagItem != null)
// return tagItem.getId();
//
// // get the associated merchant brand name from FashionTagItem
// String merchant = fashionTagItem.getUserBrandMerchant();
// Long merchantId = fashionTagItem.getBrandOrMerchantId();
//
// ECommerceStore merchantBrand = null;
//
// if (merchantId != null && merchantId > 0L)
// merchantBrand = ECommerceStoreBO.getECommerceStoreById(merchantId);
// else if (merchant != null)
// merchantBrand = ECommerceStoreBO.getECommerceStoreByName(merchant);
// // fetch merchant details for the given name
// // ECommerceStore merchantBrand =
// // ECommerceStoreBO.getECommerceStoreByName(merchant);
// // ECommerceStore merchantByStoreId =
// // ECommerceStoreBO.getECommerceStoreById(merchantId);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// } else {
// Producer oldStore = ProducerBO.getProducerByName(merchant);
//
// if (oldStore != null)
// fashionTagItem.setLegacyId(oldStore.getId());
// }
//
// fashionItemId = FashionItemDAO.saveFashionItemDAO(fashionTagItem);
//
// if (fashionItemId != null) {
//
// logger.info("update Cache Stream Looks Tag Item for tag Item " +
// fashionTagItem.getId());
//
// JAXBStreamCacheManager.updateCacheStreamLooksTagItem(fashionTagItem.getLooksId(),
// fashionItemId, true);
//
// logger.info("callBackgroundTaskForLook " + fashionTagItem.getId());
//
// if (fashionTagItem.getBrandOrMerchantId() != null)
// callBackgroundTaskForLook(fashionItemId, fashionTagItem.getLooksId(),
// fashionTagItem.getBrandOrMerchantId());
// }
//
// // buildTagsFromTagItem(fashionTagItem);
//
// logger.info("Time taken:" + (System.currentTimeMillis() - startTime) / 1000);
//
// SearchIndexUpdateUtil.updateFashionLook(fashionTagItem.getLooksId());
//
// return fashionItemId;
//
// } catch (DataBaseException e) {
// logger.info("Error while retrieving data from database, saveFashionItem ");
// }
// return null;
// }
//
// public static List<Long> saveFashionItemBatch(List<FashionTagItem>
// fashionTagItems) {
//
// Boolean flag = false;
// Long fashionItemId = 0L;
// Long fashionLooksProductId = 0L;
// logger.info("Calling fashionLooksProduct saving function");
// try {
//
// List<Long> tagItemIds = new ArrayList<Long>();
//
// List<FashionTagItem> updatedTagItems = new ArrayList<FashionTagItem>();
//
// for (FashionTagItem fashionTagItem : fashionTagItems) {
//
// // FashionTagItem tagItem =
// //
// FashionItemDAO.getFashionItemByLookIdAndTagDetails(fashionTagItem.getLooksId(),
// // fashionTagItem.getUserTagItem(),
// // fashionTagItem.getUserBrandMerchant());
//
// FashionTagItem tagItem = null;
// if (!StringUtils.isNullOrEmpty(fashionTagItem.getUserTagItem()))
// tagItem =
// FashionItemDAO.getFashionItemByLookIdAndTagName(fashionTagItem.getLooksId(),
// fashionTagItem.getUserTagItem());
// else if (!StringUtils.isNullOrEmpty(fashionTagItem.getCuratedTagItem()))
// tagItem =
// FashionItemDAO.getFashionItemByLookIdAndCuratedTagName(fashionTagItem.getLooksId(),
// fashionTagItem.getCuratedTagItem());
//
// if (tagItem == null) {
// updatedTagItems.add(fashionTagItem);
//
// // get the associated merchant brand name from
// // FashionTagItem
// String merchant = fashionTagItem.getUserBrandMerchant();
// Long merchantId = fashionTagItem.getBrandOrMerchantId();
//
// ECommerceStore merchantBrand = null;
//
// if (merchantId != null && merchantId > 0L)
// merchantBrand = ECommerceStoreBO.getECommerceStoreById(merchantId);
// else if (merchant != null)
// merchantBrand = ECommerceStoreBO.getECommerceStoreByName(merchant);
// // fetch merchant details for the given name
// // ECommerceStore merchantBrand =
// // ECommerceStoreBO.getECommerceStoreByName(merchant);
// // ECommerceStore merchantByStoreId =
// // ECommerceStoreBO.getECommerceStoreById(merchantId);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// } else {
// Producer oldStore = ProducerBO.getProducerByName(merchant);
//
// if (oldStore != null)
// fashionTagItem.setLegacyId(oldStore.getId());
// }
// }
// // fashionItemId =
// // FashionItemDAO.saveFashionItemDAO(fashionTagItem);
// }
//
// fashionTagItems = updatedTagItems;
//
// List<FashionTagItem> tagItems =
// FashionItemDAO.saveFashionItemBatch(fashionTagItems);
//
// if (tagItems != null && tagItems.size() > 0) {
//
// tagItemIds = new ArrayList<Long>();
// for (FashionTagItem tagItem : tagItems) {
// if (tagItem.getId() != null)
// tagItemIds.add(tagItem.getId());
//
// }
// // System.out.println("update Cache Stream Looks Tag Item for
// // tag Item " + fashionTagItem.getId());
//
// if (tagItemIds.size() > 0) {
// FashionTagItem firstItem = tagItems.get(0);
//
// List<FashionItemJAXB> fashionItemJAXBs =
// FashionItemBO.convertFashionItem(tagItems);
//
// JAXBStreamCacheManager.updateCacheStreamLooksTagItemBatch(firstItem.getLooksId(),
// fashionItemJAXBs,
// true, false);
//
// // System.out.println("callBackgroundTaskForLook " +
// // fashionTagItem.getId());
// for (FashionTagItem fashionTagItem : fashionTagItems) {
// if (fashionTagItem.getBrandOrMerchantId() != null &&
// fashionTagItem.getBrandOrMerchantId() > 0L)
// callBackgroundTaskForLook(fashionTagItem.getId(),
// fashionTagItem.getLooksId(),
// fashionTagItem.getBrandOrMerchantId());
// }
//
// SearchIndexUpdateUtil.updateFashionLook(firstItem.getLooksId());
// }
// }
//
// // buildTagsFromTagItem(fashionTagItem);
//
// return tagItemIds;
//
// } catch (DataBaseException e) {
// logger.info("Error while retrieving data from database, saveFashionItem ");
// }
// return null;
// }
//
// private static void callBackgroundTaskForLook(Long tagItemId, Long looksId,
// Long merchantId) {
//
// Long actionEntityId = tagItemId;
// Long actionType = EntityConstants.FASHION_LOOK_ITEM;
// Long objectEntityId = looksId;
// Long objectEntityType = EntityConstants.FASHION_LOOK;
// Long creatorEntityId = merchantId;
// Long creatorEntityType = EntityConstants.MERCHANT_TYPE;
//
// BackendUtil.callBackGroundTask(actionEntityId, actionType, objectEntityId,
// objectEntityType, creatorEntityId,
// creatorEntityType);
//
// }
//
// private static void callBackgroundTaskForLookTagDelete(Long tagItemId, Long
// looksId, Long merchantId) {
//
// Long actionEntityId = tagItemId;
// Long actionType = EntityConstants.FASHION_LOOK_ITEM_DELETE;
// Long objectEntityId = looksId;
// Long objectEntityType = EntityConstants.FASHION_LOOK;
// Long creatorEntityId = merchantId;
// Long creatorEntityType = EntityConstants.MERCHANT_TYPE;
//
// BackendUtil.callBackGroundTask(actionEntityId, actionType, objectEntityId,
// objectEntityType, creatorEntityId,
// creatorEntityType);
//
// }
//
// private static void callBackgroundTaskForLookUpdate(Long tagItemId, Long
// looksId, Long oldMerchantId,
// Long merchantId) {
//
// Long actionEntityId = tagItemId;
// Long actionType = EntityConstants.FASHION_LOOK_ITEM_UPDATE;
// Long objectEntityId = oldMerchantId;
// Long objectEntityType = EntityConstants.FASHION_LOOK;
// Long creatorEntityId = merchantId;
// Long creatorEntityType = EntityConstants.MERCHANT_TYPE;
//
// BackendUtil.callBackGroundTask(actionEntityId, actionType, objectEntityId,
// objectEntityType, creatorEntityId,
// creatorEntityType);
//
// }
//
// public static Boolean updateFashionItem(Long itemId, FashionTagItem
// fashionTagItem) {
// Boolean flag = false;
// Boolean isMerchantSet = false;
// Boolean isMerchantChanged = false;
// String merchant = null;
// FashionTagItem oldTagItem = null;
// try {
// // check the curated merchant entry when brandOrMerchantId is not
// // set
// if (fashionTagItem.getBrandOrMerchantId() == null) {
// if (fashionTagItem.getCuratedBrandMerchant() != null ||
// fashionTagItem.getUserBrandMerchant() != null) {
//
// if (fashionTagItem.getUserBrandMerchant() != null)
// merchant = fashionTagItem.getUserBrandMerchant();
// else
// merchant = fashionTagItem.getCuratedBrandMerchant();
// // get the associated merchant brand name from
// // FashionTagItem
//
// // fetch merchant details for the given name
// ECommerceStore merchantBrand =
// ECommerceStoreBO.getECommerceStoreByName(merchant);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// isMerchantSet = true;
// }
// }
// } else {
//
// oldTagItem = FashionItemDAO.getFashionItemById(itemId);
// boolean merchantChanged = false;
//
// if
// (!fashionTagItem.getCuratedBrandMerchant().equals(oldTagItem.getCuratedBrandMerchant()))
// {
// merchant = fashionTagItem.getCuratedBrandMerchant();
// merchantChanged = true;
// } else if
// (!fashionTagItem.getUserBrandMerchant().equals(oldTagItem.getUserBrandMerchant()))
// {
// merchant = fashionTagItem.getUserBrandMerchant();
// merchantChanged = true;
// }
//
// if (merchantChanged) {
// ECommerceStore merchantBrand =
// ECommerceStoreBO.getECommerceStoreByName(merchant);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// isMerchantChanged = true;
// }
// }
// }
//
// FashionItemDAO.updateFashionItemDAO(itemId, fashionTagItem);
//
// JAXBStreamCacheManager.updateCacheStreamLooksTagItem(fashionTagItem.getLooksId(),
// itemId, true);
//
// if (isMerchantSet) {
// callBackgroundTaskForLook(itemId, fashionTagItem.getLooksId(),
// fashionTagItem.getBrandOrMerchantId());
// }
//
// if (isMerchantChanged) {
// callBackgroundTaskForLookUpdate(itemId, fashionTagItem.getLooksId(),
// oldTagItem.getBrandOrMerchantId(),
// fashionTagItem.getBrandOrMerchantId());
// }
// flag = true;
// // SearchIndexCRUDBO.create(fashionTagItem.getLooksId(),
// // EntityConstants.FASHION_LOOK, new Date(),
// // SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(fashionTagItem.getLooksId());
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionItem");
// }
// return flag;
// }
//
// public static Boolean updateFashionItemBatch(Long lookId,
// List<FashionTagItem> fashionTagItems,
// List<String> lookTags) {
// Boolean flag = false;
// Boolean isMerchantSet = false;
// Boolean isMerchantChanged = false;
// String merchant = null;
// FashionTagItem oldTagItem = null;
// List<Long> tagItemIds = new ArrayList<Long>();
// Map<Long, Boolean> merchantSetMap = new HashMap<Long, Boolean>();
// Map<Long, Boolean> merchantChangedMap = new HashMap<Long, Boolean>();
// Map<Long, Long> oldTagMerchantIdMap = new HashMap<Long, Long>();
//
// Set<String> finalTags = new HashSet<String>();
// if (lookTags != null && !lookTags.isEmpty()) {
// finalTags.addAll(lookTags);
// }
// try {
// for (FashionTagItem fashionTagItem : fashionTagItems) {
//
// Long itemId = fashionTagItem.getId();
//
// tagItemIds.add(itemId);
//
// // check the curated merchant entry when brandOrMerchantId is
// // not set
// if (fashionTagItem.getBrandOrMerchantId() == null) {
// if (fashionTagItem.getCuratedBrandMerchant() != null
// || fashionTagItem.getUserBrandMerchant() != null) {
//
// if (fashionTagItem.getUserBrandMerchant() != null)
// merchant = fashionTagItem.getUserBrandMerchant();
// else
// merchant = fashionTagItem.getCuratedBrandMerchant();
// // get the associated merchant brand name from
// // FashionTagItem
//
// // fetch merchant details for the given name
// ECommerceStore merchantBrand =
// ECommerceStoreBO.getECommerceStoreByName(merchant);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// // isMerchantSet = true;
// merchantSetMap.put(itemId, Boolean.TRUE);
// } else
// merchantSetMap.put(itemId, Boolean.FALSE);
// }
// } else {
//
// oldTagItem = FashionItemDAO.getFashionItemById(itemId);
// boolean merchantChanged = false;
//
// if (!StringUtils.isNullOrEmpty(fashionTagItem.getCuratedBrandMerchant()) &&
// oldTagItem != null
// &&
// !fashionTagItem.getCuratedBrandMerchant().equals(oldTagItem.getCuratedBrandMerchant()))
// {
// merchant = fashionTagItem.getCuratedBrandMerchant();
// merchantChanged = true;
//
// } else if (!StringUtils.isNullOrEmpty(fashionTagItem.getUserBrandMerchant())
// && oldTagItem != null
// &&
// !fashionTagItem.getUserBrandMerchant().equals(oldTagItem.getUserBrandMerchant()))
// {
// merchant = fashionTagItem.getUserBrandMerchant();
// merchantChanged = true;
// }
//
// if (oldTagItem != null && oldTagItem.getBrandOrMerchantId() != null
// && oldTagItem.getBrandOrMerchantId() > 0L)
// oldTagMerchantIdMap.put(itemId, oldTagItem.getBrandOrMerchantId());
//
// if (merchantChanged) {
// ECommerceStore merchantBrand =
// ECommerceStoreBO.getECommerceStoreByName(merchant);
//
// if (merchantBrand != null) {
// fashionTagItem.setBrandOrMerchantId(merchantBrand.getId());
// // isMerchantChanged = true;
// merchantChangedMap.put(itemId, Boolean.TRUE);
// } else
// merchantChangedMap.put(itemId, Boolean.FALSE);
// }
//
// // tags update
// if (oldTagItem != null) {
// List<String> newTags = null;
// List<String> oldTags = null;
// if (!StringUtils.isNullOrEmpty(oldTagItem.getUserTagItem())
// && !oldTagItem.getUserTagItem().equals(fashionTagItem.getUserTagItem())) {
// newTags = buildTagsFromTagItem(fashionTagItem.getUserTagItem(), null);
// if (newTags != null && !newTags.isEmpty()) {
// finalTags.addAll(newTags);
// }
// oldTags = buildTagsFromTagItem(oldTagItem.getUserTagItem(), null);
// if (oldTags != null && !oldTags.isEmpty()) {
// finalTags.removeAll(oldTags);
// }
// } else if (StringUtils.isNullOrEmpty(oldTagItem.getUserTagItem())) {
// if (!StringUtils.isNullOrEmpty(oldTagItem.getCuratedTagItem())
// &&
// !oldTagItem.getCuratedTagItem().equals(fashionTagItem.getCuratedTagItem())) {
// newTags = buildTagsFromTagItem(fashionTagItem.getCuratedTagItem(), null);
// if (newTags != null && !newTags.isEmpty()) {
// finalTags.addAll(newTags);
// }
// oldTags = buildTagsFromTagItem(oldTagItem.getCuratedTagItem(), null);
// if (oldTags != null && !oldTags.isEmpty()) {
// finalTags.removeAll(oldTags);
// }
// }
// }
// }
// }
// }
//
// if (finalTags != null && !finalTags.isEmpty())
// updateFashionLookTags(lookId, new ArrayList<String>(finalTags));
//
// FashionItemDAO.updateFashionItemBatch(fashionTagItems);
//
// List<FashionItemJAXB> fashionItemJAXBs =
// FashionItemBO.convertFashionItem(fashionTagItems);
//
// if (fashionTagItems.size() > 0)
// JAXBStreamCacheManager.updateCacheStreamLooksTagItemBatch(fashionTagItems.get(0).getLooksId(),
// fashionItemJAXBs, true, true);
//
// for (FashionTagItem fashionTagItem : fashionTagItems) {
//
// Long itemId = fashionTagItem.getId();
// if (merchantSetMap.size() > 0 && merchantSetMap.get(itemId) != null &&
// merchantSetMap.get(itemId)) {
// callBackgroundTaskForLook(itemId, fashionTagItem.getLooksId(),
// fashionTagItem.getBrandOrMerchantId());
// }
//
// if (merchantChangedMap.size() > 0 && merchantChangedMap.get(itemId) != null
// && merchantSetMap.size() > 0
// && merchantSetMap.get(itemId)) {
// callBackgroundTaskForLookUpdate(itemId, fashionTagItem.getLooksId(),
// oldTagMerchantIdMap.get(itemId), fashionTagItem.getBrandOrMerchantId());
// }
// }
// flag = true;
// if (fashionTagItems.size() > 0) {
// // SearchIndexCRUDBO.create(fashionTagItems.get(0).getLooksId(),
// // EntityConstants.FASHION_LOOK, new Date(),
// // SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// SearchIndexUpdateUtil.updateFashionLook(fashionTagItems.get(0).getLooksId());
// }
//
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionItem");
// }
// return flag;
// }
//
// public static Boolean updateFashionItemMetadata(Long lookId, String color,
// String object, String style,
// String sleeve_style, String pattern, Integer item_x, Integer item_y, Integer
// item_w, Integer item_h,
// String option1, String option2) {
//
// Long itemId = null;
// FashionTagItem item_tag = null;
// String item_color = " ", item_name = "";
// boolean addOrUpdate = false;
// // process the color strings (form multiple color separated by /
//
// class FTagItem {
//
// private Integer list_index;
// private Double match_score;
//
// public FTagItem(Integer list_index, Double match_score) {
// this.list_index = list_index;
// this.match_score = match_score;
// }
//
// public Integer getList_index() {
// return list_index;
// }
//
// public void setList_index(Integer list_index) {
// this.list_index = list_index;
// }
//
// public Double getMatch_score() {
// return match_score;
// }
//
// public void setMatch_score(Double match_score) {
// this.match_score = match_score;
// }
// }
//
// if (color != null) {
// String[] color_arr = color.split("\\-|/");
//
// item_color = (color_arr.length > 1) ? (color_arr[0] + " " + color_arr[1]) :
// color_arr[0];
// }
//
// item_name = item_color + " " + object;
//
// // find the matching items in a given look and set this metadata
// // attribute
//
// List<FashionTagItem> look_items = getFashionTagItemsForLookId(lookId);
//
// if (look_items != null && look_items.size() > 0) {
//
// Map<Long, FTagItem> item_match_score = new HashMap<Long, FTagItem>();
//
// Integer index = 0;
// for (FashionTagItem item : look_items) {
// // check which item metadata item_name matches
// String available_item = item.getUserTagItem() != null ? item.getUserTagItem()
// : item.getCuratedTagItem();
//
// item_match_score.put(item.getId(),
// new FTagItem(index, StringUtils.findSimilarity(available_item, item_name)));
//
// index++;
// }
//
// Map.Entry<Long, FTagItem> maxEntry = null;
//
// for (Map.Entry<Long, FTagItem> entry : item_match_score.entrySet()) {
// if (maxEntry == null || entry.getValue().getMatch_score() >
// maxEntry.getValue().getMatch_score()) {
// maxEntry = entry;
// }
// }
//
// if (maxEntry != null) {
// // update the corresponding tag item
// itemId = maxEntry.getKey();
// item_tag = look_items.get(maxEntry.getValue().getList_index());
// // set the meta data to given tag item
// // item_tag.setColor(color);
// // item_tag.setPattern(pattern);
// // item_tag.setStyle(style);
// // item_tag.setSleeve_style(sleeve_style);
// // item_tag.setItem_x_pos(item_x);
// // item_tag.setItem_y_pos(item_y);
// // item_tag.setItem_width(item_w);
// // item_tag.setItem_height(item_h);
// // item_tag.setOption1(option1);
// // item_tag.setOption2(option2);
//
// addOrUpdate = false;
// }
// } else {
// // create the new tag item (TODO)
// item_tag = new FashionTagItem();
// // item_tag.setColor(color);
// // item_tag.setPattern(pattern);
// // item_tag.setStyle(style);
// // item_tag.setSleeve_style(sleeve_style);
// // item_tag.setItem_x_pos(item_x);
// // item_tag.setItem_y_pos(item_y);
// // item_tag.setItem_width(item_w);
// // item_tag.setItem_height(item_h);
// // item_tag.setOption1(option1);
// // item_tag.setOption2(option2);
//
// item_tag.setUserTagItem(item_name);
//
// String searchText = item_name + " " + style + " " + pattern;
//
// FashionLook fashionLook = getFashionLook(lookId);
//
// List<EcommProductLimitedJAXB> ecommerceProductJAXBs = null;
// if (FeatureConstants.fromElasticsearch) {
// EsSearchOptions searchOptions = new EsSearchOptions();
// searchOptions.setLoggedInUserId(fashionLook.getUserId());
// List<String> searchTexts = new ArrayList<String>();
// searchTexts.add(searchText);
// searchOptions.setSearchText(searchTexts);
// searchOptions.setPageNumber(1L);
// searchOptions.setPageCount(FashionLookBO.FASHION_LOOK_SIMILAR_ITEM_MAX_COUNT);
// ecommerceProductJAXBs =
// esEcommProductSearch.searchProductLimitedJAXB(searchOptions);
// } else {
// try {
// ecommerceProductJAXBs = new
// EcommerceProductSearch().getSimilarEcommerceProduct(
// fashionLook.getUserId(), searchText, 1,
// FashionLookBO.FASHION_LOOK_SIMILAR_ITEM_MAX_COUNT,
// null, null);
// } catch (SearchException e) {
// logger.error("Error occured..", e);
// }
// }
//
// if (ecommerceProductJAXBs != null && ecommerceProductJAXBs.size() > 0) {
//
// EcommProductLimitedJAXB product = ecommerceProductJAXBs.get(0);
//
// item_tag.setBrandOrMerchantId(product.getStoreId());
// item_tag.setUserBrandMerchant(product.getStoreName());
// }
//
// addOrUpdate = true;
// }
// try {
// if (addOrUpdate)
// FashionItemDAO.saveFashionItemDAO(item_tag);
// else
// FashionItemDAO.updateFashionItem(itemId, item_tag);
//
// } catch (DataBaseException e) {
// logger.info("Error while updateFashionItem");
// return false;
// }
//
// return true;
// }
//
// public static String deleteFashionItem(Long itemId, boolean delete) {
//
// String resultStatus = StatusCode.TAG_ITEM_DELETED;
//
// FashionTagItem tagItem = null;
// try {
//
// tagItem = FashionItemBO.getFashionTagItem(itemId);
//
// // resultStatus = FashionItemBO.deleteFashionItem(itemId,
// // tagItem.getLooksId());
//
// // if (resultStatus != null) {
// // FashionLooksProductBO.deleteFashionLooksProductForGivenItemId(itemId);
// // logger.info("Successfully called deleteFashionItem ");
// // }
//
// // if (!delete && tagItem != null) {
// JAXBStreamCacheManager.updateCacheStreamLooksTagItem(tagItem.getLooksId(),
// itemId, false);
//
// // callBackgroundTaskForLookTagDelete(itemId, tagItem.getLooksId(),
// // tagItem.getBrandOrMerchantId());
// // }
//
// FashionLook fashionLook = FashionLookBO.getFashionLook(tagItem.getLooksId());
// // FashionTagItem fashionTagItem =
// // FashionLookBO.getFashionTagItem(actionEntityId);
// try {
// List<String> lookTags = fashionLook.getLookTags();
// List<String> tags = buildTagsFromTagItem(tagItem.getUserTagItem(),
// tagItem.getCuratedTagItem());
// if (lookTags != null && tags != null)
// lookTags.removeAll(tags);
//
// FashionLookDAO.updateFashionLook(fashionLook.getId(), fashionLook);
// } catch (Exception e) {
// logger.error("Error occured..", e);
// }
//
// // FashionLook look =
// // FashionLookBO.getFashionLook(fashionItem.getLooksId());
//
// logger.info("DELETING FASHION TAG ITEM:" + tagItem.getId());
// // FashionLookBO.deleteFashionItem(tagItem.getId(), true);
//
// resultStatus = FashionItemBO.deleteFashionItem(itemId, tagItem.getLooksId());
// // if (objectEntityId != null) {
// GlobalActivityLogBO.createTask_DeleteGlobalActivityLog_Update_Tag_Store_Item_FashionLook(tagItem,
// fashionLook);
// // }
//
// // SearchIndexCRUDBO.create(fashionLook.getId(),
// // EntityConstants.FASHION_LOOK, new Date(),
// // SearchUtils.SEARCH_INDEX_CRUD_UPDATE);
// if (fashionLook != null) {
// SearchIndexUpdateUtil.updateFashionLook(fashionLook.getId());
// }
//
// } catch (Exception e) {
// logger.info("Error while deleteFashionItem", e);
// resultStatus = "TAG_ITEM_FAILED";
// }
// return resultStatus;
// }
//
// private static List<String> buildTagsFromTagItem(String userTagItem, String
// curatedTagItem) {
// List<String> tags = null;
// if (!StringUtils.isNullOrEmpty(userTagItem)) {
// List<String> userTags = TagUtils.getHashTags(userTagItem);
// for (String userTag : userTags) {
// userTagItem = userTagItem.replaceAll(userTag, "");
// }
// userTags.addAll(TrendUtils.generateTrendPhrases(userTagItem));
// tags = userTags;
// } else if (!StringUtils.isNullOrEmpty(curatedTagItem)) {
// List<String> curatedTags = TagUtils.getHashTags(curatedTagItem);
// for (String curatedTag : curatedTags) {
// curatedTagItem = curatedTagItem.replaceAll(curatedTag, "");
// }
// curatedTags.addAll(TrendUtils.generateTrendPhrases(curatedTagItem));
// tags = curatedTags;
// }
// return tags;
// }
//
// public static FashionItemJAXB getFashionItem(Long itemId) {
// FashionTagItem fashionTagItem = null;
// try {
// fashionTagItem = FashionItemDAO.getFashionItemById(itemId);
// FashionItemJAXB fashionItemJAXB = new FashionItemJAXB();
// if (fashionTagItem != null) {
// fashionItemJAXB.setId(fashionTagItem.getId());
//
// // if (fashionTagItem.getUserTagItem() != null &&
// // !fashionTagItem.getUserTagItem().isEmpty())
// // fashionItemJAXB.setUserTagItem(fashionTagItem.getUserTagItem());
// // else if (fashionTagItem.getCuratedTagItem() != null &&
// // !fashionTagItem.getCuratedTagItem().isEmpty())
// // fashionItemJAXB.setUserTagItem(fashionTagItem.getCuratedTagItem());
// //
// // if (fashionTagItem.getUserBrandMerchant() != null &&
// // !fashionTagItem.getUserBrandMerchant().isEmpty())
// //
// fashionItemJAXB.setUserBrandMerchant(fashionTagItem.getUserBrandMerchant());
// // else if (fashionTagItem.getCuratedBrandMerchant() != null &&
// // !fashionTagItem.getCuratedBrandMerchant().isEmpty())
// //
// fashionItemJAXB.setUserBrandMerchant(fashionTagItem.getCuratedBrandMerchant());
// fashionItemJAXB.setUserTagItem(fashionTagItem.getUserTagItem());
// fashionItemJAXB.setCuratedTagItem(fashionTagItem.getCuratedTagItem());
// fashionItemJAXB.setLooksId(fashionTagItem.getLooksId());
// fashionItemJAXB.setUserBrandMerchant(fashionTagItem.getUserBrandMerchant());
// fashionItemJAXB.setCuratedBrandMerchant(fashionTagItem.getCuratedBrandMerchant());
// // fashionItemJAXB.setItemRadius(fashionTagItem.getItemRadius());
// // fashionItemJAXB.setItemXPos(fashionTagItem.getItem_x_pos());
// // fashionItemJAXB.setItemYPos(fashionTagItem.getItem_y_pos());
// fashionItemJAXB.setCategory(fashionTagItem.getCategory());
// fashionItemJAXB.setSubCategory(fashionTagItem.getSubCategory());
// fashionItemJAXB.setSubCategory2(fashionTagItem.getSubCategory2());
// fashionItemJAXB.setMerchantBrandId(fashionTagItem.getBrandOrMerchantId());
//
// fashionItemJAXB.setLegacyId(fashionTagItem.getLegacyId());
//
// }
// logger.info("Successfully called getFashionItem ");
// return fashionItemJAXB != null ? fashionItemJAXB : null;
// } catch (DataBaseException e) {
// logger.info("Error while getFashionItem");
// }
// return null;
// }
//
// public static FashionTagItem getFashionTagItem(Long itemId) {
//
// try {
// return FashionItemDAO.getFashionItemById(itemId);
//
// } catch (DataBaseException e) {
// logger.info("Error while getFashionItem");
// }
// return null;
// }
//
// public static List<FashionTagItem> getFashionTagItemsForLookId(Long lookId) {
//
// try {
//
// return FashionItemDAO.getFashionTagItemForLookIdDAO(lookId);
//
// } catch (DataBaseException ex) {
// logger.error("Error getting Fashion Tag Item ex = " + ex.getMessage());
// }
//
// return null;
// }
//
// public static FashionTagItem bindFashionObjectValues(Long id, String
// userTagItem, String curatedTagItem,
// String userBrandMerchant, String curatedBrandMerchant, Long
// brandOrMerchantId, Long lookId,
// Double itemRadius, Integer xPos, Integer yPos, String category, String
// subCategory, String subCategory2) {
// FashionTagItem fashionTagItem = new FashionTagItem();
// try {
// fashionTagItem.setId(id);
// fashionTagItem.setUserTagItem(userTagItem);
// fashionTagItem.setCuratedTagItem(curatedTagItem);
// fashionTagItem.setUserBrandMerchant(userBrandMerchant);
// fashionTagItem.setCuratedBrandMerchant(curatedBrandMerchant);
// fashionTagItem.setBrandOrMerchantId(brandOrMerchantId);
// fashionTagItem.setLooksId(lookId);
// fashionTagItem.setItemRadius(itemRadius);
// fashionTagItem.setItem_x_pos(xPos);
// fashionTagItem.setItem_y_pos(yPos);
// fashionTagItem.setCategory(category);
// fashionTagItem.setSubCategory(subCategory);
// fashionTagItem.setSubCategory2(subCategory2);
// if (id == null) {
// fashionTagItem.setCreateDate(new Date());
// fashionTagItem.setUpdateDate(new Date());
// } else {
// fashionTagItem.setUpdateDate(new Date());
// }
// } catch (Exception e) {
// logger.error("Error occured in bindFashionObjectValues", e);
// }
// return fashionTagItem;
//
// }
//
// public static List<FashionItemEcommSmallProductJAXB>
// getFashionItemEcommSmallProductJAXBForLookId(Long lookId) {
//
// List<FashionItemEcommSmallProductJAXB> fashionItemEcommSmallProductJAXBList =
// new ArrayList<FashionItemEcommSmallProductJAXB>();
// List<FashionLooksProduct> fashionLooksProductList = null;
//
// try {
// fashionLooksProductList =
// FashionLooksProductDAO.getFashionLookProductForLookIdDAO(lookId);
// } catch (DataBaseException e) {
// logger.info("Error while fetching data from DATABASE..");
// e.printStackTrace(System.err);
// }
//
// for (FashionLooksProduct fashionLooksProduct : fashionLooksProductList) {
//
// Long id = fashionLooksProduct.getId();
//
// List<FashionLooksProductItem> itemProdList =
// FashionLooksProductBO.getFashionLooksProductItemById(id);
// FashionItemEcommSmallProductJAXB itemProdJAXB = new
// FashionItemEcommSmallProductJAXB();
// if (itemProdList != null) {
// logger.info("list of FashionLooksProductItem found");
// itemProdJAXB.setFashionItem(fashionLooksProduct.getFashionItemId());
// int i = 0;
// for (FashionLooksProductItem itemProduct : itemProdList) {
// if (i == 3)
// break;
// EcommerceProductJAXB eCommerceProductJAXB = ECommerceProductBO
// .getECommerceProductDetails(itemProduct.getProductId());
// if (eCommerceProductJAXB != null) {
// StreamEcommProductJAXB productJAXB = ECommerceProductBO
// .convertECommerceProduct(eCommerceProductJAXB);
// i++;
// itemProdJAXB.getProductList().add(productJAXB);
// }
// }
// }
//
// fashionItemEcommSmallProductJAXBList.add(itemProdJAXB);
//
// }
// if (fashionItemEcommSmallProductJAXBList != null &&
// fashionItemEcommSmallProductJAXBList.size() > 0)
// return fashionItemEcommSmallProductJAXBList;
//
// return null;
// }
//
// public static List<FashionItemEcommSmallProductJAXB>
// getFashionItemEcommSmallProductJAXBAdded(
// List<FashionItemEcommSmallProductJAXB> itemProductJAXBList, Long lookId, Long
// tagItemId, Long productId) {
//
// // List<FashionItemEcommSmallProductJAXB>
// // fashionItemEcommSmallProductJAXBList = new
// // ArrayList<FashionItemEcommSmallProductJAXB>();
// // List<FashionLooksProductItem> fashionLooksProductItemList = null;
//
// FashionItemEcommSmallProductJAXB tagProductJAXB = null;
// FashionLooksProduct lookProduct = null;
// try {
// lookProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId, tagItemId);
// } catch (Exception e) {
// logger.info("Error while fetching data from DATABASE..");
// e.printStackTrace(System.err);
// }
//
// if (lookProduct != null) {
//
// // FashionLooksProductItem productItem =
// // FashionLooksProductBO.getFashionLooksProductItemByProductId(productId);
//
// for (FashionItemEcommSmallProductJAXB itemProductJAXB : itemProductJAXBList)
// {
//
// if (itemProductJAXB.getFashionItem().equals(tagItemId))
// tagProductJAXB = itemProductJAXB;
// }
//
// if (tagProductJAXB != null && tagProductJAXB.getProductList().size() >= 1) {
// tagProductJAXB.setProductCount(tagProductJAXB.getProductCount() + 1);
// return itemProductJAXBList;
// }
//
// logger.info("list of FashionLooksProductItem found");
// // itemProdJAXB.setFashionItem(tagItemId);
//
// EcommerceProductJAXB ecommerceProductJAXB =
// ECommerceProductBO.getECommerceProductDetails(productId);
// if (ecommerceProductJAXB != null) {
// StreamEcommProductJAXB productJAXB =
// ECommerceProductBO.convertECommerceProduct(ecommerceProductJAXB);
//
// if (tagProductJAXB != null)
// tagProductJAXB.getProductList().add(productJAXB);
// else {
// tagProductJAXB = new FashionItemEcommSmallProductJAXB();
// tagProductJAXB.setFashionItem(tagItemId);
// tagProductJAXB.getProductList().add(productJAXB);
// tagProductJAXB.setProductCount(1);
// itemProductJAXBList.add(tagProductJAXB);
//
// }
// }
// return itemProductJAXBList;
// // fashionItemEcommSmallProductJAXBList.add(itemProdJAXB);
// }
// // if (fashionItemEcommSmallProductJAXBList !=null &&
// // fashionItemEcommSmallProductJAXBList.size()>0)
// // return fashionItemEcommSmallProductJAXBList;
//
// return null;
// }
//
// public static List<FashionItemEcommSmallProductJAXB>
// getFashionItemEcommSmallProductJAXBRemoved(
// List<FashionItemEcommSmallProductJAXB> itemProductJAXBList, Long lookId, Long
// tagItemId, Long productId) {
//
// FashionItemEcommSmallProductJAXB tagProductJAXB = null;
// FashionLooksProduct lookProduct = null;
// try {
// lookProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId, tagItemId);
// } catch (Exception e) {
// logger.info("Error while fetching data from DATABASE..");
// e.printStackTrace(System.err);
// }
//
// if (lookProduct != null) {
//
// // FashionLooksProductItem productItem =
// // FashionLooksProductBO.getFashionLooksProductItemByProductId(productId);
//
// for (FashionItemEcommSmallProductJAXB itemProductJAXB : itemProductJAXBList)
// {
//
// if (itemProductJAXB.getFashionItem().equals(tagItemId)) {
// logger.info("itemProductJAXB found:" + itemProductJAXB);
// tagProductJAXB = itemProductJAXB;
// break;
// }
// }
//
// logger.info("list of FashionLooksProductItem found" + tagProductJAXB);
// // itemProdJAXB.setFashionItem(tagItemId);
// boolean deleted = false;
// if (tagProductJAXB != null) {
//
// for (Iterator<StreamEcommProductJAXB> productItr =
// tagProductJAXB.getProductList()
// .iterator(); productItr.hasNext();) {
//
// StreamEcommProductJAXB productItem = productItr.next();
//
// if (productItem.getId().equals(productId)) {
// productItr.remove();
// deleted = true;
// break;
// }
// }
// tagProductJAXB.setProductCount(tagProductJAXB.getProductCount() - 1);
//
// if (deleted) {
// // pull the next linked product entry from DB and put into
// // cache
//
// logger.info("updating tagProductJAXB to get next product");
// FashionLooksProduct looksProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId,
// tagItemId);
//
// List<FashionLooksProductItem> productList = FashionLooksProductBO
// .getFashionLooksProductItemById(looksProduct.getId());
//
// logger.info(">>>>>productList:" + productList);
// if (productList != null && productList.size() > 1) {
//
// logger.info("updating tagProductJAXB to get next product");
// FashionLooksProductItem nextProduct = productList.get(1);
//
// EcommerceProductJAXB ecommerceProductJAXB = ECommerceProductBO
// .getECommerceProductDetails(nextProduct.getProductId());
// if (ecommerceProductJAXB != null) {
// StreamEcommProductJAXB productJAXB = ECommerceProductBO
// .convertECommerceProduct(ecommerceProductJAXB);
//
// tagProductJAXB.getProductList().add(productJAXB);
// logger.info("added next product:" + productJAXB);
// }
// } else {
// // itemProductJAXBList.remove(tagProductJAXB);
// for (Iterator<FashionItemEcommSmallProductJAXB> tagProductJAXBItr =
// itemProductJAXBList
// .iterator(); tagProductJAXBItr.hasNext();) {
//
// FashionItemEcommSmallProductJAXB tagProductJAXBItem =
// tagProductJAXBItr.next();
//
// if
// (tagProductJAXBItem.getFashionItem().equals(tagProductJAXB.getFashionItem()))
// {
// tagProductJAXBItr.remove();
// }
// }
// tagProductJAXB.setProductList(null);
// // tagProductJAXB = null;
// }
// }
// // for (StreamEcommProductJAXB productJAXB :
// // tagProductJAXB.getProductList()) {
// //
// // if (productJAXB.getId().equals(productId))
// // tagProductJAXB.getProductList().remove(productJAXB);
// // }
// }
//
// logger.info("itemProductJAXBList:" + itemProductJAXBList);
// return itemProductJAXBList;
// // fashionItemEcommSmallProductJAXBList.add(itemProdJAXB);
// }
// // if (fashionItemEcommSmallProductJAXBList !=null &&
// // fashionItemEcommSmallProductJAXBList.size()>0)
// // return fashionItemEcommSmallProductJAXBList;
//
// return null;
// }
//
// public static boolean getFashionItemEcommSmallProductJAXBUpdated(
// List<FashionItemEcommSmallProductJAXB> itemProductJAXBList, Long lookId, Long
// tagItemId, Long productId) {
//
// FashionItemEcommSmallProductJAXB tagProductJAXB = null;
// int tagProductJAXBIdx = 0;
//
// for (int index = 0; index < itemProductJAXBList.size(); index++) {
//
// FashionItemEcommSmallProductJAXB itemProductJAXB =
// itemProductJAXBList.get(index);
//
// if (itemProductJAXB.getFashionItem().equals(tagItemId)) {
// tagProductJAXB = itemProductJAXB;
// tagProductJAXBIdx = index;
// break;
// }
// }
//
// logger.info("list of FashionLooksProductItem found");
// // itemProdJAXB.setFashionItem(tagItemId);
// boolean deleted = false;
// if (tagProductJAXB != null) {
//
// for (Iterator<StreamEcommProductJAXB> productItr =
// tagProductJAXB.getProductList().iterator(); productItr
// .hasNext();) {
//
// StreamEcommProductJAXB productItem = productItr.next();
//
// if (productItem.getId().equals(productId)) {
// deleted = true;
// productItr.remove();
// break;
// }
// }
//
// if (deleted) {
// EcommerceProductJAXB ecommerceProductJAXB =
// ECommerceProductBO.getECommerceProductDetails(productId);
//
// if (ecommerceProductJAXB != null && ecommerceProductJAXB.isAvailable()) {
// StreamEcommProductJAXB productJAXB = ECommerceProductBO
// .convertECommerceProduct(ecommerceProductJAXB);
// tagProductJAXB.getProductList().add(productJAXB);
// } else {
// if (tagProductJAXB.getProductCount() > 1) {
// tagProductJAXB.setProductCount(tagProductJAXB.getProductCount() - 1);
// } else {
// itemProductJAXBList.remove(tagProductJAXBIdx);
// }
// }
//
// }
// }
//
// return deleted;
//
// }
//
// public static List<FashionItemEcommSmallProductJAXB>
// getFashionItemEcommSmallProductJAXBBatchRemoved(
// List<FashionItemEcommSmallProductJAXB> itemProductJAXBList, Long lookId, Long
// tagItemId,
// List<StreamEcommProductJAXB> products) {
//
// FashionItemEcommSmallProductJAXB tagProductJAXB = null;
// FashionLooksProduct lookProduct = null;
// try {
// lookProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId, tagItemId);
// } catch (Exception e) {
// logger.info("Error while fetching data from DATABASE..");
// e.printStackTrace(System.err);
// }
//
// if (lookProduct != null) {
//
// // FashionLooksProductItem productItem =
// // FashionLooksProductBO.getFashionLooksProductItemByProductId(productId);
//
// for (FashionItemEcommSmallProductJAXB itemProductJAXB : itemProductJAXBList)
// {
//
// if (itemProductJAXB.getFashionItem().equals(tagItemId)) {
// tagProductJAXB = itemProductJAXB;
// break;
// }
// }
//
// logger.info("list of FashionLooksProductItem found");
// // itemProdJAXB.setFashionItem(tagItemId);
//
// if (tagProductJAXB != null) {
//
// loopExit: {
// for (StreamEcommProductJAXB product : products) {
//
// for (Iterator<StreamEcommProductJAXB> productItr =
// tagProductJAXB.getProductList()
// .iterator(); productItr.hasNext();) {
//
// StreamEcommProductJAXB productItem = productItr.next();
//
// if (productItem.getId().equals(product.getId())) {
// productItr.remove();
// tagProductJAXB.setProductCount(tagProductJAXB.getProductCount() - 1);
//
// break loopExit;
// }
// }
// }
// }
// }
//
// for (Iterator<FashionItemEcommSmallProductJAXB> tagItemItr =
// itemProductJAXBList.iterator(); tagItemItr
// .hasNext();) {
//
// FashionItemEcommSmallProductJAXB tagItem = tagItemItr.next();
//
// if (tagItem.getFashionItem().equals(tagItemId)) {
// tagItemItr.remove();
// break;
// }
//
// }
//
// return itemProductJAXBList;
// // fashionItemEcommSmallProductJAXBList.add(itemProdJAXB);
// }
// // if (fashionItemEcommSmallProductJAXBList !=null &&
// // fashionItemEcommSmallProductJAXBList.size()>0)
// // return fashionItemEcommSmallProductJAXBList;
//
// return null;
// }
//
// public static Long addProductLinking(Long productId, Long lookId, Long
// fashionTagId, int priority) {
//
// FashionLooksProduct fashionLooksProduct = null;
//
// try {
//
// fashionLooksProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId,
// fashionTagId);
//
// if (fashionLooksProduct == null) {
// logger.info("error occured while fetching data");
//
// fashionLooksProduct = new FashionLooksProduct();
//
// fashionLooksProduct.setLooksId(lookId);
// fashionLooksProduct.setFashionItemId(fashionTagId);
// fashionLooksProduct.setCreatedDate(new Date());
// Long looksProductId =
// FashionLooksProductBO.saveFashionLooksProduct(fashionLooksProduct);
//
// FashionLooksProductItem fashionLooksProductItem = new
// FashionLooksProductItem();
// fashionLooksProductItem.setLooksProductId(looksProductId);
// fashionLooksProductItem.setProductId(productId);
// fashionLooksProductItem.setCreateDate(new Date());
//
// if (priority > 0)
// fashionLooksProductItem.setPriority((int) (new Date().getTime()));
//
// fashionLooksProductItem.setPriority(priority);
// Long fashionLooksProductItemId = FashionLooksProductItemBO
// .saveFashionLooksProductItem(fashionLooksProductItem);
//
// if (fashionLooksProductItemId != null) {
//
// // callBackgroundTaskForItemProduct(fashionLooksProductItemId,
// // lookId,
// // fashionTagId);
// JAXBStreamCacheManager.updateCacheStreamLooksTagProductLink(lookId,
// fashionTagId, productId, true);
// }
// SearchIndexUpdateUtil.updateFashionLook(lookId);
//
// // Update the ECommerceProduct Rank
// ECommerceProductDAO.updateRank(productId, true);
//
// return fashionLooksProductItemId;
// } else {
//
// FashionLooksProductItem lookProductItem = FashionLooksProductItemBO
// .getFashionLooksProductItem(fashionLooksProduct.getId(), productId);
// if (lookProductItem == null) {
// FashionLooksProductItem fashionLooksProductItem = new
// FashionLooksProductItem();
// fashionLooksProductItem.setLooksProductId(fashionLooksProduct.getId());
// fashionLooksProductItem.setProductId(productId);
// fashionLooksProductItem.setCreateDate(new Date());
//
// if (priority > 0)
// fashionLooksProductItem.setPriority((int) (new Date().getTime()));
//
// fashionLooksProductItem.setPriority(priority);
// Long fashionLooksProductItemId = FashionLooksProductItemBO
// .saveFashionLooksProductItem(fashionLooksProductItem);
//
// logger.info("product Linking made successfully");
//
// if (fashionLooksProductItemId != null) {
//
// // callBackgroundTaskForItemProduct(fashionLooksProductItemId,
// // lookId,
// // fashionTagId);
// JAXBStreamCacheManager.updateCacheStreamLooksTagProductLink(lookId,
// fashionTagId, productId,
// true);
// }
//
// ECommerceProductDAO.updateRank(productId, true);
//
// SearchIndexUpdateUtil.updateFashionLook(lookId);
//
// return fashionLooksProductItemId;
// } else {
//
// SearchIndexUpdateUtil.updateFashionLook(lookId);
// return lookProductItem.getId();
// }
// }
//
// } catch (DataBaseException ex) {
// logger.error("Error in linking product to looks tag item", ex);
// }
//
// return null;
// }
//
// public static Boolean productUnLinking(Long lookId, Long tagItemId, Long
// productId) {
// Boolean flag = false;
// Long looksProductId = null;
// String status = null;
// FashionLooksProduct fashionLooksProduct = null;
// try {
//
// fashionLooksProduct =
// FashionLooksProductBO.getFashionLooksProductItemByTagItem(lookId, tagItemId);
//
// if (fashionLooksProduct != null) {
// // callBackgroundTaskForItemProduct(fashionLooksProductItemId,
// // lookId,
// // fashionTagId);
// JAXBStreamCacheManager.updateCacheStreamLooksTagProductLink(lookId,
// tagItemId, productId, false);
// status =
// FashionLooksProductItemBO.deleteFashionLooksProductItem(fashionLooksProduct.getId(),
// productId);
//
// List<FashionLooksProductItem> productList = FashionLooksProductItemBO
// .getFashionLooksProductItemByLookProductId(fashionLooksProduct.getId());
//
// if (productList == null || (productList != null && productList.isEmpty())) {
// // delete the looks Product Association entry
// FashionLooksProductBO.deleteFashionLooksProduct(fashionLooksProduct.getId());
// }
//
// // delete the product rank
// ECommerceProductDAO.updateRank(productId, false);
// }
// SearchIndexUpdateUtil.updateFashionLook(lookId);
// } catch (DataBaseException e) {
// logger.error(e);
// }
//
// if (status != null)
// return true;
// else
// return flag;
//
// /*
// * String deleteStatus =
// * FashionLooksProductItemBO.deleteFashionLooksProductItem(fashionItemId
// * ); if (deleteStatus == null) { logger.error(
// * "Error while storing data in FashionLooksProductItem"); return flag;
// * }
// */
//
// }
//
// public static List<FashionLook> getLooksById(List<Long> looksId) {
// if (looksId != null && looksId.size() > 0) {
// return FashionLookDAO.getFashionLooks(looksId);
// }
// return null;
// }
//
// public static void updateTrendScoreById(Long id, Double score, Date
// lastTrend) {
// Boolean status = false;
// Double trendScore = FashionLookDAO.updateTrendScoreById(id, score,
// lastTrend);
// logger.info("Creating Fashionlook in FASHIONLOOKBO uupdateTrendScoreById");
// if (Double.compare(trendScore, EntityConstants.BREAKEVENSCORE) > 0) {
// logger.info("Crossed Breakeven score");
// // createTrendingQueue(id);
// }
// }
//
// public static Long createTrendingQueue(Long id) {
// FashionLook fashionLook = FashionLookBO.getFashionLook(id);
// return createTrendingQueue(fashionLook);
// }
//
// public static Long createTrendingQueue(FashionLook look) {
// try {
// if (look != null) {
// TrendingQueue entry = TrendingQueueDAO.getTrendingQueue(look.getId());
// if (entry != null) {
// return entry.getId();
// }
//
// TrendLog logEntry = TrendingLogDAO.getTrendingLogByEntityId(look.getId());
//
// if (logEntry != null) {
// logger.info("Entity [" + look.getId() + "] is already in trending!");
// return logEntry.getId(); // Returning Trending Log ID
// }
//
// TrendingQueue trendingQueue = new TrendingQueue();
//
// trendingQueue.setUserId(look.getUserId());
// trendingQueue.setCreateDate(new Date());
// trendingQueue.setEntityCreateDate(look.getCreateDate());
// trendingQueue.setEntityId(look.getId());
// trendingQueue.setSortOrderDate(new Date());
// trendingQueue.setTimeLapsed(new Date().getTime() -
// look.getCreateDate().getTime());
// trendingQueue.setTrendScore(look.getTrendScore());
// trendingQueue.setEntityType(EntityConstants.FASHION_LOOK);
//
// User user = UserBO.getUserById(look.getUserId());
// if (user == null ||
// EntityConstants.UserStatus.SPAM.toString().equals(user.getStatus())
// || EntityConstants.UserStatus.BLOCKED.toString().equals(user.getStatus())
// || EntityConstants.Gender.male.toString().equals(user.getGender())) {
// logger.info("Looks of the User [UserId: " + user.getId() + ", Status: " +
// user.getStatus()
// + "] cannot be trended.");
// return null;
// }
//
// Long trendedUserId = look.getUserId();
// checkUserLookTrendingRecently(trendedUserId, look.getId());
//
// Long trendQueueId = TrendingQueueDAO.createTrendingQueue(trendingQueue);
// return trendQueueId;
//
// }
// } catch (DataBaseException e) {
// logger.error("Error occured while saving data into queue : ", e);
// }
// return null;
// }
//
// private static void checkUserLookTrendingRecently(Long trendedUserId, Long
// lookId) throws DataBaseException {
// long countToCheck = 5L;
// /**
// * Checking in the trending queue last "countToCheck" count. If queue
// * does not have that no of users, check in trend log also
// */
// List<TrendingQueue> alreadyQueued =
// TrendingQueueDAO.getTrendingQueueLastLooks(countToCheck);
// List<Long> existingLooks = new ArrayList<Long>();
// boolean allCheckDone = false;
// if (alreadyQueued != null) {
// for (TrendingQueue queue : alreadyQueued) {
// if (trendedUserId.equals(queue.getUserId())) {
// existingLooks.add(queue.getEntityId());
// }
// }
//
// if (alreadyQueued.size() == countToCheck) {
// allCheckDone = true;
// } else {
// countToCheck -= alreadyQueued.size();
// }
// }
// if (!allCheckDone) {
// List<Long> entityType = new ArrayList<>();
// entityType.add(EntityConstants.FASHION_LOOK);
// List<TrendLog> trendLogs = TrendingLogDAO.getTrendingLookLog(new Date(),
// true, countToCheck, 1L,
// entityType);
// if (trendLogs != null) {
// List<Long> lookIds = new ArrayList<Long>();
// for (TrendLog trendLog : trendLogs) {
// lookIds.add(trendLog.getEntityId());
// }
// List<FashionLook> trendedLooks = FashionLookBO.getLooksById(lookIds);
// for (FashionLook trendedLook : trendedLooks) {
// if (trendedUserId.equals(trendedLook.getUserId())) {
// existingLooks.add(trendedLook.getId());
// }
// }
// }
// }
//
// if (existingLooks.size() > 0) {
// String subject = "Same user looks trending consequently";
// String message = "Trended Look - www.wooplr.com/look/" + lookId;
// message += "<br/> Already trending from the same user - ";
// for (Long existingLookId : existingLooks) {
// message += " www.wooplr.com/look/" + existingLookId;
// }
//
// SearchIndexMailUtils.sendEmailTOFashionTeam(subject, message);
// }
// }
//
// public static void updateTrendScoreById(Long id, Double score) {
// Double trendScore = FashionLookDAO.updateTrendScoreById(id, score);
// logger.info("Creating Fashionlook in FASHIONLOOKBO uupdateTrendScoreById");
// if (Double.compare(trendScore, EntityConstants.BREAKEVENSCORE) > 0) {
// logger.info("Crossed Breakeven score");
// // createTrendingQueue(id);
// }
// }
//
// public static List<StreamEcommProductJAXB> getLinkedProductByTagId(Long
// tagId) {
// FashionLooksProduct fashionLooksProduct = null;
// try {
// fashionLooksProduct = FashionLookDAO.getLinkedProductId(tagId);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (fashionLooksProduct != null) {
// List<FashionLooksProductItem> fashionLooksProductItems = null;
// try {
// fashionLooksProductItems =
// FashionLookDAO.getLinkedProductIdByAssociatedId(fashionLooksProduct.getId());
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (fashionLooksProductItems != null && fashionLooksProductItems.size() > 0)
// {
//
// List<StreamEcommProductJAXB> streamEcommProductJAXBs = new
// ArrayList<StreamEcommProductJAXB>();
//
// for (FashionLooksProductItem fashionLooksProductItem :
// fashionLooksProductItems) {
// EcommerceProductJAXB ecommerceProductJAXB = ECommerceProductBO
// .getECommerceProductDetails(fashionLooksProductItem.getProductId());
// if (ecommerceProductJAXB != null) {
// StreamEcommProductJAXB streamEcommProductJAXB = ECommerceProductBO
// .convertECommerceProduct(ecommerceProductJAXB);
// streamEcommProductJAXBs.add(streamEcommProductJAXB);
// }
// }
// return streamEcommProductJAXBs;
// } else
// return null;
// } else {
// return null;
// }
// }
//
// public static List<GenericStreamEntry> getIsLinked(Boolean islinked, Long
// pageNumber, Long count, User user) {
// List<FashionLook> FashionLookList = null;
// try {
// FashionLookList = FashionLookDAO.getIsLinkedLook(islinked, pageNumber,
// count);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (FashionLookList != null && FashionLookList.size() > 0) {
// List<GenericStreamEntry> fashionLookCommonJAXBList =
// convertToLookJAXB(FashionLookList, user);
// return fashionLookCommonJAXBList;
// }
// return null;
// }
//
// public static List<GenericStreamEntry> getIsTagged(Boolean isTagged, Long
// pageNumber, Long count, User user) {
// List<FashionLook> FashionLookList = null;
// try {
// FashionLookList = FashionLookDAO.getIsTaggedLook(isTagged, pageNumber,
// count);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (FashionLookList != null && FashionLookList.size() > 0) {
// List<GenericStreamEntry> fashionLookCommonJAXBList =
// convertToLookJAXB(FashionLookList, user);
// return fashionLookCommonJAXBList;
// }
// return null;
// }
//
// public static List<GenericStreamEntry> getIsTaggedIsLinkedLook(Boolean
// isTagged, Boolean isLinked, Long pageNumber,
// Long count, User user) {
// List<FashionLook> FashionLookList = null;
// try {
// FashionLookList = FashionLookDAO.getIsTaggedIsLinkedLook(isTagged, isLinked,
// pageNumber, count);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (FashionLookList != null && FashionLookList.size() > 0) {
// List<GenericStreamEntry> fashionLookCommonJAXBList =
// convertToLookJAXB(FashionLookList, user);
// return fashionLookCommonJAXBList;
// }
// return null;
// }
//
// public static List<GenericStreamEntry>
// getIsTaggedIsLinkedIsStaffedLook(Boolean isTagged, Boolean isLinked,
// Boolean isStaffed, Long pageNumber, Long count, User user) {
// List<FashionLook> FashionLookList = null;
// try {
// FashionLookList = FashionLookDAO.getIsTaggedIsLinkedIsStaffedLook(isTagged,
// isLinked, isStaffed, pageNumber,
// count);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// if (FashionLookList != null && FashionLookList.size() > 0) {
// List<GenericStreamEntry> fashionLookCommonJAXBList =
// convertToLookJAXB(FashionLookList, user);
// return fashionLookCommonJAXBList;
// }
// return null;
// }
//
// public static List<FashionLookLimitedJAXB>
// convertToLookLimitedJAXB(List<FashionLook> fashionLookList) {
// List<FashionLookLimitedJAXB> fashionLookLimitedJAXBList = new
// ArrayList<FashionLookLimitedJAXB>();
// if (fashionLookList != null && fashionLookList.size() > 0) {
// try {
// for (FashionLook look : fashionLookList) {
// FashionLookLimitedJAXB fashionLookLimitedJAXB = new FashionLookLimitedJAXB();
// System.out.println("FashionLookJAXB : step 2222");
// fashionLookLimitedJAXB.setId(look.getId());
// fashionLookLimitedJAXB.setImage_pid(look.getOrphanImageId());
// fashionLookLimitedJAXB.setText(look.getLookText());
// fashionLookLimitedJAXB.setTags(look.getLookTags());
//
// AggregatedEntityStatistics statistics =
// EntityStatisticsBO.getEntityStatistics(look.getId(),
// EntityConstants.FASHION_LOOK, Arrays.asList("LIKES_GOT", "COMMENTS_GOT"));
//
// if (statistics != null) {
// fashionLookLimitedJAXB
// .setLoveCount(statistics.getLikesGot() == null ? 0L :
// statistics.getLikesGot());
// fashionLookLimitedJAXB.setCommentCount(
// statistics.getCommentsGot() == null ? 0L : statistics.getCommentsGot());
// }
// fashionLookLimitedJAXBList.add(fashionLookLimitedJAXB);
// }
// } catch (Exception e) {
// logger.error("Error occured", e);
// }
// }
// return fashionLookLimitedJAXBList;
// }
//
// public static List<GenericStreamEntry> convertToLookJAXB(List<FashionLook>
// fashionLookList, User user) {
// List<GenericStreamEntry> genericStreamEntryList = new
// ArrayList<GenericStreamEntry>();
// if (fashionLookList != null && fashionLookList.size() > 0) {
//
// for (FashionLook look : fashionLookList) {
// GenericStreamEntry lookStreamEntry =
// FashionLookInterface.doGetFashionLookExtendedJAXB(look.getId(),
// null, user, true);
// if (lookStreamEntry != null)
// genericStreamEntryList.add(lookStreamEntry);
// }
// return genericStreamEntryList;
// }
// return null;
// }
//
// public static Long addLookToTrendingQueue(FashionLook fashionLook) {
// if (fashionLook != null && (fashionLook.getIsLinked() != null &&
// fashionLook.getIsLinked())
// && (fashionLook.getIsTagged() != null && fashionLook.getIsTagged())
// && (fashionLook.isStaffPick() == null || !fashionLook.isStaffPick())) {
//
// if (FeatureConstants.user_challenges) {
// Map<String, String> params = new HashMap<>();
// params.put("userChallenge",
// EntityConstants.UserChallenge.LOOK_CURATED.getChallengeName());
// params.put("userId", String.valueOf(fashionLook.getUserId()));
// TaskEnqueueUtil.pushTask("background-task", "/user-challenges-rewards.do",
// params);
// }
//
// if (FeatureConstants.smartNotification && (fashionLook.getNotificationType()
// == null || !fashionLook
// .getNotificationType().contains(NotificationConstants.NotificationType.LOOK_CURATED.getValue())))
// {
// Map<String, String> params = new HashMap<String, String>();
//
// // User user = UserBO.getUserById(fashionLook.getUserId());
// params.put("userId", String.valueOf(fashionLook.getUserId()));
// params.put("targetUserId", String.valueOf(fashionLook.getUserId()));
// params.put("entityId", String.valueOf(fashionLook.getId()));
// params.put("entityType",
// NotificationConstants.EntityType.FASHION_LOOK.getValue());
// params.put("campaignKey",
// NotificationConstants.CampaignKey.FEATURED_CURATED.getValue());
// params.put("notificationType",
// NotificationConstants.NotificationType.LOOK_CURATED.getValue());
// try {
// FashionLookDAO.updateNotificationType(fashionLook.getId(),
// NotificationConstants.NotificationType.LOOK_CURATED.getValue());
// } catch (DataBaseException e) {
// logger.error("Error occcured..", e);
// }
// if (!params.isEmpty()) {
// NotificationEngineBO.addNotificationLog(params);
// }
// }
// }
// if (fashionLook != null && (fashionLook.getIsLinked() != null &&
// fashionLook.getIsLinked())
// && (fashionLook.getIsTagged() != null && fashionLook.getIsTagged())
// && (fashionLook.isStaffPick() != null && fashionLook.isStaffPick())) {
// if (FeatureConstants.smartNotification) {
// // delete look curated notifications in to be dispatched state
// List<NotificationMessage> toBeDeleted = new ArrayList<>();
// List<NotificationMessage> notificationMessages = NotificationMessageDAO
// .getMessageToBeDispatchedByEntityId(fashionLook.getId());
//
// for (NotificationMessage notificationMessage : notificationMessages) {
// if (NotificationConstants.NotificationType.LOOK_CURATED.getValue()
// .equals(notificationMessage.getNotificationType())) {
// toBeDeleted.add(notificationMessage);
// }
// }
// try {
// List<Long> notificationMessageIds = new ArrayList<>();
// for (NotificationMessage notificationMessage : toBeDeleted) {
// notificationMessageIds.add(notificationMessage.getId());
// }
// if (!notificationMessageIds.isEmpty()) {
// NotificationMessageDAO.deleteMessage(notificationMessageIds);
// }
// List<NotificationLog> notificationLogs =
// NotificationLogDAO.get(fashionLook.getId());
// if (notificationLogs != null && !notificationLogs.isEmpty()) {
// for (NotificationLog notificationLog : notificationLogs) {
// if (NotificationConstants.NotificationType.LOOK_CURATED.getValue()
// .equals(notificationLog.getNotificationType())) {
// NotificationLogDAO.delete(notificationLog.getId());
// }
// }
// }
// } catch (DataBaseException e) {
// logger.error("Error occured..", e);
// }
// }
// return createTrendingQueue(fashionLook);
// }
// return null;
// }
//
// public static List<GenericStreamEntry> getTrendingQueue(User loggedInUser,
// int pageNumber, int count) {
// try {
// List<TrendingQueue> trendingQueues =
// TrendingQueueDAO.getTrendingQueue(EntityConstants.FASHION_LOOK,
// pageNumber, count);
//
// if (trendingQueues != null) {
// List<StreamEntry> streamEntries = new ArrayList<StreamEntry>();
// for (TrendingQueue trendingQueue : trendingQueues) {
// FashionLookStreamEntry fashionlookStreamEntry = new FashionLookStreamEntry(
// trendingQueue.getEntityId(), (long) 0, trendingQueue.getTrendScore(),
// trendingQueue.getEntityCreateDate());
// streamEntries.add(fashionlookStreamEntry);
// }
// return StreamConversionUtil.convertToGenericStream(streamEntries,
// loggedInUser, "v2");
// }
// } catch (DataBaseException e) {
// logger.error("Error occured..", e);
// }
// return null;
// }
//
// public static Long deleteTrendingQueueByEntityId(Long entityId) {
// try {
// Long id = TrendingQueueDAO.deleteTrendingQueueByEntityId(entityId);
// return (id != null) ? id : null;
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// return null;
// }
//
// public static void fashionTagItemCreateDate() {
// Long maxCount = 5L;
// final Long time = 50L;
// SearchIndexTracker tracker =
// SearchIndexTrackerDAO.getRecentTracker(EntityConstants.FASHIONTAG_CREATEDATE);
// Date startTime = new Date(0);
// if (tracker != null) {
// logger.info("Old tracker found");
// startTime = tracker.getLastTimeStampProcessed();
// }
// List<FashionLook> fashionLookList = null;
// try {
// fashionLookList = FashionLookDAO.getFashionLookByCreateDate(maxCount,
// startTime);
// } catch (DataBaseException e) {
// logger.error(e);
// }
//
// if (fashionLookList != null && fashionLookList.size() > 0) {
// for (FashionLook fashionLook : fashionLookList) {
// if (fashionLook.getId() != null) {
// List<FashionTagItem> fashionTagItemList = null;
// try {
// fashionTagItemList =
// FashionItemDAO.getFashionTagItemRandomForLookIdDAO(fashionLook.getId());
// } catch (DataBaseException e) {
// logger.error(e);
// }
//
// for (int i = 0; i < fashionTagItemList.size(); i++) {
// if (fashionTagItemList.get(i) != null &&
// (fashionTagItemList.get(i).getCreateDate() == null
// || fashionTagItemList.get(i).getCreateDate().equals(""))) {
// Long timetime = fashionLook.getCreateDate().getTime() + ((i + 1L) * time);
// // fashionTagItemList.get(i).setCreateDate(new
// // Date(timetime));
//
// try {
// FashionLookDAO.updateFashionTagCreateDateDAO(fashionTagItemList.get(i).getId(),
// new Date(timetime));
// } catch (DataBaseException e) {
// logger.error(e);
// }
// }
// }
// }
// FashionLook lastfashionLook = fashionLookList.get(fashionLookList.size() -
// 1);
// if (fashionLookList != null && fashionLookList.size() > 0)
// startTime = fashionLookList.get(fashionLookList.size() - 1).getCreateDate();
//
// Long newTrackerId = SearchIndexTrackerBO.create(startTime,
// EntityConstants.FASHIONTAG_CREATEDATE, null);
// SearchIndexTrackerBO.update(newTrackerId,
// Long.valueOf(fashionLookList.size()), lastfashionLook.getId(),
// lastfashionLook.getCreateDate(), fashionLookList.get(0).getId(),
// fashionLookList.get(0).getCreateDate(), true);
// }
// }
// }
//
// public static void createLookGlobalActivity() {
//
// Long maxCount = 10L;
// SearchIndexTracker tracker = SearchIndexTrackerDAO
// .getRecentTracker(EntityConstants.LOOK_GLOBAL_ACTIVITY_CREATE);
// Date startTime = new Date(0);
// if (tracker != null) {
// logger.info("Old tracker found in createLookGlobalActivity ");
// startTime = tracker.getLastTimeStampProcessed();
// }
// List<FashionLook> fashionLookList = null;
// try {
// fashionLookList = FashionLookDAO.getFashionLookByCreateDate(maxCount,
// startTime);
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
//
// if (fashionLookList != null && fashionLookList.size() > 0) {
// for (FashionLook fashionLook : fashionLookList) {
// if (fashionLook != null && fashionLook.getId() != null) {
// GlobalActivityLog globalActivityLog = null;
// try {
// globalActivityLog = GlobalActivityLogDAO.getActivityByObjectEntityId(
// EntityConstants.ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK,
// fashionLook.getId());
// } catch (DataBaseException e) {
// e.printStackTrace();
// }
//
// if (globalActivityLog == null) {
// logger.info("creating globalActivity for fashionLook: " +
// fashionLook.getId());
// GlobalActivityLogBO.createTask_GlobalActivityLog_FashionLook(fashionLook);
// }
//
// }
// FashionLook lastfashionLook = fashionLookList.get(fashionLookList.size() -
// 1);
// if (fashionLookList != null && fashionLookList.size() > 0)
// startTime = fashionLookList.get(fashionLookList.size() - 1).getCreateDate();
//
// Long newTrackerId = SearchIndexTrackerBO.create(startTime,
// EntityConstants.LOOK_GLOBAL_ACTIVITY_CREATE,
// null);
// SearchIndexTrackerBO.update(newTrackerId,
// Long.valueOf(fashionLookList.size()), lastfashionLook.getId(),
// lastfashionLook.getCreateDate(), fashionLookList.get(0).getId(),
// fashionLookList.get(0).getCreateDate(), true);
// }
// }
// }
//
// private static List<String> buildTagsFromLookText(String fashionLookText) {
// if (!StringUtils.isNullOrEmpty(fashionLookText)) {
// logger.info("buildTagsFromLookText:" + fashionLookText);
// List<String> hashTags = TagUtils.getHashTags(fashionLookText);
//
// for (String hashTag : hashTags) {
// fashionLookText = fashionLookText.replaceAll(hashTag, "");
// }
// hashTags.addAll(TrendUtils.generateTrendPhrases(fashionLookText));
// logger.info("hashTags:" + hashTags);
// return hashTags;
// }
// return null;
// }
//
// public static int lookAutoLove(Long entityId, User user, Boolean
// notification, Boolean lookAutoLove)
// throws DataBaseException {
// Long followId = null;
// // if (!UserFollowBO.getIsEntityFollowedByUser(user.getId(), entityId))
// // {
// followId = UserFollowBO.follow(entityId, user.getId(),
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK, notification,
// lookAutoLove);
// // }
// return UserFollowBO.getFollowerCount(entityId,
// EntityConstants.FOLLOW_TYPE_FASHIONLOOK);
// }
//
// public static List<FashionLookBareJAXB> getLookServerCall(Boolean isTagged,
// Boolean islinked, Boolean isStaffed,
// Long pageNumber, Long count, Long timestamp, Boolean after, User user) {
// List<FashionLook> fashionLookList = null;
// try {
// Boolean legacy = false;
// fashionLookList = FashionLookDAO.getLookForServerCall(isTagged, islinked,
// isStaffed, pageNumber, count,
// new Date(timestamp), after, legacy);
//
// if (fashionLookList != null && fashionLookList.size() > 0) {
// List<FashionLookBareJAXB> longList = new ArrayList<FashionLookBareJAXB>();
// for (FashionLook fashionLook : fashionLookList) {
// FashionLookBareJAXB lookBareJAXB = new FashionLookBareJAXB();
// lookBareJAXB.setId(fashionLook.getId());
// lookBareJAXB.setTimestamp(fashionLook.getCreateDate().getTime());
//
// longList.add(lookBareJAXB);
// }
//
// return (longList != null && longList.size() > 0) ? longList : null;
// }
//
// } catch (DataBaseException e) {
// e.printStackTrace(System.err);
// }
// return null;
// }
//
// public static List<FashionLookBareJAXB>
// getFashionLookForUserInTimeInterval(Long userId, Long startTime,
// Long endTime, Long count) {
// Date startDate = null;
// Date endDate = null;
//
// if (startTime != null)
// startDate = new Date(startTime);
//
// if (endTime != null)
// endDate = new Date(endTime);
//
// if (startTime == null && endTime == null) {
// endDate = new Date();
// if (count == null)
// count = 10L;
// }
//
// List<FashionLook> fashionLookList = null;
// logger.info("getFashionLookForUserInTimeInterval call details :userId " +
// userId + " startTime:" + startTime
// + " endTime :" + endTime + "count :" + count);
// try {
// fashionLookList =
// FashionLookDAO.getFashionLooksByUserIdInTimeInterval(userId, startDate,
// endDate, count);
// } catch (DataBaseException e) {
// logger.error("Fetching data from DB : ", e);
// }
//
// if (fashionLookList != null && fashionLookList.size() > 0) {
// List<FashionLookBareJAXB> longList = new ArrayList<FashionLookBareJAXB>();
// for (FashionLook fashionLook : fashionLookList) {
// FashionLookBareJAXB lookBareJAXB = new FashionLookBareJAXB();
// lookBareJAXB.setId(fashionLook.getId());
// lookBareJAXB.setTimestamp(fashionLook.getCreateDate().getTime());
//
// longList.add(lookBareJAXB);
// }
// return (longList != null && longList.size() > 0) ? longList : null;
// }
//
// return null;
// }
//
// public static Boolean addBlogUrlToLook(User user, String blogUrl) {
//
// try {
//
// com.google.appengine.api.taskqueue.Queue queue =
// QueueFactory.getQueue("update-look-task");
// ModulesService modulesService = ModulesServiceFactory.getModulesService();
// String backendAddress =
// modulesService.getVersionHostname("wooplr-backend-new",
// modulesService.getCurrentVersion());
//
// logger.info("userId : " + user.getId() + " blogUrl : " + blogUrl + "
// backendAddress : " + backendAddress);
//
// if (!StringUtils.isNullOrEmpty(backendAddress)) {
// queue.add(TaskOptions.Builder.withUrl("/look-blog-setter.do")
// .param("userId", String.valueOf(user.getId())).param("blogUrl", blogUrl)
// .header("host", backendAddress).method(TaskOptions.Method.POST));
// } else {
// queue.add(TaskOptions.Builder.withUrl("/look-blog-setter.do")
// .param("userId", String.valueOf(user.getId())).param("blogUrl", blogUrl)
// .method(TaskOptions.Method.POST));
// }
//
// } catch (Exception e) {
// logger.error("user object update :", e);
// return Boolean.FALSE;
// }
// return Boolean.TRUE;
// }
// }
