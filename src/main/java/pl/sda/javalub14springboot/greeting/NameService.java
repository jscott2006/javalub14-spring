package pl.sda.javalub14springboot.greeting;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    private String name;

    public NameService() {
        this.name = "Kamil";
    }

    public String getName() {
        return name;
    }
}
