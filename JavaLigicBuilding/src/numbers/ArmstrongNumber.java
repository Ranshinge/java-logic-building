package numbers;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int count=0, tempnum=num, orgnum=num, digitsum=0, digit=0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		while(tempnum>0)
		{
			digit=tempnum%10;
			digitsum+=(int)Math.pow(digit, count);
			tempnum=tempnum/10;
			
		}
		if(digitsum==orgnum)
		{
			System.out.print(orgnum + " is Armstrong number.");
		}
		else
		{
			System.out.print(orgnum + " is not Armstrong number.");
		}
		sc.close();
	}

}
