package introduction10.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import introduction10.model.Chapter;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
    
}
