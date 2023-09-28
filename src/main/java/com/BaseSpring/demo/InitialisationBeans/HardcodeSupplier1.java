package com.BaseSpring.demo.InitialisationBeans;


import jakarta.annotation.PostConstruct;

import java.util.function.Supplier;

public class HardcodeSupplier1 implements Supplier<String> {
    private String data;

    @PostConstruct
    //initialiser cette methode au moment de creation de ce bean
    public void readData() {
        data ="HardcodeSupplier1";
    }

    @Override
    public String get() {
        return data;
    }
}
