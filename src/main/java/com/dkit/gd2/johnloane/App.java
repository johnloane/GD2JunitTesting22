package com.dkit.gd2.johnloane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount account = new BankAccount("Milana", "Vilenskaya", "BOI1234567", 3000, BankAccount.SAVING);
        double balance = account.deposit(1000, true);
        System.out.println(balance);

        Utilities util = new Utilities();
        System.out.println(util.removePairs(null));
        String test = "hello";
        System.out.println(test.getClass());

        util.converter(10, 0);
    }
}
