package com.picpay.kafkapoc;

import com.picpay.kafkapoc.stream.KafkaInputStream;
import com.picpay.kafkapoc.stream.KafkaOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@EntityScan("com.picpay.kafkapoc")
@ComponentScan("com.picpay.kafkapoc")
@EnableBinding(value = {KafkaInputStream.class, KafkaOutputStream.class})
@SpringBootApplication
public class KafkapocApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkapocApplication.class, args);
	}

}
