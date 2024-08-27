package homework04;

public class Worker extends Employee {
    public Worker(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    @Override
    public void printSalary() {//重写不需要修改
        super.printSalary();
    }
}
