import java.util.Scanner;
public class day7 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("Enter Month:");
		int month =sc.nextInt();
		System.out.print("Enter Year:");
		int year =sc.nextInt();
		
		// finding if the given year is a leap year or not 
		if(year%4==0 && year%100!=0) {
			//if leap year then check month is february or not
			if(month==2) {
				//if month is february then print days+1
			System.out.println(arr[month-1]+1);
			}
			else{
				//if month is february then print days
				System.out.println(arr[month-1]);
			}
		}
		//print the no of days if not leap year
		else {
			
			System.out.println(arr[month-1]);
		}
		
	}
}
