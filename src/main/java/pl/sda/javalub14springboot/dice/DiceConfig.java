package pl.sda.javalub14springboot.dice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class DiceConfig {

    @Bean
    public Random random() {
        return new Random();
    }
}
