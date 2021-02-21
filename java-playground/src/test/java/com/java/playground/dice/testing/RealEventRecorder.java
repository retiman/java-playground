package com.java.playground.dice.testing;

import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.java.playground.dice.EventRecorder;


public final class RealEventRecorder implements EventRecorder {
  private final List<Integer> events;

  public RealEventRecorder() {
    events = new LinkedList<>();
  }

  @Override
  public void recordThrowEvent(int value) {
    events.add(value);
  }

  public List<Integer> getEvents() {
    return ImmutableList.copyOf(events);
  }
}
