package com.ehcache.example.demo;

import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.stereotype.Component;

import javax.cache.CacheManager;
import javax.cache.configuration.MutableConfiguration;

@Component
public class CacheConfigSetup implements JCacheManagerCustomizer {
    @Override
    public void customize(CacheManager cacheManager) {
        cacheManager.createCache("getSquare",new MutableConfiguration<Long,Long>().setStoreByValue(true));
    }
}
