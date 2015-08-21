package com.zuozuo.show_time.jedis;

import redis.clients.jedis.Jedis;

/**
 * Created by zuozuo on 15-8-20.
 */
public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.set("foo", "bar"));

        System.out.println(jedis.get("foo"));
    }
}
