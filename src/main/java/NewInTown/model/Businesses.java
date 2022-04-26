package NewInTown.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Businesses {
    private String alias;
    private String name;
    private URL url;
    private List<Categories> categories;
    private double rating;
    private String price;
    private Location locationDetails;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @JsonProperty("location")
    public Location getLocationDetails() {
        return locationDetails;
    }
    @JsonProperty("location")
    public void setLocationDetails(Location locationDetails) {
        this.locationDetails = locationDetails;
    }

//    public String NPEonPrice() throws NullPointerException {
//
//    }
}
