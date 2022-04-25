package NewInTown.repository;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@Component
public class DistilleriesAndMoreRepository {
        private List<String> distilleriesCategoryTitles = Arrays.asList("breweries", "cideries", "distilleries", "wineries");

    public List<String> getDistilleriesCategoryTitles() {
        return distilleriesCategoryTitles;
    }

    public void setDistilleriesCategoryTitles(List<String> distilleriesCategoryTitles) {
        this.distilleriesCategoryTitles = distilleriesCategoryTitles;
    }

    public String distilleryIdeas (){
            Random randomSelection = new Random(System.currentTimeMillis());
            return distilleriesCategoryTitles.get(randomSelection.nextInt(4));
        }
}
