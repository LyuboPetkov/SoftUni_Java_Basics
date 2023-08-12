package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds1 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());
        int totalTime = seconds1+seconds2+seconds3;
        int minutes = totalTime/60;
        int seconds = totalTime%60;
        if(seconds<10) System.out.printf("%d:0%d",minutes,seconds);
        else System.out.printf("%d:%d",minutes,seconds);
    }
}
