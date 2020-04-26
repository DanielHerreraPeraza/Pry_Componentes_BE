package com.cenfotec.componentes.service;

import com.cenfotec.componentes.domain.User;
import reactor.core.publisher.Flux;

public interface UserService {
    public Flux<User> findAll();
    public void saveUser(User u);
    public Flux<User> findByAge(User u);
}
