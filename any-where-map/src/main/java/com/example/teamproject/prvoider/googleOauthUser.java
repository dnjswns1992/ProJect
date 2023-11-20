package com.example.teamproject.prvoider;


import lombok.Getter;

import java.util.Map;
@Getter
public class googleOauthUser implements Oauth2UserInfo {

    private Map<String,Object> attribute;

    public googleOauthUser(Map<String, Object> attribute){
        this.attribute = attribute;
    }

    @Override
    public String getProviderId() {
        return (String)attribute.get("sub");
    }

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getEmail() {
        return (String)attribute.get("email");
    }

}
