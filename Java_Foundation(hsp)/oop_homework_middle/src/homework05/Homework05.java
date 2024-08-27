package homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", 1000);
        worker.printSalary();//name:jack	年工资:12000.0

        Peasant peasant = new Peasant("jack", 1000);
        peasant.setSalaryMonth(15);//修改带薪月份
        peasant.printSalary();//name:jack	年工资:15000.0

        Teacher teacher = new Teacher("tom", 5000);
        teacher.setClassDay(360);
        teacher.setClassSalary(100);
        teacher.printSalary();

        Scientist scientist = new Scientist("smith", 1000);
        scientist.setBonus(10000);
        scientist.printSalary();
    }
}

