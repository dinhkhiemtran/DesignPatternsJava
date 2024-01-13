package org.example.behavioral.strategy;

public class ConcreteStrategySubtract implements CalculateStrategy{
  @Override
  public int calculate(int a, int b) {
    return a - b;
  }
}
