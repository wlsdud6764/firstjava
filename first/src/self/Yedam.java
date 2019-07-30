package self;
import java.util.Scanner;

public class Yedam {
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        
	        String name;
	        int age;
	        
	        System.out.print("이름?");
	        name = sc.next(); 
	 
	        System.out.print("나이?");
	        age= sc.nextInt();
	        
	        System.out.println(name +":" +age); 
	        sc.close();
                  
	    }
	

}
