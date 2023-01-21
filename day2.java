import java.util.*;
import java.io.*;

public class day2 {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the character:");
		char c= sc.next().charAt(0);
		
		if(Character.isLetter(c)) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not an alphabet");
		}
	}
}
