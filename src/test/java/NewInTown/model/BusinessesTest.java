package NewInTown.model;

import NewInTown.service.restaurantService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessesTest {

    @Test
    void displayPriceNullNotAvailable() {
        Businesses businesses = new Businesses();
        String result = businesses.priceDisplay();
        System.out.println(result);
        assertEquals(result, "Not Available");
    }
}