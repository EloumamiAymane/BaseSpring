package com.BaseSpring.demo.injectionBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Supplier;

public class main {
//permet d'enregistrer un objet  HardcodedSupplier dans le context
    //on utilise comme type de retour Supplier
    //c'est comme on fait  Supplier<String> s=new HardcodedSupplier();
    //dont Supplier<String> est l'interface donc c'est le couplage faible
    //classe depend de l'interface
    @Bean
    public Supplier<String> dataSupplier() {
        return new HardcodedSupplier();
    }



    //permet d'enregistrer un objet  WriterService dans le context on injectant l'objet Supplier de type HardcodedSupplier
    //on utilise comme type de retour Runnable
    //c'est comme on fait  Supplier<String> s=new WriterService(dataSupplier);
    //dont Runnable est l'interface donc c'est le couplage faible
    //classe depend de l'interface
    @Bean
    public Runnable task(Supplier<String> dataSupplier) {
        return new WriterService(dataSupplier);
    }

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appCtx
                     = new AnnotationConfigApplicationContext(main.class)) {
            appCtx.getBean(WriterService.class).run();
        }
    }
}
