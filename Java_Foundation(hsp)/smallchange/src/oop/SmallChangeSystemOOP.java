package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
面向对象的零钱通
该类是完成零钱通的各个功能的类
使用OOP(面向对象编程)
将各个功能对应一个方法
 */
public class SmallChangeSystemOOP {
    //属性
    //定义相关变量
    //把变量变成属性
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

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("=============零钱通菜单OOP=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.println("请选择 1-4：");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误!!!");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void details() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        //改进2 增加业务逻辑
        if (money <= 0) {
            System.out.println("收益入账金额要 > 0 !!!");
            return;//退出方法
        }

        balance += money;
        //拼接收益入账到 details
        date = new Date();//获取到当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
    }

    //完成消费
    public void pay() {
        System.out.println("消费项目:");
        note = scanner.next();
        System.out.println("消费金额:");
        money = scanner.nextDouble();
        //改进2 增加业务逻辑
        if (money <= 0 || money > balance) {
            System.out.println("消费金额要 0-" + balance);
            return;
        }
        balance -= money;
        date = new Date();//重新获取时间
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
    }

    //退出
    public void exit() {
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
    }
}
