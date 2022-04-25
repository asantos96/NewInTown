package NewInTown.repository;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component

public class DateNightRepository {
    private List<String> dateNightCategoryTitles = Arrays.asList("movietheaters", "jazzandblues", "paintandsip", "comedyclubs", "tastingclasses");

    public List<String> getDateNightCategoryTitles() {
        return dateNightCategoryTitles;
    }

    public void setDateNightCategoryTitles(List<String> dateNightCategoryTitles) {
        this.dateNightCategoryTitles = dateNightCategoryTitles;
    }

    public String dateNightIdeas (){
        Random randomSelection = new Random(System.currentTimeMillis());
        return dateNightCategoryTitles.get(randomSelection.nextInt(5));
    }
}
