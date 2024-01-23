package edu.wit.csds;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(("Please input five numbers: ") + "\n");
		double number1 = scanner.nextInt();
		double number2 = scanner.nextInt();
		double number3 = scanner.nextInt();
		double number4 = scanner.nextInt();
		double number5 = scanner.nextInt();
		double sum = number1 + number2 + number3 + number4 + number5;
		double mean = sum / 5;
		
		System.out.println(" The sum of these numbers are " +
				sum);
		System.out.println("The mean of these numbers are " +
				sum / 5) ;
		
		double diff1 = mean - number1;
		double diff2 = mean - number2;
		double diff3 = mean - number3;
		double diff4 = mean - number4;
		double diff5 = mean - number5;
		
		double stdDev = Math.sqrt(
				(diff1 * diff1 + 
				diff2 * diff2 + 
				diff3 * diff3 + 
				diff4 * diff4 + 
				diff5 * diff5 
				)/5.0);
				
		
		System.out.printf("The standard deviation of these numbers are %.4f%n", stdDev
				);
		
		
		scanner.close();
	}

}
