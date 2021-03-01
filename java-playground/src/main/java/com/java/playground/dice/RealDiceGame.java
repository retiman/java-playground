package com.java.playground.dice;

import javax.inject.Inject;


final class RealDiceGame implements DiceGame {
  private final DiceManager diceManager;

  @Inject
  RealDiceGame(DiceManager.Factory diceManagerFactory) {
    diceManager = diceManagerFactory.create(System.currentTimeMillis());
  }
}
