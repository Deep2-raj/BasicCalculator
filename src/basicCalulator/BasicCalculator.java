package basicCalulator;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		//store the two number
		double num1,num2;
		
		//Take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("Enter the two opertor (+,-,*,/)");
		
		char op = sc.next().charAt(0);
		double ans = 0;
		
		switch(op){
		//case to add two numbers
		case '+':
			ans = num1 + num2;
			break;
		//case to subtract two numbers
		case '-':
			ans = num1 - num2;
			break;
		case '*':
			ans = num1 * num2;
			break;
		
		case '/':
			ans = num1 / num2;
			break;
		
		default:
			System.out.println("You enter the wrong input");
		}
		System.out.println("The final result is:");
		 
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + ans);
	}
}
