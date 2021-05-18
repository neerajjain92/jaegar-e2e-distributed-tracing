package com.neeraj.jaegarserver.service;

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
public class JaegarServerService {

    private final WebClient webClient;

    @Autowired
    public JaegarServerService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> get(Integer id) {
        return webClient.get()
                .uri("http://numbersapi.com/" + id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
