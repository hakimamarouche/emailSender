package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonEmail {
    @JsonProperty
    private String emailAddress;
    @JsonProperty
    private String password;
    @JsonProperty
    private String name;
    @JsonProperty
    private String subject;
    @JsonProperty
    private String[] to;
    @JsonProperty
    private String messageBody;

    @JsonCreator
    public JsonEmail(String emailAddress, String password, String name, String subject, String[] to, String messageBody) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.name = name;
        this.subject = subject;
        this.to = to;
        this.messageBody = messageBody;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
