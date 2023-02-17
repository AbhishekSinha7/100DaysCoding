import java.util.Scanner;

public class day26 {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the no:");
	int no=sc.nextInt();
	int total=0,temp=0;
	for(int i=1;i<=no;i++) {
		temp=no-i;
		total=total+temp;
	}
	System.out.println(total);
	
}
}
