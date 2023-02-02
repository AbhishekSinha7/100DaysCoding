import java.util.Scanner;

public class day14 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int no=sc.nextInt();
		int rem=0,reverse=0;
		if(no<0) { 
		no=Math.abs(no);
		while(no>0) {
			rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		reverse=reverse*-1;
		}
		else {
			while(no>0) {
				rem=no%10;
				reverse=reverse*10+rem;
				no=no/10;
			}
			}
		
		System.out.println(reverse);
	}
}
