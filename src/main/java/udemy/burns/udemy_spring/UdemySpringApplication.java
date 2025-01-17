package udemy.burns.udemy_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemySpringApplication {

    //objects created by specificed classes then configured with JPA to and mapped to use the interface classes to store the object data in  memory using the H2 plugin

    public static void main(String[] args) {
        SpringApplication.run(UdemySpringApplication.class, args);
    }

}
