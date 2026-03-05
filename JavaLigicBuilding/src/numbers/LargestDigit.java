package numbers;
import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int Num=sc.nextInt();
		int digit=0, max=0;
		
		while(Num>0)
		{
			digit=Num%10;
			if(digit>max)
			{
				max=digit;
			}
			Num=Num/10;
		}
		System.out.print(max + " is Largest digit in the number.");
		sc.close();
	}

}
