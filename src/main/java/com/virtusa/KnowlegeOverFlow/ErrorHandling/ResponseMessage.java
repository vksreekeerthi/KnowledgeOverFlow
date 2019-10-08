package com.virtusa.KnowlegeOverFlow.ErrorHandling;

public class ResponseMessage {
    private int statusCode;
    private String statusMessage;

    public ResponseMessage(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "statusCode=" + statusCode +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
