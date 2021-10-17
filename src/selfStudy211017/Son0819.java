package selfStudy211017;

public class Son0819 {

	public static void main(String[] args) {

		int i = 91234567;    //8�ڸ��� 10����
  	    float f = (float)i;  //int�� float�� ����ȯ
  	    int i2 = (int)f;     //float�� int�� ����ȯ
  	    	
  	    double d = (double)i;   //int�� double�� ����ȭ
  	    int i3 = (int)d;        //double�� �ٽ� int�� ����ȯ
    	    
  	    float f2 = 1.123456789f;
  	    double d2 = 1.123456789;
  	    
  	    
		
		
		
		System.out.printf("i=%d\n", f, i2);            //i2�� 91234567�� �ƴ� 912345678�� �� ������ �ݿø�!
		System.out.printf("f=%f i2=%d\n", f, i2);     
		System.out.printf("d=%f i3=%d\n", d, i3);
		System.out.printf("%f%n", f2);                 //float�� �Ҽ��� 6�ڸ����� ǥ���Ҽ� ������ 6->7�̵� ������ �ݿø�
		System.out.printf("%.10f%n, f2");              //float�� �Ҽ��� 6�ڸ����� ��ȿ���̴�.
		System.out.printf("%.10f", d2);               //double�� �Ҽ��� 14�ڸ����� ��ȿ���̴�.
	
	}

}
