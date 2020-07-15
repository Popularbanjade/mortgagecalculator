package com.popular;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte MONTHS_IN_YEAR = 12;
	final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal amount: ");
        int principalAmount = scanner.nextInt();


        Scanner scanner1  = new Scanner(System.in);
        System.out.print("Annual interest rate: ");
    float annualInterestRate = scanner1.nextFloat();
    float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

    Scanner scanner2 = new Scanner(System.in);
    System.out.print("Time period (years): ");
    int timePeriod = scanner2.nextInt();

    int numberOfPayments = timePeriod * MONTHS_IN_YEAR;

    double monthlyPayment = principalAmount * monthlyInterestRate * (Math.pow((1+ monthlyInterestRate), numberOfPayments ))
            / ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1) ;

    System.out.println("Monthly Payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

    }
}
