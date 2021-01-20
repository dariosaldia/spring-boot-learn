package introduction10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Tells Spring Boot, when launched, to scan recursively for Spring components inside this package and register them
// It also tells Spring Boot to enable autoconfiguration, a process where beans are automatically created based on classpath settings, property settings, and other factors.
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
