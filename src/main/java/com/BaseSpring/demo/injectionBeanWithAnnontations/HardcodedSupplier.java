package com.BaseSpring.demo.injectionBeanWithAnnontations;

import java.util.function.Supplier;

public class HardcodedSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Hello HardcodedSupplier";
    }
}