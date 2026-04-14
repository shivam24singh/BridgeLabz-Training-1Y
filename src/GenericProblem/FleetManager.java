package GenericProblem;

import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    List<T> list = new ArrayList<>();

    public void addVehicle(T v) {
        list.add(v);
    }

    public void showFleet() {
        for (T v : list) {
            System.out.println(v.getClass().getSimpleName());
        }
    }
}