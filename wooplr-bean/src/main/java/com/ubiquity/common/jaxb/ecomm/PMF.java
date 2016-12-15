/*****************************************************************************
 * Copyright (c) 2001 - 2011 Wooplr, Inc.
 * All Rights Reserverd.
 *
 * This software is confidential and proprietary information of Wooplr Inc.
 * Any reproduction of this software without prior written authorization 
 * from Wooplr Inc. is strictly prohibited.
 ****************************************************************************/

/*
 * User: Arjun
 * Date: Feb 6, 2011
 */

package com.ubiquity.common.jaxb.ecomm;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.apache.log4j.Logger;

public final class PMF {
	private static PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");
	private static final Logger logger = Logger.getLogger(PMF.class);

	// static {
	// PrivateKey privateKey = null;
	// try {
	//
	// privateKey =
	// SecurityUtils.loadPrivateKeyFromKeyStore(SecurityUtils.getPkcs12KeyStore(),
	// PMF.class.getClassLoader().getResourceAsStream("woopler100-05412cb5ff21.p12"),
	// "notasecret", "privatekey", "notasecret");
	//
	// } catch (GeneralSecurityException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// RemoteApiOptions remoteApiOptions = new RemoteApiOptions()
	// .server("woopler100.appspot.com",
	// 443).useServiceAccountCredential("woopler100@appspot.gserviceaccount.com",
	// privateKey);
	// RemoteApiInstaller remoteApiInstaller = new RemoteApiInstaller();
	// try {
	// remoteApiInstaller.install(remoteApiOptions);
	// } catch (Exception ex) {
	// logger.error("Error occured..", ex);
	// }
	//
	// pmfInstance =
	// JDOHelper.getPersistenceManagerFactory("transactions-optional");
	// }

	private static final java.lang.Class[] classes = new java.lang.Class[] { /*
																				 * User
																				 * .
																				 * class,
																				 * UserRole
																				 * .
																				 * class,
																				 * Producer
																				 * .
																				 * class,
																				 * Attribute
																				 * .
																				 * class,
																				 * //
																				 * ProducerReview
																				 * .
																				 * class,
																				 * ProducerProduct
																				 * .
																				 * class,
																				 * ProducerProductReview
																				 * .
																				 * class,
																				 * UserFollow
																				 * .
																				 * class,
																				 * //
																				 * UserEntityRelation
																				 * .
																				 * class,
																				 * UserFollow
																				 * .
																				 * class,
																				 * //
																				 * RecommendationShare
																				 * .
																				 * class,
																				 * RecommendationText
																				 * .
																				 * class,
																				 * Contact
																				 * .
																				 * class,
																				 * DataSourceEntity
																				 * .
																				 * class,
																				 * //
																				 * FMRecommendation
																				 * .
																				 * class,
																				 * FMUser
																				 * .
																				 * class,
																				 * FMProducer
																				 * .
																				 * class,
																				 * //
																				 * FMProduct
																				 * .
																				 * class,
																				 * ConsumerToken
																				 * .
																				 * class,
																				 * AccessToken
																				 * .
																				 * class,
																				 * ProducerBranch
																				 * .
																				 * class,
																				 * //
																				 * AggregatedEntityStatistics
																				 * .
																				 * class,
																				 * 
																				 * RecommendationBlobImage
																				 * .
																				 * class,
																				 * ProducerBlobImage
																				 * .
																				 * class,
																				 * ProducerProductBlobImage
																				 * .
																				 * class,
																				 * DealBlobImage
																				 * .
																				 * class,
																				 * AttributeBlobImage
																				 * .
																				 * class,
																				 * UserBlobImage
																				 * .
																				 * class
																				 */ }; // add
																					// the
																					// classes
																					// which
																					// have
																					// to
																					// be
																					// included
																					// in
																					// the
																					// caching
																					// mechanism.

	private PMF() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}

	public static PersistenceManager getNonTxnPm() {
		PersistenceManager pm = pmfInstance.getPersistenceManager();
		// pm.addInstanceLifecycleListener(new CacheMgmtLifecycleListener(),
		// classes);
		return pm;
	}

	public static PersistenceManager getTxnPm() {
		PersistenceManager pm = pmfInstance.getPersistenceManager();
		// pm.addInstanceLifecycleListener(new CacheMgmtTxnLifecycleListener(),
		// classes);
		return pm;
	}
}
