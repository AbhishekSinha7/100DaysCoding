import java.util.Scanner;

public class day17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int no= sc.nextInt();
		boolean flag=true;
		for(int i=1;i<=no;i++) {
			if(no%i==0)
			{
				if(flag) {
					System.out.print(i);
					flag=false;
				}
				else {
					System.out.print(","+i);
				}
			}
			
		}
	}
}
