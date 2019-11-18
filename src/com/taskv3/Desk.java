package com.taskv3;

import static java.util.stream.IntStream.range;

public class Desk {

    private Card[] cards;

    public Desk() {
        this(true);
    }

    public Desk(boolean includeJokers) {
        int cardId = 0;
        if(includeJokers) {
            cards = new Card[54];
            cards[cardId] = new Card(1, 0);
            cardId++;
            cards[cardId] = new Card(2, 0);
            cardId++;
        } else {
            cards = new Card[52];
        }
//        for(CardType cardType: CardType.values()) {
//            if(cardType != CardType.Joker) {
//                final int id = cardId;
//                range(0, 12).forEach(i -> {
//                    cards[id] = new Card(i, cardType);
//                    cardId++;
//                });
//
//
//            }
//        }
    }
}
