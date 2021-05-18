package com.neeraj.jaegarclient.controller;

import com.neeraj.jaegarclient.service.JaegarClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author neeraj on 18/05/21
 * Copyright (c) 2019, jaegar-e2e-distributed-tracing.
 * All rights reserved.
 */
@RestController
@RequestMapping("/jaegar/client")
public class JaegarClientController {

    private final JaegarClientService jaegarClientService;

    @Autowired
    public JaegarClientController(JaegarClientService jaegarClientService) {
        this.jaegarClientService = jaegarClientService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegarClientService.get(id);
    }

}
