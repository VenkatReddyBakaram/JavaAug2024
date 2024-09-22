package com.vtech.coreApps.exceptions;

import java.util.Scanner;

class ATM {

    void withdrawFromAccount(double withdrawAmount) {
        double actualBalance = 50000;
        double remBalance = 0;
        try {
            String customerName = "Venkat Reddy";
            remBalance = actualBalance - withdrawAmount;
            System.out.println("Transaction successfully completed by " + customerName.toUpperCase());
        } catch (NullPointerException npe) {
            System.out.println("Transaction is failed..!");
            System.out.println("You are trying to access null value. Please check once");
            remBalance = actualBalance;
        }

        System.out.println("Remaining Balance :" + remBalance);
    }

    void depositIntoAccount(double depositAmount) {
        double actualBalance = 50000;
        double remBalance = 0;
        try {
            String customerName = null;
            remBalance = actualBalance + depositAmount;
            System.out.println("Transaction successfully completed by " + customerName.toUpperCase());
        } catch (NullPointerException npe) {
            System.out.println("Transaction is failed..!");
            System.out.println("You are trying to access null value. Please check once");
            remBalance = actualBalance;
        }

        System.out.println("Remaining Balance :" + remBalance);
    }
}

public class TestApp29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("How much balance you want to withdraw :");
        double balance = sc.nextDouble();

        //atm.withdrawFromAccount(balance);
        atm.depositIntoAccount(balance);

    }
}
