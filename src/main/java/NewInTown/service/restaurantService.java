package NewInTown.service;


import NewInTown.model.RestaurantData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class restaurantService {
    public RestaurantData fetchRestaurantInfo (String city, String category){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.yelp.com/v3/businesses/search?location=" + city + "&categories="
                + category + "&open_now=true" , RestaurantData.class);
    }
}
