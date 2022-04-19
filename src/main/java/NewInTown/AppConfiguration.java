package NewInTown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class AppConfiguration {
    public static void main(String[] args) {

        SpringApplication.run(AppConfiguration.class, args);

    }

}
