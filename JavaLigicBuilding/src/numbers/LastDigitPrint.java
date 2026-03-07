package numbers;
import java.util.Scanner;
public class LastDigitPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		num=num%10;
		System.out.print(num);
		sc.close();
	}

}
