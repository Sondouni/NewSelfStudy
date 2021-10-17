package selfStudy211017;

import java.util.Scanner;

public class Sonscanner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
        System.out.println("�Է³���: " + input);
        System.out.printf("num=%d%n", num);
         */
      
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.?");
		
		int input = scanner.nextInt();
		
		System.out.println("�Է³���:" + input);
		System.out.printf("num=%d%n", input);
		
		scanner.close();
		
	}

}
