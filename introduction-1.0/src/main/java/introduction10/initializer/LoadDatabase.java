package introduction10.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.net.SyslogOutputStream;
import introduction10.model.Chapter;
import introduction10.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
    
    @Bean
    CommandLineRunner init (ChapterRepository repository) {
        return args -> {
            Flux.just(
                new Chapter("Quick Start with java"),
                new Chapter("Reactive we with Spring boot"),
                new Chapter("... and more!")
            )
            .flatMap(repository::save)
            .subscribe(System.out::println);
        };
    }
}
