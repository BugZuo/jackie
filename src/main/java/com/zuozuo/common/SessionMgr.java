package com.zuozuo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by zuozuo on 15-8-20.
 */
public class SessionMgr {

    @Autowired
    private RedisTemplate<String, String> redisCli;

    public String get(String key) {
        return redisCli.opsForValue().get(key);
    }

    public void set(String key, String value) {
        redisCli.opsForValue().set(key, value);
    }
}
