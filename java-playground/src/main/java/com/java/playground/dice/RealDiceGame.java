package com.java.playground.dice;

final class RealDiceGame implements DiceGame {
  private final LegacyDiceWidget legacyDiceWidget;
  private final DiceManager diceManager;

  RealDiceGame(
      LegacyDiceWidget legacyDiceWidget,
      DiceManager.Factory diceManagerFactory) {
    this.legacyDiceWidget = legacyDiceWidget;
    this.diceManager = diceManagerFactory.create(System.currentTimeMillis());
  }
}
