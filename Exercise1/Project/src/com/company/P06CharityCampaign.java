package com.company;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double bakers = Double.parseDouble(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cakesProfit = cakes * 45;
        double wafflesProfit = waffles*5.80;
        double pancakesProfit = pancakes*3.20;
        double daySum = (cakesProfit + wafflesProfit + pancakesProfit)*bakers;
        double campaignSum = daySum*days;
        double costs = campaignSum * 1 / 8;
        double lastSum = campaignSum - costs;
        System.out.printf("%.2f",lastSum);

    }
}
