package b;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        try {
            setAge(age);
        } catch (AgeOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOutOfBoundsException {
        if (age < 20 || age > 120) {
            throw new AgeOutOfBoundsException("Age out of bounds");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAge: " + age;
    }
}
