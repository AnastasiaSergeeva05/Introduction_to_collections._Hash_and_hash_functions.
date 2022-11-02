package school;

import java.util.Objects;

public class Task {
    private final int value1;
    private final int valeu2;

    public Task(int value1, int valeu2) {
        this.value1 = value1;
        this.valeu2 = valeu2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValeu2() {
        return valeu2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (value1 == task.value1 && valeu2 == task.valeu2) ||
                (value1 == task.valeu2 && valeu2 == task.value1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1* valeu2);
    }

    @Override
    public String toString() {
        return String.format(" %s * %s = %s \n ", this.value1
                , this.valeu2,this.value1*this.valeu2 );

    }
}
