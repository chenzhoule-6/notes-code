package homework05;

public class Teacher extends Employee {
    private int classDay;//一年上了多少天课
    private double classSalary;//课时费

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    @Override
    public void printSalary() {
        System.out.println("name:" + getName() + "\t年工资:" + (getSalary() *
                getSalaryMonth() + classDay * classSalary));
    }
}
