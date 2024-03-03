package homework05;

public class Employee {
    private String name;
    private double salary;
    private int salaryMonth = 12;//带薪的月份

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public void printSalary() {
        System.out.println("name:" + name + "\t年工资:" +salary * salaryMonth);
    }
}
