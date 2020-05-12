package com.lin.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program:20200512
 * @description
 * @author: 张林
 * @creat:2020-05-12 21:39
 **/
class Card {
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s  %d]",suit,rank);
    }


}
public class CardDemo {
    public static final String[] SUITS = { "♥","♠","♦","♣"};
    public static List<Card> buyDeck() {
        List<Card> deck = new ArrayList<>();

        for(int i = 0;i < 4;i++) {
            for(int j = 1;j <= 13;j++) {
                //int rank = j;
                //String suit = SUITS[i];
                Card card = new Card(j,SUITS[i]);
                deck.add(card);
            }
        }
        return deck;
    }
    //洗牌
    public static void swap(List<Card> deck,int index,int i) {
        //tmp = [index]
        //[index] = [i];
        //[i] = tmp;
        Card tmp = deck.get(index);
        deck.set(index,deck.get(i));
        deck.set(i,tmp);

    }
    public static void shuffle(List<Card> deck) {
        for(int i = deck.size()-1;i > 0;i--) {
            Random random = new Random();
            int index = random.nextInt(i);//随机生成一个0到i之间的数字 左闭右开
            swap(deck,index,i);
        }
    }

    public static void main(String[] args) {
        List <Card> deck  = buyDeck();
        System.out.println(deck);
        System.out.println("洗牌");
        shuffle(deck);
        System.out.println(deck);

        //三人揭牌  轮流 每人揭牌五张
        List<List<Card>> hand = new ArrayList<>();
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();
        hand.add(hands1);
        hand.add(hands2);
        hand.add(hands3);
        for(int i = 0;i < 5;i++) {
            for(int j = 0;j < 3;j++) {
                Card card = deck.remove(0);
                hand.get(j).add(card);
                //List<Card> list = hand.get(j);
                //list.add(card);


            }
        }






    }

}
