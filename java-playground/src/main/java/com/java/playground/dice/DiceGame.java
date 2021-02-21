package com.java.playground.dice;

public final class DiceGame {
  private final EventRecorder eventRecorder;
  private final DiceManager diceManager;

  public DiceGame(
      EventRecorder eventRecorder,
      DiceManager diceManager) {
    this.eventRecorder = eventRecorder;
    this.diceManager = diceManager;
  }

  public double averageScore() {
    double result = 0;
    int times = 3;

    for (int i = 0; i < times; i++) {
      int value = diceManager.throwDie();
      eventRecorder.recordThrowEvent(value);

      result += value;
    }

    return result / times;
  }
}
