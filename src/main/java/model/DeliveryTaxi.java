package model;

import enums.AutoMake;
import enums.TaxiClass;

public class DeliveryTaxi extends Car{
    private TaxiClass taxiClass;
    private int loadCapacity;

    public DeliveryTaxi(AutoMake autoMake, String model, int price, int maxSpeed, int fuelConsumption, TaxiClass taxiClass, int loadCapacity) {
        super(autoMake, model, price, maxSpeed, fuelConsumption);
        this.taxiClass = taxiClass;
        this.loadCapacity = loadCapacity;
    }

    public TaxiClass getTaxiClass() {
        return taxiClass;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "DeliveryTaxi{" +
                "Model = " + getAutoMake() + " " + getModel() +
                ", Price = " + getPrice() +
                ", Maximal speed = " + getMaxSpeed() +
                ", Fuel consumption = " + getFuelConsumption() +
                ", taxiClass = " + taxiClass +
                ", loadCapacity = " + loadCapacity +
                '}';
    }
}
