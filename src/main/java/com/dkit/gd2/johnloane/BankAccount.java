package com.dkit.gd2.johnloane;

public class BankAccount
{
    private String firstName;
    private String lastName;
    private String iban;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVING = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, String iban, double balance, int accountType)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.balance = balance;
        this.accountType = accountType;
    }

    /*
    The branch argument is true if the customer performs the transaction in a branch, false indicates that it is at an ATM
     */
    public double deposit(double amount, boolean branch)
    {
        balance += amount;
        return balance;
    }
    /*
    branch argument is as for deposit
    You can only withdraw a max of 500 from an ATM
    You can withdraw any amount that you have from a branch
     */
    public double withdraw(double amount, boolean branch)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        if((amount > 500) && !branch)
        {
            throw new IllegalArgumentException();
        }
        return balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean getAccountType()
    {
        return accountType==CHECKING;
    }
}
