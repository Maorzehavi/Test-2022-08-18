package c;

import a.Profession;

import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    private static School instance = new School();

    private School() {
        this.classRooms = new ClassRoom[5];
    }

    public static School getInstance() {
        return instance;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void addClassRoom(ClassRoom classRoom) {
        for (int i = 0; i < classRooms.length; i++) {
            if (classRooms[i] == null) {
                classRooms[i] = classRoom;
                break;
            }
        }
    }

    public ClassRoom getClassRoom(String ClassRoomName) {
        for (ClassRoom classRoom : classRooms) {
            if (classRoom != null && classRoom.getName().equals(ClassRoomName)) {
                return classRoom;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "School: \n" + Arrays.toString(classRooms);

    }

    public void addRandomStudents() {
        for (ClassRoom classRoom : classRooms) {
            for (int i = 0; i < classRoom.getStudents().length; i++) {
                classRoom.getStudents()[i] = new Student("student" + (i + 1), (int) (Math.random() * 100 + 20));
            }
//                classRoom.addRandomStudents2();
            }
        }
    }

