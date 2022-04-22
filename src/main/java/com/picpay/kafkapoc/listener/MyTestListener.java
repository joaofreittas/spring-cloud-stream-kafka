package com.picpay.kafkapoc.listener;

import com.picpay.kafkapoc.domain.Pessoa;
import com.picpay.kafkapoc.stream.KafkaInputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyTestListener {

    @StreamListener(KafkaInputStream.MY_TEST_EVENT)
    public void listen(@Payload final Pessoa body) {
        log.info("BODY RECEIVED: {}", body);
    }

}