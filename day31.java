import java.util.Scanner;

public class day31 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:");
		String str1=sc.next();
		char[] ch=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			if(Character.isUpperCase(ch[i])) {
				ch[i]=Character.toLowerCase(ch[i]);
			}
			else {
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		
		for(char c:ch) {
			System.out.println(c);
		}
		str1=new String(ch);
		System.out.println(str1);
	}
}
