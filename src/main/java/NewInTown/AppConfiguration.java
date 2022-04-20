package NewInTown;

import NewInTown.model.RestaurantData;
import NewInTown.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@EnableAutoConfiguration
@ComponentScan
public class AppConfiguration {


    public static void main(String[] args) {

        SpringApplication.run(AppConfiguration.class, args);


    }

}
