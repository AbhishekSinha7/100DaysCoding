import java.util.*;
public class day1 {

	public static void main(String args[]) {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter a character:");
	        char ch=scan.next().charAt(0);
	        int vowel=0;
	        char[] arr={ 'a','e','i','o','u', 'A','E','I','O','U'};
	        for(char c:arr){
	            if(ch==c){
	                vowel=1;
	            }
	        }
	        
	        if(vowel==1){
	            System.out.println("Vowel");
	        }else{
	            System.out.println("Consonant");
	        }
	        scan.close();
	}
}
