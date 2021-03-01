package com.java.playground.dice;

import javax.inject.Inject;

import com.google.inject.assistedinject.Assisted;


final class RealDiceManager implements DiceManager {
  @Inject
  public RealDiceManager(@Assisted Long seed) {
  }
}
