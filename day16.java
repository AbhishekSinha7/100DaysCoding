import java.util.Scanner;
import java.util.ArrayList;
public class day16 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int no = sc.nextInt();
		int sum=0;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		
		if(no==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect number");
		}
	}
}
