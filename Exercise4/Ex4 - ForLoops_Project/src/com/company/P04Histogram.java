package com.company;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countUnder200=0;
        int countBetween200and399=0;
        int countBetween400and599=0;
        int countBetween600and799=0;
        int countOver800=0;

        double percentUnder200;
        double percentBetween200and399;
        double percentBetween400and599;
        double percentBetween600and799;
        double percentOver800;

        for (int i = 1; i <=n ; i++) {
            int temp = Integer.parseInt(scanner.nextLine());
            if(temp<200) countUnder200++;
            else if(temp<400) countBetween200and399++;
            else if(temp<600) countBetween400and599++;
            else if(temp<800) countBetween600and799++;
            else countOver800++;
        }

        percentUnder200 = (countUnder200*1.0/n)*100;
        percentBetween200and399 = (countBetween200and399*1.0/n)*100;
        percentBetween400and599 = (countBetween400and599*1.0/n)*100;
        percentBetween600and799 = (countBetween600and799*1.0/n)*100;
        percentOver800 = (countOver800*1.0/n)*100;
        System.out.printf("%.2f%%\n",percentUnder200);
        System.out.printf("%.2f%%\n",percentBetween200and399);
        System.out.printf("%.2f%%\n",percentBetween400and599);
        System.out.printf("%.2f%%\n",percentBetween600and799);
        System.out.printf("%.2f%%",percentOver800);
    }
}
