import java.util.Scanner;
public class day8 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a:");
		int a=sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		System.out.print("Enter c:");
		int c=sc.nextInt();
		
		int d= (b*b)-4*a*c;
		double r1,r2;
		if(d>0) {
			r1=-b+Math.sqrt(d)/(2*a);
			r2=-b-Math.sqrt(d)/(2*a);
			System.out.println("Root 1="+r1+" root 2 = "+r2);
		}
		else if(d==0) {
			r1=-b/(2*a);
			r2=-b/(2*a);
			System.out.println("Root 1="+r1+" root 2 = "+r2);
		}
		else {
			System.out.println("Roots are imaginary");
		}
	}
}
