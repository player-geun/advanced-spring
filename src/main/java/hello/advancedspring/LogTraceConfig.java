package hello.advancedspring;

import hello.advancedspring.trace.logtrace.FieldLogTrace;
import hello.advancedspring.trace.logtrace.LogTrace;
import hello.advancedspring.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {

//        return new FieldLogTrace();
        return new ThreadLocalLogTrace();
    }
}
