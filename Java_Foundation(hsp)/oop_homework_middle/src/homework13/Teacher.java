package homework13;

/*
写一个Teacher类，Teacher类有名称（name），性别（sex），年龄（age），工龄（work_age),
做合理封装，通过构造器在创建对象时将4个属性赋值
 */
public class Teacher extends Person {
    private int  work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会好好教学.");
    }

    /**
     * 老师爱玩象棋
     */
    @Override
    public String play() {
        return super.play() + "象棋";
    }

    //输出信息方法
    public void printInfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
