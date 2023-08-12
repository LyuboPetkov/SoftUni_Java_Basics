package com.company;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double gradeSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while(failedTimes<failedThreshold){
            String problemName = scanner.nextLine();
            if("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade<5) failedTimes++;

            gradeSum +=grade;
            solvedProblems++;
            lastProblem = problemName;
        }

        if(isFailed) System.out.printf("You need a break, %d poor grades.", failedThreshold);
        else{
            System.out.printf("Average score: %.2f\n", gradeSum/solvedProblems);
            System.out.printf("Number of problems: %d\n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
