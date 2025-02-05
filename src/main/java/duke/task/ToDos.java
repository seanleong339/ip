package duke.task;

public class ToDos extends Task {

    /**
     * Creates a ToDos instance
     *
     * @param s Description of the ToDos task
     */
    public ToDos(String s) {
        super(s);
    }

    /**
     * Returns String representation of the Todos
     *
     * @return String representation of this Todos
     */
    @Override
    public String toString() {
        if (super.getDone()) {
            return "[T][X] " + super.taskDescription();
        } else {
            return "[T][ ] " + super.taskDescription();
        }
    }

    /**
     * Returns String format of this Todos to store
     *
     * @return String format of this Todos to store
     */
    @Override
    public String storeFormat() {
        return "T" + "|" + super.getDone() + "|" + super.taskDescription() + "\n";
    }

    /**
     * Returns true if object is duplicate of ToDos, else return false
     * @param t Object to check
     * @return Boolean
     */
    @Override
    public boolean equals(Object t) {
        if (!(t instanceof ToDos)) {
            return false;
        }
        return this.taskDescription().equals(((ToDos) t).taskDescription());
    }
}
