package com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 服务消费者调用测试接口入口
 * @author: XiongFeiYang
 * @createTime: 2019-03-03 18:20
 **/
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return testService.echo("Hi Feign");
    }

}
