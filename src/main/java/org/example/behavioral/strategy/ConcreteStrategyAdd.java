package org.example.behavioral.strategy;

public class ConcreteStrategyAdd implements CalculateStrategy {
  @Override
  public int calculate(int a, int b) {
    return a + b;
  }
}
