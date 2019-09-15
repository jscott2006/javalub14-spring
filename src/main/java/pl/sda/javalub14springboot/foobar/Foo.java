package pl.sda.javalub14springboot.foobar;

import org.springframework.stereotype.Service;

@Service
public class Foo {

    private final Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void foo() {
        System.out.println("Foo!");
    }

    public void fooBar() {
        foo();
        bar.bar();
    }
}
