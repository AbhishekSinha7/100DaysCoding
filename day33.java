import java.util.Scanner;

public class day33 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.next();
		StringBuffer sf =new StringBuffer(str);
		sf.reverse();
		
		if(sf.toString().equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
