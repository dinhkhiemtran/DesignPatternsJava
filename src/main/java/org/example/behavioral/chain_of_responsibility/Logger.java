package org.example.behavioral.chain_of_responsibility;

public abstract class Logger {
  private final LogLevel logLevel;
  private Logger next;

  public Logger(LogLevel logLevel) {
    this.logLevel = logLevel;
  }

  public Logger setNext(Logger next) {
    this.next = next;
    return next;
  }

  public void log(LogLevel severity, String message) {
    if (severity.getLogLevel() >= logLevel.getLogLevel()) {
      writeMessage(message);
    }
    if (next != null) {
      next.log(severity, message);
    }
  }

  protected abstract void writeMessage(String message);
}
