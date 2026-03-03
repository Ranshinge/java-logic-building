package numbers;

import java.util.Scanner;

public class DigitSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		int digit=0, sum=0;
		
		while(number>0)
		{
			digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.print("Sum of the digit: " +sum);		
		sc.close();
	}

}
