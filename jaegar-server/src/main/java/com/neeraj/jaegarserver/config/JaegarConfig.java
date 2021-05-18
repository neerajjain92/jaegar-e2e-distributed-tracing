package com.neeraj.jaegarserver.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author neeraj on 18/05/21
 * Copyright (c) 2019, jaegar-e2e-distributed-tracing.
 * All rights reserved.
 */
@Configuration
public class JaegarConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }

    @Bean
    public JaegerTracer jaegerTracer() {
        return new io.jaegertracing.Configuration("jaeger-server")
                .withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(ConstSampler.TYPE)
                        .withParam(1))
                .withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withLogSpans(true))
                .getTracer();
    }
}
