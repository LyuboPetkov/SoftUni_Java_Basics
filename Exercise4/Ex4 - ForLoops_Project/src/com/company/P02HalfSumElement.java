package com.company;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            sum+=temp;
            if (temp>max) max = temp;
        }

        int sumWithoutMax = sum - max;
        if(max == sumWithoutMax)
        {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }
        else
            System.out.printf("No\nDiff = %d", Math.abs(max-sumWithoutMax));
    }
}
