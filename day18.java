import java.util.Scanner;

public class day18 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the x1 and y1:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.print("Enter the x2 and y2:");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		int x3 = (x1*y2)+(x2*y1);
		int y3 = (y1*y2);
		while(y3>1 && x3>1) {
		for(int i=2;i<=y3;i++) {
			if(x3%i==0 && y3%i==0) {
				x3=x3/i;
				y3=y3/i;
			}
		}}
	System.out.println(x3+"/"+y3);
	}
}
