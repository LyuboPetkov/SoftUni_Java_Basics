package com.company;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints;
        double total;
        if(number<=100) bonusPoints = 5;
        else if(number>100 && number <=1000) bonusPoints = number * 0.2;
        else bonusPoints = number * 0.1;
        if(number%2==0) bonusPoints++;
        if(number%10==5) bonusPoints +=2;
        total = number + bonusPoints;
        System.out.printf("%.1f\n",bonusPoints);
        System.out.printf("%.1f",total);
    }
}
