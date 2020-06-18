import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program:20200616
 * @description
 * @author: 张林
 * @creat:2020-06-17 00:31
 **/


public class LianXi {


    public static void main(String[] args) {
        //char[] arr = {'a','b','c'};
        String arr = "abcde";
        StringBuffer sb = new StringBuffer(arr);
        System.out.println(sb.reverse());
        int[] rrr = {1,3,4,5,3};
        System.out.println(Arrays.toString(rrr));
    }







    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int next = scan.nextInt();
           if(next == 0) {
               return ;
           }
                HashMap<Integer,Integer> map = new HashMap<>();
                int N = next;
                for(int i = 0;i < N;i++) {
                    int score = scan.nextInt();
                    if(map.get(score) == null) {
                        map.put(score,1);
                    }else{
                        int count = map.get(score);
                        map.put(score,count+1);
                    }
                }
                int goal = scan.nextInt();
                if(map.containsKey(goal)) {
                    System.out.println(map.get(goal));
                }else {
                    System.out.println(0);
                }


            //  next = scan.nextInt();
        }
    }



}
