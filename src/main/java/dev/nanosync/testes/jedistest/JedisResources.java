package dev.nanosync.testes.jedistest;

import redis.clients.jedis.Jedis;

public class JedisResources {
    Jedis jedisResources;
    public JedisResources(Jedis jedisResources){
        this.jedisResources = jedisResources;
    }

    public void setAttribute(String key, String value){
        jedisResources.set(key, value);
    }

    public String getAttribute(String key){
        return jedisResources.get(key);
    }
}
