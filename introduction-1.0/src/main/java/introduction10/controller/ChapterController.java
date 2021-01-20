package introduction10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import introduction10.model.Chapter;
import introduction10.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {
    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> list() {
        return chapterRepository.findAll();
    }


}
