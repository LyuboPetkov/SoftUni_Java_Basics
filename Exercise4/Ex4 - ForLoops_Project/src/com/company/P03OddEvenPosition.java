package com.company;

import java.util.Scanner;

public class P03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double min = -10000000.00;
        double max =  10000000.00;
        double oddSum = 0.00;
        double oddMin = max;
        double oddMax = min;
        double evenSum = 0.00;
        double evenMin = max;
        double evenMax = min;
        for (int i = 1; i <= n; i++) {
            double temp = Double.parseDouble(scanner.nextLine());
            if (i%2==0)
            {
                if(temp>evenMax) evenMax = temp;
                if(temp<evenMin) evenMin = temp;
                evenSum+=temp;
            }
            else
            {
                if (temp>oddMax) oddMax = temp;
                if (temp<oddMin) oddMin = temp;
                oddSum+= temp;
            }
            }

        System.out.printf("OddSum=%.2f,\n", oddSum);
        if (oddMin == max) System.out.printf("OddMin=No,\n");
        else System.out.printf("OddMin=%.2f,\n", oddMin);
        if (oddMax == min) System.out.printf("OddMax=No,\n");
        else System.out.printf("OddMax=%.2f,\n",oddMax);
        System.out.printf("EvenSum=%.2f,\n",evenSum);
        if (evenMin == max) System.out.printf("EvenMin=No,\n");
        else System.out.printf("EvenMin=%.2f,\n", evenMin);
        if (evenMax == min) System.out.printf("EvenMax=No");
        else System.out.printf("EvenMax=%.2f",evenMax);

    }
}

