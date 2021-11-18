package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Game {
    ArrayDeque<Integer> player1 = new ArrayDeque<Integer>();
    ArrayDeque<Integer> player2 = new ArrayDeque<Integer>();
    Scanner in = new Scanner(System.in);

    void creatPlayer1(){
        System.out.println("Enter nominal of cards for the player1:");
        String s1 = in.nextLine();
        char[] chars1 = s1.toCharArray();
        for (int i = chars1.length-1; i>=0; i--){
            if ((chars1[i] >= '0') && (chars1[i] <= '9')){
                int chars = chars1[i] - '0';
                player1.add(chars);
            }
        }
    }

    void creatPlayer2(){
        System.out.println("Enter nominal of cards for the player2:");
        String s2 = in.nextLine();
        char[] chars2 = s2.toCharArray();
        for (int i = chars2.length-1; i>=0; i--){
            if ((chars2[i] >= '0') && (chars2[i] <= '9')){
                int chars = chars2[i] - '0';
                player2.add(chars);
            }
        }
    }

    void playGame(){
        for (int i = 0; i <=106; i++){
            if (player1.isEmpty()) {
                System.out.println("Second " + i);
                break;
            }

            if (player2.isEmpty()) {
                System.out.println("First " + i);
                break;
            }

            int card1 = player1.pop();
            int card2 = player2.pop();

            if (card1 > card2){
                if (card1 == 9 && card2 == 0) {
                    player2.addFirst(card2);
                    player2.addFirst(card1);
                }
                else{
                    player1.addFirst(card1);
                    player1.addFirst(card2);
                }
            }

            else{
                if (card1 == 0 && card2 == 9) {
                    player1.addFirst(card1);
                    player1.addFirst(card2);
                }
                else {
                    player2.addFirst(card2);
                    player2.addFirst(card1);
                }
            }
        }
    }
}
