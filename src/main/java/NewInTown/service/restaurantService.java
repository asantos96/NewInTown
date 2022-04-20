package NewInTown.service;


import NewInTown.model.RestaurantData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class restaurantService {
    public RestaurantData fetchRestaurantInfo (String city, String category) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        //Creates HttpHeaders object
        HttpHeaders httpHeaders = new HttpHeaders();
        //This adds the header that is required for authorization
        httpHeaders.add("Authorization", "Bearer TWstSOpaLq1NG3t-l_SkuUkxkHfiZ2QBi4j3SaxA0z_7" +
                "dYh8MX-ee6Gv6o0kBNr2zBami0b4KYa6MACMWj53uJThN8wkn3N9ZDjc5HAAnbz6LtJAL0FCn8PS1AxfYnYx");
        //Entity tracks the headers and is a required param of the exchange method
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity responseEntity = restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location="+
                        city + "&categories=" + category + "&open_now=true", HttpMethod.GET, httpEntity,
                String.class);
        return new ObjectMapper().readValue(responseEntity.getBody().toString(), RestaurantData.class);

    }
}
