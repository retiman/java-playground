package com.java.playground.dice;

public final class DiceGame {
  private final DiceManager diceManager;

  public DiceGame(DiceManager diceManager) {
    this.diceManager = diceManager;
  }

  public double averageScore() {
    double result = 0;
    int times = 3;

    for (int i = 0; i < times; i++) {
      result += diceManager.throwDie();
    }

    return result / times;
  }
}
