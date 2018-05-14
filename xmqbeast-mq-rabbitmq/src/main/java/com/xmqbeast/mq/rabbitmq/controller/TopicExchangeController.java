package com.xmqbeast.mq.rabbitmq.controller;

import io.swagger.annotations.Api;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xmqbeast.mq.rabbitmq.scenes.topicExChange.TopicSender;

@RestController
@RequestMapping("/rabbit5")
@Api(value = "topic exchange类型rabbitmq",description = "")
public class TopicExchangeController {

    @Autowired
    private TopicSender topicSender;

    @RequestMapping(value = "/topic",method = RequestMethod.GET)
    public void topicTest() {
        topicSender.send();
    }
}
