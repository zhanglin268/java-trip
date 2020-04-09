public class TestDemoA { 
public static void main(String[] args) {
	final int MAXNUM = 10;
	System.out.println(MAXNUM);
	
}





/**
*字符串拼接
*
*/
public static void main11(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("a = " + a + ",b = " + b);
	
}





/**
*字节数据类型、     小于四个字节的数据类型 运算的时候回发生类型的提升
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
*布尔类型：
*在java中布尔类型没有明确的大小
*/
public static void main9(String[] args) {
	boolean flg = false;
	System.out.println(flg);
	
	
}




/**
*短整形 short  2个字节
*/
public static void main8(String[] args) {
	short sh = 12;
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);


}

	/**
	*byte 一个字节
	*/
	public static void main7(String[] args) {
		byte b = 12;
		byte c = 21;
		System.out.println(b + c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int d = Byte.MAX_VALUE+1;
		System.out.println(d);//默认是以整形进行打印的
		//byte e = 130;
		
		
		
		
	}
	
	public static void main6(String[] args) {
		
		//char 两个字节 
		char ch = 'a';
		System.out.println(ch);
		char ch2 = '高';
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
     *String[] args 代表什么
	 */
	
	public static void main2(String[] args) {
	     for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		 }
	      System.out.println("kaixin");
	}
	
	
	
	
	
	
	
	/**
	*讲解长整形
	*/
	public static void main1(String[] args) {
  	long a = 10L;
	System.out.println("最大值：" +  Long.MAX_VALUE);
	System.out.println("最小值：" +  Long.MIN_VALUE);
	
	
  	System.out.println("最大值是：" + a);
	int b = 10;
	int c = 20;
	System.out.println(b + c);
	System.out.println("hahaha"+ b + c);
	
	//任何类型的数据和字符串拼接都是字符串
	//	System.out.println("kaishijintiandedaima");

	}
}