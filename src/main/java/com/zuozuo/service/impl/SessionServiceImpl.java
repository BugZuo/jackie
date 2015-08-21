package com.zuozuo.service.impl;

import com.zuozuo.common.SessionMgr;
import com.zuozuo.service.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zuozuo on 15-8-20.
 */
public class SessionServiceImpl implements ISessionService {

    @Autowired
    private SessionMgr sessionMgr;

    public String get(String key) {
        return sessionMgr.get(key);
    }

    public void set(String key, String value) {
        sessionMgr.set(key, value);
    }
}
