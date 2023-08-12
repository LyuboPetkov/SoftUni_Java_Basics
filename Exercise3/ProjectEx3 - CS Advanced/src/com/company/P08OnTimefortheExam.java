package com.company;
import java.util.Scanner;

public class P08OnTimefortheExam {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());
        int examTime = 60*(examHour) + examMinutes;
        int arrivalTime = 60*(arrivalHour) + arrivalMinutes;

        if (arrivalTime>examTime){
            System.out.printf("Late\n");
            if ((arrivalTime-examTime) >= 60)
            {
                if(((arrivalTime-examTime)%60)<10)
                    System.out.printf("%d:0%d hours after the start",(arrivalTime-examTime)/60, (arrivalTime-examTime)%60);
                else
                    System.out.printf("%d:%d hours after the start",(arrivalTime-examTime)/60, (arrivalTime-examTime)%60);
            }
			else
            System.out.printf("%d minutes after the start",(arrivalTime-examTime)%60);
        }
        else if ((examTime-arrivalTime)>=0 && (examTime - arrivalTime)<=30){
            System.out.printf("On time\n");
            if(((examTime-arrivalTime)%30) >= 0)
                System.out.printf("%d minutes before the start",(examTime - arrivalTime));
        }
        else if ((examTime - arrivalTime)>30) {
            System.out.printf("Early\n");
            if ((examTime - arrivalTime) >= 60)
            {
                if(((examTime - arrivalTime)%60)<10)
                    System.out.printf("%d:0%d hours before the start",(examTime - arrivalTime)/60, (examTime - arrivalTime)%60 );
                else
                    System.out.printf("%d:%d hours before the start",(examTime - arrivalTime)/60, (examTime - arrivalTime)%60 );
            }
			else
            System.out.printf("%d minutes before the start",(examTime - arrivalTime)%60);
        }
    }
}
