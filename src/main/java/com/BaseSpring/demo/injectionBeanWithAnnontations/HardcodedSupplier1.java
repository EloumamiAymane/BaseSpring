package com.BaseSpring.demo.injectionBeanWithAnnontations;

import java.util.function.Supplier;

public class HardcodedSupplier1  implements Supplier<String> {
    @Override
    public String get() {
        return "Hello HardcodedSupplier1";
    }
}
