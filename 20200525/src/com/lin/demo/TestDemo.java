package com.lin.demo;

/**
 * @program:20200525
 * @description
 * @author: 张林
 * @creat:2020-05-25 18:12
 **/

import java.util.Objects;

/**
 *
 *         泛型
 */

class Card {
    public int rank;
    public String suit;
    public Card(int rank,String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || !(obj instanceof Card)) {
            return false;
        }
        Card tmp = (Card)obj;
        if(this.rank == tmp.rank && this.suit.equals(tmp.suit)) {
            return true;
        }
        return false;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(5,"♥");
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));//比较的是card对象的地址
        //如果要比较对象里面的东西 具体的内容 则需要重写equals方法
    }




}
