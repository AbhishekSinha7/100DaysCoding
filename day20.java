import java.util.Scanner;

public class day20 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int no= sc.nextInt();
		boolean flag=true;
		int m =no/2;
		if(no==1 || no==2) {
			System.out.println(no+" is not a prime number");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(no%i==0) {
					flag=false;
				}
			}
			if(flag) {
				System.out.println(no+" is a prime number");
			}
			else {
				System.out.println(no+" is not a prime number");
			}
		}
		
		
	}
}
