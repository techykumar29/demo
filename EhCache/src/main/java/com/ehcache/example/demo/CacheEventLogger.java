package com.ehcache.example.demo;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheEventLogger implements CacheEventListener<Object,Object> {
    private static Logger log = LoggerFactory.getLogger(CacheEventLogger.class);
    @Override
    public void onEvent(CacheEvent<? extends Object, ? extends Object> cacheEvent) {
        log.info("Caching",cacheEvent.getKey(),cacheEvent.getOldValue(),cacheEvent.getNewValue());
    }
}
