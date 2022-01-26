package com.microservices.apigateway;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class loggingfilter implements GlobalFilter {

private Logger logger=LoggerFactory.getLogger(loggingfilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
     logger.info("path of the req made ->{}",exchange.getRequest().getPath());
        return chain.filter(exchange);
    }
    
}
