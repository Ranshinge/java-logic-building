package numbers;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		int digit=0, digitsum=0, originalnum=num;
		
		while(num>0)
		{
			digit=num%10;
			digitsum+=digit;
			num=num/10;
		}
		if(originalnum%digitsum==0)
		{
			System.out.print(originalnum + " is harshad number.");
		}
		else
		{
			System.out.print(originalnum + " is not harshad number.");
		}
		sc.close();
	}

}
