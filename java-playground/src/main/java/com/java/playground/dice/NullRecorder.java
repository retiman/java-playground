package com.java.playground.dice;

public final class NullRecorder implements EventRecorder {
  @Override
  public void recordThrowEvent(int value) {
    // Intentionally does nothing.
  }
}
