package NewInTown.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyOutingsRepositoryTest {

    private FamilyOutingsRepository familyOutingsRepository;

    @BeforeEach
    public void setUp() {
        familyOutingsRepository = new FamilyOutingsRepository();
    }

    @Test
    void familyIdeasNotNull() {
        String result = familyOutingsRepository.familyIdeas();
        assertNotNull(result);
    }
    @Test
    void ensuresCategoryNotInRepositoryIsNotIncluded() {
        String result = familyOutingsRepository.familyIdeas();
        assertNotEquals(result, "paintandsip");
    }
    @Test
    void displaysSecondIndexOfFamilyOutingsArrayList() {
        String result = familyOutingsRepository.getFamilyOutingsCategoryTitles().get(2);
        assertEquals(result, "escapegames");
    }
}