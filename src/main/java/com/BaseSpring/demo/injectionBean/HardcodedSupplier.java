package com.BaseSpring.demo.injectionBean;

import java.util.function.Supplier;

public class HardcodedSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Hello world";
    }
}