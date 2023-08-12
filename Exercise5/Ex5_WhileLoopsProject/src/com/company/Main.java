package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String bookName = scanner.nextLine();
	String input = scanner.nextLine();
	boolean isFound = false;
	int count = 0;
	while (!input.equals("No More Books"))
    {
        if(bookName.equals(input)){
            isFound = true;
            break;
        }
        count++;
        input = scanner.nextLine();
    }

	if(isFound){
        System.out.printf("You checked %d books and found it.", count);
    }
	else
        System.out.printf("The book you search is not here!%nYou checked %d books.", count);

    }
}
