package com.virtusa.KnowlegeOverFlow.Model;

import javax.validation.constraints.NotNull;

public class LoginRequest {
    @NotNull(message="User name cannot be empty")
    private String email;
    @NotNull(message="Password cannot be empty")
    private String password;

    public LoginRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
