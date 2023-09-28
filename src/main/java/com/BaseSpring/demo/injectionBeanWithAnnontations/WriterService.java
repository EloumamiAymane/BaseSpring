package com.BaseSpring.demo.injectionBeanWithAnnontations;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.function.Supplier;

public class WriterService implements Runnable {
   // @Autowired
   // @Qualifier("getSupplier2")
    @Resource(name="getSupplier2")//comme il combine autowird and qualifier
    private Supplier<String> supplier;



    @Override
    public void run() {
        System.out.println(supplier.get());
    }
}