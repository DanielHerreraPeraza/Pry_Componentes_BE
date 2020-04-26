package com.cenfotec.componentes.repository;

import com.cenfotec.componentes.domain.User;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends FirestoreReactiveRepository<User> {

    Flux<User> findByAge(int age);
}
