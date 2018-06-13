package com.xmqbeast.mq.rabbitmq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmqbeast.mq.rabbitmq.scenes.single.HelloSender1;

@RestController
@RequestMapping("/rabbit")
@Api(value = "单消费者，单发送者",description = "")
public class SingleController {

    @Autowired
    private HelloSender1 helloSender1;
    
    @Autowired
    private HelloSender1 helloSender2;

    @ApiOperation("单生产者和单消费者") // 单个接口的描述
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public void hello() {
        helloSender1.send();
    }

}
