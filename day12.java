import java.util.Scanner;

public class day12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int no =sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
