package selfStudy211017;

import java.util.Scanner;

public class Letzteaufgabe {

	public static void main(String[] args) {
		
		 
		 System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int input = scanner.nextInt();
	
		 scanner.close();
		 
		 if(input == 0) {
			 System.out.println("�Է� �Ͻ� ���ڴ� 0 �Դϴ�.");
			 
		 }
		 if(input !=0) {
			 System.out.println("�Է� �Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			 System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�.", input);
		 }
		
	}

}
