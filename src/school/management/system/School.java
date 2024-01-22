package school.management.system;
import java.util.*;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;



    // new school object is created (teachers , students)

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    
    // add teacher to the school
    // the teacher to be added
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // return the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    // add a student to the school
    // student to be added
    public void addStudents(Student student) {
        students.add(student);
    }

    // the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // add the total money earned by the school
    // money that is supposed to be added
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }


    // the total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // update the money that is spent by the school which is the salary given by the school to its teachers
    // MoneySpent the money spent by school
    public static void updateTotalMoneySpent(int moneySpent) {

        totalMoneyEarned -= moneySpent;
    }
}
