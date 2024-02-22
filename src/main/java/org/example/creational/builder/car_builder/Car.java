package org.example.creational.builder.car_builder;

public class Car {
  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GPSNavigator gpsNavigator;
  private double fuel = 0;

  public CarType getCarType() {
    return carType;
  }

  public double getFuel() {
    return fuel;
  }

  public Engine getEngine() {
    return engine;
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public GPSNavigator getGpsNavigator() {
    return gpsNavigator;
  }

  private Car(Builder builder) {
    this.carType = builder.carType;
    this.seats = builder.seats;
    this.engine = builder.engine;
    this.transmission = builder.transmission;
    this.tripComputer = builder.tripComputer;
    if (this.tripComputer != null) {
      this.tripComputer.setCar(this);
    }
    this.gpsNavigator = builder.gpsNavigator;
  }

  public static class Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Builder() {
    }

    public Builder carType(CarType carType) {
      this.carType = carType;
      return this;
    }

    public Builder seats(int seats) {
      this.seats = seats;
      return this;
    }

    public Builder engine(Engine engine) {
      this.engine = engine;
      return this;
    }

    public Builder transmission(Transmission transmission) {
      this.transmission = transmission;
      return this;
    }

    public Builder tripComputer(TripComputer tripComputer) {
      this.tripComputer = tripComputer;
      return this;
    }

    public Builder gpsNavigator(GPSNavigator gpsNavigator) {
      this.gpsNavigator = gpsNavigator;
      return this;
    }

    public Builder fuel(double fuel) {
      this.fuel = fuel;
      return this;
    }
    public Car build() {
      return new Car(this);
    }
  }
  public String print() {
    String info = "";
    info += "Type of car: " + carType + "\n";
    info += "Count of seats: " + seats + "\n";
    info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
    info += "Transmission: " + transmission + "\n";
    if (this.tripComputer != null) {
      info += "Trip Computer: Functional" + "\n";
    } else {
      info += "Trip Computer: N/A" + "\n";
    }
    if (this.gpsNavigator != null) {
      info += "GPS Navigator: Functional" + "\n";
    } else {
      info += "GPS Navigator: N/A" + "\n";
    }
    return info;
  }
}
