package com.company;

import java.util.Scanner;

public class P08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double avrGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0.35*minSalary;
        double exellScholarship = avrGrade*25;
        boolean social = income < minSalary && avrGrade > 4.5;
        boolean excellent = avrGrade>=5.5;


        if(social&&excellent)
        {
            if (socialScholarship>exellScholarship)
                System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socialScholarship));
            else
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(exellScholarship));
        }
        else if(social&&!excellent)
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socialScholarship));
        else if(!social&&!excellent)
            System.out.printf("You cannot get a scholarship!");
        else
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(exellScholarship));

    }
}
