package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
//        application.run(args);
    }

    /*@Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setHowlong(60);
        holoman.setName("sombrero");
        return holoman;
    }*/

}
