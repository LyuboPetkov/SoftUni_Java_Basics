package com.company;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberry = Double.parseDouble(scanner.nextLine());
        double strawberry = Double.parseDouble(scanner.nextLine());
        double raspberryPrice = 0.5*strawberryPrice;
        double orangesPrice = 0.6*raspberryPrice;
        double bananasPrice = 0.2*raspberryPrice;
        double strawberryCost = strawberry*strawberryPrice;
        double bananasCost = bananas*bananasPrice;
        double orangesCost = oranges*orangesPrice;
        double raspberryCost = raspberry*raspberryPrice;
        double cost = strawberryCost + bananasCost + orangesCost + raspberryCost;
        System.out.printf("%.2f",cost);
    }
}
