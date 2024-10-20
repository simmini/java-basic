package oop1.ex;

public class Account {
    int balance;
    void deposit(int amount){
        this.balance+=amount;
    }

    void withdraw(int amount){
        //int n=this.balance-amount;
        if(balance<amount){
            System.out.println("잔액 부족");
        }else{
            this.balance-=amount;
        }
    }
}
