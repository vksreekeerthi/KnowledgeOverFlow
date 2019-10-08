package com.virtusa.KnowlegeOverFlow.Model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class ErrorDetails {
    @UpdateTimestamp
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}