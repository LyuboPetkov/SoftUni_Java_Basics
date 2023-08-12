package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 String projection = scanner.nextLine();
	 int cols = Integer.parseInt(scanner.nextLine());
	 int rows = Integer.parseInt(scanner.nextLine());
	 double profit = 0;
	 if ("Premiere".equals(projection))
	     profit = cols * rows * 12.00;
	 else if ("Normal".equals(projection))
	     profit = cols * rows * 7.50;
	 else if ("Discount".equals(projection))
	     profit = cols * rows * 5.00;

        System.out.printf("%.2f",profit);

    }
}
