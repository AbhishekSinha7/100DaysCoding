import java.util.Scanner;
public class day9 {
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number:");
		int no=sc.nextInt();
		int count=0;
		while(no>0) {
			no=no/10;
			count++;
		}
		System.out.println(count);
	}
}
