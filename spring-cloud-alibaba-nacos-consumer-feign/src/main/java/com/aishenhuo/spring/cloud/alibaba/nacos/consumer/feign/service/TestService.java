package com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 测试服务
 * @author: XiongFeiYang
 * @createTime: 2019-03-03 18:11
 **/
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class)
public interface TestService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);

//    String echo(String message);

}
