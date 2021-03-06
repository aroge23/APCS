package com.company;

public class SavingsAccountClass extends BankAccount{
    //private static int numberOfTransactions()
    //public static int getNumberOfTransactions;
    //public static int getNumberOfBankAccounts();
    //public String getFirstName();
    //and so on from the BankAccountClass


    private double interestRate;

    public SavingsAccountClass() {
        setBankName("");
        setFirstName("");
        setLastName("");
        //can't numberOfBankAccounts++;
        //can't accountNumber
    }
    public SavingsAccountClass(String first, String last) {
        setFirstName(first);
        setLastName(last);
    }
    public double getInterestRate() {
        return interestRate;
    }
    private void setInterestRate(double newRate) {
        if(newRate < 0)
            interestRate = 0;
        else
            interestRate = newRate;
    }
    //public void applyForNewInterestRate();

    public void accrueMonthlyInterest() {
        double monthlyRate = interestRate / 12;
        Money.round(monthlyRate * 100);
        //accrued interest = balance & monthlyRate
        Money accruedInterest = getBalance().product(monthlyRate);
        //add interest to balance
        deposit(accruedInterest);
    }

}