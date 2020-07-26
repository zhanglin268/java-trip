package com.lin.demo2;

import java.util.*;

/**
 * @program:20200527
 * @description
 * @author: 张林
 * @creat:2020-05-27 23:50
 **/


public class TestDemo {
        //宝石问题
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String expected = scanner.nextLine();//7_This_is_a_test
            String actual = scanner.nextLine();//_hs_s_a_es

            //1、把实际的字符转换为大写存放到集合当中
            HashSet<Character> setActual = new HashSet<>();
            for (char s : actual.toUpperCase().toCharArray()) {
                setActual.add(s);
            }
            HashSet<Character> set = new HashSet<>();
            for(char e : expected.toUpperCase().toCharArray()) {
                if(!setActual.contains(e)) {
                    set.add(e);
                }
            }

        }





    /**
     *
     * 10万个数据，统计重复的数字及出现的次数
     * @param args
     */
    public static void main6(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 100000;i++) {
            list.add(random.nextInt(10000));//10000表示随机生成数字的范围
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer key:list) {
            if(map.get(key) == null) {
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for(Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+"这个数字出现了" +entry.getValue()+"次");
        }
    }

    /**
     * 大数据的去重问题
     * @param args
     */
    public static void main5(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 100000;i++) {
            list.add(random.nextInt(10000));//10000表示随机生成数字的范围
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer val : list) {
            set.add(val);
        }
        //set.addAll();
        System.out.println(set);
    }


    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 100000;i++) {
            list.add(random.nextInt(10000));//10000表示随机生成数字的范围
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer val : list) {
            if(set.contains(val)) {
                System.out.println("找到了第一个重复的数字");
                return;
            }else {
                set.add(val);
            }
        }
    }

    public static void main3(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(9);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();//迭代器
        while(it.hasNext()) {
            System.out.println(it.next());//打印it的下一个并且向后走一个
        }

    }
    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"jf");
        map.put(2,"sjj");
        map.put(3,"jfsjk");
        map.put(4,"asjk");
        //System.out.println(map);
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
            //entry.getKey() 拿到key
            //entry.getValue()  拿到value值
        }
    }

    public static void main12(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
}
