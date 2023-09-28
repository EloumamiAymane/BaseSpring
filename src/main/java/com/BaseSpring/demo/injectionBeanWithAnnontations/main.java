package com.BaseSpring.demo.injectionBeanWithAnnontations;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.function.Supplier;

public class main {
    //creer un bean
    //Supplier<String> s= new HardcodedSupplier();
    //avec Primary on leve l'ambigute a spring s'il exise plusieurs bean de meme type
    //alors avec cette anontation on impose a spring d'utiliser ce bean la
    @Bean
    @Primary
    public Supplier<String> getSupplier(){
        return new HardcodedSupplier();
    }

    @Bean

    public Supplier<String> getSupplier2(){
        return new HardcodedSupplier1();
    }

    //injection faite automatique ici  dans la class qui implemente Runnable
     @Bean
     public Runnable task(){
        return new WriterService();
}


    public static void main(String[] args) throws InterruptedException {
        try (AnnotationConfigApplicationContext appCtx =
                     new AnnotationConfigApplicationContext(main.class)) {
            appCtx.getBean(Runnable.class).run();
        }
    }
}
