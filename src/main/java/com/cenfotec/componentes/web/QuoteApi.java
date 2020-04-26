package com.cenfotec.componentes.web;

import com.cenfotec.componentes.domain.Quote;
import com.cenfotec.componentes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class QuoteApi {

    @Autowired
    private QuoteRepository userRepository;

    @GetMapping
    public Flux<Quote> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/saveUser")
    public Mono<Quote> saveUser(@RequestBody Quote u) {
        return userRepository.save(u);
    }

}
