package com.java.playground.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public final class DiceTest {
  private DiceGame game;

  @BeforeEach
  public void setUp() {
    game = new DiceGame(new RealDiceManager());
  }

  @Test
  public void testAverageScore() {
    assertThat(game.averageScore()).isEqualTo(3);
  }
}
