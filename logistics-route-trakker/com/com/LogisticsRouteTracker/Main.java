package com.LogisticsRouteTracker;

public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 50, 60));
        d.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 35));
        d.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 60, 40, 55));

        d.printSummary();
    }
}