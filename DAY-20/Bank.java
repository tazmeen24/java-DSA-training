class Bank{
    int balance=1000;
    synchronized void withdraw(Int amount){
        if(amount<=balance){
            System.out.println("Amount Withdrawal Successful");
            balance-=amount;
            System.out.println("Remaining Balance:"+balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

class BankThread extends Thread{
    Bank bank;
    BankThread(Bank bank){
        this.bank=bank;
    }
    
}