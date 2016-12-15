/*****************************************************************************

 ****************************************************************************/

/*
 * User: Arjun
 * Date: Apr 2, 2011
 */

package com.ubiquity.common.jaxb.ecomm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ubiquity.common.jaxb.search.SearchFilterPriceRangeJAXB;

public class EntityConstants {

	private static final Logger logger = Logger.getLogger(EntityConstants.class);
	public static List<Long> curatedRecommendations = new ArrayList<Long>();
	public static List<Long> blackListedUsers = new ArrayList<Long>();

	static {
		curatedRecommendations.add(3512060L); // food pastry
		curatedRecommendations.add(3676042L); // accessories
		curatedRecommendations.add(3762105L); // accesories && bag
		curatedRecommendations.add(3398090L); // accessories
		curatedRecommendations.add(2941041L); // accessories

		curatedRecommendations.add(2850387L); // bag
		curatedRecommendations.add(2910221L); // home decor
		curatedRecommendations.add(2755446L); // apparel
		curatedRecommendations.add(2756598L); // food
		curatedRecommendations.add(2728244L); // food

		curatedRecommendations.add(2706647L); // home decor
		curatedRecommendations.add(2760155L); // accessories
		curatedRecommendations.add(3342048L); // shoes
		curatedRecommendations.add(2763479L); // shoes
		curatedRecommendations.add(2537220L); // accessories

		curatedRecommendations.add(2662551L); // shoes
		curatedRecommendations.add(1201194l); // accessories
		curatedRecommendations.add(2514048L); // food
		curatedRecommendations.add(2475859L); // home decor
		curatedRecommendations.add(2918221L); // food

		blackListedUsers.add(5606369L); // Toteteca
		blackListedUsers.add(12539612L); // Hemlata Hajong

	}

	public final static Long FREQUENCY_FACTOR = 20L;
	// WATCH OUT : If changing the frequency factor first flush the cache from
	// users-to-follow-management.jsp as admin and then change .
	public final static Long entityTableVersion = 1L;
	public final static Long recommendationBlogImageTableVersion = 8L;

	public static HashMap<Long, String> tagNameToDisplay = new HashMap<Long, String>();

	public final static Long ROOT_TYPE = (long) -1;
	public final static Long OTHERS_TYPE = (long) 0x0000;
	public final static Long PRODUCER_TYPE = (long) 0x0001;
	public final static Long CATEGORY_TYPE = (long) 0x0002;
	public final static Long BRAND_TYPE = (long) 0x0003;
	public final static Long PRODUCT_TYPE = (long) 0x0005;
	public final static Long SERVICE_TYPE = (long) 0x0006;
	public final static Long DEAL_TYPE = (long) 0x0008;
	public final static Long PRODUCER_STORE_TYPE = (long) 0x0004;

	public final static Long ECOMMERCE_STORE_TYPE = (long) 0x0007;

	public final static Long PRODUCER_BRANCH_TYPE = (long) 0x0009;
	public final static Long PRODUCER_PRODUCT_TYPE = (long) 0x000A;
	public final static Long PRODUCER_SERVICE_TYPE = (long) 0x000B;
	// public final static Long BUZZ_TYPE = (long) 0x0004;
	public final static Long USER_TYPE = (long) 0x000C;
	public final static Long TAG_TYPE = (long) 0x000D;
	public final static Long REWARD_TYPE = (long) 0x000E;
	public final static Long BADGE_TYPE = (long) 0x000F;
	public static final Long REVIEW_TYPE = (long) 0x0010;
	public static final Long ATTRIBUTE_TYPE = (long) 0x0011;
	public static final Long LANDING_SUGGESTION_TYPE = (long) 0x0012;
	public static final Long FEATURE_TYPE = (long) 0x0013;
	public static final Long CONTACT_TYPE = (long) 0x0014;
	public final static Long USER_BOARD_TYPE = (long) 0x0015;
	public final static Long FASHION_LOOK = (long) 0x0016;
	public final static Long FASHION_LOOK_ITEM = (long) 0x0017;
	public final static Long FASHION_LOOK_ITEM_UPDATE = (long) 0x0024L;
	public final static Long FASHION_LOOK_ITEM_DELETE = (long) 0x0025L;
	public final static Long FASHION_ITEM_PRODUCT = (long) 0x0021;
	public static final Long IMAGE_TYPE = 0x2000L;
	public static final Long ECOMM_PRODUCT_TYPE = 0x0018L;
	public static final Long MERCHANT_TYPE = 0x0020L;
	public static final Long ECOMM_STORE = 0x0019L;
	public static final Long TREND_USER_TYPE = 0x0022L;
	public static final Long TREND_PRODUCER_PRODUCT_REVIEW_TYPE = 0x0023L;
	public static final Long LINKED_ECOMM_PRODUCT_TYPE = 0x0026L;
	public static final Long COLLECTION_ECOMM_PRODUCT_DISCOUNT_UPDATE_TYPE = 0x002AL;
	public static final Long UNLINKED_ECOMM_PRODUCT_TYPE = 0x0032L;
	public static final Long CURATOR_TYPE = 0x0028L;
	public final static Long FASHION_LOOK_AND_PRODUCTS = (long) 0x0034L;
	public static final Long CONTENT_TYPE = 0x0041L;
	public static final Long CONTENT_CHANNEL_TYPE = 0x0043L;
	public static final Long ALIAS_HANDLE_TYPE = 0x0044L;
	public static final Long WIDGET_TYPE = 0x0042L;
	public static final Long ECOMM_ORDER_TYPE = 0x004AL;

	public static final Long EMAIL_INTIMATION = 0x0027L;
	public static final Long COLLECTION = (long) 0x0027L;
	public static final Long FASHIONTAGCLEANUP = 0x0030L;
	public static final Long FASHIONTAG_CREATEDATE = 0x0033L;
	public static final Long LOOK_GLOBAL_ACTIVITY_CREATE = 0x0034L;
	public static final Long ADD_PRODUCT_TO_COLLECTION = 0x0035L;
	public static final Long USER_ADD_PRODUCT_COLLECTION_NOTIFY_COLLECTION_OWNER = 0x0036L;
	public static final Long CREATE_COLLECTION_NOTIFY_FOLLOWERS = 0x0037L;
	public static final Long DELETE_FOOD_DRINK_RECOMMENDATION = 0x0038L;
	public static final Long COLLECTION_ISPRIVATE = 0x0039L;
	public static final Long COLLEGE_SYNONYMS = 0x0040L;
	public static final Long MAILCHIMP_USER_SUBSCRIBERS = 0x0041L;
	public static final Long ECOMM_PRODUCT_SKU = 0x0043L;
	public static final Long TRACKER_PRODUCT_SHOPIFY_MIGRATION = 0x0046L;
	public static final Long TRACKER_USER_GENDER_MIGRATION = 0x0047L;

	public static final Long USER_PROFILE_COMPLETENESS_RESET = 0x0048L;
	public static final Long MAILCHIMP_USER_UNSUBSCRIBE = 0x0049L;
	public static final Long TRACKER_DELHIVERY_STATUSUPDATE = 0x0050L;
	public static final Long SEND_TRENDING_LOOK_NOTIFICATION = 0x0051L;
	public static final Long SEND_USER_INACTIVITY_NOTIFICATION = 0x0052L;
	public static final Long GROUP = 0x0051L;

	public static final Long ECOMM_CUSTOMER = 0x0053L;
	public static final Long USER_LAST_ACTIVITY = 0x0054L;

	public static final Long TRACKER_PRODUCT_THEMECOLLECTION_SEQUENCE_UPDATE = 0x0055L;
	public static final Long TRACKER_PRODUCT_STYLINGTIP_RESET = 0x0056L;
	public static final Long ABANDONED_CART_EMAIL_TRACKER = 0x0057L;
	public static final Long ORDER_FEEDBACK_EMAIL_TRACKER = 0x0058L;
	public static final Long ORDER_REVERSE_PICKUP_TRACKER = 0x0059L;

	public static final Long PRODUCT_FIELD_UPDATE_TRACKER = 0x0060L;
	public static final Long SHIPMENT_PROCESSING_TRACKER = 0x0061L;

	public static final Long WEB_USER_SUBSCRIPTION_TRACKER = 0x0062L;
	public static final Long RESELLER_ANALYTICS_SMS_TRACKER = 0x0063L;

	public static final Long REVIEW_TYPE_PRODUCER = (long) 0x1000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_PRODUCERPRODUCT = (long) 0x2000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_PRODUCERSERVICE = (long) 0x3000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_PRODUCT = (long) 0x4000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_SERVICE = (long) 0x5000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_DEAL = (long) 0x6000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_FM_PRODUCERPRODUCT = (long) 0x7000 | REVIEW_TYPE;
	public static final Long REVIEW_TYPE_PRODUCER_OWNER_PRODUCERPRODUCT = (long) 0x8000 | REVIEW_TYPE;

	public final static Long LOCATION_TYPE = (long) 70;
	public final static Long LOCATION_STREET_TYPE = (long) 71;
	public final static Long LOCATION_AREA_TYPE = (long) 72;
	public final static Long LOCATION_LANDMARK_TYPE = (long) 73;
	public final static Long LOCATION_PINCODE_TYPE = (long) 74;
	public final static Long LOCATION_CITY_TYPE = (long) 75;
	public final static Long LOCATION_LATITUDE_TYPE = (long) 76;
	public final static Long LOCATION_LONGITUDE_TYPE = (long) 77;
	public final static Long LOCATION_BUILDING_TYPE = (long) 78;
	public final static Long LOCATION_COUNTRY_TYPE = (long) 79;
	public final static Long LOCATION_STATE_TYPE = (long) 80;

	public final static Long ATTRIBUTE_INACTIVE = (long) 0;

	public final static String ROOT_TYPE_NAME = "ROOT";
	public final static String CATEGORY_TYPE_NAME = "CATEGORY";
	public final static String PRODUCT_TYPE_NAME = "PRODUCT";
	public final static String PRODUCER_PRODUCT_TYPE_NAME = "PRODUCER_PRODUCT";
	public final static String PRODUCER_PRODUCT_REVIEW_TYPE_NAME = "PRODUCER_PRODUCT_REVIEW";
	public final static String PRODUCER_TYPE_NAME = "PRODUCER";
	public final static String PRODUCER_BRANCH_TYPE_NAME = "PRODUCER_BRANCH";

	public final static String BRAND_TYPE_NAME = "BRAND";
	public final static String FEATURE_TYPE_NAME = "FEATURE";
	public final static String USER_TYPE_NAME = "USER";
	public static final String ATTRIBUTE_TYPE_NAME = "ATTRIBUTE";

	public final static String LOCATION_TYPE_NAME = "LOCATION";
	public final static String LOCATION_TYPE_STREET_SUBTYPE_NAME = "LOCATIONSTREET";
	public final static String LOCATION_TYPE_AREA_SUBTYPE_NAME = "LOCATIONAREA";
	public final static String LOCATION_TYPE_LANDMARK_SUBTYPE_NAME = "LOCATIONLANDMARK";
	public final static String LOCATION_TYPE_PINCODE_SUBTYPE_NAME = "LOCATIONPINCODE";
	public final static String LOCATION_TYPE_CITY_SUBTYPE_NAME = "LOCATIONCITY";

	public static final String topBannerDetails = "topBannerDetails";
	public static final String bottomLeftBannerDetails = "bottomLeftBannerDetails";
	public static final String bottomRightBannerDetails = "bottomRightBannerDetails";
	public static final String bannerImage = "bannerImage";
	public static final String deepLink = "deepLink";
	public static final String bannerText = "bannerText";
	public static final String DEFAULT_TOP_BANNER_IMG = "";
	public static final String DEFAULT_TOP_BANNER_DEEPLINK = "";
	public static final String DEFAULT_TOP_BANNER_TEXT = "";
	public static final String DEFAULT_BOT_LEFT_BANNER_IMG = "";
	public static final String DEFAULT_BOT_LEFT_BANNER_DEEPLINK = "";
	public static final String DEFAULT_BOT_LEFT_BANNER_TEXT = "";
	public static final String DEFAULT_BOT_RIGHT_BANNER_IMG = "";
	public static final String DEFAULT_BOT_RIGHT_BANNER_DEEPLINK = "";
	public static final String DEFAULT_BOT_RIGHT_BANNER_TEXT = "";

	public static final Integer FOLLOW_TYPE_DEAL = 1;
	public static final Integer FOLLOW_TYPE_PRODUCT = 2;
	public static final Integer FOLLOW_TYPE_PRODUCER = 3;
	public static final Integer FOLLOW_TYPE_PRODUCER_PRODUCT = 4;
	public static final Integer FOLLOW_TYPE_CATEGORY = 5;
	public static final Integer FOLLOW_TYPE_LOCATION = 6;
	public static final Integer FOLLOW_TYPE_USER = 8;
	public static final Integer FOLLOW_TYPE_PRODUCER_REVIEW = 10;
	public static final Integer FOLLOW_TYPE_PRODUCER_PRODUCT_REVIEW = 11;
	public static final Integer FOLLOW_TYPE_DEAL_REVIEW = 12;

	public static final Integer FOLLOW_TYPE_TAG = 13;
	public static final Integer FOLLOW_TYPE_FASHIONLOOK = 14;
	public static final Integer FOLLOW_TYPE_ECOMM_STORE = 15;
	public static final Integer FOLLOW_TYPE_CONTENT = 16;
	public static final Integer FOLLOW_TYPE_COLLECTION = 17;
	public static final Integer FOLLOW_TYPE_USER_REQUEST = 20;
	// public static final Integer FOLLOW_TYPE_ECOMMSTORE = 21;
	public static final Integer FOLLOW_TYPE_CONTENT_TYPE = 22;

	public static final Integer GROUP_CONTAINS_USER = 23;
	public static final Integer FOLLOW_TYPE_GROUP = 24;
	public static final Integer GROUP_CONTAINER_SIZE = 100;

	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_DEAL = FOLLOW_TYPE_DEAL + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_PRODUCT = FOLLOW_TYPE_PRODUCT + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_PRODUCER = FOLLOW_TYPE_PRODUCER + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_PRODUCER_PRODUCT = FOLLOW_TYPE_PRODUCER_PRODUCT + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_CATEGORY = FOLLOW_TYPE_CATEGORY + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_LOCATION = FOLLOW_TYPE_LOCATION + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_USER = FOLLOW_TYPE_USER + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_PRODUCER_REVIEW = FOLLOW_TYPE_PRODUCER_REVIEW + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_PRODUCER_PRODUCT_REVIEW = FOLLOW_TYPE_PRODUCER_PRODUCT_REVIEW
			+ 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_DEAL_REVIEW = FOLLOW_TYPE_DEAL_REVIEW + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_TAG = FOLLOW_TYPE_TAG + 0x2000L;

	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_USER_REQUEST = FOLLOW_TYPE_USER_REQUEST + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_FASHIONLOOK = FOLLOW_TYPE_FASHIONLOOK + 0x2000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_FASHIONLOOK = FOLLOW_TYPE_FASHIONLOOK + 0x2001L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_COLLECTION = FOLLOW_TYPE_COLLECTION + 0x2002L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_CONTENT = FOLLOW_TYPE_CONTENT + 0x2004L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_CONTENT_TYPE = FOLLOW_TYPE_CONTENT_TYPE + 0x2005L;
	public static final Long GLOBAL_ACTIVITY_FOLLOW_TYPE_GROUP = FOLLOW_TYPE_GROUP + 0x2000L;

	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_DEAL = 1 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_PRODUCT = 2 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_PRODUCER = 3 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_PRODUCER_PRODUCT = 4 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_CATEGORY = 5 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_LOCATION = 6 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_COLLECTION = COLLECTION + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_USER = 8 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_PRODUCER_REVIEW = 10 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_PRODUCER_PRODUCT_REVIEW = 11 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_DEAL_REVIEW = 12 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_TAG = 13 + 0x3000L;
	public static final Long GLOBAL_ACTIVITY_UNFOLLOW_TYPE_CONTENT = CONTENT_TYPE + 0x3000L;

	public static final Long POPULATE_COUNTERS = 0x4000L;

	public static final Long TRACKER_COUNTER_USER = 0x4100L | USER_TYPE;
	public static final Long TRACKER_COUNTER_USER_BY_ENTITY_ID = 0x4200L | USER_TYPE;
	public static final Long TRACKER_COUNTER_FASHION_LOOK = 0x4000L | FASHION_LOOK;
	public static final Long TRACKER_COUNTER_FASHION_LOOK_BY_ENTITY_ID = 0x4200L | FASHION_LOOK;
	public static final Long TRACKER_COUNTER_COLLECTION = 0x4000L | COLLECTION;
	public static final Long TRACKER_COUNTER_COLLECTION_BY_ENTITY_ID = 0x4200L | COLLECTION;
	public static final Long TRACKER_COUNTER_PPR = 0x4000L | PRODUCER_PRODUCT_TYPE;
	public static final Long TRACKER_COUNTER_PPR_BY_ENTITY_ID = 0x4200L | PRODUCER_PRODUCT_TYPE;
	public static final Long TRACKER_COUNTER_USER_PART_II = 0x4150L | USER_TYPE;
	public static final Long TRACKER_COUNTER_USER_PART_II_BY_ENTITY_ID = 0x4250L | USER_TYPE;
	public static final Long TRACKER_COUNTER_USER_BY_DATE = 0x4500L | USER_TYPE;
	public static final Long TRACKER_SEARCH_COLLECTION = 0x0029L;
	public static final Long TRACKER_SEARCH_ECOMM_ORDER = 0x002BL;
	public static final Long TRACKER_SEARCH_ECOMM_SETTLEMENT_LOG = 0x002CL;
	public static final Long TRACKER_SEARCH_ECOMM_EARNING_LOG = 0x002DL;
	public static final Long TRACKER_SEARCH_RESELLER = 0x002EL;
	public static final Long TRACKER_SEARCH_CONTENT = 0x0045L;
	public static final Long TRACKER_CAMPAIGN_DIWALI = 0x0091L;
	public static final Long TRACKER_CAMPAIGN_COLLECTION_DIWALI = 0x0092L;
	public static final Long TRACKER_ORDER_PICKUP_REQUEST = 0x0093L;
	public static final Long TRACKER_ORDER_ID_GENERATOR = 0x0094L;
	public static final Long TRACKER_ORDER_SETTLEMENT = 0x0095L;
	public static final Long TRACKER_TRANSCTION_VALUE_RESET = 0x0096L;
	public static final Long TRACKER_CLEANUP_SHIPPING_CHARGE = 0x4300 | ECOMM_PRODUCT_SKU;

	public static final Integer FOLLOWERS_OF_FOLLOWED_UNFOLLOWED = 1;
	public static final Integer FOLLOWING_OF_FOLLOWER = 2;

	public static final Long RESELLER_ANALYTIC_STAT = 0x0096L;

	public static final Long RELATION_TRIED = (long) 0x1001;
	public static final Long RELATION_WISH = (long) 0x1002;
	public static final Long REVIEW_SHARE = 0x5101L;
	public static final Long COMMENT_TYPE = 0x5102L;
	public static final Long COMMENT_TYPE_SECOND_DEGREE = 0x5103L;
	public static final Long COMMENT_TYPE_SECOND_DEGREE_COMMENT = 0x5104L;

	public static final Long RELATION_TRIED_PRODUCER = (long) 0x10001;
	public static final Long RELATION_WISH_PRODUCER = (long) 0x10002;
	public static final Long RELATION_TRIED_PRODUCER_PRODUCT = (long) 0x10003;
	public static final Long RELATION_WISH_PRODUCER_PRODUCT = (long) 0x10004;
	public final static Long RECOMMENDATION_ADD_TO_BOARD_ACTION = (long) 0x10005;

	public static final int CACHE_TIME_OUT_SHORT = 10000000;
	public static final int CACHE_TIME_OUT = 10 * 24 * 60 * 60 * 1000; // 10
																		// days
																		// cache
	public static final Long CACHE_TIME_OUT_ONE_DAY = 1 * 24 * 60 * 60 * 1000L; // 1
																				// day
																				// cache
	public static final int CACHE_TIME_OUT_LONG = 1000000000;
	public static final Long USER_LATEST_LOOK_EXPIRATION_TIME = 12 * 60 * 60 * 1000L;
	public static final Long GOBAL_PROMOCODE_CACHE_TIMEOUT = 24 * 60 * 60 * 1000L;
	public static final Long RE_SELLER_ENTITY_EXPIRATION_TIME = 7 * 24 * 60 * 60 * 1000L;

	public static final Long CACHE_EMPTY_PRODUCER_PRODUCT_RECOMMENDATIONS = 0x7101L;

	public static final Boolean GENDER_FILTER = false;

	public static final Boolean PRIVATE_USER_FILTER = false;

	public static final Boolean USER_LOVES_OPTIMIZED = true;

	public static final String INFLUENCER_TYPE = "influencer";

	public static final String PEOPLE_TO_FOLLOW = "people_to_follow";

	public static final String ONES_TO_WATCH = "ones_to_watch";

	public static final String TASTE_MAKERS = "taste_makers";

	public static final String TREND_TYPE = "trending";

	public static final Long GUEST_USER_ID = 5223514000850944L;

	public static final Long GUEST_USER_TYPE = 0x7102L;

	public static String getEmailRepresentationofMobileNumber(String countryCode, String mobile) {
		return mobile + "@woopler.com";
	}

	public enum Gender {
		male(0xA001L), female(0xA002L), unisex(0xA003L), unknown(0xA004L);

		private long value;

		private Gender(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}

		public static long getValue(String gender) {
			if (Gender.male.toString().equals(gender)) {
				return Gender.male.value;
			} else if (Gender.female.toString().equals(gender)) {
				return Gender.female.value;
			} else if (Gender.unisex.toString().equals(unisex)) {
				return Gender.unisex.value;
			} else {
				return Gender.unknown.value;
			}
		}

		public static String getGender(String gender) {
			if (Gender.male.toString().equals(gender)) {
				return Gender.male.toString();
			} else if (Gender.female.toString().equals(gender)) {
				return Gender.female.toString();
			} else if (Gender.unisex.toString().equals(gender)) {
				return Gender.unisex.toString();
			} else {
				return Gender.unknown.toString();
			}
		}
	}

	public enum DeviceType {
		ios("ios"), android("android"), windowsphone("windowsphone"), unknown("unknown"), desktop("desktop");

		private String value;

		private DeviceType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum UserType {
		landingpage(0xA001L), facebook(0xA002L), admin(0xA003L), exisiting(0xA004L);

		private long value;

		private UserType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum UserCommentsSetting {
		ALLOW_ALL(0x2401L), ALLOW_FOLLOWING(0x2402L), ALLOW_NONE(0x2403L),;

		private long value;

		private UserCommentsSetting(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum UserCollectionCommentSetting {
		ALLOW_ALL(0x2401L), ALLOW_FOLLOWING(0x2402L), ALLOW_NONE(0x2403L),;

		private long value;

		private UserCollectionCommentSetting(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum CampaignType {
		LOOK(0x2411L), COLLECTION(0x2412L);

		private long value;

		private CampaignType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum UserInviteSource {
		USER_INVITE_SOURCE_GMAIL_CONTACTS(0x2301L), USER_INVITE_SOURCE_FACEBOOK_CONTACTS(
				0x2302L), USER_REGISTRATION_SOURCE_MOBILE_NUMBER(0x2303L),;

		private long value;

		private UserInviteSource(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public static void addRecommendation(Long id) {
		int pos = curatedRecommendations.indexOf(id);
		if (pos >= 0) {
			curatedRecommendations.remove(pos);
		}
		curatedRecommendations.add(0, id);
		if (curatedRecommendations.size() >= 20) {
			curatedRecommendations = curatedRecommendations.subList(0, 20);
		}
	}

	// public static Long getRecommendationType(int type) {
	// if (type == Constants.producer_recommendation)
	// return REVIEW_TYPE_PRODUCER;
	// else if (type == Constants.producer_product_recommendation)
	// return REVIEW_TYPE_PRODUCERPRODUCT;
	// else if (type == Constants.deal_recommendation)
	// return REVIEW_TYPE_DEAL;
	// else
	// return null;
	// }

	public enum UserRoleType {
		INFLUENCER(0xB101L), CONTRIBUTOR(0xB102L), READONLY(0xB103L), QUEUED(0xB104L);

		private long value;

		private UserRoleType(long value) {
			this.value = value;
		}

	}

	public enum ActivityStatus {
		ACTIVE(0xB101L), INACTIVE(0xB102L), FLAGGED(0xB103L), EVENT_01(0xB104L), JNC(0xB105L), NIFTB(0xB106L), MCC(
				0xB107L), THENETWORK(0xB108L), VALENTINE(0xB109L);

		private long value;

		private ActivityStatus(long value) {
			this.value = value;
		}

	}

	public enum EntityStatisticType {
		LIKES_GOT(0xC201L), LIKES_DONE(0xC202L), SHARES_GOT(0xC203L), SHARES_DONE(0xC204L), FOLLOWER_COUNT(
				0xC205L), FOLLOWING_COUNT(0xC206L), RECOMMENDATION_COUNT(0xC207L), PAGEVIEWS_DONE(
						0xC208L), PROFILEVIEWS_GOT(0xC209L), COMMENTS_GOT(0xC20AL), COMMENTS_DONE(
								0xC20BL), CONTACT_COUNT(0xC20CL), FRESH_PRODUCTS(0xC20DL), COLLECTION_COUNT(
										0xC20EL), NOTIFICATION_COUNT(0xC20FL), VIEW_COUNT(
												0xC210L), LIKES_DONE_CHALLENGES(0xC211L), FOLLOWING_COUNT_CHALLENGES(
														0xC212L), RECOMMENDATION_COUNT_CHALLENGES(
																0xC213L), ORDER_COUNT(0xC214L);
		private long value;

		private EntityStatisticType(long value) {
			this.value = value;
		}
	}

	public enum ActivityGroup {
		REVIEW(0xC101L), ACTIVITY(0xC102L);

		private long value;

		private ActivityGroup(long value) {
			this.value = value;
		}
	}

	public enum BusinessContactPurpose {
		BUY(0xC301L), TALK(0xC302L), KNOWMORE(0xC303L), GETQUOTE(0xC304L);

		private long value;

		private BusinessContactPurpose(long value) {
			this.value = value;
		}
	}

	public enum PricingPlanElements {
		Tenure(0xE301L), Lead(0xE302L);

		private long value;

		private PricingPlanElements(long value) {
			this.value = value;
		}
	}

	public enum PlanStatus {
		ACTIVE(0xF301L), SUSPENDED(0xF302L), CLOSED(0xF305L);

		private long value;

		private PlanStatus(long value) {
			this.value = value;
		}
	}

	public enum ProducerPlanStatus {
		START(0xD301L), RENEW(0xC302L), PAYMENTPENDING(0xC303L), SUSPENDED(0xC304L), CLOSED(0xC305L);

		private long value;

		private ProducerPlanStatus(long value) {
			this.value = value;
		}
	}

	public enum DaysOfWeek {
		SUNDAY(0x9101L), MONDAY(0x9102L), TUESDAY(0x9103L), WEDNESDAY(0x9104L), THURSDAY(0x9105L), FRIDAY(
				0x9106L), SATURDAY(0x9107L);

		private long value;

		private DaysOfWeek(long value) {
			this.value = value;
		}
	}

	public enum PromotedType {
		PRODUCER_PROMOTED_FRESHPRODUCTS(0x2101L), PRODUCER_PROMOTED_ANNOUNCEMENTS(0x2102L), PRODUCER_PROMOTED_DEALS(
				0x2103L), PRODUCER_PROMOTED_EVENTS(0x2104L), PRODUCER_PROMOTED_SALE_COUPON(0x2105L);

		private long value;

		private PromotedType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum PromotionActionType {
		USER_PROMOTION_ACTION_SHOW(0x2201L), USER_PROMOTION_ACTION_CLICK(
				0x2202L), USER_PROMOTION_ACTION_STREAM_IMPRESSION(0x2203L), USER_PROMOTION_ACTION_WANT(0x2204L);

		private long value;

		private PromotionActionType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	// Activity type of global activity stream
	public enum ActivityLogType {
		USER_ACTIVITY__USER_FOLLOW_USER(0x9001L) {
			@Override
			public List<UserChallenge> getUserChallenge() {
				return Arrays.asList(UserChallenge.FOLLOW_USERS_10);
			}
		},
		USER_ACTIVITY__USER_FOLLOW_TAG(0x9002L), USER_ACTIVITY__USER_FOLLOW_LOCATION(
				0x9003L), USER_ACTIVITY__USER_FOLLOW_PRODUCER(0x9004L), USER_ACTIVITY__USER_FOLLOWED_BY_USER(0x9005L),

		USER_ACTIVITY__USER_LIKE_PRODUCERPRODUCT_REVIEW(0x9006L), USER_ACTIVITY__USER_LIKE_PRODUCER_REVIEW(
				0x9007L), USER_ACTIVITY__USER_LIKE_PRODUCERPRODUCT(0x9008L),

		USER_ACTIVITY__USER_LIKE_FASHION_LOOK(0x9009L) {
			@Override
			public List<UserChallenge> getUserChallenge() {
				return Arrays.asList(UserChallenge.LOVE_LOOK_10);
			}
		},
		USER_ACTIVITY__USER_LIKE_COLLECTION(0x9010L), USER_ACTIVITY__USER_WISH_PRODUCERPRODUCT(
				0x9011L), USER_ACTIVITY__USER_TRIED_PRODUCERPRODUCT(0x9012L), USER_ACTIVITY__USER_WISH_PRODUCER(
						0x9013L), USER_ACTIVITY__USER_TRIED_PRODUCER(
								0x9014L), USER_ACTIVITY__USER_LIKE_CONTENT(0x9015L),

		USER_ACTIVITY__USER_CREATED(0x901AL),

		USER_ACTIVITY__CREATOR_REVIEW_SHARED_BY_USER(0x9021L), USER_ACTIVITY__USER_SHARED_REVIEW_BY_CREATOR(0x9022L),

		USER_ACTIVITY__USER_CREATE_PRODUCER_REVIEW(0x9023L), USER_ACTIVITY__USER_CREATE_PRODUCERPRODUCT_REVIEW(
				0x9024L), USER_ACTIVITY__USER_COMMENTED_PRODUCER_REVIEW(
						0x9025L), USER_ACTIVITY__USER_COMMENTED_PRODUCERPRODUCT_REVIEW(
								0x9026L), USER_ACTIVITY__USER_SPOTTED_PRODUCER(
										0x9027L), USER_ACTIVITY__USER_SPOTTED_PRODUCERPRODUCT(0x9028L),

		PRODUCER_ACTIVITY__USER_SHARED_REVIEW_OF_PRODUCER(0x9029L), PRODUCER_ACTIVITY__USER_COMMENTED_PRODUCER_REVIEW(
				0x902AL), PRODUCER_ACTIVITY__USER_COMMENTED_PRODUCERPRODUCT_REVIEW(0x902BL),

		USER_ACTIVITY__USER_COMMENTED_FASHIONLOOK(0x902CL), PRODUCER_ACTIVITY__USER_COMMENTED_FASHIONLOOK(
				0x902DL), USER_ACTIVITY__USER_COMMENTED_CONTENT(
						0x902EL), USER_ACTIVITY__USER_COMMENTED_COLLECTION(0x902FL),

		PRODUCER_ACTIVITY__USER_SPOTTED_PRODUCERPRODUCT(0x9101L), PRODUCER_ACTIVITY__PRODUCER_ADDED_PRODUCERPRODUCT(
				0x9102L), PRODUCER_ACTIVITY__USER_SPOTTED_PRODUCER(
						0x9103L), PRODUCER_ACTIVITY__PRODUCER_FOLLOWED_BY_USER(
								0x9104L), PRODUCER_ACTIVITY__PRODUCER_REVIEW_CREATED_BY_USER(
										0x9105L), PRODUCER_ACTIVITY__PRODUCERPRODUCT_REVIEW_CREATED_BY_USER(
												0x9106L), PRODUCER_ACTIVITY__PRODUCERPRODUCT_LIKED_BY_USER(
														0x9107L), PRODUCER_ACTIVITY__PRODUCER_REVIEW_LIKED_BY_USER(
																0x9108L), PRODUCER_ACTIVITY__PRODUCERPRODUCT_REVIEW_LIKED_BY_USER(
																		0x9109L), PRODUCER_ACTIVITY__PRODUCER_WISHED_BY_USER(
																				0x910aL), PRODUCER_ACTIVITY__PRODUCER_TRIED_BY_USER(
																						0x910bL), PRODUCER_ACTIVITY__PRODUCERPRODUCT_WISHED_BY_USER(
																								0x910cL), PRODUCER_ACTIVITY__PRODUCERPRODUCT_TRIED_BY_USER(
																										0x910dL),

		STORE_ACTIVITY__FASHION_LOOK_LIKED_BY_USER(0x9111L),

		USER_ACTIVITY__USER_CONTACT_PRODUCER(0x902CL), USER_ACTIVITY__USER_RECOMMENDATION_INFLUENCED_CONTACT_PRODUCER(
				0x902DL), USER_ACTIVITY__USER_RECOMMENDATION_WAS_INFLUENCED_CONTACT_PRODUCER(
						0x902EL), PRODUCER_ACTIVITY__USER_CONTACT_PRODUCER(
								0x910EL), PRODUCER_ACTIVITY__USER_RECOMMENDATION_INFLUENCED_CONTACT_PRODUCER(0x910FL),

		// producer owner added fresh products
		OWNER_USER_ACTIVITY_USER_SPOTTED_PRODUCER_REVIEW(
				0x920AL), PRODUCER_ACTIVITY__PRODUCER_REVIEW_CREATED_BY_OWNER_USER(
						0x920BL), USER_ACTIVITY_OWNER_USER_CREATE_PRODUCERPRODUCT_REVIEW(
								0x920AL), PRODUCER_ACTIVITY__PRODUCERPRODUCT_REVIEW_CREATED_BY_OWNER_USER(0x920BL),

		USER_ACTIVITY__USER_CREATE_USERBOARD(0x920CL),

		USER_ACTIVITY__USER_ADDED_RECOMMENDATION_TO_USERBOARD(
				0x920DL), USER_ACTIVITY__USERBOARD_ADDED_WITH_NEW_RECOMMENDATION(0x920EL),

		USER_ACTIVITY__CREATORS_RECOMMENDATION_ADDED_TO_USERBOARD(
				0x920FL), USER_ACTIVITY__USERBOARD_ADDED_WITH_CREATORS_RECOMMENDATION(0x9210L),

		PRODUCER_ACTIVITY__PRODUCERS_RECOMMENDATION_ADDED_TO_USERBOARD(
				0x9211L), PRODUCER_ACTIVITY__USERBOARD_ADDED_WITH_PRODUCERS_RECOMMENDATION(0x9212L),

		USER_ACTIVITY__USER_FOLLOW_USER_REQUEST(0x9213L), USER_ACTIVITY__USER_FOLLOW_REQUESTED_BY_USER(
				0x9214L), USER_ACTIVITY__USER_CREATE_FASHION_LOOK(0x9215L) {
					@Override
					public List<UserChallenge> getUserChallenge() {
						return Arrays.asList(UserChallenge.POST_LOOK_1, UserChallenge.POST_LOOK_2,
								UserChallenge.POST_LOOK_3, UserChallenge.POST_LOOK_4, UserChallenge.POST_LOOK_5);
					}
				},
		MERCHANT_ACTIVITY__FASHION_LOOK_CREATED_BY_USER_OR_CURATOR(0x9216L),

		CURATOR_ACTIVITY_CURATOR_CREATE_ECOMMPRODUCT(0x9217L), CURATOR_ACTIVITY_CURATOR_UPDATE_ECOMMPRODUCT(
				0x9218L), CURATOR_ACTIVITY_CURATOR_POST_PRODUCT_ATTRIBUTE(
						0x9219L), CURATOR_ACTIVITY_CURATOR_UPDATE_PRODUCT_PRICE(
								0x921AL), USER_ACTIVITY_USER_VIEW_ECOMMPRODUCT(
										0x921BL), USER_ACTIVITY_USER_VIEW_PROFILEACTIVITY(
												0x921CL), USER_ACTIVITY_USER_VIEW_PRODUCT_ATTRIBUTE(
														0x921DL), CURATOR_ACTIVITY_CURATOR_UPDATE_PRODUCT(
																0x921EL), USER_ACTIVITY_USER_VIEW_SIMILAR_ECOMMPRODUCTS(
																		0x921FL), CURATOR_ACTIVITY_CURATOR_VIEW_NEVER_CURATEDLOOKS(
																				0x9220L), CURATOR_ACTIVITY_CURATOR_CREATE_ECOMMSTORE(
																						0x9221L), CURATOR_ACTIVITY_CURATOR_UPDATE_ECOMMSTORE(
																								0x9222L), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMSTORE_LIST(
																										0x9223L), USER_ACTIVITY_USER_VIEW_SMALL_ECOMMSTORE_LIST(
																												0x9224L), // Not
																															// being
																															// used.
		USER_ACTIVITY_USER_SEARCH_ECOMMSTORES(0x9225L), CURATOR_ACTIVITY_CURATOR_DELETE_ECOMMSTORE(
				0x9226L), USER_ACTIVITY_USER_VIEW_ECOMMSTORE(0x9227L), USER_ACTIVITY_USER_VIEW_ECOMMSTORE_PROFILE(
						0x9228L), USER_ACTIVITY_USER_VIEW_ECOMMPRODUCTS_BY_ECOMMSTORE(
								0x9229L), USER_ACTIVITY_USER_FOLLOW_ECOMMSTORE(
										0x922AL), USER_ACTIVITY_USER_UNFOLLOW_ECOMMSTORE(
												0x922BL), USER_ACTIVITY_USER_VIEW_STORE_FOLLOWERS(
														0x922CL), USER_ACTIVITY_USER_VIEW_STORES_LOOKS(
																0x922DL), USER_ACTIVITY_USER_LOVE_LOOK(
																		0x922EL), USER_ACTIVITY_USER_UNLOVE_LOOK(
																				0x922FL), USER_ACTIVITY_USER_COMMENT_ON_LOOK(
																						0x9230L), USER_ACTIVITY_USER_UNCOMMENT_ON_LOOK(
																								0x9231L), USER_ACTIVITY_USER_POST_LOOKS_MULTIPART(
																										0x9232L), USER_ACTIVITY_USER_DELETE_FASHION_LOOK(
																												0x9233L), USER_ACTIVITY_USER_VIEW_FASHIONLOOK(
																														0x9234L), CURATOR_ACTIVITY_CURATOR_UPDATE_FASHION_LOOK_TAGGED_LINKS(
																																0x9235L), CURATOR_ACTIVITY_CURATOR_UPDATE_FASHION_LOOK_TEXT(
																																		0x9236L), CURATOR_ACTIVITY_CURATOR_UPDATE_FASHION_LOOK(
																																				0x9237L), CURATOR_ACTIVITY_CURATOR_CREATE_FASHION_ITEM(
																																						0x9238L), CURATOR_ACTIVITY_CURATOR_CREATE_FASHION_ITEM_BATCH(
																																								0x9239L), USER_ACTIVITY_USER_VIEW_FASHION_ITEM(
																																										0x923AL), CURATOR_ACTIVITY_CURATOR_DELETE_FASHION_ITEM(
																																												0x923BL), CURATOR_ACTIVITY_CURATOR_UPDATE_FASHION_ITEM(
																																														0x923CL), CURATOR_ACTIVITY_CURATOR_LINK_PRODUCT_TO_FASHION_LOOK(
																																																0x923DL), CURATOR_ACTIVITY_CURATOR_UNLINK_FASHION_ITEM_TO_PRODUCT(
																																																		0x923EL), USER_ACTIVITY_USER_VIEW_FASHION_LOOK_LOVES(
																																																				0x9240L), USER_ACTIVITY_USER_VIEW_FASHION_LOOK_COMMENTS(
																																																						0x9241L), USER_ACTIVITY_USER_VIEW_SIMILAR_LOOKS(
																																																								0x9242L), USER_ACTIVITY_USER_VIEW_SIMILAR_PRODUCTS(
																																																										0x9243L), USER_ACTIVITY_USER_VIEW_SIMILAR_PRODUCTS_AND_LOOKS(
																																																												0x9244L), CURATOR_ACTIVITY_CURATOR_VIEW_LINKEDPRODUCTS_FOR_TAG_ITEM(
																																																														0x9245L), USER_ACTIVITY_USER_VIEW_LINKED_LOOKS(
																																																																0x9246L), USER_ACTIVITY_USER_VIEW_TAGGED_LOOKS(
																																																																		0x9247L), USER_ACTIVITY_USER_VIEW_LINKED_AND_TAGGGED_LOOKS(
																																																																				0x9248L), USER_ACTIVITY_USER_VIEW_RECENT_FASHION_LOOK_STREAM(
																																																																						0x9249L), USER_ACTIVITY_USER_VIEW_FASHION_LOOK_STREAM_BY_ID(
																																																																								0x924AL), USER_ACTIVITY_USER_VIEW_SMALL_FASHION_LOOK_STREAM_BY_ID(
																																																																										0x924BL), USER_ACTIVITY_USER_VIEW_SOCIAL_LOOK_STREAM(
																																																																												0x924CL), USER_ACTIVITY_USER_VIEW_TRENDING_FASHIONLOOK_STREAM(
																																																																														0x924DL), USER_ACTIVITY_USER_VIEW_GUIDE(
																																																																																0x924EL), USER_ACTIVITY_USER_VIEW_GUIDE_STREAM(
																																																																																		0x924FL), USER_ACTIVITY_USER_VIEW_GUIDE_STREAM_BY_CITY(
																																																																																				0x9250L), USER_ACTIVITY_USER_VIEW_GUIDE_STREAM_BY_CITY_AND_CATEGORY(
																																																																																						0x9251L), USER_ACTIVITY_USER_PERFORM_LOGIN(
																																																																																								0x9252L) {
																																																																																							@Override
																																																																																							public List<UserChallenge> getUserChallenge() {
																																																																																								return Arrays
																																																																																										.asList(UserChallenge.LOGIN);
																																																																																							}
																																																																																						},
		USER_ACTIVITY_USER_PERFORM_LOGOUT(0x9253L), USER_ACTIVITY_USER_SEARCH_REVVIEWS(
				0x9254L), CURATOR_ACTIVITY_CURATOR_DELETE_CONTENT_BY_ID(
						0x9306L), CURATOR_ACTIVITY_CURATOR_PUBLISH_CONTENT(
								0x9307L), CURATOR_ACTIVITY_CURATOR_DELETE_WIDGET(
										0x9308L), CURATOR_ACTIVITY_CURATOR_SAVE_CONTENT(
												0x9309L), CURATOR_ACTIVITY_CURATOR_UNPUBLISH_CONTENT(
														0x930AL), CURATOR_ACTIVITY_CURATOR_UPSERT_WIDGET(
																0x930BL), CURATOR_ACTIVITY_CURATOR_MAKE_CONTENT_STICKY(
																		0x930CL), CURATOR_ACTIVITY_CURATOR_GET_CONTENT_TYPES(
																				0x930DL), CURATOR_ACTIVITY_CURATOR_GET_CONTENTS(
																						0x930EL), USER_ACTIVITY_USER_GET_CONTENT(
																								0x930FL), CURATOR_ACTIVITY_CURATOR_GET_CONTENT(
																										0x9310L), USER_ACTIVITY_USER_LOVE_CONTENT(
																												0x9311L)

		{
																											@Override
																											public boolean isUserSearch() {
																												return Boolean.TRUE;
																											}

																											@Override
																											public String getAttribute() {
																												return "searchText";
																											}
																										},
		USER_ACTIVITY_USER_SEARCH_USERS(0x9255L) {
			@Override
			public boolean isUserSearch() {
				return Boolean.TRUE;
			}

			@Override
			public String getAttribute() {
				return "searchText";
			}
		},
		USER_ACTIVITY_USER_SEARCH_BRANCHES(0x9256L) {
			@Override
			public boolean isUserSearch() {
				return Boolean.TRUE;
			}

			@Override
			public String getAttribute() {
				return "searchText";
			}
		},
		USER_ACTIVITY_USER_SEARCH_ECOMMPRODUCT(0x9258L) {
			@Override
			public boolean isUserSearch() {
				return Boolean.TRUE;
			}

			@Override
			public String getAttribute() {
				return "searchText";
			}
		},
		USER_ACTIVITY_USER_SEARCH_FASHION_LOOK(0x9259L) {
			@Override
			public boolean isUserSearch() {
				return Boolean.TRUE;
			}

			@Override
			public String getAttribute() {
				return "searchText";
			}
		},
		USER_ACTIVITY_USER_SEARCH_ENTITY(0x925AL) {
			@Override
			public boolean isUserSearch() {
				return Boolean.TRUE;
			}

			@Override
			public String getAttribute() {
				return "searchText";
			}
		},
		USER_ACTIVITY_USER_VIEW_OWN_PROFILE(0x925BL), USER_ACTIVITY_USER_VIEW_RECOMMENDATIONS(
				0x925CL), USER_ACTIVITY_USER_VIEW_LOVES(0x925DL), USER_ACTIVITY_USER_VIEW_ACTIVITY(
						0x925EL), USER_ACTIVITY_USER_REMOVE_FOLLOWER(0x925FL), USER_ACTIVITY_USER_ALLOW_FOLLOWER(
								0x9260L), USER_ACTIVITY_USER_VIEW_FOLLOW_REQUESTS(
										0x9261L), USER_ACTIVITY_USER_VIEW_FOLLOWERS(
												0x9262L), USER_ACTIVITY_USER_VIEW_FOLLOWING(
														0x9263L), USER_ACTIVITY_USER_UPDATE_USERINFO(
																0x9264L), USER_ACTIVITY_USER_UPDATE_FBNOTIFICATION(
																		0x9265L), USER_ACTIVITY_USER_UPDATE_FBNOTIFICATION_SETTINGS(
																				0x9266L), USER_ACTIVITY_USER_UNREGISTER_PUSHNOTIFICATION(
																						0x9267L), USER_ACTIVITY_USER_REGISTER_DEVICE(
																								0x9268L), USER_ACTIVITY_USER_INVITE_FRIENDS(
																										0x9269L), USER_ACTIVITY_USER_REGISTER_PUSHNOTIFICATION(
																												0x926AL), USER_ACTIVITY_USER_VIEW_USERS_TO_FOLLOW(
																														0x926BL), USER_ACTIVITY_USER_VIEW_INFLUENCERS_TO_FOLLOW(
																																0x926CL), USER_ACTIVITY_USER_POST_INVITES(
																																		0x926DL), USER_ACTIVITY_USER_VIEW_OTHERUSER(
																																				0x926EL), USER_ACTIVITY_USER_VIEW_OTHERUSERS_RECOMMENDATIONS(
																																						0x926FL), USER_ACTIVITY_USER_VIEW_OTHERUSERS_ACTIVITY(
																																								0x9270L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_FOLLWERS(
																																										0x9271L), USER_ACTIVITY_USER_FOLLOW_OTHERUSER(
																																												0x9272L), USER_ACTIVITY_USER_UNFOLLOW_OTHERUSER(
																																														0x9273L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_FOLLOWING(
																																																0x9274L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOOKS_LOVES(
																																																		0x9275L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOOKS(
																																																				0x9276L), USER_ACTIVITY_USER_VIEW_TRENDING_USERS(
																																																						0x9277L), USER_ACTIVITY_USER_VIEW_CATEGORIES(
																																																								0x9278L), USER_ACTIVITY_USER_VIEW_SUBCATEGORIES(
																																																										0x9279L), USER_ACTIVITY_USER_VIEW_STATIC_DYNAMIC_SUBCATEGORIES(
																																																												0x927AL), USER_ACTIVITY_USER_VIEW_TRENDS(
																																																														0x927BL), USER_ACTIVITY_USER_VIEW_TOP_RECOMMENDATIONS(
																																																																0x927CL), USER_ACTIVITY_USER_VIEW_TOP_STORES(
																																																																		0x927DL), USER_ACTIVITY_USER_VIEW_SPECIFIC_TRENDS(
																																																																				0x927EL), USER_ACTIVITY_USER_VIEW_ATTRIBUTE(
																																																																						0x927FL), USER_ACTIVITY_USER_VIEW_PRODUCER_FRESH_RECOMMENDATIONS(
																																																																								0x9281L), USER_ACTIVITY_USER_VIEW_PRODUCER_RECOMMENDATIONS(
																																																																										0x9282L), USER_ACTIVITY_USER_VIEW_PRODUCER(
																																																																												0x9283L), USER_ACTIVITY_USER_VIEW_PRODUCER_ACTIVITY(
																																																																														0x9284L), USER_ACTIVITY_USER_VIEW_PRODUCER_FOLLOWERS(
																																																																																0x9285L), USER_ACTIVITY_USER_VIEW_PRODUCER_LOCATIONS(
																																																																																		0x9286L), USER_ACTIVITY_USER_FOLLOW_PRODUCER(
																																																																																				0x9287L), USER_ACTIVITY_USER_UNFOLLOW_PRODUCER(
																																																																																						0x9288L), USER_ACTIVITY_USER_VIEW_INFLUENCERS(
																																																																																								0x9289L), USER_ACTIVITY_USER_VIEW_SIMILAR_ECOMMPRODUCTS_LOOKS(
																																																																																										0x928AL), USER_ACTIVITY__USER_CREATE_COLLECTION(
																																																																																												0x928BL) {
																																																																																											@Override
																																																																																											public List<UserChallenge> getUserChallenge() {
																																																																																												return Arrays
																																																																																														.asList(UserChallenge.CREATE_COLLECTION_1);
																																																																																											}
																																																																																										},
		USER_ACTIVITY_USER_VIEW_OWN_LOOKS(0x928CL), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_LOOKS(
				0x928DL), USER_ACTIVITY_USER_VIEW_OWN_LOVED_LOOKS(0x928EL), USER_ACTIVITY_USER_CREATE_COLLECTION(
						0x928FL), CURATOR_ACTIVITY_CURATOR_CREATE_COLLECTION(
								0x9290L), USER_ACTIVITY_USER_UPDATE_COLLECTION(
										0x9291L), CURATOR_ACTIVITY_CURATOR_UPDATE_COLLECTION(
												0x9292L), USER_ACTIVITY_USER_DELETE_COLLECTION(
														0x9293L), CURATOR_ACTIVITY_CURATOR_DELETE_COLLECTION(
																0x9294L), USER_ACTIVITY_USER_CREATE_COLLECTION_WITH_ENTITY(
																		0x9295L), USER_ACTIVITY_USER_VIEW_USER_COLLECTIONS(
																				0x9296L), USER_ACTIVITY_USER_VIEW_PUBLIC_COLLECTIONS(
																						0x9297L), USER_ACTIVITY_USER_DELETE_ENTITY_FROM_COLLECTION(
																								0x9298L), CURATOR_ACTIVITY_CURATOR_DELETE_ENTITY_FROM_COLLECTION(
																										0x9299L), CURATOR_ACTIVITY_CURATOR_VIEW_CURATOR_COLLECTION_LOOKS(
																												0x929AL), USER_ACTIVITY_USER_VIEW_CURATED_COLLECTION(
																														0x929BL), CURATOR_ACTIVITY_CURATOR_VIEW_CURATOR_COLLECTION_PRODUCTS(
																																0x929CL), USER_ACTIVITY_USER_VIEW_USER_COLLECTION(
																																		0x929DL), USER_ACTIVITY_USER_LOVE_COLLECTION(
																																				0x929EL), USER_ACTIVITY_USER_ADD_ENTITY_TO_COLLECTION(
																																						0x929FL), CURATOR_ACTIVITY_CURATOR_ADD_ENTITY_TO_COLLECTION(
																																								0x92A0L), CURATOR_ACTIVITY_CURATOR_DELETE_ECOMMPRODUCT(
																																										0x92A1L), CURATOR_ACTIVITY_CURATOR_VIEW_LINKED_LOOKS(
																																												0x92A2L), CURATOR_ACTIVITY_CURATOR_VIEW_ALL_CURATED_COLLECTIONS(
																																														0x92A3L), CURATOR_ACTIVITY_CURATOR_DELETE_TRENDING_ENTRY(
																																																0x92A4L), CURATOR_ACTIVITY_CURATOR_VIEW_TAGGED_LINKED_STAFFED_LOOKS(
																																																		0x92A5L), CURATOR_ACTIVITY_CURATOR_POST_AUTO_LOOKLOVE(
																																																				0x92A6L), CURATOR_ACTIVITY_CURATOR_VIEW_SIMILAR_TAGGED_PRODUCTS(
																																																						0x92A7L), CURATOR_ACTIVITY_CURATOR_VIEW_COLLECTION_DETAILS(
																																																								0x92A8L), CURATOR_ACTIVITY_CURATOR_VIEW_RECENT_FASHION_LOOK_STREAM(
																																																										0x92A9L), CURATOR_ACTIVITY_CURATOR_VIEW_RECENT_FASHION_LOOK_SERVERCALL(
																																																												0x92AAL), CURATOR_ACTIVITY_CURATOR_VIEW_LOOK_DETAILS(
																																																														0x92ABL), USER_ACTIVITY_USER_VIEW_OTHERUSER_COLLECTIONS(
																																																																0x92ACL), USER_ACTIVITY_USER_VIEW_CURATED_COLLECTION_LOOKS(
																																																																		0x92ADL), USER_ACTIVITY_USER_VIEW_USER_COLLECTION_LOOKS(
																																																																				0x92AEL), USER_ACTIVITY_USER_VIEW_CURATED_COLLECTION_PRODUCTS(
																																																																						0x92AFL), USER_ACTIVITY_USER_VIEW_USER_COLLECTION_PRODUCTS(
																																																																								0x92B0L), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMSTORE(
																																																																										0x92B1L), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMPRODUCTS_BY_ECOMMSTORE(
																																																																												0x92B2L), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMPRODUCT(
																																																																														0x92B3L), CURATOR_ACTIVITY_CURATOR_SEARCH_ECOMMPRODUCT(
																																																																																0x92B4L), CURATOR_ACTIVITY_CURATOR_LOVE_LOOK(
																																																																																		0x92B5L), CURATOR_ACTIVITY_CURATOR_VIEW_SIMILAR_PRODUCTS_AND_LOOKS(
																																																																																				0x92B6L), CURATOR_ACTIVITY_CURATOR_UPDATE_LINKED_TAGGED(
																																																																																						0x92B7L), CURATOR_ACTIVITY_CURATOR_POST_LOOKS_MULTIPART(
																																																																																								0x92B8L), CURATOR_ACTIVITY_CURATOR_VIEW_PUBLIC_COLLECTIONS(
																																																																																										0x92B9L), USER_NOTIFICATION(
																																																																																												0x92BAL), USER_ACTIVITY_USER_NEWLY_JOINED(
																																																																																														0x92BBL),

		USER_ACTIVITY_USER_UNLOVE_COLLECTION(0x92BCL),

		CURATOR_ACTIVITY_CURATOR_DELETE_FASHION_LOOK(0x92BCL), USER_ACTIVITY_USER_SEARCH_COLLECTIONS(
				0x92BDL), CURATOR_ACTIVITY_CURATOR_SEARCH_COLLECTIONS(0x92BEL), USER_ACTIVITY_USER_SEARCH_CONTENTS(
						0x92BFL), CURATOR_ACTIVITY_CURATOR_SEARCH_CONTENTS(0x92C0L), USER_ACTIVITY_USER_SEARCH_STORES(
								0x92C1L), CURATOR_ACTIVITY_CURATOR_SEARCH_STORES(
										0x92C2L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_COLLECTIONS(
												0x92C3L), USER_ACTIVITY_USER_VIEW_OWN_LOVED_COLLECTIONS(
														0x92C4L), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_CONTENTS(
																0x92C5L), USER_ACTIVITY_USER_VIEW_OWN_LOVED_CONTENTS(
																		0x92C6L), USER_ACTIVITY_USER_INTEND_TO_BUY(
																				0x92C7L), USER_ACTIVITY_USER_ADDED_PRODUCT_TO_CART(
																						0x92C8L), USER_ACTIVITY_USER_ADDED_MULIPLE_PRODUCTS_TO_CART(
																								0x92C9L), USER_ACTIVITY_USER_MODIFIED_CART(
																										0x92CAL), USER_ACTIVITY_USER_DELETE_PRODUCT_FROM_CART(
																												0x92CBL), USER_ACTIVITY_USER_DELETE_ALL_PRODUCTS_FROM_CART(
																														0x92CCL), USER_ACTIVITY_USER_CREATE_CUSTOMER_ADDRESS(
																																0x92CDL), USER_ACTIVITY_USER_INTEND_TO_BUY_PRODUCT_FROM_CART(
																																		0x92CEL), USER_ACTIVITY_USER_INITIATE_BUY_COD(
																																				0x92CFL), USER_ACTIVITY_USER_INITIATE_BUY_PG(
																																						0x92D0L), USER_ACTIVITY_USER_PAYMENT_SUCCESSFUL_PG(
																																								0x92D1L), USER_ACTIVITY_USER_PAYMENT_FAILED_PG(
																																										0x92D2L), USER_ACTIVITY_USER_PAYMENT_SUCCESSFUL_COD(
																																												0x92D3L), USER_ACTIVITY_USER_PAYMENT_FAILED_COD(
																																														0x92D4L), USER_ACTIVITY_USER_VIEW_PRODUCTS_FROM_CART(
																																																0x92D5L),

		USER_ACTIVITY_USER_CREATED_HANDLE(0x92D6L), USER_ACTIVITY_USER_FIND_FRIENDS_ON_WOOPLR(
				0x92D7L), CURATOR_ACTIVITY_USER_FEATURED_IN_CONTENT(0x92D8L) {
					@Override
					public List<UserChallenge> getUserChallenge() {
						return Arrays.asList(UserChallenge.FEATURED_IN_CONTENT_COTM,
								UserChallenge.FEATURED_IN_CONTENT_OOTD, UserChallenge.FEATURED_IN_CONTENT_FOTD,
								UserChallenge.FEATURED_IN_CONTENT_LOOK_BOOK, UserChallenge.FEATURED_IN_CONTENT);
					}
				},
		CURATOR_ACTIVITY_CURATOR_VERIFIED_LOOK(0x92D9L);

		private long value;
		public static Map<Long, ActivityLogType> map = new HashMap<Long, ActivityLogType>();

		static {
			for (ActivityLogType activityLogType : ActivityLogType.values()) {
				map.put(activityLogType.value, activityLogType);
			}
		}

		private ActivityLogType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}

		public boolean isUserSearch() {
			return Boolean.FALSE;
		}

		public String getAttribute() { // TODO: personalization: object build
										// for looks, prod
			return null;
		}

		public List<UserChallenge> getUserChallenge() {
			return null;
		}

		public static ActivityLogType getActivityLogType(Long value) {
			return map.get(value);
		}
	}

	;

	// TODO: remove methods below later if not needed.

	static {

		tagNameToDisplay.put(CATEGORY_TYPE, CATEGORY_TYPE_NAME);
		tagNameToDisplay.put(BRAND_TYPE, BRAND_TYPE_NAME);
		// categoryNameToDisplay.put(PRODUCT_TYPE,PRODUCT_TYPE_NAME);
		tagNameToDisplay.put(FEATURE_TYPE, FEATURE_TYPE_NAME);
		tagNameToDisplay.put(LOCATION_AREA_TYPE, LOCATION_TYPE_AREA_SUBTYPE_NAME);
		tagNameToDisplay.put(LOCATION_CITY_TYPE, LOCATION_TYPE_CITY_SUBTYPE_NAME);
		tagNameToDisplay.put(LOCATION_PINCODE_TYPE, LOCATION_TYPE_PINCODE_SUBTYPE_NAME);
		tagNameToDisplay.put(LOCATION_LANDMARK_TYPE, LOCATION_TYPE_LANDMARK_SUBTYPE_NAME);
		tagNameToDisplay.put(LOCATION_STREET_TYPE, LOCATION_TYPE_STREET_SUBTYPE_NAME);

	}

	public static HashMap<Long, String> getTagTypesListing() {
		return tagNameToDisplay;
	}

	public static void create(Long entityId, int type) {
		EntityType entityType = new EntityType();
		entityType.setEntityId(entityId);
		entityType.setEntitytype(type);
		EntityTypeDAO.save(entityType);
	}

	public static int getEntityType(Long entityId) {
		return EntityTypeDAO.getEntityType(entityId);
	}

	public enum BoardType {
		HTML_TYPE(0x9301L), GENERIC_RECOMMENDATION_TYPE(0x9302L), SHOPPING_DAY(0x9303L), MY_GIFTS(
				0x9304L), SHOE_FANTASY(0x9305L),;

		private long value;

		private BoardType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}

	}

	public static final String CLICKSTREAM_TOPUSER = "CLICKSTREAM_TOPUSER";

	public enum TagFrequencyEntityType {
		ENTITY_TOP_USERS("TOP_USERS_ENTITY"), ENTITY_TOP_STORES("TOP_STORES_ENTITY"), ENTITY_TOP_TAGS(
				"TOP_TAGS_ENTITY"), LOOK_TOP_USERS("LOOK_TOP_USERS"),;

		private String entityType;

		public String getEntityType() {
			return entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		private TagFrequencyEntityType(String entityType) {
			this.entityType = entityType;
		}
	}

	public enum ContentType {
		BASIC("BASIC"), VIDEO("VIDEO"), PEOPLE("PEOPLE");

		private static Map<String, ContentType> map = new HashMap<String, ContentType>();

		private String contentType;

		ContentType(String contentType) {
			this.contentType = contentType;
		}

		@Override
		public String toString() {
			return contentType;
		}

		static {
			for (ContentType contentType : ContentType.values()) {
				map.put(contentType.toString(), contentType);
			}
		}

		public static ContentType getContentType(String contentTypeString) {
			return map.get(contentTypeString);
		}

		public String getContentType() {
			return contentType;
		}
	}

	public static final String processedEntityKey[] = { "TOPSTORES", "TOPUSERS", "CURATEDSTORES", "LOOK_TOP_USERS" };

	public enum TrendingEntity {
		USER_ENTITY("USER_ENTITY"), PPR_ENTITY("PPR_ENTITY"), LOOK_ENTITY("LOOK_ENTITY"), STORE_ENTITY(
				"STORE_ENTITY"), OLD_RECOMMENDATION_ENTITY("OLD_RECOMMENDATION_ENTITY");

		private String logEntityType;

		public String getLogEntityType() {
			return logEntityType;
		}

		public void setLogEntityType(String logEntityType) {
			this.logEntityType = logEntityType;
		}

		private TrendingEntity(String logEntityType) {
			this.logEntityType = logEntityType;
		}
	}

	public enum UserStatus {
		GUEST, INACTIVE, BLOCKED, ACTIVE, ANONYMOUS, SWITCHED, SPAM, NULL, ADMIN, CURATOR, BUSINESS;

		// only bocked used now
		public static UserStatus getUserStatus(String userStatus) {
			if (GUEST.toString().equalsIgnoreCase(userStatus)) {
				return GUEST;

			} else if (INACTIVE.toString().equalsIgnoreCase(userStatus)) {
				return INACTIVE;

			} else if (BLOCKED.toString().equalsIgnoreCase(userStatus)) {
				return BLOCKED;

			} else if (ACTIVE.toString().equalsIgnoreCase(userStatus)) {
				return ACTIVE;

			} else if (ANONYMOUS.toString().equalsIgnoreCase(userStatus)) {
				return ANONYMOUS;

			} else if (SWITCHED.toString().equalsIgnoreCase(userStatus)) {
				return SWITCHED;

			} else if (NULL.toString().equalsIgnoreCase(userStatus)) {
				return NULL;

			} else if (SPAM.toString().equalsIgnoreCase(userStatus)) {
				return SPAM;

			} else if (ADMIN.toString().equalsIgnoreCase(userStatus)) {
				return ADMIN;

			} else if (CURATOR.toString().equalsIgnoreCase(userStatus)) {
				return CURATOR;

			} else if (BUSINESS.toString().equalsIgnoreCase(userStatus)) {
				return BUSINESS;

			} else {
				return null;
			}
		}
	}

	public enum ProfileType {
		FASHIONISTA("FASHIONISTA"), AMBASSADOR("AMBASSADOR"), EDITOR("EDITOR"), INFLUENCER("INFLUENCER"), NORMAL(
				"NORMAL");

		private String value;

		private ProfileType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum OrderAPIType {
		ORDER_BOT("ORDER_BOT"), ORDER_API("ORDER_API"), ORDER_OFFLINE("ORDER_OFFLINE");

		private String value;

		private OrderAPIType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum CollectionType {
		SPOTLIGHT(0xAAA0L), TREND(0xAAA1L), // default curator collection
											// creation
		DEFAULT_WISHLIST(0xAAA2L), USER(0xAAA3L), // default user collection
													// creation
		DEFAULT_BIRTHDAY(0xAAA4L), DEFAULT_BUY_LATER(0xAAA5L), SHOPPING_CART(0xAAA7L), PINNED_TREND(0xAAA6L),

		// -----------------------------
		RESELLER_USER(0xAAA8L), RESELLER_CURATOR(0xAAA9L), RESELLER_USER_DEFAULT_COLLECTION(0xAAAAL);

		private long value;

		private CollectionType(long value) {
			this.value = value;
		}

		public long getValue() {
			return value;
		}

		public void setValue(long value) {
			this.value = value;
		}
	}

	public enum ApiVersion {
		V1("v1"), V2("v2"), V3("v3"), V5("v5");

		ApiVersion(String version) {
			this.version = version;
		}

		private String version;

		public String getVersion() {
			return version;
		}
	}

	public enum LookupFilter {
		DISCOUNTED("on_sale") {
			@Override
			protected List<Object> getValues() {
				return new ArrayList<Object>() {
					{
						add(Boolean.TRUE.toString());
						add(Boolean.FALSE.toString());
					}
				};
			}
		},
		PRICE("price_range") {
			@Override
			protected List<Object> getValues() {
				List<Object> priceRanges = new ArrayList<Object>();
				SearchFilterPriceRangeJAXB price1 = new SearchFilterPriceRangeJAXB();
				price1.setLowerLimit(0d);
				price1.setUpperLimit(499d);
				priceRanges.add(price1);

				SearchFilterPriceRangeJAXB price2 = new SearchFilterPriceRangeJAXB();
				price2.setLowerLimit(500d);
				price2.setUpperLimit(999d);
				priceRanges.add(price2);

				SearchFilterPriceRangeJAXB price3 = new SearchFilterPriceRangeJAXB();
				price3.setLowerLimit(1000d);
				price3.setUpperLimit(1499d);
				priceRanges.add(price3);

				SearchFilterPriceRangeJAXB price4 = new SearchFilterPriceRangeJAXB();
				price4.setLowerLimit(1500d);
				price4.setUpperLimit(1999d);
				priceRanges.add(price4);

				SearchFilterPriceRangeJAXB price5 = new SearchFilterPriceRangeJAXB();
				price5.setLowerLimit(2000d);
				price5.setUpperLimit(4999d);
				priceRanges.add(price5);

				SearchFilterPriceRangeJAXB price6 = new SearchFilterPriceRangeJAXB();
				price6.setLowerLimit(5000d);
				price6.setUpperLimit(null);
				priceRanges.add(price6);

				// SearchFilterPriceRangeJAXB price7 = new
				// SearchFilterPriceRangeJAXB();
				// price7.setLowerLimit(10000d);
				// price7.setUpperLimit(null);
				// priceRanges.add(price7);

				return priceRanges;
			}
			// }, COLOR("color") {
			// @Override
			// protected List<String> getValues() {
			// return ColorConstants.colorHexCodes;
			// }
		},
		BRAND("brand") {
			@Override
			protected List<Object> getValues() {
				// TODO static list for now: need to run facets and get live max
				// values: returning 20 values
				return new ArrayList<Object>() {
					{
						add("Shop Nineteen");
						add("Miss Chase");
						add("Vajor");
						add("Forever 21");
						add("Style Fiesta");
						add("Candidly Couture");
						add("Closet37");
						add("Divaat");
						add("Chen Chen Fashion");
						add("Kaaryah");
						add("Spring Break");
						add("Baublebeads");
						add("Ebony Twist");
						add("Feelinwow");
						add("Niche");
						add("BandBox");
						add("Chic Accessorizer");
						add("Mariposa Love");
						add("Felomhe");
						add("WhySoBlue");
						add("Fancy Pants");
						add("Pataaka");

						add("Mango");
						add("StalkBuyLove");
						add("Koovs");
						add("FOREVER NEW");
						// add("India Circus");
						add("Fab India");
						add("Biba");
						add("Dorothy Perkins");
						add("New Look");
						add("Vero Moda");
						add("FabAlley");
						add("Bewakoof");
						add("Carlton London");
						add("Bhane");
						add("Nike");
						add("River Island");

					}
				};
			}
			// }, STORE("store") {
			// @Override
			// protected List<String> getValues() {
			// //TODO static list for now: need to run facets and get live max
			// values: returning 10 values
			// return new ArrayList<String>() {{
			// add("Jabong");
			// add("Koovs");
			// add("Mango");
			// add("Forever 21");
			// add("StalkBuyLove");
			// add("Fabindia");
			// add("Kaaryah");
			// add("Biba");
			// add("Forever New");
			// }};
			// }
		};

		LookupFilter(String displayName) {
			this.displayName = displayName;
		}

		private String displayName;

		public String getDisplayName() {
			return displayName;
		}

		protected abstract List<Object> getValues();
	}

	public enum ECommerceStoreTransaction {
		FOREVER_21("forever21") {
			@Override
			public ECommerceTransaction parseParams(Map<String, Object> transactionInfo) {
				ECommerceTransaction eCommerceTransaction = new ECommerceTransaction();
				String[] transactionId = (String[]) transactionInfo.get("t");
				if (transactionId != null) {
					eCommerceTransaction.setTransactionId(transactionId[0]);
				}
				String[] salesPrice = (String[]) transactionInfo.get("ect");
				if (salesPrice != null) {
					eCommerceTransaction.setSalesPrice(Double.parseDouble(salesPrice[0]));
				}
				eCommerceTransaction.setName(getStoreName());
				return eCommerceTransaction;
			}
		},
		KOOVS("koovs") {
			@Override
			public ECommerceTransaction parseParams(Map<String, Object> transactionInfo) {
				ECommerceTransaction eCommerceTransaction = new ECommerceTransaction();
				String[] transactionId = (String[]) transactionInfo.get("TRACK_ID");
				if (transactionId != null) {
					eCommerceTransaction.setTransactionId(transactionId[0]);
				}
				String[] salesPrice = (String[]) transactionInfo.get("SALE_AMOUNT");
				if (salesPrice != null) {
					eCommerceTransaction.setSalesPrice(Double.parseDouble(salesPrice[0]));
				}
				eCommerceTransaction.setName(getStoreName());
				return eCommerceTransaction;
			}
		},
		MISS_CHASE("miss_chase") {
			@Override
			public ECommerceTransaction parseParams(Map<String, Object> transactionInfo) {
				ECommerceTransaction eCommerceTransaction = new ECommerceTransaction();
				String[] transactionId = (String[]) transactionInfo.get("TRACK_ID");
				if (transactionId != null) {
					eCommerceTransaction.setTransactionId(transactionId[0]);
				}
				String[] salesPrice = (String[]) transactionInfo.get("SALE_AMOUNT");
				if (salesPrice != null) {
					eCommerceTransaction.setSalesPrice(Double.parseDouble(salesPrice[0]));
				}
				eCommerceTransaction.setName(getStoreName());
				return eCommerceTransaction;
			}
		},
		JODI("jodi") {
			@Override
			public ECommerceTransaction parseParams(Map<String, Object> transactionInfo) {
				ECommerceTransaction eCommerceTransaction = new ECommerceTransaction();
				String[] transactionId = (String[]) transactionInfo.get("TRACK_ID");
				if (transactionId != null) {
					eCommerceTransaction.setTransactionId(transactionId[0]);
				}
				String[] salesPrice = (String[]) transactionInfo.get("SALE_AMOUNT");
				if (salesPrice != null) {
					eCommerceTransaction.setSalesPrice(Double.parseDouble(salesPrice[0]));
				}
				eCommerceTransaction.setName(getStoreName());
				return eCommerceTransaction;
			}
		},
		PURPLLE("purplle") {
			@Override
			public ECommerceTransaction parseParams(Map<String, Object> transactionInfo) {
				ECommerceTransaction eCommerceTransaction = new ECommerceTransaction();
				String[] transactionId = (String[]) transactionInfo.get("TRACK_ID");
				if (transactionId != null) {
					eCommerceTransaction.setTransactionId(transactionId[0]);
				}
				String[] salesPrice = (String[]) transactionInfo.get("SALE_AMOUNT");
				if (salesPrice != null) {
					eCommerceTransaction.setSalesPrice(Double.parseDouble(salesPrice[0]));
				}
				eCommerceTransaction.setName(getStoreName());
				return eCommerceTransaction;
			}
		};

		private String storeName;

		private ECommerceStoreTransaction(String storeName) {
			this.storeName = storeName;
		}

		public String getStoreName() {
			return storeName;
		}

		public static ECommerceStoreTransaction getECommerceStoreTransaction(String storeName) {
			if (FOREVER_21.storeName.equals(storeName)) {
				return FOREVER_21;
			} else if (KOOVS.storeName.equals(storeName)) {
				return KOOVS;
			} else if (MISS_CHASE.storeName.equals(storeName)) {
				return MISS_CHASE;
			} else if (JODI.storeName.equals(storeName)) {
				return JODI;
			} else if (PURPLLE.storeName.equals(storeName)) {
				return PURPLLE;
			}
			return null;
		}

		public abstract ECommerceTransaction parseParams(Map<String, Object> transactionInfo);
	}

	public enum LookupEntities {
		ECOMMERCE_PRODUCT("product") {
			@Override
			public Map<String, List<Object>> getFilters() {

				Map<String, List<Object>> filters = new HashMap<String, List<Object>>();
				List<LookupFilter> lookupFilters = getFilterKeys();

				for (LookupFilter lookupFilter : lookupFilters) {
					filters.put(lookupFilter.getDisplayName(), lookupFilter.getValues());
				}
				return filters;
			}

			@Override
			protected List<LookupFilter> getFilterKeys() {
				List<LookupFilter> filterKeys = new ArrayList<LookupFilter>() {
					{
						add(LookupFilter.DISCOUNTED);
						add(LookupFilter.PRICE);
						// add(LookupFilter.COLOR);
						add(LookupFilter.BRAND);
						// add(LookupFilter.STORE);
					}
				};
				return filterKeys;
			}
		},
		FASHION_LOOK("look") {
			@Override
			public Map<String, List<Object>> getFilters() {
				return null;
			}

			@Override
			protected List<LookupFilter> getFilterKeys() {
				return null;
			}
		};

		LookupEntities(String type) {
			this.type = type;
		}

		private String type;

		public abstract Map<String, List<Object>> getFilters();

		protected abstract List<LookupFilter> getFilterKeys();

		public static LookupEntities getType(String type) {
			if (ECOMMERCE_PRODUCT.type.equals(type)) {
				return ECOMMERCE_PRODUCT;
			} else if (FASHION_LOOK.type.equals(type)) {
				return FASHION_LOOK;
			}
			return null;
		}
	}

	public static final Double BREAKEVENSCORE = 4.0;

	public static final int LOOK_LINK_PRODUCT_COUNT = 1;
	public static final int LOOK_COMMENT_COUNT = 3;
	public static final int LOOK_LOVES_COUNT = 6;

	public static List curatorUserIdList = new ArrayList<Long>();

	static {
		// curatorUserIdList.add(5868988583116800L);
		// curatorUserIdList.add(4762596662050816L);
		// curatorUserIdList.add(5081854965186560L);
		// curatorUserIdList.add(5800314492944384L);
		// curatorUserIdList.add(5770237022568448L); // local userId for test
		// curatorUserIdList.add(5289277214687232L); // my stagging userId
		// curatorUserIdList.add(5868988583116800L); // abhishek prod id
		// curatorUserIdList.add(196580L); // soumen prod id
		// curatorUserIdList.add(5668325641158656L); // arif prod id
		// curatorUserIdList.add(5210945513586688L); // rohan prod id
		// curatorUserIdList.add(4608670582177792L); // ganesh prod id
		// curatorUserIdList.add(196562L); // Ankit prod id
		// curatorUserIdList.add(5501454461698048L); // Debashish prod id
		// curatorUserIdList.add(4762596662050816L); // Subarthi prod id
		// curatorUserIdList.add(5669625923633152L); // Abhishek prod id
		// curatorUserIdList.add(215559L); // Praveen prod id
		// curatorUserIdList.add(194652L); // Arjun prod id
		// curatorUserIdList.add(5081854965186560L); // Gaurav prod id
		// curatorUserIdList.add(4862851515678720L); // Venky prod id
		// curatorUserIdList.add(5977788607627264L); // Shiv prod id
		// curatorUserIdList.add(5908812901908480L); // Govind prod id
		curatorUserIdList.add(6483083226775552L);

		curatorUserIdList.add(5783013226971136L); // setta staging Id

	}

	public static List collectionCuratorList = new ArrayList<Long>();

	static {
		collectionCuratorList.add(5770237022568448L); // abhishek local system
		collectionCuratorList.add(5486678911221760L);
		collectionCuratorList.add(5845002475274240L); // seeta staggingId
	}

	public static final String accessToken = "88b40d3c2861434cbc2ebc5f5b4a99fc";
	public static final String accessSecret = "c9aadea3adb84acd80f9bd3f92ebecc4";

	public static final String INFLUENCER_TYPE_USER = "USER";
	public static final String INFLUENCER_TYPE_STORE = "STORE";

	public static final String INFLUENCER_ROLE_BLOGGERS = "BLOGGERS";
	public static final String INFLUENCER_ROLE_YOUTUBERS = "YOUTUBERS";
	public static final String INFLUENCER_ROLE_FASHIONNEWS = "FASHIONNEWS";
	public static final String INFLUENCER_ROLE_BUSSINESSES = "BUSSINESSES";

	public enum TrendSearchTabType {
		LIVETAB("liveTab"), GENERAL("General"), CONTENT_SEARCH("ContentSearch"),;;

		private String value;

		private TrendSearchTabType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum UserProfileCompleteness {
		SIGNED_UP(1), PROFILE_UPDATE(2), FOLLOWED_INFLUENCER(3), FB_CONNECT(4), FB_FRIENDS_FOLLOW(5), GOOGLE_CONNECT(
				6), POSTED_PHOTO(7), USER_HANDLE(
						8), FOLLOW_GROUPS(9), GENDER(10), INVITE_FRIENDS(11), LOVED_A_LOOK(12), FOLLOWED_USERS(13);
		;

		private Integer value;
		private static List<Integer> values;

		private UserProfileCompleteness(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		// public static List<Integer> getUserProfileCompletenessValues() {
		// if (values == null) {
		// values = new ArrayList<>();
		//
		// for (EntityConstants.UserProfileCompleteness profileEnum :
		// EntityConstants.UserProfileCompleteness
		// .values()) {
		// List<Integer> profileCompletenessData = new ArrayList<>();
		// values.add(profileEnum.getValue());
		// }
		// }
		// return values;
		// }
	}

	public enum NotificationCampaignKey {
		USER_FOLLOW_USER_REQUEST("USER_FOLLOW_USER_REQUEST"), USER_COMMENT_PRODUCERPRODUCT_REVIEW(
				"USER_COMMENT_PRODUCERPRODUCT_REVIEW"), USER_COMMENT_FASHIONLOOK(
						"USER_COMMENT_FASHIONLOOK"), USER_FOLLOW_PRODUCERPRODUCT_REVIEW(
								"USER_FOLLOW_PRODUCERPRODUCT_REVIEW"), USER_FOLLOW_FASHIONLOOK(
										"USER_FOLLOW_FASHIONLOOK"), USER_FOLLOW_USER(
												"USER_FOLLOW_USER"), USER_ALLOWFOLLOW_USER(
														"USER_ALLOWFOLLOW_USER"), USER_COMMENT_REVIEW_2LVL(
																"USER_COMMENT_REVIEW_2LVL"), USER_COMMENT_FASHIONLOOK_2LVL(
																		"USER_COMMENT_FASHIONLOOK_2LVL"), USER_LOOK_TRENDING(
																				"USER_LOOK_TRENDING"), USER_FOLLOW_COLLECTION(
																						"USER_FOLLOW_COLLECTION"), USER_ADD_PRODUCT_COLLECTION(
																								"USER_ADD_PRODUCT_COLLECTION"), CREATE_COLLECTION_NOTIFY_FOLLOWERS(
																										"CREATE_COLLECTION_NOTIFY_FOLLOWERS"),

		CONTENT_SUGGESTION_FOLLOWERS("CONTENT_SUGGESTION_FOLLOWERS"), USER_REMINDER_NOTIFICATION(
				"USER_REMINDER_NOTIFICATION"), USER_FOLLOWER_NEW_LOOK("USER_FOLLOWER_NEW_LOOK"),

		NEWLY_JOINED_FACEBOOK_USER_NOTIFICATION("NEWLY_JOINED_FACEBOOK_USER_NOTIFICATION");

		private String value;

		private NotificationCampaignKey(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum ActivityId {
		USER_ACTIVITY_USER_LOVE_LOOK_actionId(1001), USER_ACTIVITY_USER_VIEW_FASHIONLOOK_actionId(
				1002), USER_ACTIVITY_USER_VIEW_FASHION_LOOK_COMMENTS_actionId(
						1004), USER_ACTIVITY_USER_UNCOMMENT_ON_LOOK_actionId(
								1005), USER_ACTIVITY_USER_DELETE_FASHION_LOOK_actionId(
										1006), USER_ACTIVITY_USER_VIEW_FASHION_ITEM_actionId(
												1007), USER_ACTIVITY_USER_SEARCH_FASHION_LOOK_actionId(
														1008), USER_ACTIVITY_USER_FOLLOW_OTHERUSER_actionId(
																1009), USER_ACTIVITY_USER_VIEW_OTHERUSERS_FOLLWERS_actionId(
																		1010), USER_ACTIVITY_USER_VIEW_FASHION_LOOK_LOVES_actionId(
																				1011), USER_ACTIVITY_USER_VIEW_FOLLOWERS_actionId(
																						1012), USER_ACTIVITY_USER_VIEW_FOLLOWING_actionId(
																								1013), USER_ACTIVITY_USER_UNFOLLOW_OTHERUSER_actionId(
																										1014), USER_ACTIVITY_USER_COMMENT_ON_LOOK_actionId(
																												1015), USER_ACTIVITY_USER_VIEW_SIMILAR_LOOKS_actionId(
																														1020), USER_ACTIVITY_USER_VIEW_SIMILAR_ECOMMPRODUCTS_actionId(
																																1021), USER_ACTIVITY_USER_VIEW_SIMILAR_PRODUCTS_AND_LOOKS_actionId(
																																		1022), USER_ACTIVITY_USER_VIEW_RECENT_FASHION_LOOK_STREAM_actionId(
																																				1023), USER_ACTIVITY_USER_VIEW_SOCIAL_LOOK_STREAM_actionId(
																																						1024), USER_ACTIVITY_USER_VIEW_TRENDING_FASHIONLOOK_STREAM_actionId(
																																								1025), USER_ACTIVITY_USER_SEARCH_USERS_actionId(
																																										1027), USER_ACTIVITY_USER_SEARCH_ECOMMPRODUCT_actionId(
																																												1028), USER_ACTIVITY_USER_ADD_ENTITY_TO_COLLECTION_actionId(
																																														1029), USER_ACTIVITY_USER_VIEW_PRODUCER_LOCATIONS_actionId(
																																																1035), USER_ACTIVITY_USER_VIEW_OWN_PROFILE_actionId(
																																																		1038), USER_ACTIVITY_USER_REMOVE_FOLLOWER_actionId(
																																																				1042), USER_ACTIVITY_USER_ALLOW_FOLLOWER_actionId(
																																																						1043), USER_ACTIVITY_USER_VIEW_FOLLOW_REQUESTS_actionId(
																																																								1044), USER_ACTIVITY_USER_INVITE_FRIENDS_actionId(
																																																										1045), USER_ACTIVITY_USER_VIEW_USERS_TO_FOLLOW_actionId(
																																																												1046), USER_ACTIVITY_USER_VIEW_INFLUENCERS_TO_FOLLOW_actionId(
																																																														1047), USER_ACTIVITY_USER_VIEW_OTHERUSER_actionId(
																																																																1048), USER_ACTIVITY_USER_VIEW_OTHERUSERS_FOLLOWING_actionId(
																																																																		1051), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOOKS_actionId(
																																																																				1053), USER_ACTIVITY_USER_VIEW_ECOMMPRODUCT_actionId(
																																																																						1054), USER_ACTIVITY_USER_VIEW_OWN_LOOKS_actionId(
																																																																								1055), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMSTORE_LIST_actionId(
																																																																										1056), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_LOOKS_actionId(
																																																																												1057), USER_ACTIVITY_USER_VIEW_OWN_LOVED_LOOKS_actionId(
																																																																														1058), USER_ACTIVITY_USER_VIEW_ECOMMSTORE_PROFILE_actionId(
																																																																																1059), USER_ACTIVITY_USER_VIEW_ECOMMPRODUCTS_BY_ECOMMSTORE_actionId(
																																																																																		1060), USER_ACTIVITY_USER_FOLLOW_ECOMMSTORE_actionId(
																																																																																				1061), USER_ACTIVITY_USER_UNFOLLOW_ECOMMSTORE_actionId(
																																																																																						1062), USER_ACTIVITY_USER_VIEW_STORE_FOLLOWERS_actionId(
																																																																																								1063), USER_ACTIVITY_USER_VIEW_STORES_LOOKS_actionId(
																																																																																										1064), USER_ACTIVITY_USER_VIEW_INFLUENCERS_actionId(
																																																																																												1066), USER_ACTIVITY_USER_UPDATE_USERINFO_actionId(
																																																																																														1067), USER_ACTIVITY_USER_VIEW_SIMILAR_ECOMMPRODUCTS_LOOKS_actionId(
																																																																																																1068), USER_ACTIVITY_USER_POST_LOOKS_MULTIPART_actionId(
																																																																																																		1069), USER_ACTIVITY_USER_CREATE_COLLECTION_actionId(
																																																																																																				1070), CURATOR_ACTIVITY_CURATOR_CREATE_COLLECTION_actionId(
																																																																																																						1071), USER_ACTIVITY_USER_UPDATE_COLLECTION_actionId(
																																																																																																								1072), CURATOR_ACTIVITY_CURATOR_UPDATE_COLLECTION_actionId(
																																																																																																										1073), USER_ACTIVITY_USER_DELETE_ENTITY_FROM_COLLECTION_actionId(
																																																																																																												1074), USER_ACTIVITY_USER_DELETE_COLLECTION_actionId(
																																																																																																														1075), CURATOR_ACTIVITY_CURATOR_DELETE_COLLECTION_actionId(
																																																																																																																1076), USER_ACTIVITY_USER_CREATE_COLLECTION_WITH_ENTITY_actionId(
																																																																																																																		1077), USER_ACTIVITY_USER_LOVE_COLLECTION_actionId(
																																																																																																																				1078), USER_ACTIVITY_USER_VIEW_USER_COLLECTIONS_actionId(
																																																																																																																						1079), USER_ACTIVITY_USER_VIEW_PUBLIC_COLLECTIONS_actionId(
																																																																																																																								1080), USER_ACTIVITY_USER_PERFORM_LOGIN_actionId(
																																																																																																																										1081), USER_ACTIVITY_USER_PERFORM_LOGOUT_actionId(
																																																																																																																												1082), CURATOR_ACTIVITY_CURATOR_DELETE_ENTITY_FROM_COLLECTION_actionId(
																																																																																																																														1083), CURATOR_ACTIVITY_CURATOR_VIEW_CURATOR_COLLECTION_LOOKS_actionId(
																																																																																																																																1084), CURATOR_ACTIVITY_CURATOR_VIEW_CURATOR_COLLECTION_PRODUCTS_actionId(
																																																																																																																																		1086), CURATOR_ACTIVITY_CURATOR_ADD_ENTITY_TO_COLLECTION_actionId(
																																																																																																																																				1089), CURATOR_ACTIVITY_CURATOR_CREATE_ECOMMPRODUCT_actionId(
																																																																																																																																						1090), CURATOR_ACTIVITY_CURATOR_UPDATE_ECOMMPRODUCT_actionId(
																																																																																																																																								1091), CURATOR_ACTIVITY_CURATOR_POST_PRODUCT_ATTRIBUTE_action(
																																																																																																																																										1092), CURATOR_ACTIVITY_CURATOR_UPDATE_PRODUCT_PRICE_actionId(
																																																																																																																																												1093), CURATOR_ACTIVITY_CURATOR_DELETE_ECOMMPRODUCT_actionId(
																																																																																																																																														1094), CURATOR_ACTIVITY_CURATOR_VIEW_LINKED_LOOKS_actinId(
																																																																																																																																																1095), CURATOR_ACTIVITY_CURATOR_CREATE_ECOMMSTORE_actionId(
																																																																																																																																																		1096), CURATOR_ACTIVITY_CURATOR_UPDATE_ECOMMSTORE_actionId(
																																																																																																																																																				1097), CURATOR_ACTIVITY_CURATOR_DELETE_ECOMMSTORE_actionId(
																																																																																																																																																						1098), CURATOR_ACTIVITY_CURATOR_UPDATE_FASHION_LOOK_actionId(
																																																																																																																																																								1099), CURATOR_ACTIVITY_CURATOR_LINK_PRODUCT_TO_FASHION_LOOK_actionId(
																																																																																																																																																										1100), CURATOR_ACTIVITY_CURATOR_DELETE_FASHION_ITEM_actionId(
																																																																																																																																																												1101), CURATOR_ACTIVITY_CURATOR_VIEW_LINKEDPRODUCTS_FOR_TAG_ITEM_actionId(
																																																																																																																																																														1102), CURATOR_ACTIVITY_CURATOR_UNLINK_FASHION_ITEM_TO_PRODUCT_actionId(
																																																																																																																																																																1103), CURATOR_ACTIVITY_CURATOR_VIEW_ALL_CURATED_COLLECTIONS_actionId(
																																																																																																																																																																		1104), CURATOR_ACTIVITY_CURATOR_DELETE_TRENDING_ENTRY_actionId(
																																																																																																																																																																				1105), CURATOR_ACTIVITY_CURATOR_VIEW_TAGGED_LINKED_STAFFED_LOOKS_actionId(
																																																																																																																																																																						1106), CURATOR_ACTIVITY_CURATOR_POST_AUTO_LOOKLOVE_actionId(
																																																																																																																																																																								1107), CURATOR_ACTIVITY_CURATOR_VIEW_SIMILAR_TAGGED_PRODUCTS_actionId(
																																																																																																																																																																										1108), CURATOR_ACTIVITY_CURATOR_VIEW_COLLECTION_DETAILS_actionId(
																																																																																																																																																																												1109), CURATOR_ACTIVITY_CURATOR_VIEW_RECENT_FASHION_LOOK_STREAM_actionId(
																																																																																																																																																																														1110), CURATOR_ACTIVITY_CURATOR_VIEW_RECENT_FASHION_LOOK_SERVERCALL_actionId(
																																																																																																																																																																																1111), CURATOR_ACTIVITY_CURATOR_VIEW_LOOK_DETAILS_actionId(
																																																																																																																																																																																		1112), USER_ACTIVITY_USER_VIEW_OTHERUSER_COLLECTIONS_actionId(
																																																																																																																																																																																				1113), USER_ACTIVITY_USER_VIEW_CURATED_COLLECTION_LOOKS_actionId(
																																																																																																																																																																																						1114), USER_ACTIVITY_USER_VIEW_USER_COLLECTION_LOOKS_actionId(
																																																																																																																																																																																								1115), USER_ACTIVITY_USER_VIEW_CURATED_COLLECTION_PRODUCTS_actionId(
																																																																																																																																																																																										1116), USER_ACTIVITY_USER_VIEW_USER_COLLECTION_PRODUCTS_actionId(
																																																																																																																																																																																												1117), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMSTORE_actionId(
																																																																																																																																																																																														1118), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMPRODUCTS_BY_ECOMMSTORE_actionId(
																																																																																																																																																																																																1119), CURATOR_ACTIVITY_CURATOR_VIEW_ECOMMPRODUCT_actionId(
																																																																																																																																																																																																		1120), CURATOR_ACTIVITY_CURATOR_SEARCH_ECOMMPRODUCT_actionId(
																																																																																																																																																																																																				1121), CURATOR_ACTIVITY_CURATOR_LOVE_LOOK_actionId(
																																																																																																																																																																																																						1122), CURATOR_ACTIVITY_CURATOR_VIEW_SIMILAR_PRODUCTS_AND_LOOKS_actionId(
																																																																																																																																																																																																								1123), CURATOR_ACTIVITY_CURATOR_UPDATE_LINKED_TAGGED_actionId(
																																																																																																																																																																																																										1124), CURATOR_ACTIVITY_CURATOR_POST_LOOKS_MULTIPART_actionId(
																																																																																																																																																																																																												1125), CURATOR_ACTIVITY_CURATOR_VIEW_PUBLIC_COLLECTIONS_actionId(
																																																																																																																																																																																																														1126), USER_NOTIFICATION_actionId(
																																																																																																																																																																																																																1127), CURATOR_ACTIVITY_CURATOR_DELETE_CONTENT_BY_ID_actionId(
																																																																																																																																																																																																																		1128), CURATOR_ACTIVITY_CURATOR_PUBLISH_CONTENT_actionId(
																																																																																																																																																																																																																				1129), CURATOR_ACTIVITY_CURATOR_DELETE_WIDGET_actionId(
																																																																																																																																																																																																																						1130), CURATOR_ACTIVITY_CURATOR_SAVE_CONTENT_actionId(
																																																																																																																																																																																																																								1131), CURATOR_ACTIVITY_CURATOR_UNPUBLISH_CONTENT_actionId(
																																																																																																																																																																																																																										1132), CURATOR_ACTIVITY_CURATOR_UPSERT_WIDGET_actionId(
																																																																																																																																																																																																																												1133), CURATOR_ACTIVITY_CURATOR_MAKE_CONTENT_STICKY_actionId(
																																																																																																																																																																																																																														1134), CURATOR_ACTIVITY_CURATOR_GET_CONTENT_TYPES_actionId(
																																																																																																																																																																																																																																1135), CURATOR_ACTIVITY_CURATOR_GET_CONTENTS_actionId(
																																																																																																																																																																																																																																		1136), USER_ACTIVITY_USER_GET_CONTENT_actionId(
																																																																																																																																																																																																																																				1137), CURATOR_ACTIVITY_CURATOR_GET_CONTENT_actionId(
																																																																																																																																																																																																																																						1138), USER_ACTIVITY_USER_NEWLY_JOINED_actionId(
																																																																																																																																																																																																																																								1139),

		CURATOR_ACTIVITY_CURATOR_DELETE_FASHION_LOOK_actionId(1140), USER_ACTIVITY_USER_SEARCH_COLLECTIONS_actionId(
				1141), CURATOR_ACTIVITY_CURATOR_SEARCH_COLLECTIONS_actionId(
						1142), USER_ACTIVITY_USER_SEARCH_CONTENTS_actionId(
								1143), CURATOR_ACTIVITY_CURATOR_SEARCH_CONTENTS_actionId(
										1144), USER_ACTIVITY_USER_SEARCH_STORES_actionId(
												1145), CURATOR_ACTIVITY_CURATOR_SEARCH_STORES_actionId(
														1146), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_COLLECTIONS_actionId(
																1147), USER_ACTIVITY_USER_VIEW_OTHERUSERS_LOVED_CONTENTS_actionId(
																		1148), USER_ACTIVITY_USER_VIEW_OWN_LOVED_COLLECTIONS_actionId(
																				1149), USER_ACTIVITY_USER_VIEW_OWN_LOVED_CONTENTS_actionId(
																						1150), USER_ACTIVITY_USER_UNLOVE_COLLECTION_actionId(
																								1151), USER_ACTIVITY_USER_INTEND_TO_BUY_actionId(
																										1152), USER_ACTIVITY_USER_ADDED_PRODUCT_TO_CART_actionId(
																												1153), USER_ACTIVITY_USER_ADDED_MULIPLE_PRODUCTS_TO_CART_actionId(
																														1154), USER_ACTIVITY_USER_MODIFIED_CART_actionId(
																																1155), USER_ACTIVITY_USER_DELETE_PRODUCT_FROM_CART_actionId(
																																		1156), USER_ACTIVITY_USER_DELETE_ALL_PRODUCTS_FROM_CART_actionId(
																																				1157), USER_ACTIVITY_USER_CREATE_CUSTOMER_ADDRESS_actionId(
																																						1158), USER_ACTIVITY_USER_INTEND_TO_BUY_PRODUCT_FROM_CART_actionId(
																																								1159), USER_ACTIVITY_USER_INITIATE_BUY_COD_actionId(
																																										1160), USER_ACTIVITY_USER_INITIATE_BUY_PG_actionId(
																																												1161), USER_ACTIVITY_USER_PAYMENT_SUCCESSFUL_PG_actionId(
																																														1162), USER_ACTIVITY_USER_PAYMENT_FAILED_PG_actionId(
																																																1163), USER_ACTIVITY_USER_PAYMENT_SUCCESSFUL_COD_actionId(
																																																		1164), USER_ACTIVITY_USER_PAYMENT_FAILED_COD_actionId(
																																																				1165), USER_ACTIVITY_USER_VIEW_PRODUCTS_FROM_CART_actionId(
																																																						1166), USER_ACTIVITY_USER_LOVE_CONTENT_actionId(
																																																								1167), CURATOR_ACTIVITY_CURATOR_VERIFIED_LOOK_actionId(
																																																										1168);

		private long activityId;

		private ActivityId(long x) {
			this.activityId = x;
		}

		public long getActivityId() {
			return activityId;
		}

		public void setActivityId(long activityId) {
			this.activityId = activityId;
		}
	}

	public enum WidgetTypes {
		TITLE("TITLE"), PARA("PARA"), IMAGE("IMAGE"), LOOK("LOOK"), TWO_LOOK("TWO_LOOK"), ONE_PRODUCT(
				"ONE_PRODUCT"), TWO_PRODUCT("TWO_PRODUCT"), SEPARATOR("SEPARATOR"), SPACER(
						"SPACER"), USER("USER"), STORE("STORE"), SEARCH("SEARCH"), BUTTON("BUTTON"), BREAKER("BREAKER");

		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		WidgetTypes(String value) {
			this.value = value;
		}
	}

	public enum ContentTypes {

		HOW_TO_WEAR("HOW_TO_WEAR"), DIY("DIY"), CELEB_CRUSH("CELEB_CRUSH"), WOOPLR_SHOPS("WOOPLR_SHOPS"), DEEPLINK(
				"DEEPLINK"), STYLE_TIPS("STYLE_TIPS"), FASHION_WORD("FASHION_WORD");
		;

		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ContentTypes(String value) {
			this.value = value;
		}
	}

	public enum UserPreferenceType {
		EMAIL("EMAIL"), PUSH_NOTIFICATION("PUSH_NOTIFICATION");

		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		UserPreferenceType(String value) {
			this.value = value;
		}

	}

	public enum UserPreference {
		USER_ACTIVITY("USER_ACTIVITY"), NEWS_LETTER("NEWS_LETTER"), ANNOUNCEMENT("ANNOUNCEMENT"), CAMPAIGNS(
				"CAMPAIGNS"), ALL("ALL"),

		LOOK_LOVE("LOOK_LOVE"), LOOK_COMMENT("LOOK_COMMENT"),

		COMMENT_2VL("COMMENT_2VL"), USER_LOOK_TRENDING("USER_LOOK_TRENDING"), COLLECTION_LOVE(
				"COLLECTION_LOVE"), USER_FOLLOW_USER("USER_FOLLOW_USER");

		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		UserPreference(String value) {
			this.value = value;
		}
	}

	public enum PaginationType {
		BEFORE("before"), AFTER("after");
		String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		PaginationType(String value) {
			this.value = value;
		}
	}

	public enum NotificationSchedule {
		ONE_TIME("one_time");

		NotificationSchedule(String schedule) {
			this.schedule = schedule;
		}

		private String schedule;

		public String getSchedule() {
			return schedule;
		}
	}

	// public enum NotificationAction {
	// NOTIFY_COLLECTION_USER_PRODUCT_DISCOUNT(NotificationEvent.PRODUCT_DISCOUNT)
	// {
	//
	// @Override
	// public void setEntity(Entity entity) {
	// this.entity = entity;
	// }
	//
	// @Override
	// public String getEntityType() {
	// return Constants.COLLECTION;
	// }
	//
	// @Override
	// public Long getValidityDate() {
	// // 2 hours
	// return 2 * 60 * 60 * 1000L;
	// }
	//
	// @Override
	// // public PushNotificationPOJO getAndroidMessageBody() {
	// // PushNotificationPOJO pushNotificationPOJO = new
	// // PushNotificationPOJO();
	// //
	// //
	// pushNotificationPOJO.setCampaign_key("USER_COLLECTION_PRODUCT_DISCOUNTED");
	// // pushNotificationPOJO.setTarget_type("customer_id");
	// //
	// // ThemeCollection themeCollection =
	// // ThemeCollectionBO.getThemeCollectionById(entity.getId());
	// //
	// // PushNotificationAndroidMessagePOJO message = new
	// // PushNotificationAndroidMessagePOJO();
	// // if (entityCount > 1) {
	// // message.setAlert(
	// // entityCount + " Products in your " + themeCollection.getName() +
	// // " collection are on sale");
	// // } else {
	// // message.setAlert(
	// // entityCount + " Product in your " + themeCollection.getName() + "
	// // collection is on sale");
	// // }
	// //
	// // PushNotificationAndroidExtraPOJO extra = new
	// // PushNotificationAndroidExtraPOJO();
	// // extra.setType("ACTIVITY");
	// // extra.setDeeplink(EmailInvitationService.DEEPLINK_BASE_PATH +
	// // "collection/" + entity.getId());
	// // extra.setNotificationText(
	// // "Products in your <b>" + themeCollection.getName() + "</b>
	// // collection are on sale");
	// // try {
	// // extra.setSmallImageUrl(URLDecoder.decode(
	// // EmailInvitationService.getNotificationImageUrl(getEntityType(),
	// // entity.getId(), "square"),
	// // "UTF-8"));
	// // } catch (UnsupportedEncodingException e) {
	// // logger.error("Error occured..", e);
	// // }
	// // extra.setTimestamp(String.valueOf(new Date().getTime()));
	// //
	// extra.setWooplrVersion(EmailInvitationService.NOTIFICATION_VERSION_V3);
	// //
	// // PushNotificationAndroidPOJO android = new
	// // PushNotificationAndroidPOJO();
	// // android.setExtra(extra);
	// //
	// // message.setAndroid(android);
	// //
	// // List<PushNotificationMessagePOJO> messages = new ArrayList<>();
	// // messages.add(message);
	// //
	// // pushNotificationPOJO.setMessages(messages);
	// //
	// // return pushNotificationPOJO;
	// // }
	//
	// //@Override
	//// public PushNotificationPOJO getIosMessageBody() {
	//// PushNotificationPOJO pushNotificationPOJO = new PushNotificationPOJO();
	////
	//// pushNotificationPOJO.setCampaign_key("USER_COLLECTION_PRODUCT_DISCOUNTED");
	//// pushNotificationPOJO.setTarget_type("customer_id");
	////
	//// ThemeCollection themeCollection =
	// ThemeCollectionBO.getThemeCollectionById(entity.getId());
	////
	//// PushNotificationIosMessagePOJO message = new
	// PushNotificationIosMessagePOJO();
	//// if (entityCount > 1) {
	//// message.setAlert(
	//// entityCount + " Products in your " + themeCollection.getName() + "
	// collection are on sale");
	//// } else {
	//// message.setAlert(
	//// entityCount + " Product in your " + themeCollection.getName() + "
	// collection is on sale");
	//// }
	////
	//// PushNotificationIosExtraPOJO extra = new
	// PushNotificationIosExtraPOJO();
	//// extra.setType("ACTIVITY");
	//// extra.setDeeplink(EmailInvitationService.DEEPLINK_BASE_PATH +
	// "collection/" + entity.getId());
	//// extra.setNotificationText(
	//// "Products in your <b>" + themeCollection.getName() + "</b> collection
	// are on sale");
	//// try {
	//// extra.setSmallImageUrl(URLDecoder.decode(
	//// EmailInvitationService.getNotificationImageUrl(getEntityType(),
	// entity.getId(), "square"),
	//// "UTF-8"));
	//// } catch (UnsupportedEncodingException e) {
	//// logger.error("Error occured..", e);
	//// }
	//// extra.setTimestamp(String.valueOf(new Date().getTime()));
	//// extra.setWooplrVersion(EmailInvitationService.NOTIFICATION_VERSION_V3);
	////
	//// PushNotificationIosPOJO ios = new PushNotificationIosPOJO();
	//// ios.setExtra(extra);
	////
	//// message.setIos(ios);
	////
	//// List<PushNotificationMessagePOJO> messages = new ArrayList<>();
	//// messages.add(message);
	////
	//// pushNotificationPOJO.setMessages(messages);
	////
	//// return pushNotificationPOJO;
	//// }
	// },
	// NOTIFY_COLLECTION_USER_PRODUCT_BACK_IN_STOCK(NotificationEvent.PRODUCT_BACK_IN_STOCK)
	// {
	// @Override
	// public void setEntity(Entity entity) {
	// this.entity = entity;
	// }
	//
	// @Override
	// public String getEntityType() {
	// return Constants.COLLECTION;
	// }
	//
	// @Override
	// public PushNotificationPOJO getAndroidMessageBody() {
	// return null;
	// }
	//
	// @Override
	// public PushNotificationPOJO getIosMessageBody() {
	// return null;
	// }
	// };
	//
	// NotificationAction(NotificationEvent notificationEvent) {
	// this.notificationEvent = notificationEvent;
	// }
	//
	// protected NotificationEvent notificationEvent;
	// protected Entity entity;
	// protected int entityCount = 1;
	// protected Date validityDate;
	//
	// public abstract void setEntity(Entity entity);
	//
	// public abstract String getEntityType();
	//
	// public Long getValidityDate() {
	// return 0L;
	// }
	//
	// protected NotificationEvent getNotificationEvent() {
	// return notificationEvent;
	// }
	//
	// public static NotificationAction getNotificationAction(NotificationEvent
	// notificationEvent, String entityType) {
	// for (NotificationAction notificationAction :
	// Arrays.asList(NotificationAction.values())) {
	// if (notificationAction.getNotificationEvent().equals(notificationEvent)
	// && notificationAction.getEntityType().equals(entityType)) {
	// return notificationAction;
	// }
	// }
	// return null;
	// }
	//
	// public abstract PushNotificationPOJO getAndroidMessageBody();
	//
	// public abstract PushNotificationPOJO getIosMessageBody();
	//
	// public void setEntityCount(int count) {
	// this.entityCount = count;
	// }
	//
	// public Entity getEntity() {
	// return entity;
	// }
	//
	// public class Entity {
	// private Long id;
	// private String type;
	//
	// public Long getId() {
	// return id;
	// }
	//
	// public void setId(Long id) {
	// this.id = id;
	// }
	//
	// public String getType() {
	// return type;
	// }
	//
	// public void setType(String type) {
	// this.type = type;
	// }
	// }
	// }

	public enum NotificationEvent {
		PRODUCT_DISCOUNT {
			@Override
			protected String getSchedule() {
				return NotificationSchedule.ONE_TIME.getSchedule();
			}

			@Override
			protected String getTemplate() {
				return null;
			}

			@Override
			public void setEntity(Entity entity) {
				this.entity = entity;
			}

		},
		PRODUCT_BACK_IN_STOCK {
			@Override
			protected String getSchedule() {
				return NotificationSchedule.ONE_TIME.getSchedule();
			}

			@Override
			protected String getTemplate() {
				return null;
			}

			@Override
			public void setEntity(Entity entity) {
				this.entity = entity;
			}
		};

		protected Entity entity;

		protected abstract String getSchedule();

		protected abstract String getTemplate();

		public Entity getEntity() {
			return entity;
		}

		public abstract void setEntity(Entity entity);

		public static NotificationEvent getNotificationEvent(String notificationEventName) {
			for (NotificationEvent notificationEvent : Arrays.asList(NotificationEvent.values())) {
				if (notificationEvent.toString().equals(notificationEventName))
					return notificationEvent;
			}
			return null;
		}

		public class Entity {
			private Long id;
			private String type;

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	public enum PaymentStatus {
		INITIATED("INITIATED"), FAILED("FAILED"), SUCCESS("SUCCESS"), PENDING_VERFICATION(
				"PENDING_VERFICATION"), ABANDONED("ABANDONED");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		PaymentStatus(String value) {
			this.value = value;
		}

	}

	public enum ECommerceEarningType {
		BONUS, ORDER, VISITS;
	}

	public enum ECommerceEarningBeneficiaryType {
		RESELLER;
	}

	public enum ECommerceEarningStatus {
		UNCONFIRMED, CONFIRMED, REJECTED;

		public static ECommerceEarningStatus fromValue(String value) {
			for (ECommerceEarningStatus eCommerceEarningStatus : ECommerceEarningStatus.values()) {
				if (eCommerceEarningStatus.toString().equalsIgnoreCase(value)) {
					return eCommerceEarningStatus;
				}
			}
			return null;
		}
	}

	public enum ECommerceSettlementStatus {
		APPROVED {
			@Override
			protected String getClaimableStatus() {
				return "SETTLED";
			}
		},
		PENDING {
			@Override
			protected String getClaimableStatus() {
				return "CLAIMED";
			}
		},
		REJECTED {
			@Override
			protected String getClaimableStatus() {
				return "REJECTED";
			}
		};
		protected abstract String getClaimableStatus();

		// public static ECommerceSettlementStatus getSettlementStatus(String
		// claimableStatus) {
		// if (!StringUtils.isNullOrEmpty(claimableStatus)) {
		// for (ECommerceSettlementStatus eCommerceSettlementStatus : values())
		// {
		// if
		// (eCommerceSettlementStatus.toString().equalsIgnoreCase(claimableStatus))
		// return eCommerceSettlementStatus;
		// }
		// }
		// return null;
		// }
	}

	public enum UserProfileStepShown {
		SIGNED_UP(1), PROFILE_UPDATE(2), FOLLOWED_INFLUENCER(3);
		;

		private Integer value;

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		UserProfileStepShown(Integer value) {
			this.value = value;
		}
	}

	public enum RuleType {
		VAT("VAT"), COD_CHARGE("COD_CHARGE"), SHIPPING_CHARGE("SHIPPING_CHARGE"), SHIPPING_METHOD(
				"SHIPPING_METHOD"), SHIPPING_TIME("SHIPPING_TIME"), DELIVERY_TIME("DELIVERY_TIME"), CANCELLATION_TIME(
						"CANCELLATION_TIME"), SIZING_CHART_URL("SIZING_CHART_URL"), PAYMENT_SUPPORT(
								"PAYMENT_SUPPORT"), SIZING_CHART_VERSION("SIZING_CHART_VERSION");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		RuleType(String value) {
			this.value = value;
		}

	}

	public enum PaymentSupportType {
		COD_PLUS_PG("1"), PG("2"), COD("3"), AFFILIATE("4");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		PaymentSupportType(String value) {
			this.value = value;
		}

		private static Map<String, PaymentSupportType> map = new HashMap<String, PaymentSupportType>();

		static {
			for (PaymentSupportType type : PaymentSupportType.values()) {
				map.put(type.getValue(), type);
			}
		}

		public static PaymentSupportType getPaymentSupportType(String value) {
			if (value != null) {
				return map.get(value);
			}
			return null;
		}
	}

	public enum PaymentType {
		COD("COD"), PAYMENT_GATEWAY("PG");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		PaymentType(String value) {
			this.value = value;
		}
	}

	public enum RuleValueUnit {
		RUPEE("RUPEE"), PERCENT("PERCENT"), STRING("STRING");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		RuleValueUnit(String value) {
			this.value = value;
		}

	}

	public enum OrderType {
		AUTO("AUTO"), MAN("MANUAL"), BOT("BOT");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		OrderType(String value) {
			this.value = value;
		}

	}

	public enum OrderStatus {
		UNCONFIRMED("UNCONFIRMED") {
			@Override
			public String getDisplayOrderStatus() {
				return "PLACED";
			}

		},
		CONFIRMED("CONFIRMED"), REJECTED("REJECTED") {
			@Override
			public String getDisplayOrderStatus() {
				return "REJECTED";
			}
		},
		CANCELLED("CANCELLED"), SHIPPED("SHIPPED"), COMPLETED("COMPLETED") {
			@Override
			public String getDisplayOrderStatus() {
				return "DELIVERED";
			}

		},
		RETURNED("RETURNED"), FAILED("FAILED"), ABANDONED("ABANDONED");
		/**
		 * TODO: IMPORTANT If any status is added check the Payment
		 * captureTask(RazorPaypaymentCaptureTask) to Capture Payment logic
		 * TODO: AND Check ECommOrderDAO updateTransactionInfo method
		 */

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		OrderStatus(String value) {
			this.value = value;
		}

		private static Map<String, OrderStatus> map = new HashMap<String, OrderStatus>();
		static {
			for (OrderStatus orderStatus : OrderStatus.values()) {
				map.put(orderStatus.getValue(), orderStatus);
			}
		}

		public static OrderStatus getOrderStatus(String orderStatusString) {
			if (orderStatusString != null) {

				return map.get(orderStatusString);
			}

			return null;
		}

		public String getDisplayOrderStatus() {
			return this.value;
		}

	}

	public enum SellerPermission {
		WOOPLR("WOOPLR"), CURATOR("CURATOR"), SELLER("SELLER");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		SellerPermission(String value) {
			this.value = value;
		}
	}

	public enum ResellerPermission {
		WOOPLR("WOOPLR"), WOOPLR_FINANCE("WOOPLR_FINANCE"), RESELLER("RESELLER"), BLOCKED("BLOCKED");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ResellerPermission(String value) {
			this.value = value;
		}
	}

	public enum TransactionHandler {
		WOOPLR("WOOPLR"), STORE_KING("STORE_KING"), ABCS("ABCS");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		TransactionHandler(String value) {
			this.value = value;
		}

		private static Map<String, TransactionHandler> map = new HashMap<String, TransactionHandler>();

		static {
			for (TransactionHandler transactionHandler : TransactionHandler.values()) {
				map.put(transactionHandler.getValue(), transactionHandler);
			}
		}

		public static TransactionHandler getHandler(String value) {
			return map.get(value);
		}
	}

	public enum RefundStatus {
		INITIATED("INITIATED"), SUCCESS("SUCCESS"), FAILED("FAILED");

		private String value;

		public String getValue() {
			return value;
		}

		RefundStatus(String value) {
			this.value = value;
		}

		public static String getSellerDashBoardStatus() {
			return "REFUND_INITIATED";
		}
	}

	public enum WalletTransactionReason {
		ORDER_PLACED("ORDER_PLACED"), TRANSACTION_CLEANUP("TRANSACTION_CLEANUP"), ORDER_REFUND("ORDER_REFUND");

		private String value;

		public String getValue() {
			return value;
		}

		WalletTransactionReason(String value) {
			this.value = value;
		}
	}

	public enum ShipmentCreateStatus {
		INITIATED("INITIATED") {
			@Override
			public Boolean isOrderStatusConfirmed() {
				return Boolean.TRUE;
			}
		},
		WAITING_FOR_AWB("WAITING_FOR_AWB") {
			@Override
			public Boolean isOrderStatusConfirmed() {
				return Boolean.TRUE;
			}
		},
		AWB_GENERATED("AWB_GENERATED") {
			@Override
			public Boolean isOrderStatusConfirmed() {
				return Boolean.TRUE;
			}
		},
		NOT_PICKED("NOT_PICKED") {
			@Override
			public Boolean isOrderStatusToBePicked() {
				return Boolean.TRUE;
			}
		},
		READY_TO_SHIP("READY_TO_SHIP") {
			@Override
			public Boolean isOrderStatusToBePicked() {
				return Boolean.TRUE;
			}
		},
		IN_TRANSIT("IN_TRANSIT") {
			@Override
			public String getDisplayShipmentStatus() {
				return "IN TRANSIT";
			}
		},
		RTO("RTO"), DTO("DTO"), FAILED("FAILED"), SUCCESS("SUCCESS"),

		// Status for non serviceable
		NON_SERVICEABLE_ORDER_WAITING_FOR_AWB("NON_SERVICEABLE_ORDER_WAITING_FOR_AWB") {
			@Override
			public Boolean isOrderStatusConfirmed() {
				return Boolean.TRUE;
			}
		},
		NON_SERVICEABLE_ORDER_AWB_GENERATED("NON_SERVICEABLE_ORDER_AWB_GENERATED") {
			@Override
			public Boolean isOrderStatusConfirmed() {
				return Boolean.TRUE;
			}
		};

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ShipmentCreateStatus(String value) {
			this.value = value;
		}

		private static Map<String, ShipmentCreateStatus> map = new HashMap<String, ShipmentCreateStatus>();

		static {
			for (ShipmentCreateStatus status : ShipmentCreateStatus.values()) {
				map.put(status.getValue(), status);
			}
		}

		public static ShipmentCreateStatus getShipmentCreationStatus(String value) {
			if (value != null) {
				return map.get(value);
			}
			return null;
		}

		public String getSellerDashBoardStatus() {
			return this.value;
		}

		public Boolean isOrderStatusConfirmed() {
			return Boolean.FALSE;
		}

		public Boolean isOrderStatusToBePicked() {
			return Boolean.FALSE;
		}

		public String getDisplayShipmentStatus() {
			return this.value;
		}
	}

	public enum CouponType {
		USER_COUPON("USER_COUPON"), GLOBAL_PROMOTION("GLOBAL_PROMOTION");

		private String value;

		CouponType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public enum PromoCodeValueType {
		PERCENTAGE("PERCENTAGE"), FLAT("FLAT"), CASH_BACK_PERCENTAGE("CASH_BACK_PERCENTAGE"), CASH_BACK_FLAT(
				"CASH_BACK_FLAT");

		private String value;

		PromoCodeValueType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		private static Map<String, PromoCodeValueType> valueMap = new HashMap<String, PromoCodeValueType>();

		static {
			for (PromoCodeValueType valueType : PromoCodeValueType.values()) {
				valueMap.put(valueType.getValue(), valueType);
			}
		}

		public static PromoCodeValueType getValueType(String value) {
			if (value != null) {
				return valueMap.get(value);
			}
			return null;
		}
	}

	public enum PromoCodeUsageType {
		TOTAL_PRICE("TOTAL_PRICE"), SELLING_PRICE("SELLING_PRICE"), COD_CHARGE("COD_CHARGE"), SHIPPING_CHARGE(
				"SHIPPING_CHARGE");

		private String value;

		PromoCodeUsageType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		private static Map<String, PromoCodeUsageType> valueMap = new HashMap<String, PromoCodeUsageType>();

		static {
			for (PromoCodeUsageType usageType : PromoCodeUsageType.values()) {
				valueMap.put(usageType.getValue(), usageType);
			}
		}

		public static PromoCodeUsageType getUsageType(String value) {
			if (value != null) {
				return valueMap.get(value);
			}
			return null;
		}
	}

	public enum RegularSize {
		XXS(-1), XS(0), S(1), M(2), L(3), XL(4), XXL(5), XXXL(6), XXXXL(7), XXXXXL(8), XXXXXXL(9);

		private int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public static int findValue(String size) {
			int count;
			String prefix;
			if (size.matches("^[2-9][Xx][SsLl]")) {
				// Convert 2XL to XXL, 3XL to XXXL, ...
				count = Integer.parseInt(size.substring(0, 1));
				prefix = new String(new char[count]).replace("\0", "X");
				size = prefix + size.substring(2).toUpperCase();
			}
			return valueOf(size).getValue();
		}

		RegularSize(int value) {
			this.value = value;
		}
	}

	public enum UKProductSize {
		UK8(0), UK9(1), UK10(2), UK11(3), UK12(4), UK13(5);

		private int value;

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		UKProductSize(int value) {
			this.value = value;
		}
	}

	public static final Integer ECOMMERCE_WOOPLR_EXTRA_TIME = 0;
	public static final Integer ECOMMERCE_WOOPLR_CONSTANT_TIME_BUFFER = 3;
	public static final String ECOMMERCE_WOOPLR_EXTRA_TIME_REASON = null;
	public static final Double ECOMMERCE_CONVENIENCE_CHARGE = 0.0D;
	public static final Integer ECOMMERCE_WOOPLR_SHIPPING_TIME = 7;
	public static final Integer ECOMMERCE_WOOPLR_DELIVERY_TIME = 7;
	public static final Integer ECOMMERCE_WOOPLR_CANCELLATION_TIME = 15;
	public static final String ECOMMERCE_REFUND_TIME = "10-15 Days";
	public static final String ECOMMERCE_REFUND_TIME_ZERO_DAYS = "0 Days";
	public static final Double ECOMMERCE_WOOPLR_COD_CHARGE = 50.0D;
	public static final Double ECOMMERCE_WOOPLR_SHIPPING_CHARGE = 100.0D;
	public static final String ECOMMERCE_WOOPLR_SHIPPING_METHOD = "wooplr";
	public static final String ECOMMERCE_WOOPLR_PAYMENT_SUPPORT = "4";
	public static final String ECOMMERCE_WOOPLR_SIZING_CHART_URL = null;
	public static final int ECOMMERCE_WOOPLR_SIZING_CHART_VER = 1;
	public static final Double ECOMMERCE_WOOPLR_VAT = 0.0D;

	public enum CardsType {
		LOGIN("Login"), GROUP_FOLLOW("Group Follow"), USER_FOLLOW("User Follow"), SOCIAL_CONNECT(
				"Social Connect"), APP_UPDATE("App Update"), ON_BOARDING("On boarding"), NOTIFICATION_SETTING(
						"Notification Setting"), PROFILE_COMPLETE_HANDLE(
								"Profile Complete Handle"), PROFILE_COMPLETE_PICTURE(
										"Profile Complete Picture"), POST_LOOK("Post Look"), LOVE_LOOK(
												"Love Look"), HAPPY_FESTIVAL("Happy Festival"), APP_RATING(
														"App Rating"), INVITE_FRIENDS("Invite Friends"), STYLE_MILES(
																"Style Miles"), FEEDBACK(
																		"Feedback"), ANNOUNCEMENT("Announcement");

		private String value;

		CardsType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public enum WooplrEntity {
		LOOK("LOOK"), CONTENT("CONTENT"), COLLECTION("COLLECTION"), USER("USER"), STORE("STORE"), PRODUCT(
				"PRODUCT"), ORDER("ORDER"), GROUP("GROUP"), APP("APP");

		private String entityType;

		public String getEntityType() {
			return entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		WooplrEntity(String entityType) {
			this.entityType = entityType;
		}
	}

	public enum ReverseShipmentStatus {
		INITIATED("INITIATED"), FAILED("FAILED"), SUCCESS("SUCCESS"), WAITING_TO_PICKED(
				"WAITING_TO_PICKED"), PICKED_FROM_CUSTOMER("PICKED_FROM_CUSTOMER"), DTO("DTO");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ReverseShipmentStatus(String value) {
			this.value = value;
		}
	}

	public enum UserChallenge {

		LOGIN("login") {
			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY_USER_PERFORM_LOGIN.getValue();
			}
		},
		LOVE_LOOK_10("love_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY__USER_LIKE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long likesDoneforChallengesCount =
			// AggregateStatisticsInterface.getLikesDoneForChallengesCount(userId,
			// EntityConstants.USER_TYPE);
			// return likesDoneforChallengesCount == 10L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }

		},
		FOLLOW_USERS_10("follow_user") {
			@Override
			public Long getEntityType() {
				return EntityConstants.USER_TYPE;
			}

			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY__USER_FOLLOW_USER.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long followUsersForChallengesCount =
			// AggregateStatisticsInterface.getFollowingCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return followUsersForChallengesCount == 10L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }

		},
		CREATE_COLLECTION_1("create_collection") {
			@Override
			public Long getEntityType() {
				return EntityConstants.COLLECTION;
			}

			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY__USER_CREATE_COLLECTION.getValue();
			}

		},
		HANDLE("create_handle") {

			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY_USER_CREATED_HANDLE.getValue();
			}

		},
		FIND_FRIENDS_ON_WOOPLR("find_friends") {
			// TODO: its complicated
			@Override
			public Long getActionType() {
				return EntityConstants.ActivityLogType.USER_ACTIVITY_USER_FIND_FRIENDS_ON_WOOPLR.getValue();
			}
		},
		POST_LOOK_1("post_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long recommendationChallengesCount = AggregateStatisticsInterface
			// .getRecommendationCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return recommendationChallengesCount == 1L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }
		},
		POST_LOOK_2("post_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long recommendationChallengesCount = AggregateStatisticsInterface
			// .getRecommendationCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return recommendationChallengesCount == 2L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }

		},
		POST_LOOK_3("post_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long recommendationChallengesCount = AggregateStatisticsInterface
			// .getRecommendationCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return recommendationChallengesCount == 3L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }

		},
		POST_LOOK_4("post_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long recommendationChallengesCount = AggregateStatisticsInterface
			// .getRecommendationCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return recommendationChallengesCount == 4L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }

		},
		POST_LOOK_5("post_look") {
			@Override
			public Long getEntityType() {
				return EntityConstants.FASHION_LOOK;
			}

			@Override
			public Long getActionType() {
				return ActivityLogType.USER_ACTIVITY__USER_CREATE_FASHION_LOOK.getValue();
			}

			// @Override
			// public boolean isApplicable(Long userId) {
			// Long recommendationChallengesCount = AggregateStatisticsInterface
			// .getRecommendationCountChallenges(userId,
			// EntityConstants.USER_TYPE);
			// return recommendationChallengesCount == 5L ? Boolean.TRUE :
			// Boolean.FALSE;
			// }
		},
		FEATURED_IN_TOPPICKS("featured_in_toppicks") {

		},
		LOOK_CURATED("look_curated") {

		},
		SHOP_PRODUCT_1_ON_WOOPLR("product_buy") {
			// TODO: its complicated

		},
		FEATURED_IN_COLLECTION("featured_in_collection") {

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> lookUserIds = new HashSet<>();
			// try {
			// List<LooksThemeCollection> looksThemeCollections =
			// LooksThemeCollectionDAO
			// .getLookCollectionById(entityId);
			// if (looksThemeCollections != null) {
			// for (LooksThemeCollection looksThemeCollection :
			// looksThemeCollections) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(looksThemeCollection.getLooks_id());
			// if (fashionLook != null) {
			// lookUserIds.add(fashionLook.getUserId());
			// }
			// }
			// }
			// } catch (DataBaseException e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(lookUserIds);
			// }
		},
		FEATURED_IN_CONTENT_COTM("featured_in_content") {
			@Override
			public Long getEntityType() {
				return EntityConstants.CONTENT_TYPE;
			}

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> widgetUserIds = new HashSet<>();
			// try {
			// List<Widget> widgets = WidgetBO.getWidgetsByContentId(entityId,
			// 0L, -1L);
			// if (widgets != null) {
			// for (Widget widget : widgets) {
			// if (widget.getUserId() != null) {
			// widgetUserIds.add(widget.getUserId());
			// }
			// if (widget.getLookId() != null) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(widget.getLookId());
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			// }
			// if (widget.getTwoLookList() != null &&
			// widget.getTwoLookList().size() > 0) {
			// List<Long> looks = widget.getTwoLookList();
			// for (Long look : looks) {
			// FashionLook fashionLook = FashionLookBO.getFashionLook(look);
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			//
			// }
			// }
			// }
			// }
			// } catch (Exception e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(widgetUserIds);
			// }

			// @Override
			// public boolean isApplicable(Long userId, Long entityId) {
			// Content content = ContentBO.getContentById(entityId);
			// // com.ubiquity.app.entity.content.ContentType contentType =
			// // ContentBO.getContentTypeById(content.getId());
			// if ("cotm".equalsIgnoreCase(content.getType())) {
			// return Boolean.TRUE;
			// }
			// return Boolean.FALSE;
			// }

		},
		FEATURED_IN_CONTENT_OOTD("featured_in_content") {
			@Override
			public Long getEntityType() {
				return EntityConstants.CONTENT_TYPE;
			}

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> widgetUserIds = new HashSet<>();
			// try {
			// List<Widget> widgets = WidgetBO.getWidgetsByContentId(entityId,
			// 0L, -1L);
			// if (widgets != null) {
			// for (Widget widget : widgets) {
			// if (widget.getUserId() != null) {
			// widgetUserIds.add(widget.getUserId());
			// }
			// if (widget.getLookId() != null) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(widget.getLookId());
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			// }
			// if (widget.getTwoLookList() != null &&
			// widget.getTwoLookList().size() > 0) {
			// List<Long> looks = widget.getTwoLookList();
			// for (Long look : looks) {
			// FashionLook fashionLook = FashionLookBO.getFashionLook(look);
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			//
			// }
			// }
			// }
			// }
			// } catch (Exception e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(widgetUserIds);
			// }

			// @Override
			// public boolean isApplicable(Long userId, Long entityId) {
			// Content content = ContentBO.getContentById(entityId);
			// // com.ubiquity.app.entity.content.ContentType contentType =
			// // ContentBO.getContentTypeById(content.getId());
			// if ("ootd".equalsIgnoreCase(content.getType())) {
			// return Boolean.TRUE;
			// }
			// return Boolean.FALSE;
			// }

		},
		FEATURED_IN_CONTENT_FOTD("featured_in_content") {

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> widgetUserIds = new HashSet<>();
			// try {
			// List<Widget> widgets = WidgetBO.getWidgetsByContentId(entityId,
			// 0L, -1L);
			// if (widgets != null) {
			// for (Widget widget : widgets) {
			// if (widget.getUserId() != null) {
			// widgetUserIds.add(widget.getUserId());
			// }
			// if (widget.getLookId() != null) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(widget.getLookId());
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			// }
			// if (widget.getTwoLookList() != null &&
			// widget.getTwoLookList().size() > 0) {
			// List<Long> looks = widget.getTwoLookList();
			// for (Long look : looks) {
			// FashionLook fashionLook = FashionLookBO.getFashionLook(look);
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			//
			// }
			// }
			// }
			// }
			// } catch (Exception e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(widgetUserIds);
			// }

			// @Override
			// public boolean isApplicable(Long userId, Long entityId) {
			// Content content = ContentBO.getContentById(entityId);
			// // com.ubiquity.app.entity.content.ContentType contentType =
			// // ContentBO.getContentTypeById(content.getId());
			// if ("fashionista-of-the-day".equalsIgnoreCase(content.getType()))
			// {
			// return Boolean.TRUE;
			// }
			// return Boolean.FALSE;
			// }
		},
		FEATURED_IN_CONTENT_LOOK_BOOK("featured_in_content") {

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> widgetUserIds = new HashSet<>();
			// Content content = ContentBO.getContentById(entityId);
			// try {
			// if (content != null) {
			// List<Widget> widgets = WidgetBO.getWidgetsByContentId(entityId,
			// 0L, -1L);
			// if (widgets != null) {
			// for (Widget widget : widgets) {
			// if (widget.getUserId() != null) {
			// widgetUserIds.add(widget.getUserId());
			// }
			// if (widget.getLookId() != null) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(widget.getLookId());
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			// }
			// if (widget.getTwoLookList() != null &&
			// widget.getTwoLookList().size() > 0) {
			// List<Long> looks = widget.getTwoLookList();
			// for (Long look : looks) {
			// FashionLook fashionLook = FashionLookBO.getFashionLook(look);
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			//
			// }
			// }
			// }
			// }
			// }
			// } catch (Exception e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(widgetUserIds);
			// }

			// @Override
			// public boolean isApplicable(Long userId, Long entityId) {
			// Content content = ContentBO.getContentById(entityId);
			// // com.ubiquity.app.entity.content.ContentType contentType =
			// // ContentBO.getContentTypeById(content.getId());
			// if ("lookbook".equalsIgnoreCase(content.getType())) {
			// return Boolean.TRUE;
			// }
			// return Boolean.FALSE;
			// }
		},
		FEATURED_IN_CONTENT("featured_in_content") {

			// @Override
			// public List<Long> getUserIds(Long entityId) {
			// Set<Long> widgetUserIds = new HashSet<>();
			// try {
			// List<Widget> widgets = WidgetBO.getWidgetsByContentId(entityId,
			// 0L, -1L);
			// if (widgets != null) {
			// for (Widget widget : widgets) {
			// if (widget.getUserId() != null) {
			// widgetUserIds.add(widget.getUserId());
			// }
			// if (widget.getLookId() != null) {
			// FashionLook fashionLook =
			// FashionLookBO.getFashionLook(widget.getLookId());
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			// }
			// if (widget.getTwoLookList() != null &&
			// widget.getTwoLookList().size() > 0) {
			// List<Long> looks = widget.getTwoLookList();
			// for (Long look : looks) {
			// FashionLook fashionLook = FashionLookBO.getFashionLook(look);
			// if (fashionLook != null) {
			// widgetUserIds.add(fashionLook.getUserId());
			// }
			//
			// }
			// }
			// }
			// }
			// } catch (Exception e) {
			// logger.error("Error occured..", e);
			// }
			// return new ArrayList<>(widgetUserIds);
			// }

			// @Override
			// public boolean isApplicable(Long userId, Long entityId) {
			// Content content = ContentBO.getContentById(entityId);
			// // com.ubiquity.app.entity.content.ContentType contentType =
			// // ContentBO.getContentTypeById(content.getId());
			// if ("lookbook".equalsIgnoreCase(content.getType())
			// || "fashionista-of-the-day".equalsIgnoreCase(content.getType())
			// || "ootd".equalsIgnoreCase(content.getType()) ||
			// "cotm".equalsIgnoreCase(content.getType())) {
			// return Boolean.FALSE;
			// }
			// return Boolean.TRUE;
			// }
		};

		private String challengeName;

		UserChallenge(String challengeName) {
			this.challengeName = challengeName;
		}

		public String getChallengeName() {
			return challengeName;
		}

		// public static List<UserChallenge> getUserChallenge(String
		// challengeName) {
		// List<UserChallenge> userChallenges = new ArrayList<>();
		// for (UserChallenge userChallenge : UserChallenge.values()) {
		// if (userChallenge.challengeName.equals(challengeName)) {
		// userChallenges.add(userChallenge);
		// }
		// }
		// return userChallenges;
		// }

		public Long getEntityType() {
			return -1L;
		}

		public Long getActionType() {
			return -1L;
		}

		public boolean isApplicable(Long userId, Long entityId) {
			return Boolean.TRUE;
		}

		public boolean isApplicable(Long userId) {
			return Boolean.TRUE;
		}

		public List<Long> getUserIds(Long entityId) {
			return null;
		}

		// public boolean postChallengeToUserWallet(Long userId, UserChallenge
		// userChallenge) throws DataBaseException {
		// List<UserChallengeStyleMiles> userChallengeStyleMileses =
		// UserChallengeStyleMilesDAO.get(userId);
		// if (userChallengeStyleMileses != null) {
		// for (UserChallengeStyleMiles userChallengeStyleMiles :
		// userChallengeStyleMileses) {
		// if (userChallenge.equals(
		// EntityConstants.UserChallenge.valueOf(userChallengeStyleMiles.getUserChallenge())))
		// {
		// return Boolean.FALSE;
		// }
		// }
		// }
		//
		// String error = WalletServerUtil.postStyleMiles(userId,
		// userChallenge);
		// UserChallengeStyleMiles userChallengeStyleMiles = new
		// UserChallengeStyleMiles();
		// userChallengeStyleMiles.setUserId(userId);
		// userChallengeStyleMiles.setUserChallenge(userChallenge.toString());
		// userChallengeStyleMiles.setCreateDate(new Date());
		// userChallengeStyleMiles.setUpdateDate(new Date());
		// if (error != null) {
		// userChallengeStyleMiles.setError(error);
		// userChallengeStyleMiles.setSuccess(Boolean.FALSE);
		// UserChallengeStyleMilesDAO.save(userChallengeStyleMiles);
		// return Boolean.FALSE;
		// }
		// userChallengeStyleMiles.setSuccess(Boolean.TRUE);
		// UserChallengeStyleMilesDAO.save(userChallengeStyleMiles);
		// return Boolean.TRUE;
		// }

		public boolean postChallengeToUserWallet(Long userId, Long entityId, Long entityType) {
			return false;
		}

	}

	public enum QuizType {
		FIND_A_THING("FIND_A_THING"), QUIZ("QUIZ");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		QuizType(String value) {
			this.value = value;
		}
	}

	public enum CampaignPromoType {
		VIP_CAMPAIGN("VIP_CAMPAIGN"), BOOK_A_STYLISH("BOOK_A_STYLISH");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		CampaignPromoType(String value) {
			this.value = value;
		}

	}

	public enum AppCardType {
		APP_CARD_TYPE("APP_CARD"), VOTING_CARD_TYPE("VOTING_CARD") {
			@Override
			public Boolean userAnsweredCardApplicable() {
				return Boolean.TRUE;
			}
		},
		FLIPPING_CARD_TYPE("FLIPPING_CARD") {
			@Override
			public Boolean userAnsweredCardApplicable() {
				return Boolean.TRUE;
			}
		};
		AppCardType(String cardType) {
			this.cardType = cardType;
		}

		private String cardType;

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public static AppCardType getCardType(String name) {
			for (AppCardType appCardType : AppCardType.values()) {
				if (appCardType.getCardType().equalsIgnoreCase(name)) {
					return appCardType;
				}
			}
			return null;
		}

		public Boolean userAnsweredCardApplicable() {
			return Boolean.FALSE;
		}
	}

	public enum OrderConsolation {
		AMOUNT("AMOUNT"), COUPON("COUPON"), FREE_SHIPPING("FREE_SHIPPING");

		private String entityType;

		public String getEntityType() {
			return entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		OrderConsolation(String entityType) {
			this.entityType = entityType;
		}
	}

	public enum UserEmailUnSubscriptionType {
		NEWSLETTER("NEWSLETTER"), PROMOTIONS("PROMOTIONS"), SHOPPING("SHOPPING");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		UserEmailUnSubscriptionType(String value) {
			this.value = value;
		}
	}

	public enum SellerAction {
		VIEW_REPORT("VIEW_REPORT"), VIEW_PAYMENT_DETAILS("VIEW_PAYMENT_DETAILS"), VIEW_REFUND_DETAILS(
				"VIEW_REFUND_DETAILS"), VIEW_ALL_STORES("VIEW_ALL_STORES"), VIEW_STORE("VIEW_STORE"), VIEW_PRODUCT(
						"VIEW_PRODUCT"), UPDATE_ORDER("UPDATE_ORDER"), UPDATE_PRODUCT("UPDATE_PRODUCT"), UPDATE_STORE(
								"UPDATE_STORE"), VIEW_ORDER_COUNT("VIEW_ORDER_COUNT"), INITIATE_REFUND(
										"INITIATE_REFUND"), MARK_AS_READY_TO_SHIP("MARK_AS_READY_TO_SHIP"), ADD_TICKET(
												"ADD_TICKET"), VIEW_PARTNER_DETAILS(
														"VIEW_PARTNER_DETAILS"), VIEW_CUSTOMER_DETAILS(
																"VIEW_CUSTOMER_DETAILS"), DELETE_SELLER(
																		"DELETE_SELLER");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		SellerAction(String value) {
			this.value = value;
		}
	}

	// public static final HashMap<String, Boolean> SELLER_ACTION_MAP = new
	// HashMap<>();
	// static {
	// SELLER_ACTION_MAP.put(SellerPermission.SELLER.getValue() + "_" +
	// SellerAction.VIEW_REPORT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.SELLER.getValue() + "_" +
	// SellerAction.UPDATE_ORDER.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.SELLER.getValue() + "_" +
	// SellerAction.VIEW_CUSTOMER_DETAILS.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_REPORT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_ALL_STORES.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_PAYMENT_DETAILS.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_REFUND_DETAILS.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_ORDER_COUNT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.INITIATE_REFUND.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.MARK_AS_READY_TO_SHIP.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.ADD_TICKET.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.DELETE_SELLER.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_PRODUCT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.UPDATE_PRODUCT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.UPDATE_ORDER.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.UPDATE_STORE.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_STORE.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_PARTNER_DETAILS.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.WOOPLR.getValue() + "_" +
	// SellerAction.VIEW_CUSTOMER_DETAILS.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.CURATOR.getValue() + "_" +
	// SellerAction.VIEW_PRODUCT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.CURATOR.getValue() + "_" +
	// SellerAction.UPDATE_PRODUCT.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.CURATOR.getValue() + "_" +
	// SellerAction.VIEW_ALL_STORES.getValue(),
	// Boolean.TRUE);
	// SELLER_ACTION_MAP.put(SellerPermission.CURATOR.getValue() + "_" +
	// SellerAction.VIEW_STORE.getValue(),
	// Boolean.TRUE);
	// }

	public enum MeasurementUnit {
		INCHES("INCHES"), CM("CM");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		MeasurementUnit(String value) {
			this.value = value;
		}
	}

	public enum BrandCategory {
		TOPWEAR("topwear"), BOTTOMWEAR("bottomwear"), FOOTWEAR(
				"footwear")/*
							 * , ALL("all")
							 */;

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		BrandCategory(String value) {
			this.value = value;
		}
	}

	public enum DELIVERY_PARTNER {
		DELHIVERY("DELHIVERY"), ECOMMEXPRESS("ECOMMEXPRESS");

		private String value;

		public String getValue() {
			return value;
		}

		// Enable/Disable Courier partners from here
		public boolean isEnabled() {
			if (ECOMMEXPRESS.getValue().equals(value))
				return false;

			return true;
		}

		public void setValue(String value) {
			this.value = value;
		}

		DELIVERY_PARTNER(String value) {
			this.value = value;
		}
	}

	public enum ResellerCompleteness {
		STORE_NAME("STORE_NAME", 20, "You need to name your store to go ahead. Eg: Aishwarya's Popup Shop.",
				"/dashboard/store-info#store-details", true), COLLECTIONS("COLLECTIONS", 10,
						"You need to add at least 3 collections to go ahead. This will ensure your store has enough range for all your visitors.",
						"/dashboard/manage-store#collections", true), // when 2
																		// collection
																		// is
																		// there
																		// in
																		// store
		EMAIL_VERIFICATION("EMAIL_VERIFICATIONS", 20,
				"Hey, you will need to verify your email to continue with Store creation.", "/",
				true), PHONE_VERIFICATION("PHONE_VERIFICATION", 10,
						"Hey, you will need to verify your phone number to start claiming your income.", "/", false),

		STORE_LOGO("STORE_LOGO", 5,
				"Add a cool store logo to make your store look credible and give it a unique identity.",
				"/dashboard/store-info#store-details", true), STORE_BANNER("STORE_BANNER", 10,
						"Add a cool store banner will add a unique identity to your store.",
						"/dashboard/store-info#store-details", true), STORE_DESCRIPTION("STORE_DESCRIPTION", 10,
								"Give your store a description so that your visitors know what your store is about.",
								"/dashboard/store-info#store-details",
								true), GENDER("GENDER", 5, "How do you identify your self?", "/", false), BANK_DETAILS(
										"BANK_DETAILS", 10,
										"Add your bank details to start claiming your earnings into your account now.",
										"/dashboard/edit/accounts#bank", true), PAN_CARD("PAN_CARD", 10,
												"Upload your PAN Card to start claiming your income.",
												"/dashboard/edit/accounts#pan", true), USER_TYPE("USER_TYPE", 5,
														"Tell us what your are doing with your life now, to help us direct you better on how to earn.",
														"/", false), SOCIAL_INTEGRATION("SOCIAL_INTEGRATION", 5, "", "",
																false), FB("FB", 2,
																		"Add your Facebook Profile so that your vistiors can explore more about who you are and your style.",
																		"/dashboard/edit/personal#profile",
																		true), INSTAGRAM("INSTAGRAM", 1,
																				"Add your Instagram Profile so that your vistiors can explore more about who you are and your style.",
																				"/dashboard/edit/personal#profile",
																				true), TWITTER("TWITTER", 1,
																						"Add your Twitter Profile so that your vistiors can explore more about who you are and your style.",
																						"/dashboard/edit/personal#profile",
																						true), BLOG("BLOG", 1,
																								"Add a link to your Blog or Website & make your store more credible.",
																								"/dashboard/edit/personal#profile",
																								true), WOOPLR_CONNECT(
																										"WOOPLR_CONNECT",
																										5,
																										"Connect your Wooplr Account to make adding new products to your store easier.",
																										"/", false),;;

		private String value;
		private Integer percent;
		private String message;
		private String weblink;
		private boolean isActive;

		ResellerCompleteness(String value, Integer percent, String message, String weblink, boolean isActive) {
			this.value = value;
			this.percent = percent;
			this.message = message;
			this.weblink = weblink;
			this.isActive = isActive;

		}

		private static List<String> values;

		private static Map<String, ResellerCompleteness> map = new HashMap<String, ResellerCompleteness>();

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getPercent() {
			return percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getWeblink() {
			return weblink;
		}

		public void setWeblink(String weblink) {
			this.weblink = weblink;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setIsActive(boolean isActive) {
			this.isActive = isActive;
		}

		// public static List<String> getResellerCompletenessValues() {
		// if (values == null) {
		// values = new ArrayList<>();
		//
		// for (EntityConstants.ResellerCompleteness profileEnum :
		// EntityConstants.ResellerCompleteness.values()) {
		// values.add(profileEnum.getValue());
		// }
		// }
		// return values;
		// }

		public static ResellerCompleteness getCompletenessByValue(String value) {
			return map.get(value);
		}

		static {
			for (ResellerCompleteness resellerCompleteness : ResellerCompleteness.values()) {
				map.put(resellerCompleteness.getValue(), resellerCompleteness);
			}
		}
	}

	public enum ResellerMessageType {
		BROADCAST("BROADCAST"), MULTICAST("MULTICAST");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ResellerMessageType(String value) {
			this.value = value;
		}
	}

	public enum ResellerMessagePlatform {
		WOOPLR("WOOPLR"), RESELLER("RESELLER");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ResellerMessagePlatform(String value) {
			this.value = value;
		}
	}

	public enum AWB_TYPES {
		PREPAID("PPD"), CASH_ON_DELIVERY("COD"), REVERSE_PICKUP("REV");

		private String value;

		AWB_TYPES(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public enum PancardStatus {
		PENDING("PENDING"), VERIFIED("VERIFIED"), REJECTED("REJECTED");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		PancardStatus(String value) {
			this.value = value;
		}
	}

	public enum ResellerProfession {
		STUDENT("STUDENT"), WORKING_PROFESSIONAL("WORKING_PROFESSIONAL"), FASHION_BLOGGER("FASHION_BLOGGER"), HOMEMAKER(
				"HOMEMAKER"), BUSSINESS_OWNER("BUSSINESS_OWNER"), LOOKING_FOR_PARTTIME_JOB("LOOKING_FOR_PARTTIME_JOB");

		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		ResellerProfession(String value) {
			this.value = value;
		}
	}
}
