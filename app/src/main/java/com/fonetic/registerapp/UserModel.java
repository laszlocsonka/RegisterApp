package com.fonetic.registerapp;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
