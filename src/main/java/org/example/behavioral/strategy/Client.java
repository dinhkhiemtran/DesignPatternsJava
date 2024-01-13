package org.example.behavioral.strategy;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Add number A: ");
    int numberA = scanner.nextInt();
    System.out.print("Add number B: ");
    int numberB = scanner.nextInt();
    System.out.print("Could you please input an operator: ");
    String operator = scanner.next();
    Context context = new Context();
    if ("+".equalsIgnoreCase(operator)) {
      context.setCalculateStrategy(new ConcreteStrategyAdd());
    } else if ("-".equalsIgnoreCase(operator)) {
      context.setCalculateStrategy(new ConcreteStrategySubtract());
    } else if ("*".equalsIgnoreCase(operator)) {
      context.setCalculateStrategy(new ConcreteStrategyMul());
    } else if ("/".equalsIgnoreCase(operator)) {
      context.setCalculateStrategy(new ConcreteStrategyDivide());
    } else {
      System.out.println("Operator invalid!");
    }
    int result = context.executeStrategy(numberA, numberB);
    System.out.println(result);
  }
}
