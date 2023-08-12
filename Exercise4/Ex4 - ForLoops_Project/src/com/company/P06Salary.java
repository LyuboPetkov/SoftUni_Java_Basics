package com.company;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean lost = false;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("Facebook")) salary-=150;
            else if (input.equals("Instagram")) salary -=100;
            else if(input.equals("Reddit")) salary -=50;

            if(salary<=0)
            {
                lost = true;
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if(!lost)System.out.println(salary);
    }
}
