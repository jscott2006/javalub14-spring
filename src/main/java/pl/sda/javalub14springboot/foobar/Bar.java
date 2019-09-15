package pl.sda.javalub14springboot.foobar;

import org.springframework.stereotype.Service;

@Service
public class Bar {

    private final FooBarProperties fooBarProperties;

    public Bar(FooBarProperties fooBarProperties) {
        this.fooBarProperties = fooBarProperties;
    }

//    @Value("${pl.sda.javalub14.bar}")
//    private String bar;

    public void bar() {
        System.out.println(fooBarProperties.getBar());
    }
}
