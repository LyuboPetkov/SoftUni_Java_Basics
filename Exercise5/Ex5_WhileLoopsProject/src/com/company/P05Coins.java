package com.company;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int count = 0;
        while (change>0.00){
            if(change>=0.01){
                change-=0.01;
                count++;
            }
            else if (change>=0.02){
                change-=0.02;
                count++;
            }
            else if (change>=0.1){
                change-=0.1;
                count++;
            }
            else if (change>=0.2) {
                change -= 0.2;
                count++;
            }
            else if (change>=0.5) {
                change -= 0.5;
                count++;
            }
            else if (change>=1) {
                change -= 1;
                count++;
            }
            else if (change>=2) {
                change -= 2;
                count++;
            }
            else if (change>=0.05) {
                change -= 0.05;
                count++;
            }
        }

        System.out.printf("%d", count);
    }
}
