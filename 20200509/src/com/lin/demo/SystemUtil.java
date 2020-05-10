package com.lin.demo;

/**
 * @program:20200509
 * @description
 * @author: 张林
 * @creat:2020-05-09 18:29
 **/
public class SystemUtil {

    public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
    }

    /*public static String replace(String str,String ret) {
        String newstr = str.replace()
    }*/

    public static void main4(String[] args) {
        String str = "zhanglin";
        String str1 = str.replace("zh","z h ");
        System.out.println(str1);
        String str2 = str.replace("ang","a1n2g3");
        System.out.println(str2);
    }
    public static void main2(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6
    }
    public static void main1(String[] args){
           System.out.println(isAdmin("Admin"));
    }
    public static int IndexOf(String str1,String str2) {
        int i = 0;
        int count = 0;
        for(i = 0;i < str1.length();i++) {
            if(str1.charAt(i) == str2.charAt(0)) {
                count = 0;
                for(int j = 0;j < str2.length();j++) {
                    if( (i+j) < str1.length()) {
                        if(str1.charAt(i+j) != str2.charAt(j)) {
                            break;
                        }
                        count++;
                    }
                }
                if (count == str2.length()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean contains(String str1,String str2) {
        int count = 0;//用于计数
        for(int i = 0;i <str1.length();i++) {
            //找第一个相同的字符
            if(str1.charAt(i) == str2.charAt(0)) {
                count = 0;
                for(int j = 0; j < str2.length();j++) {
                    if((i+j) < str1.length()) {
                        if(str1.charAt(i+j) != str2.charAt(j)) {
                            break;
                        }
                        count++;
                    }
                }
                if(count == str2.length()) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "svsajfhshdfjsffj";
        String str2 = "jfh";

        System.out.println(IndexOf(str1,str2));
        System.out.println(contains(str1,str2));
    }

}



/*
public class MyString {
    public int IndexOf(String s1, String s2) {
        int count = 0;
        // 找到第一个字符相同的位置
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                count = 0;
                // 向后遍历字符串
                for (int j = 0; j < s2.length(); j++) {
                    if (i + j < s1.length()) {
                        if (s1.charAt(i + j) != s2.charAt(j)) {
                            break;
                        }
                        count++;
                    }
                }
                if (count == s2.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}

    public String replace(int beg, String S) {
        System.out.println("请输入您要替换的字符串: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        // String 是不可修改的,就用 subString 将字符分成几部分
        S = S.substring(0, beg) + s1 +
                S.substring(beg + s1.length(), S.length());
        // 返回新的字符串
        return S;
    }

    public boolean contains(String s1, String s2) {
        // 定义一个变量记录循环走了几次
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            // 找到第一个字母相同的地方
            if (s1.charAt(i) == s2.charAt(0)) {
                // 更新变量
                count = 0;
                for (int j = 0; j < s2.length(); j++) {
                    // 防止下标越界
                    if (i + j < s1.length()) {
                        if (s1.charAt(i + j) != s2.charAt(j)) {
                            // 遇到不同的字母直接 break 跳出循环
                            break;
                        }
                        count++;
                    }
                }
                // 判断条件成立直接返回 true
                if (count == s2.length()) {
                    return true;
                }
            }
        }
        // 循环全部结束也没有符合的条件成立就返回 false
        return false;
    }

    public int compareTo(String s1, String s2) {
        int shortLen = 0;
        // 找到较短的字符串
        if (s1.length() > s2.length()) {
            shortLen = s2.length();
        }
        if (s1.length() < s2.length()) {
            shortLen = s1.length();
        }
        // 遍历短的字符串看看字符是否相同
        // 不相同返回对应的值
        for (int i = 0; i < shortLen; i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }
            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }
        // 如果相同判断两个字符串的长度
        // 如果在 shortLen 长度内相等,两个字符串相等
        // 如果不相等作比较返回对应的值
        if (s1.length() == s2.length()) {
            return 0;
        }
        return (s1.length() - s2.length() > 0) ? 1 : -1;
    }
*/
