package com.company;

import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double weakCount = 0;
        double averageCount = 0;
        double goodCount = 0;
        double excellentCount = 0;
        double sum = 0;
        double average;
        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());;
            if (grade<=2.99) weakCount++;
            else if (grade<=3.99) averageCount++;
            else if (grade<=4.99) goodCount ++;
            else excellentCount++;

            sum+=grade;
        }

        average = sum/studentsCount;
        System.out.printf("Top students: %.2f%%\n", (excellentCount/studentsCount)*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (goodCount/studentsCount)*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(averageCount/studentsCount)*100);
        System.out.printf("Fail: %.2f%%\n",(weakCount/studentsCount)*100);
        System.out.printf("Average: %.2f", average);
    }
}
