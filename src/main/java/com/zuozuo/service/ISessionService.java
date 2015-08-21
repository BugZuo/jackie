package com.zuozuo.service;

/**
 * Created by zuozuo on 15-8-20.
 */
public interface ISessionService {
    String get(String key);

    void set(String key, String value);
}
