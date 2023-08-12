package com.company;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        String operator = scanner.nextLine();
        String oddOrEven = "";
        if(operator.equals("+"))
        {
            result = number1 + number2;
            if((result%2==0))
                oddOrEven = "even";
            else
                oddOrEven = "odd";

            System.out.printf("%d %s %d = %d - %s",number1, operator, number2, result, oddOrEven);
        }
        else if (operator.equals("-"))
        {
            result = number1 - number2;
            if((result%2==0))
                oddOrEven = "even";
            else
                oddOrEven = "odd";

            System.out.printf("%d %s %d = %d - %s",number1, operator, number2, result, oddOrEven);
        }
        else if (operator.equals("*"))
        {
            result = number1*number2;
            if((result%2==0))
                oddOrEven = "even";
            else
                oddOrEven = "odd";

            System.out.printf("%d %s %d = %d - %s",number1, operator, number2, result, oddOrEven);
        }
        else if (operator.equals("/"))
        {
            if (number2 == 0)
                System.out.printf("Cannot divide %d by zero", number1);
            else {
                double result_float;
                result_float = (double) number1 / number2;
                System.out.printf("%d %s %d = %.2f", number1, operator, number2, result_float);
            }

        }
        else if (operator.equals("%"))
        {
            if (number2 == 0)
                System.out.printf("Cannot divide %d by zero", number1);
            else {
                result = number1 % number2;
                System.out.printf("%d %s %d = %d", number1, operator, number2, result);
            }
        }

    }
}
