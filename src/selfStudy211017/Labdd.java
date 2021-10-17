package selfStudy211017;

import java.util.Scanner;

public class Labdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		double w;
		double h;
		double weit;
		double around;
		
		
		System.out.print("����: ");
		w = input.nextDouble();
		System.out.print("����: ");
		h = input.nextDouble();
		
		weit = w * h;
		System.out.println(weit);
		around = (w+h)*2.0;
	    System.out.println(around);
	    

	    input.close();
	    
	 

		
		
		
		
	}

}
