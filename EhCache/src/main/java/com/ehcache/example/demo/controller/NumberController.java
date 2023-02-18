package com.ehcache.example.demo.controller;

import com.ehcache.example.demo.service.NumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    private static final Logger log = LoggerFactory.getLogger(NumberController.class);
    @Autowired
    private NumberService numberService;

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
        log.info("Controller: call numberService to square {}", number);
        return String.format("{\"square\": %s}", numberService.square(number));
    }

    @GetMapping(path = "/cube/{number}")
    public String getCube(@PathVariable Long number) {
        log.info("Controller: call numberService to square {}", number);
        return String.format("{\"square\": %s}", numberService.cube(number));
    }

    @GetMapping("/cache/clear/all")
    public String clearAllCache(){
        log.info("Clearing cache");
        return numberService.clearAllCache();
    }

    @GetMapping("/cache/clear/{cacheKey}")
    public String clearAllCache(@PathVariable String cacheKey){
        log.info("Clearing cache");
        return numberService.clearCache(cacheKey);
    }
}
