package org.example.behavioral.chain_of_responsibility;

public class AppLogger {
  public Logger getLogger() {
    Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);
    Logger filterLogger = consoleLogger.setNext(new FilterLogger(LogLevel.DEBUG));
    filterLogger.setNext(new EmailLogger(LogLevel.FATAL));
    return consoleLogger;
  }
}
