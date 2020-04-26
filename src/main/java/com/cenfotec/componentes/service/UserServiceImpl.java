package com.cenfotec.componentes.service;

import com.cenfotec.componentes.domain.User;
import com.cenfotec.componentes.repository.UserRepository;
import reactor.core.publisher.Flux;

public class UserServiceImpl implements UserService{

    private UserRepository userRepo;

    @Override
    public Flux<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(User u) {
        userRepo.save(u);
    }

    @Override
    public Flux<User> findByAge(User u) {
        return userRepo.findByAge(u.getAge());
    }
}
