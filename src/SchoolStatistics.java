import a.Profession;
import c.ClassRoom;
import c.School;
import c.Student;
import c.Teacher;

public class SchoolStatistics {
    public static void main(String[] args) {
        School school = School.getInstance();
        school.addClassRoom(new ClassRoom("1A", new Teacher("John", 30, Profession.MATH)));
        school.addClassRoom(new ClassRoom("2A", new Teacher("Mary", 30, Profession.PHYSICS)));
        school.addClassRoom(new ClassRoom("3A", new Teacher("Peter", 30, Profession.CHEMISTRY)));
        school.addClassRoom(new ClassRoom("4A", new Teacher("Paul", 30, Profession.GEOGRAPHY)));
        school.addClassRoom(new ClassRoom("5A", new Teacher("George", 30, Profession.LITERATURE)));
        school.addClassRoom(new ClassRoom("6A", new Teacher("Ringo", 30, Profession.SPORT)));
        school.addRandomStudents();
        System.out.println(school);
        getAvgGrade();
        getClassAvgGrade("1A");
        get31AndAbove();
        getAvgAge();
    }

    public static void getAvgGrade() {
        Profession[] professions = Profession.values();
        School school = School.getInstance();
        float sum = 0;
        int count = 0;
        int index = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom != null) {
                for (Student student : classRoom.getStudents()) {
                    if (student != null) {
                        if (index == professions.length) {
                            index = 0;
                        } else {
                            sum += student.getGrade(professions[index++]).getScore();
                            count++;

                        }
                    }
                }
            }
        }
        System.out.println("School total avg = " + sum / count);
    }

    public static void getClassAvgGrade(String classRoomName) {
        Profession[] professions = Profession.values();
        School school = School.getInstance();
        float sum = 0;
        int count = 0;
        int index = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom != null && classRoom.getName().equals(classRoomName)) {
                for (Student student : classRoom.getStudents()) {
                    if (student != null) {
                        if (index == professions.length) {
                            index = 0;
                        } else {
                            sum += student.getGrade(professions[index++]).getScore();
                            count++;

                        }
                    }
                }
            }
        }
        System.out.println(classRoomName+" total avg = " + sum / count);
    }

    public static void getProfessionAvgGrade(String professionName) {
        Profession[] professions = Profession.values();
        School school = School.getInstance();
        float sum = 0;
        int count = 0;
        int index = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom != null) {
                for (Student student : classRoom.getStudents()) {
                    if (student != null) {
                        if (index == professions.length) {
                            index = 0;
                        } else {
                            if (professionName.equals(student.getGrade(professions[index++]).getProfession().name())) {
                                sum += student.getGrade(professions[index - 1]).getScore();
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(professionName+" total avg = " + sum / count);
    }
    public static void getAvgAge() {
        School school = School.getInstance();
        int sum = 0;
        int count = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom != null) {
                for (Student student : classRoom.getStudents()) {
                    if (student != null) {
                        sum += student.getAge();
                        count++;
                    }
                }
            }
        }
        System.out.println("Total age = "+ sum / count);
    }

    public static void get31AndAbove() {
        School school = School.getInstance();
        int count = 0;
        float sum = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom != null) {
                for (Student student : classRoom.getStudents()) {
                    if (student != null) {
                        if (student.getAge() >= 31) {
                            count++;
                            sum += student.getAvgGrade();

                        }
                    }
                }
            }
        }
            System.out.println("Total 31 ang above students = "+ count);
            System.out.println("Total 31 ang above avg = "+ sum / count);
    }

}