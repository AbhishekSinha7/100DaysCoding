import java.util.Scanner;

public class day23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int no =sc.nextInt();
		int rem=0, reverse=0;
		
		if(no==0) {
			no=1;
		}
		while(no>0) {
			rem =no%10;
			if(rem==0) {
				rem=1;
			}
			reverse=reverse*10+rem;
			no=no/10;
		}
		no=0;
		while(reverse>0) {
			rem=reverse%10;
			no=no*10+rem;
			reverse=reverse/10;
		}
		System.out.println(no);
		
	}

}
