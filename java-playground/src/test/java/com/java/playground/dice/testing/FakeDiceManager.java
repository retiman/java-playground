package com.java.playground.dice.testing;

import java.util.Random;

import com.java.playground.dice.DiceManager;


public final class FakeDiceManager implements DiceManager {
  private final Random random;

  public FakeDiceManager() {
    long seed = 100L;
    random = new Random(seed);
  }

  @Override
  public int throwDie() {
    return Math.abs(random.nextInt(5)) + 1;
  }
}
