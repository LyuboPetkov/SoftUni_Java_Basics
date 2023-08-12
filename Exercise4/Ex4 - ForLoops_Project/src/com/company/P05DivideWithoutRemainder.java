package com.company;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countD2 = 0;
        int countD3 = 0;
        int countD4 = 0;

        double p1,p2,p3;

        for (int i = 1; i <= n; i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            if(temp%2==0) countD2++;
            if (temp%3==0) countD3++;
            if(temp%4==0) countD4++;
        }

        p1 = (1.0/n)*countD2*100;
        p2 = (1.0/n)*countD3*100;
        p3 = (1.0/n)*countD4*100;

        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%",p3);

    }
}
