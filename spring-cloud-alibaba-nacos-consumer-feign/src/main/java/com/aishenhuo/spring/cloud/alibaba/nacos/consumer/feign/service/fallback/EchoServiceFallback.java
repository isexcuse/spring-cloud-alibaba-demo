package com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.aishenhuo.spring.cloud.alibaba.nacos.consumer.feign.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @description: 避免连锁故障，通过 fallback 方法可以直接返回一个固定值
 * @author: XiongFeiYang
 * @createTime: 2019-03-03 19:18
 **/
@Component
public class EchoServiceFallback implements TestService {

    @Override
    public String echo(String message) {
        return "请求失败，请检查您的网络";
    }
}
