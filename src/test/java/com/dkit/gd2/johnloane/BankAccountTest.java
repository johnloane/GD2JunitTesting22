package com.dkit.gd2.johnloane;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest
{
    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("This executes before any tests. Count = " + count++);
    }

    @Before
    public void setup()
    {
        account = new BankAccount("Milana", "Vilenskaya", "BOI1234567", 3000, BankAccount.SAVING);
        System.out.println("Setup bank account before running tests");
    }

    @Test
    public void depositWholeNumber() throws Exception
    {
        double balance = account.deposit(1000, true);
        assertEquals(4000, balance, 0);
    }

    @Test
    public void depositCents() throws Exception
    {
        double balance = account.deposit(0.50, true);
        assertEquals(3000.50, balance, 0);
    }

    @Test
    public void withdrawBranch() throws Exception
    {
        double balance = account.withdraw(600, true);
        assertEquals(2400, balance, 0);
    }

    @Test
    public void withdrawBranchMax() throws Exception
    {
        double balance = account.withdraw(account.getBalance(), true);
        assertEquals(0, balance, 0);
    }

    @Test
    public void withdrawBranchMoreThanMax() throws Exception
    {
        double originalBalance = account.getBalance();
        double balance = account.withdraw((originalBalance+100), true);
        assertEquals(originalBalance, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawATMMoreThanATMLimit() throws Exception
    {
        double balance = account.withdraw(3003, false);
    }




    @AfterClass
    public static void afterClass()
    {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @After
    public void tearDown()
    {
        System.out.println("Count = " + count++);
    }
}