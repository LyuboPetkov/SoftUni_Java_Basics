package com.company;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double finalPrice = 0;
        if ("Roses".equals(flowerType))
        {
            if (amount>80)
                finalPrice = amount * (5*0.9);
            else
                finalPrice = amount * 5;
        }
        else if ("Dahlias".equals(flowerType))
        {
            if (amount>90)
                finalPrice = amount *  (3.80*0.85);
            else
                finalPrice = amount * 3.80;
        }
        else if ("Tulips".equals(flowerType))
        {
            if (amount>80)
                finalPrice = amount * (2.80*0.85);
            else
                finalPrice = amount * 2.80;
        }
        else if ("Narcissus".equals(flowerType))
        {
            if (amount<120)
                finalPrice = amount * (3*1.15);
            else
                finalPrice = amount * 3;
        }
        else if ("Gladiolus".equals(flowerType))
        {
            if (amount<80)
                finalPrice = amount * (2.50*1.2);
            else
                finalPrice = amount * 2.50;
        }

        if ((budget-finalPrice)>=0)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flowerType, budget-finalPrice);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice-budget);
    }
}
