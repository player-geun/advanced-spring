package hello.advancedspring;

import hello.advancedspring.config.AppV1Config;
import hello.advancedspring.config.AppV2Config;
import hello.advancedspring.config.v1_proxy.InterfaceProxyConfig;
import hello.advancedspring.trace.logtrace.LogTrace;
import hello.advancedspring.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import({AppV1Config.class, AppV2Config.class})
@Import(InterfaceProxyConfig.class)
@SpringBootApplication(scanBasePackages = "hello.advancedspring.proxy")
public class AdvancedSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedSpringApplication.class, args);
    }

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
