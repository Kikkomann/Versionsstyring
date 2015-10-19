import java.lang.Math;
import java.util.Scanner;

public class hsa {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		 
		 double a = scan.nextDouble();
		 double b = scan.nextDouble();
		 double x = scan.nextDouble();
		 double y = scan.nextDouble();
		 
		
		double afstand = Math.abs(a*x-y+b)/Math.sqrt(1+a*a);
		
		System.out.println(afstand);
	
		scan.close();
		
	}

}	
