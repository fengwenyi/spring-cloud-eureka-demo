package com.fengwenyi.eureka_server.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Erwin Feng
 * @since 2020/8/30
 */
@Slf4j
@Component // 事件驱动，优化观察者模式
public class EurekaRegisterListener {

    @EventListener
    public void register(EurekaInstanceRegisteredEvent event) {
        log.info("接收到服务注册请求：服务名[{}]，ip地址：[{}]", event.getInstanceInfo().getAppName(), event.getInstanceInfo().getIPAddr());
    }

}
