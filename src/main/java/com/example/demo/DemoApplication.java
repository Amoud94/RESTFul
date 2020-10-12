package com.example.demo;

import com.example.demo.dao.CompteRepository;
import com.example.demo.entity.compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CompteRepository compteRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        compteRepository.save(new compte(null,9000,new Date(),"courant"));
        compteRepository.save(new compte(null,32000,new Date(),"epargne"));
        compteRepository.save(new compte(null,4000,new Date(),"courant"));
        compteRepository.save(new compte(null,38990,new Date(),"epargne"));

        compteRepository.findAll().forEach(cp ->{
            System.out.println(cp.toString());
        });

    }
}
