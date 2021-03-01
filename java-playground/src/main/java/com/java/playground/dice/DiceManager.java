package com.java.playground.dice;

public interface DiceManager {
  interface Factory {
    DiceManager create(Long seed);
  }
}
