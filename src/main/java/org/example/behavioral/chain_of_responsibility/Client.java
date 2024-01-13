package org.example.behavioral.chain_of_responsibility;

public class Client {
  public static void main(String[] args) {
    AppLogger appLogger = new AppLogger();
    Logger logger = appLogger.getLogger();
    logger.log(LogLevel.INFO, "Info message");
    logger.log(LogLevel.DEBUG, "Debug message");
    logger.log(LogLevel.ERROR, "Error message");
    logger.log(LogLevel.FATAL, "Factual message");
  }
}


