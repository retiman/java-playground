package com.java.playground.dice;

final class RealDiceGame implements DiceGame {
  private final DiceManager diceManager;

  RealDiceGame(DiceManager.Factory diceManagerFactory) {
    diceManager = diceManagerFactory.create(System.currentTimeMillis());
  }
}
