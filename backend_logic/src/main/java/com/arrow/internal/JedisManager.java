package com.arrow.internal;

import redis.clients.jedis.Jedis;

/**
 * Created by ayush.shukla on 10/3/2016.
 */
public class JedisManager {
    private static Jedis _jedisinstance;

    private JedisManager() {
    }

    public static Jedis getinstance() {
        if (_jedisinstance == null) {
            _jedisinstance = new Jedis("localhost");
        }
        return _jedisinstance;
    }
}
