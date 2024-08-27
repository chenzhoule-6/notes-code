package homework13;

/*
Student类有名称（name），性别(sex),年龄（age），学号（stu_id），
做合理封装，通过构造器在创建对象时将4个属性赋值。

学生需要有学习的方法（study），在方法里写生“我承诺，我会好好学习。”
 */
public class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习.");
    }

    /**
     * 学生爱玩足球
     */
    @Override
    public String play() {
        return super.play() + "足球";
    }

    //编写一个输出信息的方法，这样体现封装
    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(super.basicInfo());
        System.out.println("学号:" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
