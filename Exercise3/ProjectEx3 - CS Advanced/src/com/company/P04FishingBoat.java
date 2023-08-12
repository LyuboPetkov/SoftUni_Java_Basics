package com.company;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0.0;
        if ("Autumn".equals(season)|| "Summer".equals(season))
            finalPrice = 4200;
        else if ("Spring".equals(season))
            finalPrice = 3000;
        else if ("Winter".equals(season))
            finalPrice = 2600;

        if (fishmen<=6)
            finalPrice*=0.9;
        else if (fishmen>=7&&fishmen<=11)
            finalPrice*=0.85;
        else if (fishmen>11)
            finalPrice*=0.75;

        if ((fishmen%2)==0 && !season.equals("Autumn"))
            finalPrice*=0.95;

        if ((budget-finalPrice)>=0)
            System.out.printf("Yes! You have %.2f leva left.", budget-finalPrice);
        else
            System.out.printf("Not enough money! You need %.2f leva.", finalPrice-budget);
    }
}
