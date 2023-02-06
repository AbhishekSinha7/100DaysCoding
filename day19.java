import java.util.Scanner;
public class day19 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int no = sc.nextInt();
		int rem=0,sum=0,temp=no;
		while(no>0) {
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		
		if(temp==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}
}
