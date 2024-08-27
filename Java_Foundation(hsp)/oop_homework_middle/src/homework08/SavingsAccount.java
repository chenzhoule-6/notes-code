package homework08;

/*
扩展前一个练习的BankAccount类，
新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数
 */
public class SavingsAccount extends BankAccount {
    private int count = 3;//每月三次免息
    private double rate = 0.01;//利率

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        //判断是否还有免手续费次数
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest() {
        count = 3;//每月初重置
        super.deposit(getBalance() * rate);//利息加入到余额
    }
}
