package com.bbogota.jmsweblogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;

@SpringBootApplication(exclude = ActiveMQAutoConfiguration.class)
public class JmsWeblogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsWeblogicApplication.class, args);
	}

}
