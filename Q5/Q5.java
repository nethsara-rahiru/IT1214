class BankAccount{

    private double balance = 0;

    void deposit(int deposit){
        balance = balance + deposit;
    }
    void withdraw(int withdraw){
        balance = balance - withdraw;
    }

    double  displayBalance(){
        return balance;
    }
}