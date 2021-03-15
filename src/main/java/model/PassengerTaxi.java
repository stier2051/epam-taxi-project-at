package model;

import enums.AutoMake;
import enums.TaxiClass;

public class PassengerTaxi extends Car{
    private TaxiClass taxiClass;
    private int passengerCapacity;

    public PassengerTaxi(AutoMake autoMake, String model, int price, int maxSpeed, int fuelConsumption, TaxiClass taxiClass, int passengerCapacity) {
        super(autoMake, model, price, maxSpeed, fuelConsumption);
        this.taxiClass = taxiClass;
        this.passengerCapacity = passengerCapacity;
    }

    public TaxiClass getTaxiClass() {
        return taxiClass;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return "PassengerTaxi{" +
                "Model = " + getAutoMake() + " " + getModel() +
                ", Maximal speed = " + getMaxSpeed() +
                ", Fuel consumption = " + getFuelConsumption() +
                '}';
    }
}
