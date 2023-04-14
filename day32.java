import java.util.Scanner;

public class day32 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.next();
		StringBuffer sf =new StringBuffer(str);
		for(int i=0;i<sf.length();i++) {
		if(sf.charAt(i)=='a' || sf.charAt(i)=='e' || sf.charAt(i)=='i' || sf.charAt(i)=='o' || sf.charAt(i)=='u') {
			sf.deleteCharAt(i);
		}
		}
		System.out.println(sf);
	}

}
