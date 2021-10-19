package com.dkit.gd2.johnloane;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized
{
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected)
    {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup()
    {
        account = new BankAccount("James", "Mitchell", "BOI1235567", 1000, BankAccount.CHECKING);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions()
    {
        return Arrays.asList(new Object[][] {
                {100, true, 1100},
                {200, true, 1200},
                {325.14, true, 1325.14},
                {480.33, true, 1480.33},
                {1000, true, 2000}
        });
    }

    @Test
    public void deposit() throws Exception
    {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0.01);
    }

}
