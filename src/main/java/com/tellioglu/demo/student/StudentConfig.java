package com.tellioglu.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {

            Student celal = new Student("Celal", "celal.telli@gmail.com", LocalDate.of(1987, Month.MAY, 1));
            Student hatice = new Student("Hatice", "hatice.telli@gmail.com", LocalDate.of(1998, Month.MARCH, 1));

            repository.saveAll(List.of(celal, hatice));
        };
    }

}
