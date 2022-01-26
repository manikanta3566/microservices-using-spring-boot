package com.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class apigatewayconfiguration {

    @Bean
    public RouteLocator gatewaylLocator(RouteLocatorBuilder builder)  {
        return builder.routes()
        .route(p->p.path("/user/contact/**")
        .uri("lb://contact-services"))
        .route(p->p.path("/user-feign/**")
        .uri("lb://user-services"))
        .build();
    }  
}
