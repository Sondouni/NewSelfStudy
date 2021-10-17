package selfStudy211017;

import java.util.Scanner;

public class Pluss {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x; // ù��° ���� ����
		int y; // �ι�° ���� ����
		int sum; //
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		x = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
	}

}
