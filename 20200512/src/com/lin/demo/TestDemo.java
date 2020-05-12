package com.lin.demo;

import java.util.*;

/**
 * @program:20200512
 * @description
 * @author: 张林
 * @creat:2020-05-12 11:31
 **/
public class TestDemo {

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
    }
    public static void main5(String[] args) {
        Map <String,String> map = new HashMap();
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        System.out.println(map);
        System.out.println(map.get("one"));
        String s = map.getOrDefault("lisi","zhanglin");
        System.out.println(s);
        System.out.println(map.containsValue("2"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        Set < Map.Entry<String,String> > set =map.entrySet();
        for( Map.Entry<String,String> entry : set) {
            System.out.println(entry.getKey() + "=>" +entry.getValue());
        }



    }
    public static void main3(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("花和尚","鲁智深");
        map.put("黑大头","李逵");
        System.out.println(map);
        String s = map.get("及时雨");
        String s2 = map.getOrDefault("及时雨2","zhanglin");
        System.out.println(s2);
        System.out.println(s);
        System.out.println( map.containsKey("及时雨"));
        Set< Map.Entry<String,String> > set = map.entrySet();
        for(Map.Entry< String,String> entry:set) {
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }


    }

    public static void main2(String[] args) {
        Collection<String> str = new ArrayList<>();
        str.add("z");
        str.add("h");
        str.add("a");
        str.add("n");
        str.add("g");
        str.add("l");
        str.add("i");
        str.add("n");
        System.out.println(str);
        str.remove("l");
        str.remove("i");
        str.remove("n");
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.isEmpty());
        Object[] object = str.toArray();
        System.out.println(Arrays.toString(object));
        System.out.println("=============");
        for(String s: str) {
            System.out.print(s + " ");
        }





    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collection collection2 = new LinkedList();
        collection.add("zhanglin");
        //collection.add(2);泛型已经说明了 只能放字符串
        //如果要放整型
        //Collection<Integer> collection3 = new ArrayList();
        collection.add("lin");
        collection.add("nihao");
        System.out.println(collection);
        //collection.clear();
        collection.isEmpty();
        System.out.println(collection.isEmpty());
        collection.remove("nihao");
        System.out.println(collection);
        //collection.clear();
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] object = collection.toArray();
        System.out.println(Arrays.toString(object));

    }
}
