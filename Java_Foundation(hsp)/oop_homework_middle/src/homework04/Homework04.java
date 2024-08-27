package homework04;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("jack",100,20,1.2);
        //设置奖金
        manager.setBonus(1000);
        manager.printSalary();

        Worker worker = new Worker("tom", 200, 25, 1.0);
        worker.printSalary();
    }
}
