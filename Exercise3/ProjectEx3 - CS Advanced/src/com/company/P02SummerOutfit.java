package com.company;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int degress = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if (dayTime.equals("Morning"))
        {
            if (degress>=10&&degress<=18)
            {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if (degress>18&&degress<=24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degress>24)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if (dayTime.equals("Afternoon"))
        {
            if (degress>=10&&degress<=18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degress>18&&degress<=24)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if (degress>24)
            {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        else if (dayTime.equals("Evening"))
        {
            outfit = "Shirt";
            shoes = "Moccasins";
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degress, outfit, shoes);

    }
}
