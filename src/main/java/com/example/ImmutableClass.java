package com.example;

import java.util.Optional;

public final class ImmutableClass {

    public final Optional<Foo> foo;
    public final Optional<Bar> bar;

    public ImmutableClass(Optional<Foo> foo, Optional<Bar> bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public static final class Foo {
//        public String baz; //uncomment this line to make the working test fail
    }

    public interface Bar {
    }
}
