package com.taskv3;

import java.util.Objects;

public class Card implements Comparable {
    private final int suit;
    private final int rank;

    public final static int ACE = 1;      // Codes for the non-numeric cards.
    public final static int JACK = 11;    //   Cards 2 through 10 have their
    public final static int QUEEN = 12;   //   numerical values for their codes.
    public final static int KING = 13;


    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades", "Jokers"};
    public static final String[] RANKS = {null, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static final String[] JOKERS = {"black", "red"};

    public Card(int rank, int suit) {
        if(suit < 0 || suit > 3) {
            throw new IllegalArgumentException("Invalid suit for card");
        }
//        if(rank < 0 )
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || getClass() != o.getClass()) throw new IllegalArgumentException("Not a Card to compare");
        Card that = (Card) o;
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
}
