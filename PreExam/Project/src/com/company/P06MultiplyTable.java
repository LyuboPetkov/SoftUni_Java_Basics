package com.company;

import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int n1,n2,n3;
        n1 = number%10;
        number/=10;
        n2 = number%10;
        number/=10;
        n3 = number%10;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {
                    int product = i*j*k;

                    System.out.printf("%d * %d * %d = %d;\n", i,j,k,product);
                }
            }
        }

    }
}
