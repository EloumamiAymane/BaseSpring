package com.BaseSpring.demo.InitialisationBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

public class main {
    //permet de creer dans le contete l'objet getSupplier de type Supplier de la classe HardcodedSupplier
    @Bean(initMethod = "readData")
    public Supplier<String> getSupplier(){
        return new HardcodedSupplier();
    }
    //permet de creer dans le contete l'objet getSupplier1 de type Supplier de la classe HardcodedSupplier
    @Bean(initMethod = "readData")
    public Supplier<String> getSupplier1(){
        return new HardcodedSupplier();
    }


    //permet de creer dans le contete l'objet getSupplier2 de type Supplier implemente la classe HardcodedSupplier1
    @Bean(initMethod = "readData")
    public Supplier<String> getSupplier2(){
        return new HardcodeSupplier1();
    }
@Bean
    public Supplier<String> getSupplier3(){
        return new HardcodeSupplier1();
    }
    @Bean
    public Runnable task(Supplier<String> getSupplier3){
        return new WriterService(getSupplier3);
    }



    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appCtx
                     = new AnnotationConfigApplicationContext(main.class)) {
            appCtx.getBean(Runnable.class).run();
        }
    }
}
