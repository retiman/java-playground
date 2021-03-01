package com.java.playground.dice;

public final class LegacyDiceWidget {
  private LegacyDiceWidget() {
  }

  public static LegacyDiceWidget create() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return new LegacyDiceWidget();
  }
}
