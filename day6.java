import java.util.Scanner;
public class day6 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the coordinates:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("This point lies in First quadrant.");
		}
		else if(x<0 && y>0) {
			System.out.println("This point lies in Second quadrant.");
		}
		else if(x<0 && y<0) {
			System.out.println("This point lies in Third quadrant.");
		}
		else{
			System.out.println("This point lies in Forth quadrant.");
		}
	}
}
