package com.xmqbeast.mq.rabbitmq.scenes.fanoutExChange;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @CSDN: http://blog.csdn.net/qqhjqs?viewmode=contents
 * @BLOG: http://vector4wang.tk
 * @wxid: BMHJQS
 */
@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msgString="fanoutSender :hello i am hzb";
        System.out.println(msgString);
        this.rabbitTemplate.convertAndSend("fanoutExchange","abcd.ee", msgString);
    }

}