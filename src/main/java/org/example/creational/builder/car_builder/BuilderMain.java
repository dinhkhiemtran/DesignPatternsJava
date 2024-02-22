package org.example.creational.builder.car_builder;

import java.lang.reflect.Field;

public class BuilderMain {
  public static void main(String[] args) {
    Car car = new Car.Builder()
        .engine(new Engine(1.1,1.2))
        .fuel(1.3)
        .carType(CarType.CITY_CAR)
        .gpsNavigator(new GPSNavigator())
        .seats(4)
        .transmission(Transmission.AUTOMATIC)
        .tripComputer(new TripComputer())
        .build();
    System.out.println(car.print());
  }
}
