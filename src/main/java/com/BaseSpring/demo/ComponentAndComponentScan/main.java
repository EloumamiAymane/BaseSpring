package com.BaseSpring.demo.ComponentAndComponentScan;

import com.BaseSpring.demo.injectionBean.HardcodedSupplier;
import com.BaseSpring.demo.injectionBean.WriterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.function.Supplier;
@ComponentScan
//Framework va rechercher dans des packages les classes qui
// doivent être instanciées pour ajouter des beans dans le contexte d’application
public class main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appCtx
                     = new AnnotationConfigApplicationContext(main.class)) {
            appCtx.getBean(Runnable.class).run();
        }
    }
}
