package numbers;
import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int Num = sc.nextInt();
		int min=9, digit=0;
		while(Num>0)
		{
			digit=Num%10;
			if(digit<min)
			{
				min=digit;
			}
			Num=Num/10;
		}
		
		System.out.print(min +" is the smallest digit in the Number");
		sc.close();
	}

}
