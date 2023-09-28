package com.BaseSpring.demo.ComponentAndComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;
@Component
public class WriterService implements Runnable {
@Autowired
    private Supplier<String> supplier;

    public WriterService(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    @Override
    public void run() {
        System.out.println(supplier.get());
    }
}