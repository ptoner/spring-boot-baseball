package com.baseball;


import com.baseball.dao.interfaces.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class App {

    @Autowired
    PersonDao personDao;


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }










//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//
//        return args -> {
//
//            System.out.println("Here are the configured beans:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//
//    }


}
