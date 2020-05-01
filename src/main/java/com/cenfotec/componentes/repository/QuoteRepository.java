package com.cenfotec.componentes.repository;

import com.cenfotec.componentes.domain.Quote;
import org.springframework.cloud.gcp.data.firestore.FirestoreReactiveRepository;
import reactor.core.publisher.Flux;

public interface QuoteRepository extends FirestoreReactiveRepository<Quote> {
	
}
