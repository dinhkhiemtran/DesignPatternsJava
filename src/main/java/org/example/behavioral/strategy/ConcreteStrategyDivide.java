package org.example.behavioral.strategy;

public class ConcreteStrategyDivide implements CalculateStrategy {
  @Override
  public int calculate(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException arithmeticException) {
      throw new ArithmeticException(arithmeticException.getMessage());
    }
  }
}
