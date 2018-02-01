package com.lab.xxx.chatbot.api.model;

public class DFResponse {
    private String speech;
    private String displayText;
    private BotMessages data;
    private String [] contextOut;
    private String source;

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public BotMessages getData() {
        return data;
    }

    public void setData(BotMessages data) {
        this.data = data;
    }

    public String[] getContextOut() {
        return contextOut;
    }

    public void setContextOut(String[] contextOut) {
        this.contextOut = contextOut;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
