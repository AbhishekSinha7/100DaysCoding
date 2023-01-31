import java.util.Scanner;

public class day10 {
	
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int res=1;
		System.out.print("Enter ther number:");
		int no=sc.nextInt();
		if(no==0 || no==1) {
			System.out.println("1");
		}
		else{			
		for(int i=2;i<=no;i++) {
			res=res*i;
		}
		System.out.println(res);
		}
	}
}
