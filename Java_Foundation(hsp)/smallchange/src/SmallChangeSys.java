
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//面向过程的零钱通，零钱通明细是通过String的拼接
public class SmallChangeSys {

    //化繁为简
    //1. 先完成显示菜单，并可以选择菜单，给出对应提示
    //2. 完成零钱通明细
    //3. 完成收益入账
    //4. 消费
    //5. 退出
    //6. 用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ，否则循环输入指令，直到输入y 或者 n
    //7. 在收益入账和消费时，判断金额是否合理，并给出相应的提示
    public static void main(String[] args) {

        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        //思路:(1)把收益入账和消费保存到数组 (2)使用对象 (3)使用String拼接
        String details = "-------------零钱通明细------------";

        //3.完成收益入账
        //定义新变量
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化的

        //4.完成消费
        //定义新变量，表示消费项目
        String note = null;

        //1.先完成显示菜单，并可以选择菜单，给出对应提示
        do {
            System.out.println("=============零钱通菜单=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择 1-4：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //改进2 增加业务逻辑
                    if (money <= 0) {
                        System.out.println("收益入账金额要 > 0 !!!");
                        break;
                    }

                    balance += money;
                    //拼接收益入账到 details
                    date = new Date();//获取到当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case "3":
                    System.out.println("消费项目:");
                    note = scanner.next();
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    //改进2 增加业务逻辑
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额要 0-" + balance);
                        break;
                    }
                    balance -= money;
                    date = new Date();//重新获取时间
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case "4":
                    //改进1
                    // 定义变量用于接收用户是否退出
                    String choice = null;

                    //先判断输入choice的是y或者n，不是就一直循环提示
                    while (true) {
                        System.out.println("你确定要退出么? y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    //退出while后，再判断choice是y还是n，决定是否退出
                    if (choice.equals("y")) {
                        loop = false;
                    }

                    //也可以这样写
//                    while (true) {
//                        System.out.println("你确定要退出么? y/n");
//                        choice = scanner.next();
//                        if ("y".equals(choice)) {
//                            loop = false;
//                            break;
//                        } else if ("n".equals(choice)) {
//                            break;
//                        }
//                    }

                    break;
                default:
                    System.out.println("选择有误!!!");
            }
        } while (loop);
        System.out.println("------退出了零钱通系统------");
    }
}
