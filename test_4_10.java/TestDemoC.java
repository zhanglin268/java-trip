import java.util.Scanner;
public class TestDemoC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pd = scan.nextLine();
		int count = 0;
		while(scan.hasNextLine()) {
			
			if(pd.equals("123456")) {
				System.out.println("密码正确");
				break;
			}
			else {
				System.out.println("密码错误,请重新输入");
			    count++	;
			}
			if(count == 3) {
				System.out.println("密码错误超过三次，退出程序！");
				break;
			}
		
		}
		
		
		
		
		
		
		/*Scaner scan = new Scanner(System.in);
		String pd = scan.nextLine();
		int count = 0;
		for(i = 1;i <= 3;i++0) {
			if(pd.equals("123456")) {
				System.out.println("密码正确");
			}
			else {
				System.out.println("密码错误");
			}
		}
		*/
		
	
		
	}
	
	
	
	
	public static void main15(String[] args) {
	   int i = 0;
	   int count = 0;
	    for(i = 1;i <= 100;i++) {
		    if((i % 10) == 9){
			count++;
			}
		    if((i / 10) == 9) {
			count++;
		    }
		
	    }
		System.out.println(count);
    }
	
	
	
	
	
	public static void main14(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double i = 1.0;
		double ret = 1.0;
		int k = 1;
		double sum = 0.0;
		for(i = 1;i <= n;i++) {
			ret = k / i;
			k *=(-1);
			sum += ret;
		}
		System.out.println(sum);
	}
	
	
	
	
	public static void main13(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int tmp = 0;
	    while((a%b)!= 0) {
			tmp = a%b;
			a = b;
			b = tmp;
		} 
		if((a%b)== 0){
			System.out.println("最大公约数是" + b);
		}
	}
	
	
	
	
	public static void main12(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int j = 1;
		for(i = 1;i <= n;i++) {
			for(j = 1;j <= i;j++) {
				System.out.print(i + "*" + j + "=" +(i*j) + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	public static void main11(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int ret = scan.nextInt();
		int i = 1;
		int n = 1;
		while(n <= ret) {
			for(i = 2;i < n ;i++) {
			    if((n % i) == 0) {
				   System.out.println( n + "不是是素数！");
				   break;
			    }
		
		    }
		        if(i == n) {
			        System.out.println( n + "是素数");
		        }
				n++;
		}
	}
	
	
	
	public static void main10(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		int i = 1;
		for(i = 2;i < n ;i++) {
			if((n % i) == 0) {
				System.out.println( n + "不是是素数！");
				break;
			}
		
		}
		if(i == n) {
			System.out.println( n + "是素数");
		}
		
		
	}
	
	
	
	
	public static void main9(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 18) {
			System.out.println("少年");
		}else if(age <= 28) {
			System.out.println("青年");
			
		}else if(age <= 55) {
			System.out.println("中年");
		} else {
			System.out.println("老年");
		}
	}
	
	
	
	
	
	public static void main8(String[] args) {
		int i = 1;
		int ret = 1;
		int sum = 0;
		while(i <= 5) {
			ret *= i;
			sum += ret;
			i++;
		}
		System.out.println(sum);
	}
	
	
	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//不能做switch参数的类型有哪些？
		//long float double boolean
		switch (n) {
			case 1:
			System.out.println("1");
			break; 
			case 2:
			System.out.println("2");
			break;
			default:
			System.out.println("请输入正确的数字：");
			
		}
		
	}
	
	
	
	
	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in);
		/**
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "是偶数！");
			
		} else {
			System.out.println( num +"是奇数!");
		}
		
		if(num > 0) {
			System.out.println(num + "是正数！");
			
		}else if (num < 0) {
			System.out.println(num + "是负数！");
		}else {
			System.out.println(num +"是0" );
		}
		*/
		
		
		
		
		while(scan.hasNextInt()) {
		//	int num = scan.nextInt();
			int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "是偶数！");
			
		} else {
			System.out.println( num +"是奇数!");
		}
		
		if(num > 0) {
			System.out.println(num + "是正数！");
			
		}else if (num < 0) {
			System.out.println(num + "是负数！");
		}else {
			System.out.println(num +"是0" );
		}
			
			
			
			
			
			if((num%4==0 && num%100!=0) || (num%400==0) ) {
			     System.out.println(num + "是闰年");
		    }else {
			System.out.println(num + "不是闰年！");
		    }
		}
		
		
	}
	
	
	
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String str = scan.nextLine();
		String str = scan.next();
		System.out.println(str);
		
		
		//int a = scan.nextInt();
		//System.out.println(a);
		
	}
	public static void main4(String[] args) {
		
		
		int a = 10;
		int b = 20;
		int c = a > b? a : b;
		System.out.println(c);
		System.out.println(a >> 2);
		System.out.println(a << 2);
		
		
		
		//int a = 10;//00000000 00000000 00000000 00001010
		
		//int b = 20;//00000000 00000000 00000000 00010100
		//System.out.println(~a);//11111111 11111111 11111111 11110101
		                       //10000000 00000000 00000000 00001011
		//System.out.println(a & b);//
		//System.out.println(a | b);
		//System.out.println(a^b);//00000000 0000000 00000000 00011110
		/**int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		
		System.out.println(!(a < b));
		*/
		//System.out.println(10 > 20 && 10/0==2);
		
		
		
	}
	
	
	
	public static void main3(String[] args) {
		int a = 10;
		int b = ++a;
		System.out.println(b);
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		
		int i = 10;
		i = i++;
		System.out.println(i);
	}
	
	
	
	
	
	public static  void main2(String[] args) {
		System.out.println(10 % 3);
		System.out.println(-10 % 3);
		System.out.println(10 % 3);
		System.out.println((float)(-10%3));
		System.out.println(11.5 % 2.0);
	}
	public static void main1(String[] args) {
		System.out.println(5 / 2);
		System.out.println(5.0 / 2);
		System.out.println((float)5 / 2);
		System.out.println((float)(5/2));
		
		
		
		
		
		
		//System.out.println("hello");
	}
}