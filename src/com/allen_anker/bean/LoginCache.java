package com.allen_anker.bean;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

public class LoginCache {

    private static LoginCache cache = new LoginCache();

    private Map<String, String> loginUserSession = new HashMap<>();
    private Map<String, HttpSession> loginSession = new HashMap<>();

    private LoginCache() {

    }

    public static LoginCache getLoginCache() {
        return cache;
    }

    public String getSessionIdByUsername(String username) {
        return loginUserSession.get(username);
    }

    public HttpSession getSessionById(String id) {
        return loginSession.get(id);
    }

    public void setSessionIdByUsername(String username, String id) {
        loginUserSession.put(username, id);
    }

    public void setSessionById(String id, HttpSession session) {
        loginSession.put(id, session);
    }
}
