package com.BaseSpring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

public class DifferenceBetweenScopeBean {
//bean a par defaut scope Singleton c'est a dire cree un seul objet ayant le meme state et valleur
@Bean()
public LocalTime maintenant() {
    return LocalTime.now();
}

    @Bean(name="now")
    @Scope("prototype")
    //prototype permet a chaque fois de recreer l'objet avec nouveay state
    public LocalTime now() {
        return LocalTime.now();
    }
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext appCtx
                    = new AnnotationConfigApplicationContext(DifferenceBetweenScopeBean.class)) {
            while (true) {
                Thread.sleep(1000);
                //va retourner la meme valeur du time lorsque le programme demarre tout au long de l'execution
               // LocalTime time = appCtx.getBean("maintenant", LocalTime.class);

//va retourner la date en fonction du sysytem
                LocalTime time = appCtx.getBean("now", LocalTime.class);
                System.out.println(time);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
