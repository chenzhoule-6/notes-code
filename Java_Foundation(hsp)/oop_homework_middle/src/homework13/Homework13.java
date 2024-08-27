package homework13;

public class Homework13 {
    public static void main(String[] args) {
        //测试学生
        Student student = new Student("小明", '男', 15, "639356");
        student.printInfo();

        //测试老师
        System.out.println("=======================");
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();

        //定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("mary", '女', 20, "0002");
        persons[2] = new Teacher("smith", '男', 36, 5);
        persons[3] = new Teacher("scott", '男', 26, 1);

        //创建对象
        Homework13 homework13 = new Homework13();
        homework13.bubbleSort(persons);

        //输出排序后的数组
        System.out.println("---排序后的数组-----");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//toString方法已经重写
        }

        //遍历数组，调用test方法
        System.out.println("=======================");
        for (int i = 0; i < persons.length; i++) {
            homework13.test(persons[i]);
        }
    }


    //定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
    //分析这里会使用到向下转型和类型判断
    public void test(Person p) {
        if (p instanceof Student) {//如果p的运行类型是Student
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing...");
        }
    }

    //方法,完成年龄从高到底排序
    Person tmp = null;
    public void bubbleSort(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                //判断条件, 注意这里的条件可以根据需要，变化
                if(persons[j].getAge() < persons[j+1].getAge()) {
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
        }
    }
}
