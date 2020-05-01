package com.cenfotec.componentes.service;

import org.springframework.stereotype.Service;

import com.cenfotec.componentes.domain.Quote;
import com.cenfotec.componentes.repository.QuoteRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class QuoteServiceImpl implements QuoteService{

    private QuoteRepository userRepo;

    @Override
    public Flux<Quote> findAll() {
        return userRepo.findAll();
    }

    @Override
    public Mono<Quote> saveQuote(Quote u) {
        return userRepo.save(u);
    }

    @Override
    public Mono<Void> deleteQuote(String id) {
        return userRepo.deleteById(id);
    }
}
