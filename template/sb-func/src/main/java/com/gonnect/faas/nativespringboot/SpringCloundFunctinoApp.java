package com.gonnect.faas.nativespringboot;

import function.Handler;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
@Log4j2
public class SpringCloundFunctinoApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloundFunctinoApp.class, args);
    }

    @Bean
    public Function<String, String> function() {
        return input -> input;
    }

    @Bean
    public Consumer<String> consume() {
        return input -> log.info("consuming: {}", input);
    }

    @Bean
    public Supplier<String> supply() {
        return () -> "Hello Gonnect!";
    }

    @Bean
    public Handler handler() {
        return new Handler();
    }
}
