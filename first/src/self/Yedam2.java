package self;
import java.util.Scanner;
public class Yedam2 {
	 public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
      
      String name;
      double weight;
      double hight;
      
      System.out.print("이름?");
      name = sc.next(); 

      System.out.print("몸무게?");
      weight= sc.nextInt();
      
      System.out.print("키?");
      hight= sc.nextInt();
      
      
      
      System.out.println(name +"의" +"비만도:"+(weight/(hight*hight)*10000));
      sc.close();
	
	 }
}
