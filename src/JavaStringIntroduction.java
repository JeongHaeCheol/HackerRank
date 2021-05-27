import java.util.Scanner;

public class JavaStringIntroduction {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        
        String result = A + " " + B;
        System.out.println(result);
        
    
	}

}
