package com.cenfotec.componentes.web;

import com.cenfotec.componentes.domain.Quote;
import com.cenfotec.componentes.service.QuoteService;
import com.cenfotec.componentes.task.CreateTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;

@RestController
@RequestMapping("/quotes")
@CrossOrigin(origins= "*")
public class QuoteApi {

    @Autowired
    private QuoteService userService;

    private CreateTask taskManager = new CreateTask();

    @GetMapping
    public Flux<Quote> getAllQuotes() {
        return userService.findAll();
    }

    @PostMapping
    public Mono<Quote> Quote(@RequestBody Quote u) throws IOException {
        Mono<Quote> newQuote = userService.saveQuote(u);
        if (newQuote != null)
            taskManager.createTask(u);
    return newQuote;
    }
    
    @DeleteMapping
    public Mono<Void> Quote(@RequestParam String id) {
        return userService.deleteQuote(id);
    }

}
