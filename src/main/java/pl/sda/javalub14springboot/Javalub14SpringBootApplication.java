package pl.sda.javalub14springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.javalub14springboot.foobar.Foo;

@SpringBootApplication
public class Javalub14SpringBootApplication implements CommandLineRunner {

	@Autowired
	private Foo foo;

	public static void main(String[] args) {
		SpringApplication.run(Javalub14SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		foo.fooBar();
	}
}
