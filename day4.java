import java.util.*;

public class day4 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Neither positive nor negative");
		}
		else if(n>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}
	}             