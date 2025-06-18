package com.testCore.testCore.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Roxanne = new Student("Roxanne", "Roxanne@gmail.com", LocalDate.of(1998, JANUARY, 22));
            Student Alex = new Student("Alex", "Alex@gmail.com", LocalDate.of(1995, NOVEMBER, 24));
            Student Maldrik = new Student("Maldrik", "Maldrik@gmail.com", LocalDate.of(1970, DECEMBER, 12));

            repository.saveAll(List.of(Roxanne, Alex, Maldrik));
        };
    }
}
