package com.company;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;
        String destination = "";
        String type = "";
        if (budget<=100)
        {
            destination = "Bulgaria";
            if (season.equals("summer")){
                price = 0.3*budget;
                type = "Camp";
            }
            else {
                price = 0.7*budget;
                type = "Hotel";
            }
        }
        else if (budget<=1000)
        {
            destination = "Balkans";
            if(season.equals("summer")){
                price = 0.4*budget;
                type = "Camp";
            }
            else{
                price = 0.8*budget;
                type = "Hotel";
            }
        }
        else if (budget>1000)
        {
            destination = "Europe";
            type = "Hotel";
            price = 0.90 * budget;
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type, price);
    }
}
