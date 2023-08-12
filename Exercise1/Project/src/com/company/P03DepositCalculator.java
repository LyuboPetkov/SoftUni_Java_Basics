package com.company;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double glp = Double.parseDouble(scanner.nextLine())/100;
        double sum = depositAmount + depositTerm*((depositAmount*glp)/12);
        System.out.printf("%.2f",sum);

    }
}
