package kr.ac.kopo.jaytourboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JayTourBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(JayTourBoardApplication.class, args);
    }

}
