package com.ehcache.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class NumberService {
    private static final Logger log = LoggerFactory.getLogger(NumberService.class);

    @Autowired
    CacheManager cacheManager;
    @Cacheable(
            value = "getSquare",
            key = "#number",
            condition = "#number>10")
    public BigDecimal square(Long number) {
        BigDecimal square = BigDecimal.valueOf(number)
                .multiply(BigDecimal.valueOf(number));
        log.info("square of {} is {}", number, square);
        return square;
    }


    public String clearAllCache() {
        cacheManager.getCache("getSquare").clear();
        return "All Cache cleared";
    }

    public String clearCache(String cacheKey){
        Cache cache =cacheManager.getCache("getSquare");
        cache.evict(Long.parseLong(cacheKey));
        return "Cache is removed for :"+cacheKey;
    }
}
