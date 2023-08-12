package com.company;

import java.util.Scanner;

public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int profit = 0;
        String command;
        while (!input.equals("closed"))
        {
            switch (input)
            {
                case "haircut":
                    command = scanner.nextLine();
                    if (command.equals("mens")) profit+=15;
                    else if (command.equals("ladies")) profit += 20;
                    else if (command.equals("kids")) profit += 10;
                    break;
                case "color":
                    command = scanner.nextLine();
                    if (command.equals("touch up")) profit+=20;
                    else if (command.equals("full color")) profit+=30;
                    break;
            }

            if (profit>=goal) break;
            input = scanner.nextLine();
        }


        if (profit>=goal) System.out.printf("You have reached your target for the day!\n");
        else
            System.out.printf("Target not reached! You need %dlv. more.\n", goal-profit);

        System.out.printf("Earned money: %dlv.", profit);
    }
}
