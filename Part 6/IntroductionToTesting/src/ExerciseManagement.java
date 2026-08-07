import java.util.HashMap;

public class ExerciseManagement {
    HashMap<String, Exercise> exercises;

    public ExerciseManagement() {
        exercises = new HashMap<>();
    }

    public HashMap<String, Exercise> exerciseList() {
        return exercises;
    }

    public void add(String exercise) {
        exercises.put(exercise, new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        exercises.get(exercise).markComplete();
    }

    public boolean isCompleted(String exercise) {
        if(!exercises.containsKey(exercise)) {
            return false;
        }
        return exercises.get(exercise).isCompleted();
    }
}
