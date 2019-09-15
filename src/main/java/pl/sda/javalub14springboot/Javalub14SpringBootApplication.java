package pl.sda.javalub14springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import pl.sda.javalub14springboot.dice.DiceConfig;
import pl.sda.javalub14springboot.dice.DiceService;
import pl.sda.javalub14springboot.foobar.Foo;
import pl.sda.javalub14springboot.foobar.FooBarProperties;
import pl.sda.javalub14springboot.greeting.GreetingService;

@EnableConfigurationProperties(FooBarProperties.class)
@SpringBootApplication
public class Javalub14SpringBootApplication implements CommandLineRunner {

	@Autowired
	private Foo foo;

	@Autowired
	private GreetingService greetingService;

	@Autowired
	private DiceService diceService;

	public static void main(String[] args) {
		SpringApplication.run(Javalub14SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		greetingService.sayHello();
	}
}
