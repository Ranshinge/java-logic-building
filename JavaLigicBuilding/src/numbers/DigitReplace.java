package numbers;
import java.util.Scanner;
public class DigitReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		System.out.print("Enter a replace number: ");
		int repnum=sc.nextInt();
		System.out.print("Enter a replacer number: ");
		int repcrnum=sc.nextInt();
		int digit=0,rev=0;
		
		while(num>0)
		{
			digit=num%10;
			if(digit==repnum)
			{
				digit=repcrnum;
			}
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.print(rev);
		sc.close();
	}
}
