package a;

public enum Profession {
    MATH("Math"),
    CHEMISTRY("Chemistry"),
    GEOGRAPHY("Geography"),
    LITERATURE("Literature"),
    PHYSICS("Physics"),
    SPORT("Sport");

    private String profession;

    Profession(String profession) {
        this.profession = profession;
    }
}
