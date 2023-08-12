package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paper = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double paperPrice = paper*5.80;
        double clothPrice = cloth*7.20;
        double gluePrice = glue*1.20;

        double finalPrice = (paperPrice+clothPrice+gluePrice)*((1.0*(100-discount))/100);

        System.out.printf("%.3f", finalPrice);
    }
}
