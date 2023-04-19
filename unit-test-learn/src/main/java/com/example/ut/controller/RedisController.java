package com.example.ut.controller;

import com.example.ut.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@Slf4j
public class RedisController {
 
    @Autowired
    private RedisTemplate redisTemplate;
 
 
    @GetMapping(value = "/getHour")
    public Set getHour() {
        long hour=System.currentTimeMillis()/(1000*60*60);
        //ZREVRANGE 返回有序集key中，指定区间内的成员,降序。
        Set<ZSetOperations.TypedTuple<Integer>> rang= this.redisTemplate.opsForZSet().reverseRangeWithScores(Constants.HOUR_KEY+hour,0,30);
        return rang;
    }
    @GetMapping(value = "/getDay")
    public Set getDay() {
        Set<ZSetOperations.TypedTuple<Integer>> rang= this.redisTemplate.opsForZSet().reverseRangeWithScores(Constants.DAY_KEY,0,30);
        return rang;
    }
 
    @GetMapping(value = "/getWeek")
    public Set getWeek() {
        Set<ZSetOperations.TypedTuple<Integer>> rang= this.redisTemplate.opsForZSet().reverseRangeWithScores(Constants.WEEK_KEY,0,30);
        return rang;
    }
 
    @GetMapping(value = "/getMonth")
    public Set getMonth() {
        Set<ZSetOperations.TypedTuple<Integer>> rang= this.redisTemplate.opsForZSet().reverseRangeWithScores(Constants.MONTH_KEY,0,30);
        return rang;
    }
}