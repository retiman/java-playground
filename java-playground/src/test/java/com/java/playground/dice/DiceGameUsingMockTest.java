package com.java.playground.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public final class DiceGameUsingMockTest {
  private DiceManager mockDiceManager;
  private DiceGame game;

  @BeforeEach
  public void setUp() {
    mockDiceManager = mock(DiceManager.class);
    when(mockDiceManager.throwDie()).thenReturn(1, 2, 3);

    game = new DiceGame(
        new NullRecorder(),
        mockDiceManager);
  }

  @Test
  public void testAverageScore() {
    assertThat(game.averageScore()).isEqualTo(2.0);

    verify(mockDiceManager, times(3)).throwDie();
  }
}
