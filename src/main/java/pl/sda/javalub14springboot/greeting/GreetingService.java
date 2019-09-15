package pl.sda.javalub14springboot.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final NameService nameService;

    public GreetingService(NameService nameService) {
        this.nameService = nameService;
    }

    public void sayHello() {
        System.out.println(String.format("Hello %s!", nameService.getName()));
    }
}
