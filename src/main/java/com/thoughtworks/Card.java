package com.thoughtworks;

public class Card {
  private String cardPoint;  // 2~10, A, J, Q, K
  private String suit;       // "黑桃","红桃","梅花","方片"

  public Card(int cardPoint, String suit) {
    this.cardPoint = formatPokerPoint(cardPoint);
    this.suit = suit;
  }

  private String formatPokerPoint(int number) {
    switch (number) {
      case 1:
        return "A";
      case 11:
        return "J";
      case 12:
        return "Q";
      case 13:
        return "K";
      default:
        return String.valueOf(number);
    }
  }

  @Override
  public String toString() {
    return String.format("%s%s ", suit, cardPoint);
  }
}
