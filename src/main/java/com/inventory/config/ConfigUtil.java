/*package com.inventory.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;


public class ConfigUtil {
    private ConfigUtil() {}

    public static final String USER_ID_KEY = "user_id";

    public static String extractUser(Authentication auth) {
        try {
            return (String) ((JwtAuthenticationToken) auth).getTokenAttributes().get(USER_ID_KEY);
        } catch (Exception e) {
            return "NA";
        }
    }
}*/