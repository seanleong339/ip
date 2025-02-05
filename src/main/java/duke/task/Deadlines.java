package duke.task;

import java.time.LocalDate;

public class Deadlines extends Task {

    private LocalDate date;

    /**
     * Creates a Deadlines instance
     * @param s Task description
     * @param time Date which task is due
     */
    public Deadlines(String s, String time) {
        super(s);
        this.date = LocalDate.parse(time);
    }

    /**
     * Returns a String representation of the task
     * @return String representation of this Deadlines
     */
    @Override
    public String toString() {
        if (super.getDone()) {
            return "[D][X] " + super.taskDescription() + " (by: " + date + ")";
        } else {
            return "[D][ ] " + super.taskDescription() + " (by: " + date + ")";
        }
    }

    /**
     * Returns a String format of the task to store
     * @return String format of this Deadlines
     */
    @Override
    public String storeFormat() {
        return "D|" + super.getDone() + "|" + super.taskDescription() + "|" + this.date + "\n";
    }

    public LocalDate getDate() {
        return this.date;
    }

    /**
     * Returns true if is a duplicate Deadline, else return false
     * @param d Object to check
     * @return Boolean
     */
    @Override
    public boolean equals(Object d) {
        if (!(d instanceof Deadlines)) {
            return false;
        }
        Deadlines de = (Deadlines) d;
        if (!de.getDate().equals(this.date)) {
            return false;
        }
        if (!de.taskDescription().equals(this.taskDescription())) {
            return false;
        }
        return true;
    }
}
