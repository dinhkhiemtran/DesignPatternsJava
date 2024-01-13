package org.example.behavioral.chain_of_responsibility;

public enum LogLevel {
  NONE(0), INFO(1), DEBUG(2), WARNING(4), ERROR(8), FATAL(16), ALL(32);
  private final int logLevel;

  private LogLevel(int logLevel) {
    this.logLevel = logLevel;
  }

  public int getLogLevel() {
    return logLevel;
  }
}
