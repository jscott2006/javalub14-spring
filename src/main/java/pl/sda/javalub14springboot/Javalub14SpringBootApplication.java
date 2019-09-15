package pl.sda.javalub14springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.javalub14springboot.dice.DiceConfig;
import pl.sda.javalub14springboot.dice.DiceService;
import pl.sda.javalub14springboot.foobar.Foo;
import pl.sda.javalub14springboot.greeting.GreetingService;

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
		foo.fooBar();
		greetingService.sayHello();
		System.out.println(diceService.roll(10));
	}
}
