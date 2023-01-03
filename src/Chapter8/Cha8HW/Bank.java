package Chapter8.Cha8HW;

public class Bank {
    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(1000);
        a.deposit(100);
        a.deposit(100);
        a.deposit(100);
        System.out.println(a.getBalance());
        a.deposit(100);
        System.out.println(a.getBalance());
    }
}

class BankAccount {

    //存取款

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{

    //存取款收取手续费1元

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}

class SavingsAccount extends BankAccount{

    //三次免手续费的机会

    private int count = 3;
    private double interest = 0.01;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    //判断是否还能免手续费

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount + 1);
        }
    }

    //每月重置次数，并给利率
    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * interest);
    }
}

