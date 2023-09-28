package com.BaseSpring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

public class CreateBeanInContext {

//cette methode permet d'entegistrer un objet dans le contexte avec le nom du methode
    //si on n'utilise pas name mais si on l'utilise on appelle avec ce nom la
   @Bean(name = {"maintenant", "now", "ahora", "jetzt"})
    public LocalTime maintenant() {
        return LocalTime.now();
    }


    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext appCtx
                    = new AnnotationConfigApplicationContext(CreateBeanInContext.class)) {
            LocalTime time = appCtx.getBean("now", LocalTime.class);
            LocalTime time1 = appCtx.getBean("maintenant", LocalTime.class);
            System.out.println(time);
            System.out.println(time1);
        }
    }
}
