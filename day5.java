import java.util.Scanner;

public class day5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int no =sc.nextInt();
		if(no%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
