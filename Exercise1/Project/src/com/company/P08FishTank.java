package com.company;

import java.util.Scanner;

public class P08FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine())/100;
        double area = length*width*height*0.001;
        double liters = area*(1-percent);
        System.out.printf("%.2f",liters);
    }
}
