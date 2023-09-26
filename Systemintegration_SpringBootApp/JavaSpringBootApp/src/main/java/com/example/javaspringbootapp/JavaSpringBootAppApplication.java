package com.example.javaspringbootapp;

import com.example.javaspringbootapp.arduino.Arduino;
import com.example.javaspringbootapp.repositories.TemperaturRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaSpringBootAppApplication {


    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBootAppApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo(TemperaturRepo tempRepo){
        return args ->{
            Arduino arduino = new Arduino(tempRepo);
            arduino.start();
        };
    }
}