public class TestDemoA { 
public static void main(String[] args) {
	final int MAXNUM = 10;
	System.out.println(MAXNUM);
	
}





/**
*�ַ���ƴ��
*
*/
public static void main11(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("a = " + a + ",b = " + b);
	
}





/**
*�ֽ��������͡�     С���ĸ��ֽڵ��������� �����ʱ��ط������͵�����
*
*/
public static void main10(String[] args ) {
	//String str = "\"hello\"";
	//System.out.println(str);
	//byte b = 10;
	//byte c = 20;
	//byte d = b + c;
	//byte b = 10;
	//byte c = 20;
	//int d = b + c;
	//System.out.println(d);
	
	byte b = 10;
	byte c = 20;
	byte d =(byte)( b + c);
	System.out.println(d);
	
}






/**
*�������ͣ�
*��java�в�������û����ȷ�Ĵ�С
*/
public static void main9(String[] args) {
	boolean flg = false;
	System.out.println(flg);
	
	
}




/**
*������ short  2���ֽ�
*/
public static void main8(String[] args) {
	short sh = 12;
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);


}

	/**
	*byte һ���ֽ�
	*/
	public static void main7(String[] args) {
		byte b = 12;
		byte c = 21;
		System.out.println(b + c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int d = Byte.MAX_VALUE+1;
		System.out.println(d);//Ĭ���������ν��д�ӡ��
		//byte e = 130;
		
		
		
		
	}
	
	public static void main6(String[] args) {
		
		//char �����ֽ� 
		char ch = 'a';
		System.out.println(ch);
		char ch2 = '��';
		System.out.println(ch2);
		char ch3 = 97;
		System.out.println(ch3);
	}
	
	
	public static void main5(String[] args) {
		//float f = 12.3;
		float f = 12.3f;
		System.out.println(f);
	}
	
	public static void main4(String[] args) {
		////byte a = 130;
		//float  b = 3.5;
		//System.out.println(a);
		//System.out.println(b);
		//double x = 2.0;
		//int    y = 4;
		//x /=++y;
		//System.out.println(x);
		//short a = 128;
		//byte  b = (byte) a;
		//System.out.println(a);
		//System.out.println(b);
		//double d = 12.5;
		//System.out.println(d);
		//System.out.println(Double.MAX_VALUE);
		//System.out.println(Double.MIN_VALUE);
		//int a = 1;
		//double b = 2.0;
		//System.out.println(a / b);
		//double num = 1.1;
		//System.out.println(num * num);
		//int a = 3;
		//byte b = a;
		////System.out.println(a);
		//System.out.println(b);
		
	}
	
	
	
	/**
     *String[] args ����ʲô
	 */
	
	public static void main2(String[] args) {
	     for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		 }
	      System.out.println("kaixin");
	}
	
	
	
	
	
	
	
	/**
	*���ⳤ����
	*/
	public static void main1(String[] args) {
  	long a = 10L;
	System.out.println("���ֵ��" +  Long.MAX_VALUE);
	System.out.println("��Сֵ��" +  Long.MIN_VALUE);
	
	
  	System.out.println("���ֵ�ǣ�" + a);
	int b = 10;
	int c = 20;
	System.out.println(b + c);
	System.out.println("hahaha"+ b + c);
	
	//�κ����͵����ݺ��ַ���ƴ�Ӷ����ַ���
	//	System.out.println("kaishijintiandedaima");

	}
}