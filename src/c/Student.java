package c;

import a.Grade;
import a.Profession;
import b.Person;

import java.util.Arrays;

public class Student extends Person {
    private Grade[] grades;

    public Student(String name, int age) {
        super(name, age);
        initGrades();
    }

    public void initGrades(Grade[] grades) {

        for (int i = 0; i < grades.length; i++) {
            this.grades[i].setProfession(Profession.values()[i]);
        }
    }

    public void initGrades() {
        this.grades = new Grade[Profession.values().length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = new Grade(Profession.values()[i], (int) (Math.random()*61+40));
        }
    }

    @Override
            ()  public String toString() {
        return super.toString() + "\nGrades: \n" + Arrays.toString(grades);
    }

    public Grade getGrade(Profession profession) {
        for (Grade grade : grades) {
            if (grade.getProfession() == profession) {
                return grade;
            }
        }
        return null;

    }

    public float getAvgGrade() {
        float sum = 0;
        for (Grade grade : grades) {
            sum += grade.getScore();
        }
        return sum / grades.length;
    }
}


