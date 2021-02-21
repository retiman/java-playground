package com.java.playground.dice;

import com.java.playground.dice.testing.StubDiceManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public final class DiceGameUsingStubTest {
  private DiceGame game;

  @BeforeEach
  public void setUp() {
    game = new DiceGame(new StubDiceManager());
  }

  @Test
  public void testAverageScore() {
    assertThat(game.averageScore()).isEqualTo(3.0);
  }
}
