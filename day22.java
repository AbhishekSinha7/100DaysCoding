import java.util.Scanner;
import java.util.ArrayList;
public class day22 {
	
	 day22(int no) {
		 boolean flag=false;
		 int no1=0,no2=0;
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		for(int j=2;j<=no;j++)
		{
		int count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2) {
			a1.add(j);
		}
		}
		
		for(int i=0;i<a1.size();i++) {
			for(int j=0;j<a1.size();j++) {
				if(a1.get(i)+a1.get(j)==no) {
					flag=true;
					no1=a1.get(i);
					no2=a1.get(j);
				}
			}
		}
		
		if(flag) {
			System.out.println(no+" can be expressed as sum of "+no1+" and "+no2);
		}
		else {
			System.out.println(no+" cannot be expressed as sum of 2 prime numbers");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int no= sc.nextInt();
		day22 obj =new day22(no);
		}

}
