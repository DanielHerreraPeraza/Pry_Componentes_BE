package com.cenfotec.componentes.service;

import com.cenfotec.componentes.domain.Quote;
import com.cenfotec.componentes.repository.QuoteRepository;
import reactor.core.publisher.Flux;

public class QuoteServiceImpl implements QuoteService{

    private QuoteRepository userRepo;

    @Override
    public Flux<Quote> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(Quote u) {
        userRepo.save(u);
    }
}
