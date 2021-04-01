package pl.karol.jenkinsspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringDemoApplication.class, args);
    }


    @GetMapping
    public String get() {
        return "Ala ma kota";
    }

}
