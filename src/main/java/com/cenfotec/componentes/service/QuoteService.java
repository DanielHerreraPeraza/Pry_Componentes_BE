package com.cenfotec.componentes.service;

import com.cenfotec.componentes.domain.Quote;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface QuoteService {
    Flux<Quote> findAll();
    Mono<Quote> save(Quote u);
    Mono<Void> deleteById(String id);
}
