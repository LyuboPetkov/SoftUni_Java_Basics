package com.company;

import java.util.Scanner;

public class P02DeerSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysAway = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double deer1Food = Double.parseDouble(scanner.nextLine());
        double deer2Food = Double.parseDouble(scanner.nextLine());
        double deer3Food = Double.parseDouble(scanner.nextLine());

        double foodLeft = food - (deer1Food*daysAway + deer2Food*daysAway + deer3Food*daysAway);
        //int foodLeftFloor = (int) Math.floor(foodLeft);
        if (foodLeft>=0){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft));
        }

        else
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(foodLeft)));
    }
}
