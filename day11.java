import java.util.*;

public class day11 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int no=sc.nextInt();
		
		int no1=0, no2=1, no3=0;
		System.out.print(no1+"\t"+no2+"\t");
		for(int i=2;i<no;i++) {
			no3=no2+no1;
			System.out.print(no3+"\t");
			no1=no2;
			no2=no3;
		}
	}
}
