package learning.spring.boot.chapter2.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import learning.spring.boot.chapter2.model.Image;

@Component
public class InitDatabase {

    //private static final String UPLOAD_ROOT = "images";

    /*
     * @Bean CommandLineRunner setUp() throws IOException { return (args) -> {
     * FileSystemUtils.deleteRecursively(new File(UPLOAD_ROOT));
     * Files.createDirectory(Paths.get(UPLOAD_ROOT));
     * FileCopyUtils.copy("Test file", new FileWriter(UPLOAD_ROOT +
     * "/learning-spring-boot-cover.jpg")); FileCopyUtils.copy("Test file2", new
     * FileWriter(UPLOAD_ROOT + "/learning-spring-boot-2nd-edition-cover.jpg"));
     * FileCopyUtils.copy("Test file3", new FileWriter(UPLOAD_ROOT +
     * "/bazinga.png")); }; }
     */

    @Bean
    CommandLineRunner init (MongoOperations operations) {
        return args -> {
            operations.dropCollection(Image.class);
            operations.insert(new Image("1", "learning-spring-boot-cover.jpg"));
            operations.insert(new Image("2", "learning-spring-boot-2nd-edition-cover.jpg"));
            operations.insert(new Image("3", "bazinga.png"));

            operations.findAll(Image.class).forEach(image -> {
                System.out.println(image.toString());
            });
        };
    }
}
