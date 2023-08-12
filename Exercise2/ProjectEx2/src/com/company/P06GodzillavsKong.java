package com.company;

import java.util.Scanner;

public class P06GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());
        double decorPrice = budget*0.1;
        double clothingPrice = statistsCount*clothing;
        if(statistsCount>150) clothingPrice = clothingPrice*0.9;
        double costs = decorPrice+clothingPrice;
        if((budget-costs) >= 0) System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget-costs);
        else System.out.printf("Not enough money!\nWingard needs %.2f leva more.", costs-budget);
    }
}
