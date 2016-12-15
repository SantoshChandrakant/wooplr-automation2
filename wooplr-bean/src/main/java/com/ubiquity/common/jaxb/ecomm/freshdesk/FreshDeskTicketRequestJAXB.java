package com.ubiquity.common.jaxb.ecomm.freshdesk;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by subharthi on 9/20/16.
 */
public class FreshDeskTicketRequestJAXB implements Serializable {

    private String id;
    private String email;
    private String phone;
    private String twitter_id;
    private String name;
    private String requester_id;
    private String subject;
    private String description;
    private String description_html;
    private Integer status;
    private Integer priority;
    private String source;
    private Boolean deleted;
    private Boolean spam;
    private String group_id;
    private String ticket_type;
    private List<String> cc_emails;
    private String email_config_id;
    private Boolean isescalated;
    private Long due_by;
    private List<Object> attachments;
    private Map<String, Object> custom_fields;

    public FreshDeskTicketRequestJAXB(){

    }

    public FreshDeskTicketRequestJAXB(String email, String subject, String description, Integer status, Integer priority, Map<String, Object> custom_fields){
        this.email = email;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.custom_fields = custom_fields;
        this.subject = subject;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTwitter_id() {
        return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
        this.twitter_id = twitter_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequester_id() {
        return requester_id;
    }

    public void setRequester_id(String requester_id) {
        this.requester_id = requester_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription_html() {
        return description_html;
    }

    public void setDescription_html(String description_html) {
        this.description_html = description_html;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getSpam() {
        return spam;
    }

    public void setSpam(Boolean spam) {
        this.spam = spam;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public List<String> getCc_emails() {
        return cc_emails;
    }

    public void setCc_emails(List<String> cc_emails) {
        this.cc_emails = cc_emails;
    }

    public String getEmail_config_id() {
        return email_config_id;
    }

    public void setEmail_config_id(String email_config_id) {
        this.email_config_id = email_config_id;
    }

    public Boolean getIsescalated() {
        return isescalated;
    }

    public void setIsescalated(Boolean isescalated) {
        this.isescalated = isescalated;
    }

    public Long getDue_by() {
        return due_by;
    }

    public void setDue_by(Long due_by) {
        this.due_by = due_by;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public Map<String, Object> getCustom_fields() {
        return custom_fields;
    }

    public void setCustom_fields(Map<String, Object> custom_fields) {
        this.custom_fields = custom_fields;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FreshDeskTicketRequestJAXB{");
        sb.append("id='").append(id).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", twitter_id='").append(twitter_id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", requester_id='").append(requester_id).append('\'');
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", description_html='").append(description_html).append('\'');
        sb.append(", status=").append(status);
        sb.append(", priority=").append(priority);
        sb.append(", source='").append(source).append('\'');
        sb.append(", deleted=").append(deleted);
        sb.append(", spam=").append(spam);
        sb.append(", group_id='").append(group_id).append('\'');
        sb.append(", ticket_type='").append(ticket_type).append('\'');
        sb.append(", cc_emails=").append(cc_emails);
        sb.append(", email_config_id='").append(email_config_id).append('\'');
        sb.append(", isescalated=").append(isescalated);
        sb.append(", due_by=").append(due_by);
        sb.append(", attachments=").append(attachments);
        sb.append(", custom_fields=").append(custom_fields);
        sb.append('}');
        return sb.toString();
    }
}
