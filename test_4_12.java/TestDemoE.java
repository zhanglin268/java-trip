import java.util.*;

public class TestDemoE {
	
	public static int  sum(int a,int b){
		
	return a + b;	
	}
	
	
	public static int sum (int a,int b,int c) {
		return a+b+c;
	}
	
	public static int sum (int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static double sum(double a,double b) {
		return a + b;
	}
	
	
	public static double sum(double a,double b,double c) {
		return a+b+c;
	}
	
	
	public static double sum(double a,double b,double c,double d) {
		return a+b+c+d;
	}
	
	//public boolean Find(int[][] arr,int target) {
		//int rows = arr.length;
		//int cols = arr[0].length;
		//int i = rows - 1;
		//int j = 0;
		//while(i >=0 && j < cols){
		//	if(target <arr[i][j]) {jiush[]
		//		i--;
		//	}
		//	else if(target>arr[i][j]) {
		//		j++;
		//	} 
		//	else 
		//		return true;
		//}
		//return false;
	//}
	
	
	//public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//int target = scan.nextInt();
		//int[][]  arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//Find(arr,target);
	//}
	

	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int RandNum = random.nextInt(100);
		System.out.println(RandNum);
		
		//while (scan.hasNextInt()) {
		//	int num = scan.nextInt();
		//	System.out.println(num);
		//}
	}
	
	
	
	public static void main2(String[] args) {
		for(byte i = 0;i <= 130;i++) {
			System.out.println(i);
		}
		
		
		//for(int  i =  1;i <= 10;i++) {
			//System.out.println(i);
		//}
	} 
	
	
	
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
		while (num <= 20) {
			if(num % 15 == 0) {
				System.out.println(num);
				//break;
				//continue;
			}
			System.out.println("hahaa");
			num++;
		}
		
	}
}