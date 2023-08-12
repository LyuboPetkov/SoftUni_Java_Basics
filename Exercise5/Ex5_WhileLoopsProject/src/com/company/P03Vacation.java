package com.company;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int allDays = 0;
        int spedDays = 0;
        boolean isFailed = false;
        while (moneyOnHand < excursionPrice) {
            allDays++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            switch (command) {
                case "spend":
                    spedDays++;
                    moneyOnHand -= money;
                    if (moneyOnHand < 0) moneyOnHand = 0;
                    break;
                case "save":
                    moneyOnHand += money;
                    spedDays = 0;
                    break;
            }

            if (spedDays == 5) {
                isFailed = true;
                break;
            }

        }

        if (isFailed)
        {
            System.out.println("You can't save the money.");
            System.out.println(allDays);
        }
        else
            System.out.printf("You saved the money for %d days.", allDays);
    }
}

