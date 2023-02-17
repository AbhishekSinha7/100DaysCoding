import java.util.Scanner;

public class day30 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no:");
		String str1=sc.next();
		int count=0;
		char[] ch=str1.toCharArray();
		for(char c: ch) {
			count++;
		}
		System.out.println(count);
	}
}
