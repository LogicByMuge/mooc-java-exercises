public class Exercise {
    private String name;
    private boolean isCompleted;

    public Exercise(String name) {
        this.name = name;
        isCompleted = false;
    }

    public void markComplete() {
        isCompleted = true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }
}
