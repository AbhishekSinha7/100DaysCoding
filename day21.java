import java.util.Scanner;
public class day21 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int no = sc.nextInt();
		int temp=no,rem,rev=0;
		while(no>0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==temp) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
