package com.java.playground.dice;

import javax.inject.Provider;


final class RealDiceGame implements DiceGame {
  private final DiceManager diceManager;
  private final Provider<LegacyDiceWidget> legacyDiceWidgetProvider;
  private LegacyDiceWidget legacyDiceWidget;

  RealDiceGame(
      DiceManager.Factory diceManagerFactory,
    Provider<LegacyDiceWidget> legacyDiceWidgetProvider) {
    this.legacyDiceWidgetProvider = legacyDiceWidgetProvider;
    this.diceManager = diceManagerFactory.create(System.currentTimeMillis());
  }

  private void doSomething() {
    if (legacyDiceWidget == null) {
      legacyDiceWidget = legacyDiceWidgetProvider.get();
    }
  }
}
