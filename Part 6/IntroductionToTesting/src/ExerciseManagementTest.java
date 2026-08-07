import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Test");
        assertTrue(management.exerciseList().containsKey("Test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("new exercise");
        management.markAsCompleted("new exercise");
        assertTrue(management.isCompleted("new exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        assertFalse(management.isCompleted("some exercise"));
    }
}