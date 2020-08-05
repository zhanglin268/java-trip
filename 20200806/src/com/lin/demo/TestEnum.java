package com.lin.demo;

import java.lang.reflect.Constructor;

/**
 * @program:20200531
 * @description
 * @author: 张林
 * @creat:2020-06-01 15:18
 **/
public enum TestEnum {//enum代表枚举
    RED(1,"red"), BLACK(2,"black"),GREEN(3,"green"),WHITE(4,"whilte");
    public int ordinal;
    public String color;

    TestEnum(int ordinal, String color) {
        this.ordinal = ordinal;
        this.color = color;
    }
    public static TestEnum getEnumKey(int key){
        for(TestEnum t:TestEnum.values()) {
            if(t.ordinal == key) {
                return t;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(getEnumKey(2));
    }
    public static void main3(String[] args) {
        TestEnum testEnum = TestEnum.BLACK;
        TestEnum testEnum1 = TestEnum.RED;
        System.out.println(testEnum.compareTo(testEnum1));
        System.out.println(BLACK.compareTo(RED));
        System.out.println(RED.compareTo(BLACK));
    }

    public static void main2(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for(int i = 0;i < testEnums.length;i++) {
            System.out.println(testEnums[i] +  " " +testEnums[i].ordinal());
        }
    }

    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("white");
                break;
            case GREEN:
                System.out.println("green");
                break;
            default:
                break;
        }
    }
}
