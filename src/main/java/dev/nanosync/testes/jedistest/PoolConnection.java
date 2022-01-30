package dev.nanosync.testes.jedistest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class PoolConnection {
    JedisPool pool;
    public PoolConnection(){
        pool = new JedisPool("localhost", 6379);
    }

    public JedisResources getResources(){
        return new JedisResources(pool.getResource());
    }
}
