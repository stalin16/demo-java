package school.management.system;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy",1500);
        Teacher lixxy = new Teacher(2, "LiXXY",300);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(lixxy);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rabbi = new Student(2, "Rabbi", 5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);


//        System.out.println(teacherList);
//        System.out.println(studentList);


        School ghs = new School(teacherList , studentList);

        tamasha.payFees(5000);
        rabbi.payFees(1000);
        System.out.println("GHS has earned: $"+ghs.getTotalMoneyEarned());

        System.out.println("-----Making SCHOOL pay salary-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to "+lizzy.getName()+" and now has $ " + ghs.getTotalMoneyEarned());

        lixxy.receiveSalary(lixxy.getSalary());
        System.out.println("GHS has spent for salary to "+lixxy.getName()+" and now has $ " + ghs.getTotalMoneyEarned());

        System.out.println(lizzy);
        System.out.println(lixxy);
        System.out.println(rabbi);
        System.out.println(tamasha);

    }
}