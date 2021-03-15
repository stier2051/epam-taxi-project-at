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

    public void setTaxiClass(TaxiClass taxiClass) {
        this.taxiClass = taxiClass;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "PassengerTaxi{" +
                "Model = " + getAutoMake() + " " + getModel() +
                ", Price = " + getPrice() +
                ", Maximal speed = " + getMaxSpeed() +
                ", Fuel consumption = " + getFuelConsumption() +
                ", taxiClass = " + taxiClass +
                ", passengerCapacity = " + passengerCapacity +
                '}';
    }
}