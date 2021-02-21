package com.java.playground.dice;

import java.util.Random;


public final class RealDiceManager implements DiceManager {
  private final EventRecorder eventRecorder;

  RealDiceManager(EventRecorder eventRecorder) {
    this.eventRecorder = eventRecorder;
  }

  RealDiceManager() {
    this(new NullRecorder());
  }

  @Override
  public int throwDie() {
    int value = Math.abs(new Random().nextInt(5)) + 1;

    // eventRecorder.fireThrowEvent(value);
    return value;
  }
}
