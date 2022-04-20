package NewInTown.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class RestaurantData {
    private List<Businesses> businesses;

    public List<Businesses> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Businesses> businesses) {
        this.businesses = businesses;
    }
}
