package com.java.playground.dice.testing;

import com.java.playground.dice.DiceManager;


public final class StubDiceManager implements DiceManager {
  @Override
  public int throwDie() {
    return 3;
  }
}
