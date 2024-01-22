package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id , String name , int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=salaryEarned;
    }
    public int getId(int id){
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    // add to the salary remove from the total money earned by the school
   public void receiveSalary(int salary){
       salaryEarned+=salary;
       School.updateTotalMoneySpent(salary);
   }
    public void add(Teacher teachers) {
    }
    public String toString() {
        return "Teacher's name: " + name + " Total salary earned so far $ " + salaryEarned;
    }
}
