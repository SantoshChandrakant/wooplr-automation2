package com.ubiquity.common.jaxb.ecomm;

import java.util.List;

/**
 * Created by subharthi on 11/12/15.
 */
public class PushNotificationPOJO<T extends PushNotificationMessagePOJO> {
	private String campaign_key;
	private String target_type;
	private List<T> messages;

	public String getCampaign_key() {
		return campaign_key;
	}

	public void setCampaign_key(String campaign_key) {
		this.campaign_key = campaign_key;
	}

	public String getTarget_type() {
		return target_type;
	}

	public void setTarget_type(String target_type) {
		this.target_type = target_type;
	}

	public List<T> getMessages() {
		return messages;
	}

	public void setMessages(List<T> messages) {
		this.messages = messages;
	}
}
