package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
        Student mariam=new Student(
              "silvi",
              "silvi.tss@gmail.com",
                LocalDate.of(2005, Month.JANUARY,5)
        );
        Student ali=new Student(
                "cholpon",
                "cholpon.neo@gmail.com",
                LocalDate.of(2004, Month.JANUARY,2)

        );
            repository.saveAll(
                    List.of(mariam,ali)
            );
        };
    }
}
