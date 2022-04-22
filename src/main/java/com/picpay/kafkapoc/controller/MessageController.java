package com.picpay.kafkapoc.controller;

import com.picpay.kafkapoc.domain.Pessoa;
import com.picpay.kafkapoc.service.SendMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final SendMessageService service;

    public MessageController(final SendMessageService sendMessageService) {
        this.service = sendMessageService;
    }

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody Pessoa pessoa) {
        service.sendMessage(pessoa);
        return ResponseEntity.ok().build();
    }

}
