package com.company;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double excursionPrice=0;
        switch (season)
        {
            case "spring":
                if (people<=5) excursionPrice = people*50.00;
                else excursionPrice = people*48.00;
                break;
            case "summer":
                if (people<=5) excursionPrice = 0.85*(people*48.50);
                else excursionPrice = 0.85*(people*45.00);
                break;
            case "autumn":
                if (people<=5) excursionPrice = people*60.00;
                else excursionPrice = people*49.50;
                break;
            case "winter":
                if (people<=5) excursionPrice = 1.08*(people*86.00);
                else excursionPrice = 1.08*(people*85.00);
                break;

        }

        System.out.printf("%.2f leva.", excursionPrice);
    }
}
