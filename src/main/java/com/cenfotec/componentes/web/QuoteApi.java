package com.cenfotec.componentes.web;

import com.cenfotec.componentes.domain.Quote;
import com.cenfotec.componentes.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/quotes")
@CrossOrigin(origins= "*")
public class QuoteApi {

    @Autowired
    private QuoteRepository userRepository;

    @GetMapping
    public Flux<Quote> getAllQuotes() {
        return userRepository.findAll();
    }

    @PostMapping
    public Mono<Quote> Quote(@RequestBody Quote u) {
        return userRepository.save(u);
    }
    
    @DeleteMapping
    public Mono<Void> Quote(@RequestParam String id) {
        return userRepository.deleteById(id);
    }

}
