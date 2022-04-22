package com.picpay.kafkapoc.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaOutputStream {

    String MY_TEST_EVENT_OUTPUT = "my-test-output";

    @Output(KafkaOutputStream.MY_TEST_EVENT_OUTPUT)
    MessageChannel myTestEvent();

}
