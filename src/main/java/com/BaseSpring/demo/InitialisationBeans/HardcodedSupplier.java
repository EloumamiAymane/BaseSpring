package com.BaseSpring.demo.InitialisationBeans;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

public class HardcodedSupplier implements Supplier<String> {
    private String data;

    public void readData() {
        data ="HardcodeSupplier";
    }

    @Override
    public String get() {
        return data;
    }
}