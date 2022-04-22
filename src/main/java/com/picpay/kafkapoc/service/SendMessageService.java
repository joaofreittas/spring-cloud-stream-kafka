package com.picpay.kafkapoc.service;

import com.picpay.kafkapoc.domain.Pessoa;
import com.picpay.kafkapoc.stream.KafkaOutputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@Service
public class SendMessageService {

    private final KafkaOutputStream kafkaOutputStream;

    public SendMessageService(final KafkaOutputStream kafkaOutputStream) {
        this.kafkaOutputStream = kafkaOutputStream;
    }

    public void sendMessage(final Pessoa pessoa) {
        log.info("Sending message {}", pessoa);
        MessageChannel messageChannel = kafkaOutputStream.myTestEvent();

        Message<Pessoa> messageBuilder = MessageBuilder
            .withPayload(pessoa)
            .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
            .build();

        messageChannel.send(messageBuilder);
    }

}
