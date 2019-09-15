package pl.sda.javalub14springboot.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    @Value("${pl.sda.javalub14.greeting.name}")
    private String name;

    public String getName() {
        return name;
    }
}
