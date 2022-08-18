package c;

import a.Profession;
import b.Person;

public class Teacher extends Person {
    private Profession profession;

    public Teacher(String name, int age, Profession profession) {
        super(name, age);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfession: " + profession ;
    }
}
