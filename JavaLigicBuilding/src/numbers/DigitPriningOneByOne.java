package numbers;
import java.util.Scanner;
public class DigitPriningOneByOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt(), digit=0;
		while(num>0)
		{
			digit=num%10;
			System.out.print(digit +" ");
			num=num/10;
		}
		sc.close();
	}

}
