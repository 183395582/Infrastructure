package com.gmzj.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import redis.clients.jedis.Jedis;

import com.gmzj.spring.SpringUtils;

@Configuration
public class RedisUtil {

	private static JedisConnectionFactory factory;
    
    /**
     * 获取Jedis实例
     * @return
     */
    public static Jedis getJedis() {
        try {
            if (factory != null) {
                JedisConnection conn = factory.getConnection();
                return conn.getNativeConnection();
            } else {
            	factory = SpringUtils.getBean(JedisConnectionFactory.class);
            	return factory.getConnection().getNativeConnection();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
