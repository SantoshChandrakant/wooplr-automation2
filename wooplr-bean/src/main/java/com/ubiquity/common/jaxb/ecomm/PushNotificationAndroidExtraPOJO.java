package com.ubiquity.common.jaxb.ecomm;

/**
 * Created by subharthi on 11/12/15.
 */
public class PushNotificationAndroidExtraPOJO {

	private String type;
	private String deeplink;
	private String notificationText;
	private String smallImageUrl;
	private String bigImageUrl;
	private String timestamp;
	private String wooplrVersion;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDeeplink() {
		return deeplink;
	}

	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}

	public String getNotificationText() {
		return notificationText;
	}

	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}

	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}

	public String getBigImageUrl() {
		return bigImageUrl;
	}

	public void setBigImageUrl(String bigImageUrl) {
		this.bigImageUrl = bigImageUrl;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getWooplrVersion() {
		return wooplrVersion;
	}

	public void setWooplrVersion(String wooplrVersion) {
		this.wooplrVersion = wooplrVersion;
	}
}
