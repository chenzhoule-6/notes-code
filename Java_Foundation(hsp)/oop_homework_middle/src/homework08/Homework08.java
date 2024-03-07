package homework08;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);// 1010 - 1 = 1009
//        checkingAccount.withdraw(9);//1009 - 9 = 1000 -1= 999
//        System.out.println(checkingAccount.getBalance());

        //测试SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());// 1300
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());// 1400 - 1 = 1399

        //月初，计算器自动调用 earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());// 1399 + 1399 * 0.01 = 1412.99
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());//免手续费 1312.99
    }
}
