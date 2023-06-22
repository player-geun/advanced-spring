package hello.advancedspring;

import hello.advancedspring.config.AppV1Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(AppV1Config.class)
@SpringBootApplication(scanBasePackages = "hello.advancedspring.proxy")
public class AdvancedSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedSpringApplication.class, args);
    }

}
