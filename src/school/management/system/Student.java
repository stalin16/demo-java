package school.management.system;

// this class is responsible for keep the track of students fees, name , grade & fees paid
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // constructor
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid=0;
        this.feesTotal=30000;
    }

    // not going to alter student's name, id
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    // and the fees to the fees paid
    // the school is going to see the funds
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    // return information of student
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    // return the remaining  fees
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
    @Override
    public String toString() {
        return "Student's name: " + name + " Total fees paid so far " + feesPaid;
    }
}
