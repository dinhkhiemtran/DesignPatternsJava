package org.example.behavioral.strategy;

public class Context {
  private CalculateStrategy calculateStrategy;

  public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
    this.calculateStrategy = calculateStrategy;
  }

  public int executeStrategy(int a, int b) {
    return calculateStrategy.calculate(a, b);
  }
}
