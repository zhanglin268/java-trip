//import java.util.Scanner;
import java.util.*;



public class TestDemoD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字：");
		int num = scan.nextInt();
		int i = 0;
		int j = 1;
		for(i= 1;i <= num;i++) {
			for(j = 1;j <= i;j++) {
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void fun(int num) {
		if(num > 9) {
			fun(num / 10);
		}
		System.out.print(num%10 + " ");
	}
	
	
	public static void main13(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字：");
		int num = scan.nextInt();
		fun(num);
	}
	
	
	
	public static void main12(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 3;
		while (count != 0) {
			System.out.println("请输入密码：");
			String pd = scan.nextLine();
			if(pd.equals("123456")) {
				System.out.println("密码正确，登录成功！");
				break;
			} else {
				count--;
				System.out.println("你还有" + count+ "次机会！");
			}
				
		}
		
	}
	
	
	
	public static void main11(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0;//00000000 00000000 00000000 01010110
		//00000000 00000000 00000000 00001010
		
		System.out.println("这是奇数序列：");
		for(i = 30;i >= 0;i -= 2) {
			System.out.print(((num>>i)&1) );
			
		}
		System.out.println();
		
		System.out.println("这是偶数序列：");
		for(i = 31;i >=0;i -= 2) {
			System.out.print(((num>>i)&1 ));
		}
	}
	
	
	public static void main10(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int count = 0;
		// 15 00000000 00000000 00000000 00001111
		      //00000000 00000000 00000000 00000001
		int i = 0;
		for(i=0;i<32;i++) {
			if(((a>>i)& 1) == 1) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	
	public static void main9(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ret = b;
		while(a%b!=0) {
		ret = a%b;
		a = b;
		b = ret;
		}
		System.out.println("a" + "和" +"b" + "最大公约数是：" + b);
		
	}
	
	
	public static void main8(String[] args) {
		
		int i = 0;
		double sum = 0;
		int flg = 1;
		for (i = 1;i <= 100;i++ ) {
			sum += 1.0/i*flg;
			flg *=-1;
		}
		System.out.println(sum);
	}
	
	
	public static void main7(String[] args) {
		for(int i = 1;i <= 9999;i++) {
			int count = 0;
			int ret = i;
			while (ret != 0) {
				count++;
				ret = ret/10;//计算有几位数
			}
			int sum = 0;
			ret = i;
			while (ret != 0) {
				sum += Math.pow(ret%10,count); //计算每一位数的count次方
				ret = ret/10;
			}
			if(sum==i) {
				System.out.println(sum + "是想要的数字");
			}
		}
		
	}
	
	
	
	
	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		Random random = new Random();
		int RandNum = random.nextInt(100)+100;
		System.out.println(RandNum);
		while(true) {
			System.out.println("请输入你猜的数字：");
			
			int n = scan.nextInt();
			if(n < RandNum) {
				System.out.println("你猜的数字小了！");
			}
			else if(n == RandNum) {
				System.out.println("猜对了！");
				
			} else {
				System.out.println("你猜的数字大了");
			}
		}
	}
	
	
	
	
	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age <= 18) {
			System.out.println("少年");
			
		}
		else if(age <= 28) {
			System.out.println("青年");
			
		}
		else if(age <= 55) {
			System.out.println("中年");
		}
		else {
			System.out.println("老年");
		}
	}
	
	
	public static void main4(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		for(i = 2;i < n;i++) {
			if(n%i == 0) {
				System.out.println(n + "不是素数！");
				break;
			}
			if (i==n) {
				System.out.println(n + "是素数！");
			}
		}
	}
	
	
	
	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int j = 0;
		for(i = 1;i <= n;i++) {
			for(j=2;j < i;j++) {
				if((i%j)==0) {
					//System.out.println(i + "不是素数！");
					break;
				}
			}
			if(j == i ) {
				System.out.println(i + "是素数！");
			}
		}
	}
	
	
	
	
	public static void main2(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int i = 0;
		for(i=1000;i <= 2000;i++) {
			if((i%4)==0 && (i%100)!=0 || (i%400)==0){
				System.out.println(i + "是闰年!");
			}
		}
		
		
	}
	
	
	
	
	
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int count = 0;
		for(i = 1;i <= n;i++) {
			if((i%10)==9) {
				count++;
			}
			else if((i/10)==9) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}