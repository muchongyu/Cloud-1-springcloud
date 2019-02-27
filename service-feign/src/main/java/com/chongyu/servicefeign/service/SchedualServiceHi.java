package com.chongyu.servicefeign.service;

import com.chongyu.servicefeign.service.serviceImpl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHiFromCilentOne(@RequestParam(value = "name") String name);
}
