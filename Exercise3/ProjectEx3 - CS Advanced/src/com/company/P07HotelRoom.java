package com.company;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int stay = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        if (month.equals("May") || month.equals("October"))
        {
            apartmentPrice = stay * 65;
            if (stay>7&&stay<=14)
                studioPrice = stay * (50*0.95);

            else if (stay>14){
                studioPrice = stay * (50*0.70);
                apartmentPrice = stay * (65*0.90);
            }
            else{
                studioPrice = stay * 50;

            }
        }
        else if (month.equals("June") || month.equals("September"))
        {

            if (stay>14){
                studioPrice = stay * (75.20*0.80);
                apartmentPrice = stay * (68.70*0.90);
            }
            else{
                studioPrice = stay * 75.20;
                apartmentPrice = stay * 68.70;
            }
        }
        else if (month.equals("July") || month.equals("August"))
        {
            if (stay>14)
                apartmentPrice = stay * (77*0.90);
            else
                apartmentPrice = stay * 77;

            studioPrice = stay * 76;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
