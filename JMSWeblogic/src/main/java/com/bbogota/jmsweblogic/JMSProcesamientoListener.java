package com.bbogota.jmsweblogic;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSProcesamientoListener {

	@JmsListener(destination = "jms/Cola", containerFactory = "myFactory")
	public void receiveMessage(final Message jmsMessage) {
		try {
			if (jmsMessage instanceof TextMessage) {
				TextMessage messageText= (TextMessage)jmsMessage;
				System.out.println("[MessageId-" + messageText.getJMSMessageID() + "][Texto-" + messageText.getText() + "]");
				try {Thread.sleep(4000);} catch (Exception ex) {}
			}else {
				System.err.println("Mensaje no es TextMessage " + jmsMessage.getJMSType());
			}
		}catch (Exception ex) {
		}
	}
}
