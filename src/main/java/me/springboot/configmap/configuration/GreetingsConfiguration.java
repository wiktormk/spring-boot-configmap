package me.springboot.configmap.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "greetings")
@Data
public class GreetingsConfiguration {

    private String from;

}
