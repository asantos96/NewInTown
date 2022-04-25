package NewInTown.repository;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class FamilyOutingsRepository {
        private List<String> familyOutingsCategoryTitles = Arrays.asList("amusementparks", "aquariums", "escapegames", "museums");

    public List<String> getFamilyOutingsCategoryTitles() {
        return familyOutingsCategoryTitles;
    }

    public void setFamilyOutingsCategoryTitles(List<String> familyOutingsCategoryTitles) {
        this.familyOutingsCategoryTitles = familyOutingsCategoryTitles;
    }

    public String familyIdeas (){
            Random randomSelection = new Random(System.currentTimeMillis());
            return familyOutingsCategoryTitles.get(randomSelection.nextInt(4));
        }
}
