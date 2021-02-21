package com.java.playground.dice;

import java.util.Random;


public final class RealDiceManager implements DiceManager {
  @Override
  public int throwDie() {
    return Math.abs(new Random().nextInt(5)) + 1;
  }
}
