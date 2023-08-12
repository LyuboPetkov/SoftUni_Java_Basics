package com.company;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int weekendsInSofia = 48-h;
        double games = 0.75*weekendsInSofia + h + (2*(double)p)/3;
        if (year.equals("leap"))
            games*=1.15;

        System.out.printf("%.0f",Math.floor(games));

    }
}
