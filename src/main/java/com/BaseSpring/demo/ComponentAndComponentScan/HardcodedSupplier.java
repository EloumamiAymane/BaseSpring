package com.BaseSpring.demo.ComponentAndComponentScan;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;
@Component
public class HardcodedSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "Hello world";
    }
}