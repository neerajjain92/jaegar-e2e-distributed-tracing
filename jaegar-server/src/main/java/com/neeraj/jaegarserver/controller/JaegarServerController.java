package com.neeraj.jaegarserver.controller;

import com.neeraj.jaegarserver.service.JaegarServerService;
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
@RequestMapping("/jaegar/server")
public class JaegarServerController {

    private final JaegarServerService jaegarServerService;

    @Autowired
    public JaegarServerController(JaegarServerService jaegarServerService) {
        this.jaegarServerService = jaegarServerService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegarServerService.get(id);
    }

}
