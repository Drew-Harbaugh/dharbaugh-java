package com.techelevator;


import com.techelevator.playingcards.Card;

public class Lecture {

    public static void main(String[] args) {

        Card myCard = new Card("Hearts");
        myCard.setRank("Queen");

        System.out.println(myCard.getSuit());

        myCard.setFaceUp(true);
        Card yourCard = new Card();
        System.out.println(yourCard.getSuit());

        myCard.flip();

        if (myCard.isFaceUp()){
            System.out.println("My card is face up.");
        } else {
            System.out.println("My card is face down.");
        }

        yourCard.setSuit("Spades");
        yourCard.setRank("Jack");

        System.out.println(myCard.getName());
        System.out.println(yourCard.getName());

        System.out.println("My card has a value of " + myCard.getValue());

        if (myCard.isHigherThan(yourCard)) {
            System.out.println("I win.");
        } else {
            System.out.println("You win.");
        }

    }
}
