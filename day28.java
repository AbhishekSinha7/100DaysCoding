import java.util.Scanner;

public class day28 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no:");
		String str1=sc.next();
		
		StringBuffer sf =new StringBuffer(str1);
		sf.reverse();
		str1=sf.toString();
		System.out.println(str1);
	}
}
