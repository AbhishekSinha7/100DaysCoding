import java.util.Scanner;

public class day15 {
	
	
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number:");
	int no = sc.nextInt();
	
	int rem=0, sum=0, temp=no;
	while(no>0) {
		int fact=1;
		rem=no%10;
		for ( int i=1; i<=rem; i++)
		{
		fact *= i ;
		}
		sum=sum+fact;
		no=no/10;
	}
	
	if(sum==temp) {
		System.out.println("Strong number");
	}
	else {
		System.out.println("Not a Strong number");
	}
	
}
	
}
