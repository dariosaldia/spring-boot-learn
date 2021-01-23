package learning.spring.boot.chapter2.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import learning.spring.boot.chapter2.model.Image;
import reactor.core.publisher.Mono;

public interface ImageRepository extends ReactiveCrudRepository<Image, String> {
    Mono<Image> findByName(String name);
}
