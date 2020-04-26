package com.cenfotec.componentes.web;

import com.cenfotec.componentes.domain.User;
import com.cenfotec.componentes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/age")
    public Flux<User> getUsersByAge(@RequestParam int age) {
        return userRepository.findByAge(age);
    }

    @PostMapping("/saveUser")
    public Mono<User> saveUser(@RequestBody User u) {
        return userRepository.save(u);
    }

}
