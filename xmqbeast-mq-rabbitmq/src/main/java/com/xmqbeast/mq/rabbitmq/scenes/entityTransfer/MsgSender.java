package com.xmqbeast.mq.rabbitmq.scenes.entityTransfer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xmqbeast.mq.rabbitmq.model.Msg;

@Component
public class MsgSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(Msg msg) {
        System.out.println("msg send : " + msg.toString());
        this.rabbitTemplate.convertAndSend("msgQueue", msg);
    }
}
