package pl.sda.javalub14springboot.foobar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Foo {

    private final Bar bar;

    @Value("${pl.sda.javalub14.foobar.foo}")
    private String foo;

    public Foo(Bar bar) {
        this.bar = bar;
    }

    public void foo() {
        System.out.println(foo);
    }

    public void fooBar() {
        foo();
        bar.bar();
    }
}
