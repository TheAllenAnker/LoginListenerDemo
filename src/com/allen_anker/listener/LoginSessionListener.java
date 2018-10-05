package com.allen_anker.listener;

import com.allen_anker.bean.LoginCache;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class LoginSessionListener implements HttpSessionAttributeListener {

    public static final String LOGIN_USER = "loginUser";

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        if (se.getName().equals(LOGIN_USER)) {
            String attrValue = (String) se.getValue();
            HttpSession session = se.getSession();
            String sessionId = session.getId();

            String oldSessionId = LoginCache.getLoginCache().getSessionIdByUsername(attrValue);
            if (oldSessionId != null) {
                HttpSession oldSession = LoginCache.getLoginCache().getSessionById(oldSessionId);
                oldSession.invalidate();
            }
            LoginCache.getLoginCache().setSessionIdByUsername(attrValue, sessionId);
            LoginCache.getLoginCache().setSessionById(sessionId, session);
        }
    }
}
