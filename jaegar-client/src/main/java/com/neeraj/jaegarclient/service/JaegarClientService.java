package com.neeraj.jaegarclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author neeraj on 18/05/21
 * Copyright (c) 2019, jaegar-e2e-distributed-tracing.
 * All rights reserved.
 */
@Service
public class JaegarClientService {

    private final WebClient webClient;

    @Autowired
    public JaegarClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> get(Integer id) {
        return webClient.get()
                .uri("http://localhost:8082/jaegar/server/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
