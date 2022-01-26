package com.microservice.contactservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
public class circuitbreaker {

    private Logger logger=LoggerFactory.getLogger(circuitbreaker.class);
    @GetMapping("/sampleapi")
    // @Retry(name="sample-api" ,fallbackMethod = "fall1BackResponse")
    @CircuitBreaker(name="default" ,fallbackMethod = "fall1BackResponse")
    public String circuitBreakerApi() {
        logger.info("sample api recived");
        ResponseEntity<String> resp=new RestTemplate().getForEntity("http://localhost:8080/dumy-api",String.class);
        return resp.getBody();
    }
    public String fall1BackResponse(Exception ex){
        return "fallbackresponse";
    }
}
