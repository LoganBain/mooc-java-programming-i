
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person eCompared = (Person) compared;
        if (eCompared.height == this.height &&
                eCompared.weight == this.weight &&
                eCompared.name.equals(this.name)) {
            if (eCompared.birthday == this.birthday) {
                return true;
            }
            if (!(eCompared.birthday instanceof SimpleDate)) {
                return false;
            }
            SimpleDate cBirthday = eCompared.birthday;
            if (cBirthday.getYear() == this.birthday.getYear() &&
                    cBirthday.getMonth() == this.birthday.getMonth() &&
                    cBirthday.getDay() == this.birthday.getDay()) {
                return true;
            }
        }
        return false;
    }
}
