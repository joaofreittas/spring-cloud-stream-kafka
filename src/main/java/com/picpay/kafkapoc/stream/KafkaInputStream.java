package com.picpay.kafkapoc.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaInputStream {

    String MY_TEST_EVENT = "my-test-input";

    @Input(KafkaInputStream.MY_TEST_EVENT)
    SubscribableChannel myTestEvent();
}
