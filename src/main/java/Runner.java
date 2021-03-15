import enums.AutoMake;
import enums.TaxiClass;
import model.Car;
import model.DeliveryTaxi;
import model.PassengerTaxi;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Runner {
    static Logger logger = Logger.getGlobal();
    static List<Car> cars = Arrays.asList(
            new PassengerTaxi(AutoMake.HYUNDAI, "Accent", 6000000, 160, 6, TaxiClass.ECONOM, 3),
            new PassengerTaxi(AutoMake.TOYOTA, "Corolla", 9000500, 160, 6, TaxiClass.ECONOM, 3),
            new PassengerTaxi(AutoMake.LADA, "Vesta", 5500000, 150, 7, TaxiClass.ECONOM, 4),
            new PassengerTaxi(AutoMake.MAZDA, "5", 8345200, 170, 10, TaxiClass.COMFORT, 7),
            new PassengerTaxi(AutoMake.MAZDA, "CX5", 12500300, 180, 9, TaxiClass.COMFORT, 3),
            new PassengerTaxi(AutoMake.NISSAN, "Murano", 18350332, 175, 11, TaxiClass.BUSINESS, 3),
            new PassengerTaxi(AutoMake.KIA, "Carnival", 2543900, 165, 14, TaxiClass.BUSINESS, 7),
            new DeliveryTaxi(AutoMake.RENAULT, "New Master", 20320404, 145, 12, TaxiClass.DELIVERY, 919),
            new DeliveryTaxi(AutoMake.HYUNDAI, "H-1", 21546078, 150, 11, TaxiClass.DELIVERY, 1050),
            new DeliveryTaxi(AutoMake.TOYOTA, "Hilux", 23455000, 140, 13, TaxiClass.DELIVERY, 1950)
    );

    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation(cars);

        logger.info("Full cost of taxi station = " + taxiStation.fullCostOfTaxiStation());

        logger.info("Sort cars by fuel consumption: " + taxiStation.sortCarsByFuelConsumption());

        logger.info("Search cars by speed range: " + taxiStation.searchCarsBySpeedRange(140, 160));
    }
}
