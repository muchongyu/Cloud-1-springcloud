package com.chongyu.servicefeign.service.serviceImpl;

import com.chongyu.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromCilentOne(String name) {
        return "(熔断器)sorry " + name;
    }
}
