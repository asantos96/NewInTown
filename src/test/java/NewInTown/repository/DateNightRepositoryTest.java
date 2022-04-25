package NewInTown.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateNightRepositoryTest {

    private DateNightRepository dateNightRepository;

    @BeforeEach
    public void initialize(){
        dateNightRepository = new DateNightRepository();
    }

    @Test
    void displaysFirstIndexOfDateNightArrayList() {
        String result = dateNightRepository.getDateNightCategoryTitles().get(1);
        assertEquals(result, "jazzandblues");
    }
    @Test
    void ensuresCategoryNotInRepositoryIsNotIncluded() {
        String result = dateNightRepository.dateNightIdeas();
        assertNotEquals(result, "breweries");
    }
}