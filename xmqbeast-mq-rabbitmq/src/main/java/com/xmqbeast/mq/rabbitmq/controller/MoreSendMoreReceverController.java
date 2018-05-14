package com.xmqbeast.mq.rabbitmq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmqbeast.mq.rabbitmq.scenes.moreSendMoreRecever.HelloMoreSender1;
import com.xmqbeast.mq.rabbitmq.scenes.moreSendMoreRecever.HelloMoreSender2;

@RestController
@RequestMapping("/rabbit3")
@Api("多生产者-多消费者")
public class MoreSendMoreReceverController {

    @Autowired
    private HelloMoreSender1 helloMoreSender1;

    @Autowired
    private HelloMoreSender2 helloMoreSender2;

    @ApiOperation("多生产者-多消费者")
    @RequestMapping(value = "/manyToMany",method = RequestMethod.GET)
    public void manyToMany() {
        for(int i=0;i<10;i++){
            helloMoreSender1.send("hellomsg:"+i);
            helloMoreSender2.send("hellomsg:"+i);
        }

    }
}
