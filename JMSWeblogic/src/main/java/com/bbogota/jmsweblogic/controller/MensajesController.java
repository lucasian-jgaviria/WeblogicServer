package com.bbogota.jmsweblogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "mensaje")
public class MensajesController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping
    public String postMessage(@RequestBody String mensaje){
    	jmsTemplate.convertAndSend("jms/Cola", mensaje);
        return "Mensaje Enviado ";
    }
    
}
