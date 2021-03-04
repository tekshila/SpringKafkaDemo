package com.tekshila.simplekafkaproducer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tekshila/demo/producer")
public class KafkaProducerController {

    @GetMapping("/hello")
    public String hellowFromProducer() {
        return "Producer is running";
    }
}
