package com.java.playground.dice;

import com.java.playground.dice.testing.FakeDiceManager;
import com.java.playground.dice.testing.RealEventRecorder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public final class DiceGameUsingFakeTest {
  private EventRecorder recorder;
  private DiceGame game;

  @BeforeEach
  public void setUp() {
    // recorder = new RealEventRecorder();
    game = new DiceGame(new FakeDiceManager());
  }

  @Test
  public void testAverageScore() {
    assertThat(game.averageScore()).isEqualTo(2.3333333333333335);
  }
}
