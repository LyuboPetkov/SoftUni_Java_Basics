package com.company;

import java.util.Scanner;

public class P05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int sum = hours*60 + minutes + 15;
        int hours1 = sum/60;
        int min1 = sum%60;
        if(hours1%24 >= 0) hours1 %= 24;
        if(min1<10) System.out.printf("%d:0%d",hours1,min1);
        else System.out.printf("%d:%d",hours1,min1);
    }
}
