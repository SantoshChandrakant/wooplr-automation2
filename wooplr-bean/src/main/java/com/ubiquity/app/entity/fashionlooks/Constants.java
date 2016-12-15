package com.ubiquity.app.entity.fashionlooks;

import java.util.ArrayList;
import java.util.HashSet;

public class Constants {
	public static final Long GUEST_USERID = 5223514000850944L;
	public static final Long STAGING_GUEST_USERID = 5831004933586944L;
	public static final String USER_GLOBAL_PASSWORD = "WooplrCurators123";
	public static final String SEARCH_CURSOR = "SEARCH_CURSOR";
	public static final Double INVALID_LAT = 0.0;
	public static final Double INVALID_LONG = 0.0;
	public static final int SHARD_COUNT = 20;
	public static final int COUNT_DEFAULT = 0;
	public static final int PEOPLE_TO_FOLLOW_DEFAULT = 4;
	public static final Long INVALID_LONG_ID = -1L;
	public static final Long ADMIN_ID = 193535L;
	public static final int NOTIFICATION_VIEW_COUNT = 20;
	public static final String invalid_id = "invalid_id";
	public static final String active = "a";
	public static final String pending = "p";
	public static final String space = " ";
	public static final String slash = "/";
	public static final String YES = "YES";
	public static final String NO = "NO";
	public static final Long ADMIN_STORE_ID = 100L;

	public static final String FREQUENCY_DAILY = "DAILY";
	public static final String FREQUENCY_DYNAMIC = "DYNAMIC";
	public static final String FREQUENCY_WEEKLY = "WEEKLY";

	// Sponsored Review
	public static final String PERMISSION = "PERMISSION";
	public static final String PRODUCER_BUZZ = "PRODUCER_BUZZ";
	public static final String PRODUCT_BUZZ = "BUZZ";
	public static final String BUZZ = "BUZZ";
	public static final String SELF = "SELF";
	public static final String LANDING_PAGE_SUGGESTION = "LANDING_PAGE_SUGGESTION";

	// PageView ENTITY TYPE
	public static String ENTITY_TYPE_DEAL = "DEAL_DETAIL";
	public static String ENTITY_TYPE_PRODUCT = "PRODUCT_DETAIL";
	public static String ENTITY_TYPE_REVIEW = "REVIEW_DETAIL";

	public static final long STREAM_COUNT = 16L;
	public static final long CART_PRODUCT_COUNT = 3L;
	public static final long MAX_COUNT = 1000L;
	public static final long BATCH_COUNT = 100L;
	public static final long MOBILE_STREAM_COUNT = 6L;
	public static final long MULTISOURCED_STREAM_COUNT = 3L;

	public static final long CATEGORY_FOOD = 0x0001;
	public static final long CATEGORY_ELECTRONICS = 0x0001;
	public static final long CATEGORY_CLOTHING = 0x0001;
	public static final long CATEGORY_BEAUTY = 0x0001;
	public static final long CATEGORY_TRAVEL = 0x0001;
	public static final long CATEGORY_SPORTS = 0x0001;
	public static final long CATEGORY_BOOKS = 0x0001;
	public static final long CATEGORY_MUSIC = 0x0008;
	public static final long CATEGORY_GAMES = 0x009;

	// public static final String BASE_URI;
	public static final String BASE_URI_LOCAL = "http://localhost:8080";
	public static final String BASE_URI_STAGING = "https://woopler100.appspot.com";
	public static final String BASE_URI_PRODUCTION = "https://www.wooplr.com";

	// public static final String USER_SHORT = "U";
	public static final String SYSTEM = "SYSTEM";
	public static final String USER = "USER";
	public static final String SELLER = "SELLER";
	public static final String WOOPLR = "WOOPLR";
	public static final String ECOMM_USER = "ECOMM_USER";
	public static final String BRANCH = "BRANCH";
	// public static final String USER_BADGE_SHORT = "U_B";
	public static final String USER_BADGE = "USER_BADGE";
	// public static final String USER_REWARD_SHORT = "U_R";
	public static final String USER_REWARD = "USER_REWARD";
	// public static final String PRODUCER_REVIEW_SHORT = "PR_RV";
	public static final String PRODUCER_REVIEW = "PRODUCER_REVIEW";
	public static final String SHARED_REVIEW = "SHARED_REVIEW";
	// public static final String DEAL_REVIEW_SHORT = "D_RV";
	public static final String DEAL_REVIEW = "DEAL_REVIEW";
	// public static final String PRODUCER_PRODUCT_SHORT = "PRPT";
	public static final String PRODUCER_PRODUCT = "PRODUCER_PRODUCT";
	public static final String PRODUCER_BRANCH = "PRODUCER_BRANCH";
	// public static final String PRODUCT_SHORT = "PT";
	public static final String PRODUCT = "PRODUCT";
	// public static final String DEAL_SHORT = "D";
	public static final String DEAL = "DEAL";
	// public static final String REWARD_SHORT = "R";
	public static final String REWARD = "REWARD";
	// public static final String REVIEW_SHORT = "RV";
	public static final String REVIEW = "REVIEW";
	public static final String RECOMMENDATION = "RECOMMENDATION";
	public static final String LOOK = "LOOK";
	public static final String ECOMM_STORE = "STORE";
	// public static final String BADGE_SHORT = "B";
	public static final String BADGE = "BADGE";
	// public static final String SMS_SHORT = "SMS";
	public static final String SMS = "SMS";
	// public static final String PRODUCER_PRODUCT_REVIEW_SHORT = "PR_PT_RV";
	public static final String PRODUCER_PRODUCT_REVIEW = "PRODUCER_PRODUCT_REVIEW";
	public static final String FASHION_LOOK = "FASHION_LOOK";
	public static final String COLLECTION = "COLLECTION";
	public static final String COLLECTION_EXTENDED = "COLLECTION_EXTENDED";
	public static final String FASHION_LOOK_EXTENDED = "FASHION_LOOK_EXTENDED";
	public static final String USER_BOARD = "USER_BOARD";
	public static final String USER_BOARD_EXTENDED = "USER_BOARD_EXTENDED";
	public static final String USER_ADDED_REVIEW_TO_BOARD = "USER_ADDED_REVIEW_TO_BOARD";
	public static final String PRODUCER_PRODUCT_REVIEW_EXTENDED = "PRODUCER_PRODUCT_REVIEW_EXTENDED";
	public static final String ECOMM_PRODUCT = "ECOMM_PRODUCT";
	public static final String COLLEGE_CAMPUS = "COLLEGE_CAMPUS";
	public static final String SEARCH_METADATA = "SEARCH_METADATA";
	public static final String CONTENT = "CONTENT";
	public static final String COLLATE_API = "COLLATE_API";
	public static final String CAMPAIGN = "CAMPAIGN";
	public static final String GROUP = "GROUP";
	public static final String APPCARDS = "APPCARDS";
	public static final String RESELLER = "RESELLER";

	public static final String REACTION = "REACTION";
	public static final String ECOMM_ORDER_TRANSACTION = "ECOMM_ORDER_TRANSACTION";

	public static final String VOTECARD = "VOTECARD";
	public static final String ECOMM_ORDER = "ECOMM_ORDER";
	public static final String FLIPPING_CARD = "FLIPPING_CARD";
	public static final String ECOMM_CUSTOMER = "ECOMM_CUSTOMER";
	public static final String ECOMM_SETTLEMENT_LOG = "ECOMM_SETTLEMENT_LOG";
	public static final String ECOMM_EARNING_LOG = "ECOMM_EARNING_LOG";

	public static final String APPLICATION_PROPERTY = "APPLICATION_PROPERTY";

	public static final String ECOMM_PRODUCT_IMAGE = "PRODUCT";
	public static final String STORE_IMAGE = "PRODUCER";
	public static final String GUIDE = "GUIDE";
	public static final String STORY = "STORY";

	public static final String ECOMMERCE_PRODUCT = "ECOMMERCE_PRODUCT";
	public static final String ECOMMERCE_PRODUCT_FULL = "ECOMMERCE_PRODUCT_FULL";
	public static final String ECOMMERCE_STORE = "ECOMMERCE_STORE";
	// public static final String PRODUCER_PRODUCT_LIKE =
	// "PRODUCER_PRODUCT_LIKE";
	// public static final String PRODUCER_PRODUCT_COMMENT =
	// "PRODUCER_PRODUCT_COMMENT";
	// public static final String PRODUCER_PRODUCT_FOLLOW =
	// "PRODUCER_PRODUCT_COMMENT";

	// public static final String PRODUCER_SHORT = "PR";
	public static final String PRODUCER = "PRODUCER";
	public static final String PRODUCER_STORE = "PRODUCER_STORE";
	// public static final String PRODUCT_REVIEW_SHORT = "PT_RV";
	public static final String PRODUCT_REVIEW = "PRODUCT_REVIEW";
	// public static final String USER_FOLLOW_PRODUCER_SHORT = "U_F_PR";
	public static final String USER_FOLLOW_PRODUCER = "USER_FOLLOW_PRODUCER";
	// public static final String USER_FOLLOW_PRODUCT_SHORT = "U_F_PT";
	public static final String USER_FOLLOW_PRODUCER_PRODUCT = "USER_FOLLOW_PRODUCT";
	// public static final String USER_FOLLOW_PRODUCER_REVIEW_SHORT =
	// "U_F_PR_RV";
	public static final String USER_FOLLOW_PRODUCER_REVIEW = "USER_FOLLOW_PRODUCT_REVIEW";
	public static final String USER_RERECOMMEND_PRODUCER_REVIEW = "USER_RERECOMMEND_PRODUCER_REVIEW";

	public static final String USER_COMMENT_PRODUCER_REVIEW = "USER_COMMENT_PRODUCER_REVIEW";
	public static final String USER_COMMENT_PRODUCER_REVIEW_SECOND_DEGREE = "USER_COMMENT_PRODUCER_REVIEW_SECOND_DEGREE";
	public static final String USER_COMMENT_PRODUCERPRODUCT_REVIEW = "USER_COMMENT_PRODUCERPRODUCT_REVIEW";
	public static final String USER_COMMENT_FASHIONLOOK = "USER_COMMENT_FASHIONLOOK";
	public static final String USER_COMMENT_PRODUCERPRODUCT_REVIEW_SECOND_DEGREE = "USER_COMMENT_PRODUCERPRODUCT_REVIEW_SECOND_DEGREE";
	public static final String USER_COMMENT_PRODUCERPRODUCT_REVIEW_SECOND_DEGREE_SRT = "USER_COMMENT_REVIEW_2LVL";
	public static final String USER_COMMENT_FASHIONLOOK_SECOND_DEGREE_SRT = "USER_COMMENT_REVIEW_2LVL";
	public static final String USER_CHAT_PRODUCER = "USER_CHAT_PRODUCER";
	public static final String PRODUCER_CHAT_USER = "PRODUCER_CHAT_USER";
	// public static final String USER_FOLLOW_PRODUCERPRODUCT_REVIEW_SHORT =
	// "U_F_PRPT_RV";
	public static final String USER_FOLLOW_PRODUCERPRODUCT_REVIEW = "USER_FOLLOW_PRODUCERPRODUCT_REVIEW";
	public static final String USER_FOLLOW_FASHIONLOOK = "USER_FOLLOW_FASHIONLOOK";
	public static final String USER_RERECOMMEND_PRODUCERPRODUCT_REVIEW = "USER_RERECOMMEND_PRODUCERPRODUCT_REVIEW";
	// public static final String USER_FOLLOW_DEAL_REVIEW_SHORT = "U_F_D_RV";
	public static final String USER_FOLLOW_DEAL_REVIEW = "USER_FOLLOW_DEAL_REVIEW";
	// public static final String USER_FOLLOW_USER_SHORT = "U_F_U";
	public static final String USER_FOLLOW_USER = "USER_FOLLOW_USER";
	public static final String USER_FOLLOW_PRIVATE_USER = "USER_FOLLOW_PRIVATE_USER";
	public static final String USER_FOLLOW_USER_REQUEST = "USER_FOLLOW_USER_REQUEST";
	public static final String USER_ALLOWFOLLOW_USER = "USER_ALLOWFOLLOW_USER";
	// public static final String USER_FOLLOW_TAG_SHORT = "U_F_T";
	public static final String USER_FOLLOW_TAG = "USER_FOLLOW_TAG";
	// public static final String USER_FOLLOW_DEAL_SHORT = "U_F_D";
	public static final String USER_FOLLOW_DEAL = "USER_FOLLOW_DEAL";
	public static final String ATTRIBUTE_SHORT = "A";
	public static final String ATTRIBUTE = "ATTRIBUTE";
	public static final String CURATOR = "CURATOR";
	public static final String USER_FOLLOW_COLLECTION = "USER_FOLLOW_COLLECTION";
	public static final String USER_ADD_PRODUCT_COLLECTION = "USER_ADD_PRODUCT_COLLECTION";
	public static final String USER_ADD_PRODUCT_COLLECTION_NOTIFY_COLLECTION_OWNER = "USER_ADD_PRODUCT_COLLECTION_NOTIFY_COLLECTION_OWNER";
	public static final String CREATE_COLLECTION_NOTIFY_FOLLOWERS = "CREATE_COLLECTION_NOTIFY_FOLLOWERS";

	public static final String USER_FOLLOW_REVIEW_JAXB = "USER_FOLLOW_REVIEW_JAXB";
	public static final String USER_FOLLOW_LOOK_JAXB = "USER_FOLLOW_LOOK_JAXB";
	public static final String USER_FOLLOW_CONTENT_JAXB = "USER_FOLLOW_CONTENT_JAXB";
	public static final String USER_FOLLOW_COLLECTION_JAXB = "USER_FOLLOW_COLLECTION_JAXB";
	public static final String USER_LOOK_TRENDING = "USER_LOOK_TRENDING";

	public static final Long NEW_ARRIVAL_COLLETION_ID_STAGING = 5018038370828288L;
	public static final Long NEW_ARRIVAL_COLLETION_ID_PRODUCTION = 6202407095894016L;
	public static final long NEW_ARRIVALS_EXPIRY_PERIOD = 10080;

	// Notification Type
	public static final String ACTION_TYPE = "ACTION_TYPE";
	public static final String EMAIL_TYPE = "EMAIL_TYPE";
	public static final String POINT_TYPE = "POINT_TYPE";
	public static final String REVIEW_TYPE = "REVIEW_TYPE";
	public static final String SUGGESTION_TYPE = "SUGGESTION_TYPE";
	public static final String LIKE_SUBTYPE = "LIKE_SUBTYPE";
	public static final String FOLLOW_SUBTYPE = "FOLLOW_SUBTYPE";

	public static final Long BIG_NUMBER = (long) 99999999;

	public static final long USER_CREATE_EVENT = 0x1001;
	public static final long USER_FOLLOW_EVENT = 0x1002;
	public static final long USER_REVIEW_EVENT = 0x1003;
	public static final long USER_VIEW_EVENT = 0x1004;
	public static final long USER_BUZZ_EVENT = 0x1005;
	public static final long USER_SHARE_EVENT = 0x1006;
	public static final long USER_TRIED_EVENT = 0x1007;
	public static final long USER_WISH_EVENT = 0x1008;
	public static final long USER_COMMENT_EVENT = 0x1009;
	public static final long USER_LOOK_EVENT = 0x1010;
	public static final long USER_COLLECTION_EVENT = 0x1011;

	public static final long TREND_PERIOD_MILLISECS = 30000;

	public static double BUZZ_RATIO = .06;
	public static double REVIEW_RATIO = .1;
	public static double LOOK_RATIO = .1;
	public static double FOLLOW_RATIO = .1;
	public static double SHARE_RATIO = .1;
	public static double COMMENT_RATIO = .1;
	public static double TRIED_RATIO = .05;
	public static double WISH_RATIO = .05;
	public static double VIEW_RATIO = .001;

	public static String ORDERBY_TIME = "time";
	public static final long VERY_OLD_TIME = 99999999;

	// Header Tab
	public static final String ADMIN_HEADER_MANAGE = "MANAGE";
	public static final String ADMIN_HEADER_SELECTED = "SELECTED";
	public static final String ADMIN_HEADER_DEAL = "DEAL";
	public static final String ADMIN_HEADER_REVIEW = "REVIEW";

	public static final String ADMIN_HEADER_USER = "USER";
	public static final String ADMIN_HEADER_PRODUCER = "PRODUCER";
	public static final String ADMIN_HEADER_POLICY = "POLICY";
	public static final String ADMIN_HEADER_FEATURES = "FEATURES";
	public static final String ADMIN_HEADER_SUGGESTION = "SUGGESTION";
	public static final String ADMIN_HEADER_TAGS = "TAGS";
	public static final String ADMIN_HEADER_POINTS = "POINTS";

	public static final String ADMIN_PANEL_USERS_MANAGE = "MANAGE_USERS";
	public static final String ADMIN_PANEL_USERS_INVITES = "INVITES";
	public static final String ADMIN_PANEL_USERS_BULK_INVITES = "BULK_INVITES";
	public static final String ADMIN_PANEL_USERS_BADGES = "BADGES";
	public static final String ADMIN_PANEL_USERS_ROLES = "ROLES";
	public static final String ADMIN_PANEL_USERS_INFLUENCERS = "INFLUENCERS";
	public static final String ADMIN_PANEL_USERS_ADD_BADGE = "ADD_BADGE";
	public static final String ADMIN_PANEL_USERS_ADD_ROLE = "ADD_ROLE";
	public static final String ADMIN_PANEL_USERS_EDIT_BADGE = "EDIT_BADGE";
	public static final String ADMIN_PANEL_USERS_EDIT_ROLE = "EDIT_ROLE";
	public static final String ADMIN_PANEL_INFLUENCERS_MANAGE = "INFLUENCERS";

	public static final String ADMIN_PANEL_PRODUCERS_ADD_PRODUCER = "ADD_PRODUCER";
	public static final String ADMIN_PANEL_PRODUCERS_MANAGE_PRODUCERS = "MANAGE_PRODUCERS";
	public static final String ADMIN_PANEL_PRODUCERS_EDIT_PRODUCER = "EDIT_PRODUCER";
	public static final String ADMIN_PANEL_PRODUCERS_CONNECT_ACCOUNTS = "CONNECT_ACCOUNTS";

	public static final String ADMIN_PANEL_TAGS_ADD_TAG = "ADD_TAG";
	public static final String ADMIN_PANEL_TAGS_MANAGE_TAGS = "MANAGE_TAGS";
	public static final String ADMIN_PANEL_TAGS_EDIT_TAG = "EDIT_TAG";

	public static final String ADMIN_PANEL_SUGGESTIONS_ADD_SUGGESTION = "ADD_SUGGESTION";
	public static final String ADMIN_PANEL_SUGGESTIONS_MANAGE_SUGGESTIONS = "MANAGE_SUGGESTIONS";
	public static final String ADMIN_PANEL_SUGGESTIONS_EDIT_SUGGESTION = "EDIT_SUGGESTION";

	public static final String ADMIN_PANEL_POINTS_ADD_POINT = "ADD_POINT";
	public static final String ADMIN_PANEL_POINTS_MANAGE_POINTS = "MANAGE_POINTS";
	public static final String ADMIN_PANEL_POINTS_EDIT_POINT = "EDIT_POINT";

	public static final String HEADER_ACTIVITY = "ACTIVITY";
	public static final String HEADER_LEADERBOARD = "LEADERBOARD";

	// User Profile
	public static final String USER_PROFILE_HEADER_FOLLOWING = "FOLLOWING";
	public static final String USER_PROFILE_HEADER_FOLLOWERS = "FOLLOWERS";
	public static final String USER_PROFILE_HEADER_SETTING = "SETTING";
	public static final String USER_PROFILE_HEADER_RECOMMENDATIONS = "RECOMMENDATIONS";
	public static final String USER_PROFILE_HEADER_COLLECTIONS = "USER_COLLECTIONS";
	public static final String USER_PROFILE_HEADER_LOVES = "LOVES";
	public static final String USER_PROFILE_HEADER_ACTIVITY = "ACTIVITY";
	public static final String USER_PROFILE_HEADER_NOTIFICATIONS = "NOTIFICATIONS";

	public static final String USER_SETTINGS_HEADER_ACCOUNT = "ACCOUNT";
	public static final String USER_SETTINGS_HEADER_PICTURE = "PICTURE";
	public static final String USER_SETTINGS_HEADER_ADDRESS = "ADDRESS";
	public static final String USER_SETTINGS_HEADER_INVITES = "INVITES";
	public static final String USER_SETTINGS_HEADER_PRIVACY = "PRIVACY";

	// User Header
	public static final String USER_HEADER_DEAL = "DEAL";
	public static final String USER_HEADER_PRODUCT = "PRODUCT";
	public static final String USER_HEADER_DISCOVER = "DISCOVER";
	public static final String USER_HEADER_FEATURED = "FEATURED";
	public static final String USER_HEADER_STREAM = "STREAM";
	public static final String USER_HEADER_RECOMMENDATIONS = "RECOMMENDATIONS";
	public static final String USER_HEADER_REWARDS = "REWARDS";

	public static final String PRODUCER_HEADER_SELECTED = "SELECTED";
	public static final String PRODUCER_HEADER_DEAL = "DEAL";
	public static final String PRODUCER_HEADER_REVIEW = "REVIEW";
	public static final String PRODUCER_HEADER_PRODUCT = "PRODUCT";
	public static final String PRODUCER_HEADER_REWARD = "REWARD";
	public static final String PRODUCER_HEADER_STORES = "STORES";
	public static final String PRODUCER_HEADER_INFO = "INFO";

	public static final String PRODUCER_HEADER_PROFILE = "PROFILE";
	public static final String PRODUCER_HEADER_DEALS = "DEALS";
	public static final String PRODUCER_HEADER_PRODUCTS = "PRODUCTS";
	public static final String PRODUCER_HEADER_RECOMMENDATION = "RECOMMENDATION";
	public static final String PRODUCER_HEADER_LOCATIONS = "LOCATIONS";
	public static final String PRODUCER_HEADER_REWARDS = "REWARDS";
	public static final String PRODUCER_HEADER_SETTINGS = "SETTINGS";
	public static final String PRODUCER_HEADER_DASHBOARD = "DASHBOARD";
	public static final String PRODUCER_HEADER_PEOPLE = "PEOPLE";

	public static final String PRODUCER_SETTINGS_HEADER_MANAGE_PROFILE = "MANAGE_PROFILE";
	public static final String PRODUCER_SETTINGS_HEADER_PICTURE = "PICTURE";
	public static final String PRODUCER_SETTINGS_HEADER_STORE_PICTURE = "STORE_PICTURE";
	public static final String PRODUCER_SETTINGS_HEADER_PRIVACY_NOTIFICATION = "PRIVACY_NOTIFICATION";

	public static final String PRODUCER_PEOPLE_HEADER_BRAND_INFLUENCERS = "BRAND_INFLUENCERS";
	public static final String PRODUCER_PEOPLE_HEADER_MOST_ACTIVE_USERS = "MOST_ACTIVE_USERS";
	public static final String PRODUCER_PEOPLE_HEADER_FOLLOWERS = "FOLLOWERS";
	public static final String PRODUCER_PEOPLE_HEADER_FOLLOWING = "FOLLOWING";

	public static final String PRODUCER_REWARDS_HEADER_CAMPAIGN = "CAMPAIGN";
	public static final String PRODUCER_REWARDS_HEADER_REWARD = "REWARD";

	public static final String TAG_HEADER_ACTIVITY = "ACTIVITY";
	public static final String TAG_HEADER_RECOMMENDATIONS = "RECOMMENDATIONS";
	public static final String TAG_HEADER_FOLLOWERS = "FOLLOWERS";

	public static final String TAG_HEADER_DEALS = "DEAL";
	public static final String TAG_HEADER_PRODUCTS = "PRODUCT";
	public static final String TAG_HEADER_STORES = "STORES";
	public static final String TAG_HEADER_INFO = "INFO";
	//
	public static final String[] ratings = { "Very Poor", "Very Poor", "Poor", "Poor", "Average", "Average", "Good", "Good", "Awesome", "Awesome" };

	public static String CONST_EDIT = "edit";
	public static String CONST_CREATE = "create";
	public static String CONST_DELETE = "delete";
	public static String CONST_AUTHENTICATE = "authenticate";
	public static String CONST_SUSPEND = "suspend";
	public static String CONST_RESETPASSWORD = "resetpassword";

	public static String status_active = "Active";
	public static String status_disabled = "Disabled";
	public static String status_expired = "Expired";
	public static String status_soldout = "Sold Out";

	public final static Long PRODUCER_TYPE = (long) 0x0001;
	public final static Long PRODUCER_PRODUCT_TYPE = (long) 0x000A;

	public static final String USER_HOME_VIEW = "home";
	public static final String USER_PRODUCER_VIEW = "producer";
	public static final String USER_TAG_VIEW = "tags";

	public static final String POINT = "POINT";
	public static final String USER_GET_DEAL = "USER_GET_DEAL";

	public static final String ADDED_BY_USER = "ADDED_BY_USER";
	public static final String USER_TRIED_PRODUCER_PRODUCT = "USER_TRIED_PRODUCT";
	public static final String USER_WISH_PRODUCER_PRODUCT = "USER_WISH_PRODUCT";
	public static final String USER_TRIED_PRODUCER = "USER_TRIED_PRODUCER";
	public static final String USER_WISH_PRODUCER = "USER_WISH_PRODUCER";

	public static final String FM_RECOMMENDATION = "FM_RECOMMENDATION";

	public static final String PRODUCER_DEALS_FILTER_ALL = "ALL";
	public static final String PRODUCER_DEALS_FILTER_FOR_YOU = "FOR_YOU";
	public static final String PRODUCER_DEALS_FILTER_NEARBY = "NEARBY";

	public static final String PRODUCER_PRODUCT_EXTENDED = "PRODUCER_PRODUCT_EXTENDED";
	public static final String PRODUCER_EXTENDED = "PRODUCER_EXTENDED";
	public static final String USER_CREATED_PRODUCER_PRODUCT = "USER_CREATED_PRODUCER_PRODUCT";

	// producer stores

	/*
	 * store(0xA001L), shoppingstreet(0xA002L), market(0xA003L), mall(0xA004L),
	 * fleamarket(0xA005L), event(0xA006L), online(0xA007L),
	 * retailchain(0xA008L), facebookstore(0xA009L),
	 */

	public static final int producer_single_store = 1;
	public static final int producer_multiple_store = 2;
	public static final int producer_retail_chain = 3;
	public static final int producer_online_store = 4;
	public static final int producer_market_store = 5;
	public static final int producer_mall_store = 6;
	public static final int producer_event_store = 7;
	public static final int producer_fleamarket_store = 8;
	public static final int producer_facebookstore_store = 9;
	public static final int producer_shoppingstreet_store = 10;

	public static final String producer_singlestore = "Single Store";
	public static final String producer_multiplestore = "Multiple Stores";
	public static final String producer_retailchain = "Retail Chain";
	public static final String producer_onlinestore = "Online Store";
	public static final String producer_market = "Market";
	public static final String producer_mall = "Mall";
	public static final String producer_event = "Event";
	public static final String producer_fleamarket = "Flea Market";
	public static final String producer_facebookstore = "Facebook Store";
	public static final String producer_streetstore = "Shopping Street";

	public static final String PEOPLE = "people";

	public static final int producer_recommendation = 1;
	public static final int producer_product_recommendation = 2;
	public static final int deal_recommendation = 3;

	public static final String RATING_LARGE_STYLE = "Large";
	public static final String RATING_SMALL_STYLE = "Small";

	// Some alternate text constants for site-wide static images
	public static final String IMAGE_ALT_LOGIN_LOGO = "Welcome to Wooplr";
	public static final String IMAGE_ALT_SITE_LOGO = "Wooplr";

	// Some contants for site-wide UI messages
	public static final String WELCOME_PITCH = "Latest trends, newer styles and the best in fashion curated by the Wooplr community";

	// Constants for default messages site-wide
	public static final String NO_NOTIFICATIONS_USER_OWN = "Lazing around, eh? No notifications to show right now :)";
	public static final String NO_NOTIFICATIONS_USER = "No notifications to show right now!";
	public static final String NO_ACTIVITY_USER_OWN = "Lazing around, eh? Here are some interesting things to get you started :)";
	public static final String NO_ACTIVITY_USER = "There has been no activity lately.. Probably lazing around at the moment :)";
	public static final String NO_FOLLOWING_USER_OWN = "You are not following anybody yet!<br/><br/> Here are some top people and businesses to follow :)";
	public static final String NO_FOLLOWING_USER = "They are not following anybody yet!";
	public static final String NO_FOLLOWERS_USER_OWN = "Nobody is following you yet! <br/><br/>Recommend things you like or have bought recently to start building up your taste profile :)";
	public static final String NO_FOLLOWERS_USER = "Nobody is following them yet!";
	public static final String NO_RECOMMENDATIONS_USER_OWN = "You have not made any recommendations yet!<br/><br/>Click on shiny blue button on the top to get started :)";
	public static final String NO_COLLECTIONS_USER_OWN = "You have not made any collections yet!";
	public static final String NO_RECOMMENDATIONS_USER = "No recommendations have been posted yet!<br/><br/>Follow them to stay updated";
	public static final String NO_COLLECTIONS_USER = "No collections have been posted yet!";
	public static final String NO_LOVES_USER_OWN = "You haven't loved any recommendations yet!<br/>";
	public static final String NO_LOVES_USER_OWN_LOOKS = "You haven't loved any looks yet!<br/>";
	public static final String NO_LOVES_USER = "No recommendations loved yet!<br/><br/>Follow them to stay updated";
	public static final String NO_LOVES_USER_LOOKS = "No looks loved yet!<br/><br/>Follow them to stay updated";
	public static final String NO_SAVED_ADDRESS_USER_OWN = "You don't have any saved addresses yet!";

	public static final String NO_FOLLOWERS_PRODUCER_OWN = "Nobody is following you yet!<br/><br/>Build up your profile and spread the word among your customers to get things started :)";
	public static final String NO_FOLLOWERS_PRODUCER = "Nobody is following them yet!";
	public static final String NO_FOLLOWING_PRODUCER_OWN = "You are not following anybody yet!<br/><br/> Start following your most loved customers for even a better social experience :)";
	public static final String NO_FOLLOWING_PRODUCER = "They are not following anybody yet!";
	public static final String NO_BRANCHES_PRODUCER_OWN = "You have not added any stores yet!<br/><br/>Add a new store to help people find you easily";
	public static final String NO_BRANCHES_PRODUCER = "No stores to show yet!";
	public static final String NO_RECOMMENDATIONS_PRODUCER_OWN = "No looks have been posted yet!<br/><br/>Spread the word among your customers to get things started.";
	public static final String NO_RECOMMENDATIONS_PRODUCER = "No looks have been posted yet.<br/><br/>Know something awesome here? Why not recommend it..<div class=\"big-action\"><a class=\"btn red-btn\" href=\"javascript:$('.add-new').trigger('click')\">Post a look</a></div>";
	public static final String NO_FRESHPRODUCTS_PRODUCER_OWN = "No fresh Products have been added yet";
	public static final String NO_FRESHPRODUCTS_PRODUCER = "No fresh products have been added yet";
	public static final String NO_PRODUCTS_PRODUCER_OWN = "You have not added any products!<br/><br/>Add some your signature products to get things started";
	public static final String NO_PRODUCTS_PRODUCER = "Nothing has been added yet.<br/><br/>Know something awesome here? Why not recommend it..<div class=\"big-action\"><a class=\"btn red-btn\" href=\"javascript:$('.add-new').trigger('click')\">Post a look</a></div>";
	public static final String NO_ACTIVITY_PRODUCER_OWN = "Lazing around, eh? Start by building up your profile to generate the buzz";
	public static final String NO_ACTIVITY_PRODUCER = "There has been no activity lately.. Probably lazing around at the moment :)<br/><br/>Follow them to stay updated<br/>";
	public static final String NO_OFFERS_PRODUCER_OWN = "You have not created any offers yet!<br/><br/>Create an offer to reward loyal customers and drive business the social way";
	public static final String NO_OFFERS_PRODUCER = "No offers to show right now!<br/><br/>Follow them to stay updated";

	public static final String NO_ACTIVITY_TAG = "No activity yet.";
	public static final String NO_FOLLOWERS_TAG = "No followers yet.";

	public static final String NOTHING_MORE_TO_SHOW = "Nothing more to show right now";
	public static final String NO_RECOMMENDATIONS_TO_SHOW = "No looks to show.";
	public static final String NO_PRODUCTS_TO_SHOW = "No products to show.";

	public static final String WANT_IT_TEXT_GET_IT = "How Do I Get It?";
	public static final String WANT_IT_TEXT_ACTION_DONE = "Already Contacted Store";
	public static final String WANT_IT_TEXT_CONTACT = "Want It? Contact Store";

	public static final String WANT_ACTION_SUCCESS = "WANT_ACTION_SUCCESS";
	public static final String WANT_ACTION_FAILED = "WANT_ACTION_FAILED";

	public static final String VERIFY_MOBILE_FAILED_INVALID_NUMBER = "VERIFY_MOBILE_FAILED_INVALID_NUMBER";
	public static final String VERIFY_MOBILE_FAILED_LESS_THAN_10 = "VERIFY_MOBILE_FAILED_LESS_THAN_10";
	public static final String VERIFY_MOBILE_FAILED_WRONG_CODE = "VERIFY_MOBILE_FAILED_WRONG_CODE";
	public static final String VERIFY_MOBILE_FAILED_EMPTY = "VERIFY_MOBILE_FAILED_EMPTY";
	public static final String VERIFY_MOBILE_FAILED_UNKNOWN = "VERIFY_MOBILE_FAILED_UNKNOWN";
	public static final String VERIFY_MOBILE_SUCCESS_SEND_CODE = "VERIFY_MOBILE_SUCCESS_SEND_CODE";
	public static final String VERIFY_MOBILE_SUCCESS = "VERIFY_MOBILE_SUCCESS";
	public static final String VERIFY_MOBILE_PENDING = "VERIFY_MOBILE_PENDING";

	// @vish -> added Constants for Email Sending
	public static final String SEND_EMAIL_TO_ALL_USERS = "ALL";
	public static final String SEND_EMAIL_INVITE_REMINDER = "REMINDER";
	public static final String SEND_EMAIL_BY_USER_ID = "BY_USER_ID";
	public static final String SEND_CUSTOM_EMAIL_BY_USER_ID = "CUSTOM_BY_USER_ID";
	public static final String SEND_EMAIL_TO_ADMIN_USERS = "ADMIN";
	public static final String SEND_EMAIL_BY_EMAIL_ID = "BY_EMAIL_ID";
	public static final String SEND_EMAIL_FROM_LISTS = "BY_EMAIL_LISTS";

	public static final String SEND_CUSTOM_EMAIL_TO_ADMIN_USERS = "ADMIN_CUSTOM";
	public static final String SEND_CUSTOM_EMAIL_TO_ALL_USERS = "ALL_CUSTOM";
	public static final String CUSTOM_NOTIFICATION = "CUSTOM_NOTIFICATION";

	public static final String PROPERTY_CONTENT_CHANNELS = "CONTENT_CHANNELS";
	public static final String PROPERTY_PRODUCT_CATEGORY = "PRODUCT_CATEGORY";
	public static final String PROPERTY_COLLEGE_HASHTAGS = "COLLEGE_HASHTAGS";
	public static final String PROPERTY_HEADER_V_1 = "header-json-v1";
	public static final String PROPERTY_GENERIC_PREFIX = "GENERIC_";
	public static final String PROPERTY_CARDS = "CARDS";
	public static final String PROPERTY_RESTRICTED_SEARCH_LOOK_IDS = "RESTRICTED_SEARCH_LOOK_IDS_";
	public static final String PROPERTY_RELEVANT_STORES = "RELEVANT_STORES";
	public static final String PROPERTY_RELEVANT_STORES_BOOST = "RELEVANT_STORES_BOOST";

	public static final String EVENT_PRODUCT_VIEW = "PRODUCT_VIEW";
	public static final String EVENT_ADDTOCART = "ADD_TO_CART";
	public static final String EVENT_DELETE_FROM_CART = "DELETE_FROM_CART";
	public static final String EVENT_CLEAR_CART = "CLEAR_CART";
	public static final String EVENT_BUY_PRODUCT = "BUY_PRODUCT";
	public static final String EVENT_CART_CHECKOUT = "CART_CHECKOUT";
	public static final String GUEST = "GUEST";
	public static final String REGISTERED = "REGISTERED";
	public static final String EVENT_PG_VERIFY = "PG_VERIFY";
	public static final String EVENT_COD_VERIFY = "COD_VERIFY";
	public static final String TRXN_STATUS_UPDATE = "TRXN_STATUS_UPDATE";
	public static final String EVENT_QUICK_BUY = "QUICK_BUY";

	// For Attribution tracking
	public static final String productId = "productId";
	public static final String skuId = "skuId";
	public static final String entryPoint = "entryPoint";
	public static final String updatedEntryPoint = "updatedEntryPoint";
	public static final String deviceId = "deviceId";
	public static final String userType = "userType";
	public static final String transactionId = "transactionId";
	public static final String ID = "ID";
	public static final String networkType = "networkType";
	public static final String customerId = "customerId";
	public static final String userId = "userId";
	public static final String platform = "platform";
	public static final String attribution = "attribution";
	public static final String level = "level";
	public static final String entityId = "entityId";
	public static final String entityType = "entityType";
	public static final String entityOwner = "entityOwner";
	public static final String entityName = "entityName";
	public static final String campaign = "campaign";
	public static final String misc = "misc";
	public static final String timestamp = "timestamp";
	public static final String price = "price";
	public static final String hourOfDay = "hourOfDay";
	public static final String transactionStatus = "transactionStatus";
	public static final String discount = "discount";
	public static final String couponDiscount = "couponDiscount";
	public static final String shippingCharge = "shippingCharge";
	public static final String amount = "amount";
	public static final String added = "added";
	public static final String deleted = "deleted";
	public static final String cartEntityId = "cartEntityId";
	public static final String skuInCart = "skuInCart";
	public static final String eventType = "eventType";
	public static final String eventId = "eventId";
	public static final String skuOrderid = "skuOrderid";
	public static final String email = "email";
	public static final String city = "city";
	public static final String state = "state";
	public static final String skuSize = "skuSize";
	public static final String userAge = "userAge";
	public static final String itemCount = "itemCount";
	public static final String osType = "osType";
	public static final String fromCart = "fromCart";
	public static final String checkout = "checkout";
	public static final String quickbuy = "quickbuy";
	public static final String day = "day";
	public static final String month = "month";
	public static final String year = "year";
	public static final String medium = "medium";
	public static final String gateway = "gateway";
	public static final String gatewayId = "gatewayId";
	public static final String tag = "tag";

	public static final String SUPPORTED_BRANDS = "SUPPORTED_BRANDS";

	public static final String CATEGORIES = "categories";
	public static final String SHOP = "shop";
	public static final String COLLECTIONS = "collections";
	public static final String TRENDING_LOOKS = "trending";
	public static final String FASHION_CARNIVAL = "fashioncarnival";
	public static final String ALL_CONTENT = "contents";

	public static final String PLATFROM_IOS = "ios";

	public static int getRecommendationType(String type) {
		if (type.equals(Constants.USER_FOLLOW_PRODUCER_REVIEW) || type.equals(Constants.PRODUCER_REVIEW) || type.equals(Constants.USER_RERECOMMEND_PRODUCER_REVIEW))
			return Constants.producer_recommendation;
		else if (type.equals(Constants.USER_FOLLOW_PRODUCERPRODUCT_REVIEW) || type.equals(Constants.PRODUCER_PRODUCT_REVIEW) || type.equals(Constants.USER_RERECOMMEND_PRODUCERPRODUCT_REVIEW))
			return Constants.producer_product_recommendation;
		else if (type.equals(Constants.DEAL_REVIEW))
			return Constants.deal_recommendation;
		else
			return -1;
	}

	// public static int getRecommendationType(Long type) {
	// if (MathUtils.equals(type, EntityConstants.REVIEW_TYPE_PRODUCER))
	// return Constants.producer_recommendation;
	// else if (MathUtils.equals(type,
	// EntityConstants.REVIEW_TYPE_PRODUCERPRODUCT))
	// return Constants.producer_product_recommendation;
	// else if (MathUtils.equals(type, EntityConstants.REVIEW_TYPE_DEAL))
	// return Constants.deal_recommendation;
	// else
	// return -1;
	// }

	public static String getRecommendationType(int type) {
		if (type == Constants.producer_recommendation)
			return Constants.PRODUCER_REVIEW;
		else if (type == Constants.producer_product_recommendation)
			return Constants.PRODUCER_PRODUCT_REVIEW;
		else if (type == Constants.deal_recommendation)
			return Constants.DEAL_REVIEW;
		else
			return null;
	}

	public static final int FEATURED_REMENDATIONS_TO_SHOW = 14;
	public static ArrayList<Long> featuredRecommendations = new ArrayList<Long>();

	static {
		featuredRecommendations.add(296347L);
		featuredRecommendations.add(715761L);
		featuredRecommendations.add(639077L);
		featuredRecommendations.add(532288L);
		featuredRecommendations.add(468094L);
		featuredRecommendations.add(296390L);
		featuredRecommendations.add(645152L);
		featuredRecommendations.add(689009L);
		featuredRecommendations.add(689014L);
		featuredRecommendations.add(670035L);
		featuredRecommendations.add(669039L);
		featuredRecommendations.add(668172L);
		featuredRecommendations.add(721149L);
		featuredRecommendations.add(715260L);
		featuredRecommendations.add(723175L);
		featuredRecommendations.add(724151L);
		featuredRecommendations.add(758030L);
		featuredRecommendations.add(757334L);
		featuredRecommendations.add(711608L);
		featuredRecommendations.add(721526L);
		featuredRecommendations.add(716572L);
		featuredRecommendations.add(196943L);
		featuredRecommendations.add(244156L);
		featuredRecommendations.add(249041L);
	};

	public static ArrayList<Long> streamBlackListedUsers = new ArrayList<Long>();

	static {

		streamBlackListedUsers.add(5986607509274624L);
		streamBlackListedUsers.add(11343001L);
		streamBlackListedUsers.add(5598723040083968L);
		streamBlackListedUsers.add(4755154486165504L);
		streamBlackListedUsers.add(5942455312580608L);
		streamBlackListedUsers.add(5223514000850944L);
	};

	public static ArrayList<Long> allowTagEditUsers = new ArrayList<Long>();

	public static ArrayList<Long> allowBranchEditUsers = new ArrayList<Long>();

	public static ArrayList<Long> allowPricingPlanEditUsers = new ArrayList<Long>();

	public static ArrayList<Long> allowProducerAndBranchMerges = new ArrayList<Long>();

	public static ArrayList<Long> allowStoreFrontCreation = new ArrayList<Long>();

	public static ArrayList<Long> allowStoreFrontImageUpdation = new ArrayList<Long>();

	public static ArrayList<Long> allowStoreProducerCodeUpdation = new ArrayList<Long>();

	public static ArrayList<Long> allowStoreProducerBranchAndEmailUpdation = new ArrayList<Long>();

	public static ArrayList<Long> allowFClubUpdation = new ArrayList<Long>();

	public static ArrayList<Long> allowSendingSMSToMobile = new ArrayList<Long>();

	public static ArrayList<Long> allowSendingIndividualPushNotifications = new ArrayList<Long>();

	public static ArrayList<Long> allowSendingPushNotifications = new ArrayList<Long>();

	public static ArrayList<Long> allowConnectingUserToProducer = new ArrayList<Long>();

	static {
		// if
		// (SearchIndexMailUtils.PRODUCTION_STRING.equals(SearchIndexMailUtils.getEnvironment()))
		// {
		// BASE_URI = BASE_URI_PRODUCTION;
		// } else if
		// (SearchIndexMailUtils.STAGING_STRING.equals(SearchIndexMailUtils.getEnvironment()))
		// {
		// BASE_URI = BASE_URI_STAGING;
		// } else {
		// BASE_URI = BASE_URI_LOCAL;
		// }

		allowTagEditUsers.add(7782220L);
		allowBranchEditUsers.add(5977788607627264L);
		allowBranchEditUsers.add(10L);
		allowPricingPlanEditUsers.add(5977788607627264L);
		allowProducerAndBranchMerges.add(5977788607627264L);

		allowPricingPlanEditUsers.add(5977788607627264L);
		allowPricingPlanEditUsers.add(5944969666756608L);
		allowPricingPlanEditUsers.add(6103752458108928L);
		allowPricingPlanEditUsers.add(12476010L);
		allowPricingPlanEditUsers.add(5996857896468480L);
		allowPricingPlanEditUsers.add(5425833795649536L);
		allowPricingPlanEditUsers.add(4783763862061056L);
		allowPricingPlanEditUsers.add(5526984289419264L);

		allowStoreFrontCreation.add(5977788607627264L);
		allowStoreFrontCreation.add(5944969666756608L);
		allowStoreFrontCreation.add(6103752458108928L);
		allowStoreFrontCreation.add(12476010L);
		allowStoreFrontCreation.add(5996857896468480L);
		allowStoreFrontCreation.add(5425833795649536L);
		allowStoreFrontCreation.add(4783763862061056L);

		allowStoreFrontImageUpdation.add(5526984289419264L); // Vishal.
		allowStoreFrontImageUpdation.add(5944969666756608L); // Geetanjali.
		allowStoreFrontImageUpdation.add(6103752458108928L); // Vishal.
		allowStoreFrontImageUpdation.add(12476010L); // Disha.
		allowStoreFrontImageUpdation.add(5996857896468480L); // Shailja.
		allowStoreFrontImageUpdation.add(5425833795649536L); // Shailja.
		allowStoreFrontImageUpdation.add(4783763862061056L); // Shailja.

		allowStoreProducerCodeUpdation.add(5526984289419264L); // Vishal.
		allowStoreProducerCodeUpdation.add(5944969666756608L); // Vishal.
		allowStoreProducerCodeUpdation.add(6103752458108928L); // Vishal.
		allowStoreProducerCodeUpdation.add(12476010L); // Vishal.
		allowStoreProducerCodeUpdation.add(5996857896468480L); // Vishal.
		allowStoreProducerCodeUpdation.add(5425833795649536L); // Vishal.
		allowStoreProducerCodeUpdation.add(4783763862061056L); // Vishal.

		allowConnectingUserToProducer.add(5944969666756608L);
		allowConnectingUserToProducer.add(6103752458108928L);
		allowConnectingUserToProducer.add(12476010L);
		allowConnectingUserToProducer.add(5996857896468480L);
		allowConnectingUserToProducer.add(5425833795649536L);
		allowConnectingUserToProducer.add(4783763862061056L);
		allowConnectingUserToProducer.add(5526984289419264L);

		allowStoreProducerBranchAndEmailUpdation.add(5526984289419264L);

		allowFClubUpdation.add(4873204586774528L);
		allowFClubUpdation.add(5081854965186560L);

		allowSendingSMSToMobile.add(5081854965186560L);

		allowSendingIndividualPushNotifications.add(5977788607627264L);
		allowSendingIndividualPushNotifications.add(5081854965186560L); // Gaurav

		allowSendingPushNotifications.add(5977788607627264L);
		allowSendingPushNotifications.add(5081854965186560L);

	};

	public static final int FEATURED_INFLUENCERS_TO_SHOW = 10;
	public static ArrayList<Long> influencers = new ArrayList<Long>();
	static {
		influencers.add(1779147L);
		influencers.add(1335284L);
		influencers.add(1664044L);
		influencers.add(1710685L);
		influencers.add(1642831L);
		influencers.add(1791033L);
		influencers.add(1336721L);
		influencers.add(711154L);
		influencers.add(1465177L);
		influencers.add(461175L);
		influencers.add(2528870L);
		influencers.add(1271361L);
		influencers.add(1104863L);
		influencers.add(2200292L);
		influencers.add(1472010L);
		influencers.add(1275141L);
		influencers.add(2629126L);
		influencers.add(2196586L);
		influencers.add(2370941L);
		influencers.add(888298L);
		influencers.add(1722992L);
		influencers.add(2010493L);
		influencers.add(1630731L);
		influencers.add(297137L);
		influencers.add(2053131L);
		influencers.add(2421188L);
		influencers.add(2068240L);
	};

	// public static ArrayList<EntityConstants.ActivityStatus> activeEventCodes
	// = new ArrayList<EntityConstants.ActivityStatus>();
	// static {
	// activeEventCodes.add(EntityConstants.ActivityStatus.THENETWORK);
	// activeEventCodes.add(EntityConstants.ActivityStatus.NIFTB);
	// }

	public static ArrayList<String> adminUsers = new ArrayList<String>();
	static {
		adminUsers.add("soumenc3@gmail.com");
		/*
		 * adminUsers.add("arjun.zacharia@gmail.com");
		 * adminUsers.add("praveen.rajaretnam@gmail.com");
		 * adminUsers.add("ankitsabharwal@gmail.com");
		 * adminUsers.add("exploreankit@gmail.com");
		 * adminUsers.add("dsouzileana@gmail.com");
		 */
	}

	public static ArrayList<Long> wooplrContentPeople = new ArrayList<Long>();
	static {
		wooplrContentPeople.add(5829917413474304L);
		wooplrContentPeople.add(3503194L);
		wooplrContentPeople.add(215559L);
		wooplrContentPeople.add(5628391586267136L);

	}

	public static ArrayList<Long> deletePermissionPeople = new ArrayList<Long>();
	public static ArrayList<Long> deleteFreshInTheStore = new ArrayList<Long>();

	static {
		deletePermissionPeople.add(196562L);
		deletePermissionPeople.add(196580L);
		deletePermissionPeople.add(215559L);
		deletePermissionPeople.add(342L);
		deletePermissionPeople.add(5081854965186560L); // gaurav

		//

		allowStoreFrontImageUpdation.add(5944969666756608L); // Sunny.
		allowStoreFrontImageUpdation.add(6103752458108928L); // Geetanjali.
		deleteFreshInTheStore.add(5944969666756608L);
		deleteFreshInTheStore.add(6103752458108928L);
		deleteFreshInTheStore.add(5081854965186560L); // gaurav

	}

	public static HashSet<String> reservedUserIds = new HashSet<String>();
	static {
		reservedUserIds.add("ankit.sabarwal");
		reservedUserIds.add("soumen.sarkar");
		reservedUserIds.add("arjun.zacharia");
		reservedUserIds.add("zacropolis");
		reservedUserIds.add("tom.cruise");

		reservedUserIds.add("recommendations");
		reservedUserIds.add("loves");
		reservedUserIds.add("followers");
		reservedUserIds.add("following");
		reservedUserIds.add("activity");
		reservedUserIds.add("products");
		reservedUserIds.add("stores");
		reservedUserIds.add("people");
		reservedUserIds.add("image");
		reservedUserIds.add("investors");
		reservedUserIds.add("app");
		reservedUserIds.add("invite-friends");
		reservedUserIds.add("robot.txt");
		reservedUserIds.add("createpromotedcontent.do");
		reservedUserIds.add("imageResize.do");
		reservedUserIds.add("pitchdeck");
		reservedUserIds.add("you");
		reservedUserIds.add("story");
		reservedUserIds.add("about");
		reservedUserIds.add("getting-started");
		reservedUserIds.add("privacy-policy");
		reservedUserIds.add("contact");
		reservedUserIds.add("friends");
		reservedUserIds.add("shopaholic");
		reservedUserIds.add("comiccon");
		reservedUserIds.add("recommend");
		reservedUserIds.add("upload");
		reservedUserIds.add("publish");
		reservedUserIds.add("switchaccounts");
		reservedUserIds.add("connectproduceruser");
		reservedUserIds.add("product");
		reservedUserIds.add("deal");
		reservedUserIds.add("trending");
		reservedUserIds.add("trend");
		reservedUserIds.add("nearby");
		reservedUserIds.add("search");
		reservedUserIds.add("settings");
		reservedUserIds.add("ajax");
		reservedUserIds.add("recommendation");
		reservedUserIds.add("tag");
		reservedUserIds.add("home");
		reservedUserIds.add("admin");
		reservedUserIds.add("influencers");
		reservedUserIds.add("invite");
		reservedUserIds.add("JNC");
		reservedUserIds.add("MCC");
		reservedUserIds.add("NIFTB");
		reservedUserIds.add("THENETWORK");
		reservedUserIds.add("error");
		reservedUserIds.add("newsletter");
		reservedUserIds.add("signin");
		reservedUserIds.add("signup");
		reservedUserIds.add("board");
		reservedUserIds.add("all");
		reservedUserIds.add("googlecontacts");
		reservedUserIds.add("producer");
		reservedUserIds.add("valentine");
		reservedUserIds.add("review");
		reservedUserIds.add("diwali");
		reservedUserIds.add("comicon");
		reservedUserIds.add("activity");
		reservedUserIds.add("notification");
		reservedUserIds.add("password");
		reservedUserIds.add("username");
		reservedUserIds.add("deals");
		reservedUserIds.add("facebox");
		reservedUserIds.add("live");
		reservedUserIds.add("you");
		reservedUserIds.add("emailannoucements");
		reservedUserIds.add("invitefriends");

	}

	public static String getRecommendation() {
		return RECOMMENDATION;
	}

	public static String getProducer() {
		return PRODUCER;
	}

	public static String getUser() {
		return USER;
	}

	public static final String VERSION_NAMES = "0,0";
	public static final String VERSION_CODES = "0,0";

	public static final String ANDROID_LATEST_VESION = "0";

	// public static final String IOS_VERSION_NAME = "0,0";
	public static final String IOS_VERSION_CODES = "0";

	public enum OauthKeys {

		PRODUCTION_API_KEY("e3df264812e248eb89874277ef688275"), PRODUCTION_API_SECRET("a6fa95385f3f4a6a8ffba4db93b96b47");

		private String mKey;

		OauthKeys(String key) {
			mKey = key;
		}

		public String getKey() {
			return mKey;
		}
	}

	public enum TopicType {
		VIEW_TOPIC("viewTopic"), NONVIEW_TOPIC("nonviewTopic");
		private String topicType;

		TopicType(String type) {
			topicType = type;
		}

		public String getTopicType() {
			return topicType;
		}
	}

	public enum Attribution {
		L("LOOK"), P("PRODUCT"), C("CURATETD_COLLECTION"), UC("USER_COLLECTION"), St("STORE"), S("SEARCH"), Home("HOME_TAB"), Collection("COLLECTION_TAB"), S1("1"), S2("2"), S3("3");

		private String value;

		Attribution(String val) {
			value = val;
		}

		public String getValue() {
			return value;
		}
	}

	public static final String DEFAULT_WISHLIST_NAME = "Wishlist";

	public enum CampusConnect {
		MANAGER("MANAGER"), USER("USER"), INFLUENCER("INFLUENCER");

		String ownerType;

		private CampusConnect(String ownerType) {
			this.ownerType = ownerType;
		}

		private String getOwnerType() {
			return ownerType;
		}

		private void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}
	}

	// public static List<Long> blockTopUsers = new ArrayList<>();
	// static {
	// blockTopUsers.add(5830109703962624L);
	// blockTopUsers.add(6515741327622144L);
	// blockTopUsers.add(4569741648199680L);
	// blockTopUsers.add(6487672065884160L);
	// }

	public static final String MONGO_PATH = "http://54.69.39.220:1234/store_entity";
	public static final String DEFAULT_USER_IMG = "https://res.wooplr.com/image/upload/v1434692014/u/t1ydr1r0elciqyznjh68.png";
	public static final String SUPPORT_SUCCESS_MSG = "Thanks for contacting us. Our support team is investigating the issue and will get back in touch soon.";
	public static final String ORDER_CANCEL_MSG = "Your order is successfully cancelled. Contact support for any query regarding this.";

	public enum DelhiveryStore {
		Vajor("Vajor") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-NR Ventures Pvt Ltd";
			}
		},
		Pataaka("Pataaka") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Epic Editing Product";
			}
		},
		StyleFiesta("Style Fiesta") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Style Fiesta";
			}
		},
		MissChase("Miss Chase") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-CCU-Chase Lifestyle";
			}
		},
		Divaat("Divaat") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-PNQ-Divaat";
			}
		},
		Baublebeads("Baublebeads") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Blue Crest Lifestyle Solutions LLP";
			}
		},
		Kaaryah("Kaaryah") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Kaaryah";
			}
		},
		ShopNineteen("Shop Nineteen") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-NOI-Nineteen Apparels Pvt. Ltd.";
			}
		},
		NICHE("Niche") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-NICHE DESIGN";
			}
		},
		CandidlyCouture("Candidly Couture") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Candidly Couture";
			}
		},
		Forever21("Forever 21") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-M/S HOLISOL LOGISTICS PRIVATE LIMITED";
			}
		},
		Feelinwow("Feelinwow") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Notandum Brands Private Limited";
			}
		},
		WhySoBlue("Why So Blue") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-WhySoBlue";
			}
		},
		Bandbox("BandBox") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-LKO-Bandbox";
			}
		},
		ChicAccessorizer("Chic Accessorizer") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Chic Accessorizer";
			}
		},
		// Felomhé("Felomhé") {
		// @Override
		// public String getDisplayName() {
		// return "WOOPLR-BOM-Felomh";
		// }
		// },
		ChenChen("Chen Chen Fashion") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Chen Chen";
			}
		},
		MariposaLove("Mariposa Love") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-Pune-Mariposa Love";
			}
		},
		EbonyTwist("Ebony Twist") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Ebony Twist";
			}
		},
		SpringBreak("Spring Break") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Spring Break";
			}
		},
		FancyPants("Fancy Pants") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM- Fancy Pants";
			}
		},
		Closet37("Closet37") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Ria Ryan Zion";
			}
		},
		Zaivaa("Zaivaa") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-JPR-Rainbow textiles Corporation";
			}
		},
		fourseven("fourseven") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Fourseven services private limited";
			}
		},
		BriMe("Bri-Me") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Brime Bright Minimalism";
			}
		},
		PhiveRivers("Phive Rivers") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-PHIVE RIVERS RETAIL PVT LTD";
			}
		},
		Zooomberg("Zooomberg") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM- Zoomberg";
			}
		},
		NiHaoFashion("Ni Hao Fashion") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Ni Hao Fashion";
			}
		},
		MadhurimaBhattacharjee("Madhurima Bhattacharjee") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Madhurima Bhattacharjee";
			}
		},
		ChalkStudio("Chalk Studio") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Chalk Studio";
			}
		},
		TrendArrest("Trend Arrest") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Trend Arrest Clothing Pvt. Ltd.";
			}
		},
		TheGudLook("The Gud Look") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-RGLFashionPrivateLimited";
			}
		},
		FabAlley("FabAlley") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-NOI-High Street Essentials Pvt Ltd";
			}
		},
		TheLabelLife("The Label Life") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-The Label Life";
			}
		},
		// TwentyDresses("20Dresses"){
		// @Override
		// public String getDisplayName() {
		// return "WOOPLR-BOM-20Dresses";
		// }
		// },
		Prym("Prym") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Prym";
			}
		},
		Shuffle("Shuffle") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Shuffle";
			}
		},
		TheVanca("The Vanca") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-FBD-The Vanca";
			}
		},
		FunkForHire("Funk For Hire") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Funk For Hire";
			}
		},
		Nun("Nun") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-PRIMEEX BRANDS PVT LTD";
			}
		},
		MADAME("MADAME") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-LDN-Jain Amar Clothing Pvt Ltd";
			}
		},
		MAYRA("MAYRA") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-Agra-GAURI ENTERPRISES";
			}
		},
		Harpa("Harpa") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Harpa Retail Pvt Ltd";
			}
		},
		LocoEnCabeza("London Bee Clothing LLP") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-London Bee CLothing Pvt Ltd";
			}
		},
		JokerWitch("JOKER & WITCH") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-JOKER & WITCH";
			}
		},
		HugoChavez("HUGO CHAVEZ") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-CHD-HUGO CHAVEZ";
			}
		},
		Saiesta("Saiesta") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Saiesta";
			}
		},
		Ruhaans("Ruhaan's") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Shine Boat Trading";
			}
		},
		Bonhomie("Bonhomie") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Rank Retails Pvt Ltd";
			}
		},
		VAAK("VAAK") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-R P Enterprises";
			}
		},
		Vvine("Vvine") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Libas Impex";
			}
		},
		TodayFashion("Today Fashion") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Today Fashion";
			}
		},
		Atrangee("Atrangee") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Atrangee Fashions Private Limited";
			}
		},
		Intoto("INTOTO") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Shree Vinayak Overseas";
			}
		},
		EyeletFashion("Eyelet Fashion") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Eyelet Fashion Private Limited";
			}
		},
		Annapoliss("Annapoliss") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Virtual Mode Pvt Ltd";
			}
		},
		// Madaam("Madaam"){
		// @Override
		// public String getDisplayName() {
		// return "WOOPLR-BLR-Madaam";
		// }
		// },
		// Yuadi("Yuadi"){
		// @Override
		// public String getDisplayName() {
		// return "WOOPLR-BLR-Yuadi";
		// }
		// },
		Calae("Calae") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-M/S Narottamdas Exports";
			}
		},
		Yufta("Yufta") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-JPR-RKT Lifestyle Pvt ltd.";
			}
		},
		Naari("Naari") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Pal Fashions Private Limited";
			}
		},
		Indibox("Indibox") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Tarini Enterprises";
			}
		},
		Pehraan("Pehraan") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-NOI-Pehraan";
			}
		},
		IraSoleil("Ira Soleil") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BOM-Amaltas Apparel and Accessories Private Limited";
			}
		},
		IndiDori("Indi Dori") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Indi Dori";
			}
		},
		Sangria("Sangria") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Jade e-Services Private Limited";
			}
		},
		ADRO("ADRO") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Belsi Retail";
			}
		},
		Blinglane("Blinglane") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Bling Fashions Pvt.Ltd.";
			}
		},
		TrendyDivva("Trendy Divva") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-Jaypreet Kaur Sawhney & CO";
			}
		},
		Splendent("Splendent") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-GGN-MDS Exports pvt ltd";
			}
		},
		Besiva("Besiva") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-DEL-Besiva Lifestyle";
			}
		},
		Rasada("Rasada") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Spenta";
			}
		},
		Vishudh("Vishudh") {
			@Override
			public String getDisplayName() {
				return "WOOPLR-BLR-Vishudh";
			}
		};

		private String value;
		private String displayName;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		DelhiveryStore(String value) {
			this.value = value;
		}

		public static DelhiveryStore getStoreDelhiveryName(String storeName) {
			for (Constants.DelhiveryStore delhiveryStore : Constants.DelhiveryStore.values()) {
				if (delhiveryStore.getValue().equals(storeName)) {
					return delhiveryStore;
				}
			}
			return null;
		}

		public abstract String getDisplayName();
	}

	public enum OrderHistory {
		ALL("ALL"), STATUS("STATUS"), CONVERSATION("CONVERSATION");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		OrderHistory(String value) {
			this.value = value;
		}

	}

	public enum ECommerceMessageType {
		ERROR("ERROR", "#666666"), INFO("INFO", "#666666"), WARNING("WARNING", "#666666");

		private String value;
		private String hexCode;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getHexCode() {
			return hexCode;
		}

		public void setHexCode(String hexCode) {
			this.hexCode = hexCode;
		}

		ECommerceMessageType(String value, String hexCode) {
			this.value = value;
			this.hexCode = hexCode;
		}
	}

	public enum StoreIdMapping {
		Faballey(5509061567578112L), TheGudLook(5391351714152448L), TrendArrest(6677804077023232L), TheVanca(5123945935405056L), Zaivaa(5269027742285824L), LondonBeeClothing(5171967635488768L),

		STAGING_TEST(5860262582157312L);

		private Long storeId;

		public Long getStoreId() {
			return storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		StoreIdMapping(Long storeId) {
			this.storeId = storeId;
		}

		public static Boolean isAvailableStoreMapping(Long storeId) {
			for (StoreIdMapping storeMapping : StoreIdMapping.values()) {
				if (storeMapping.getStoreId().longValue() == storeId.longValue())
					return Boolean.TRUE;
			}
			return Boolean.FALSE;
		}
	}

	// public static List<Long> groupPopularSyle = new ArrayList<>();
	// static {
	// /*
	// * Data on QA groupPopularSyle.add(5231024394993664L); // id of popular
	// * group groupPopularSyle.add(456L); // id of style icon group
	// */
	//
	// // groupPopularSyle.add(4912877620428800L); // id of popular group
	// groupPopularSyle.add(4912877620428800L); // id of style icon group
	// }

	public static Long trendingGroup = 6683317900673024L; // GroupId on QA
															// 5251927732387840L

	public static Integer deleteDelhiveryPinCodesBeforeHours = 2;
	public static Integer deleteECommExpressPinCodesBeforeHours = 2;

	public static Long[] wooplrSupportedStoreIds = { 5789840626941952L };
	// TODO : Add Wooplr Supported Store IDs

	public enum CollectionKeyIdMapping {
		omgstore(5482161338318848L), morphologyshop(6412451623731200L), houseofindianchic(5778439221805056L), thegreyhalfwayshop(5568067428679680L), pinktrunk(6741562049167360L), buttercupshinytail(
				6694107492384768L), wishlist97(5586866936741888L), valkyriecouture(6379023859712000L), skyhighheels(5253581400440832L), thevogueaholicquirk(5636567895638016L), lilsassyandvoguish(
						6256050221875200L), shabostoccloset(6212723799752704L), wakeupandfashionstore(6259514339491840L), fashiondoor(5753229743489024L), indosten(5588997441847296L), thefashionhunger(
								5404650063527936L), taupe(5406763346821120L), glamprotocol(
										6530549970370560L), larmadio(4787060408582144L), thecurlylookbook(6742090900570112L), edgylook(5947137047920640L), razzledazzlepickle(6068517268619264L);

		private Long key;

		public Long getKey() {
			return key;
		}

		public void setKey(Long key) {
			this.key = key;
		}

		CollectionKeyIdMapping(Long key) {
			this.key = key;
		}
	}

	public static final Boolean SINGLE_BOOST_MONSTER_FLAG = Boolean.FALSE;
}
