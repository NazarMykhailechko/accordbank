package accordbank;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
public class SpringBootWebRun {

    public static void main(String[] args) {
        SpringApplication.run(accordbank.SpringBootWebRun.class, args);
    }
}