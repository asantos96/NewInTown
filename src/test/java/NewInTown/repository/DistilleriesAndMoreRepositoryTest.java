package NewInTown.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistilleriesAndMoreRepositoryTest {

    private DistilleriesAndMoreRepository distilleriesAndMoreRepository;


    @BeforeEach
    public void initializeDistilleryRepo(){
        distilleriesAndMoreRepository = new DistilleriesAndMoreRepository();
    }

    @Test
    void distilleryIdeasNotNull() {
        String result = distilleriesAndMoreRepository.distilleryIdeas();
        assertNotNull(result);
    }

    @Test
    void displaysThirdIndexOfDistilleryArrayList() {
        String result = distilleriesAndMoreRepository.getDistilleriesCategoryTitles().get(3);
        assertEquals(result, "wineries");
    }
}