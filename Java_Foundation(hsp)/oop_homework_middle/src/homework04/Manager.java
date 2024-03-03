package homework04;

public class Manager extends Employee {
    private double bonus;

    //创建Manager对象时，奖金是多少并不确定，因此在构造器没有bonus
    //通过setBonus方法设置
    public Manager(String name, double daySalary, int workDays, double grade) {
        super(name, daySalary, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("name:" + getName() + "\tsalary:" + (bonus + getDaySalary() *
                getWorkDays() * getGrade()));
    }
}
