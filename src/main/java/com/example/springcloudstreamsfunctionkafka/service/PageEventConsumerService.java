package com.example.springcloudstreamsfunctionkafka.service;


import com.example.springcloudstreamsfunctionkafka.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class PageEventConsumerService {
    @Bean // POUR QUE LA FONCTION SOIT DEPLOYER

    // fonction de type consumer qui recoit le message en input : en tant qu'objet java pish event
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("********************************************");
            System.out.println(input.toString());
            System.out.println("********************************************");
        };
    }
}
