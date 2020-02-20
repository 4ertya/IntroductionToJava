package by.epam;

public class Student {
    private String lastNameAndInitials;
    private int group;
    private int[] marks;

    public Student(String lastNameAndInitials, int group, int[] marks) {
        this.lastNameAndInitials = lastNameAndInitials;
        this.group = group;
        this.marks = marks;
    }

    public static void printHonourStudent(Student[] students) {
        for (Student student : students) {
            boolean isGood = true;
            for (int mark : student.marks) {
                if (mark != 9 && mark != 10) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                System.out.println("Name: " + student.lastNameAndInitials);
                System.out.println("Group: " + student.group + "\n");
            }
        }
    }
}
