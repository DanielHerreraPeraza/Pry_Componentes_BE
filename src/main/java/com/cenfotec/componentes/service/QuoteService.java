package com.cenfotec.componentes.service;

import com.cenfotec.componentes.domain.Quote;
import reactor.core.publisher.Flux;

public interface QuoteService {
    public Flux<Quote> findAll();
    public void saveQuote(Quote u);
}
