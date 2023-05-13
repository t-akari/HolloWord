package com.example.helloworld;

import java.time.LocalDateTime;

public class HelloWorldResponse {
    private String message;
    private LocalDateTime timestamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public HelloWorldResponse(String message, LocalDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;


    }

}
