package com.LogisticsRouteTracker;

import java.util.ArrayList;

class Driver {
    String driverId;
    String name;
    ArrayList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new ArrayList<>();
    }

    void addCheckpoint(Checkpoint c) {
        routeHistory.add(c);
    }

    boolean removeCheckpoint(String checkpointId) {
        for (int i = 0; i < routeHistory.size(); i++) {
            if (routeHistory.get(i).checkpointId.equals(checkpointId)) {
                routeHistory.remove(i);
                return true;
            }
        }
        return false;
    }

    Checkpoint findCheckpoint(String checkpointId) {
        for (Checkpoint c : routeHistory) {
            if (c.checkpointId.equals(checkpointId)) {
                return c;
            }
        }
        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        for (Checkpoint c : routeHistory) {
            total += c.distanceFromLast;
        }
        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        for (Checkpoint c : routeHistory) {
            total += c.calculatePenalty();
        }
        return total;
    }

    void printRoute() {
        int i = 1;
        for (Checkpoint c : routeHistory) {
            String status = c.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + c.getType() + " – " + c.locationName +
                    " – " + status + " – Penalty: " + c.calculatePenalty());
            i++;
        }
    }

    boolean checkCritical() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        for (Checkpoint c : routeHistory) {
            if (c instanceof DeliveryCheckpoint) hasDelivery = true;
            if (c instanceof FuelCheckpoint) hasFuel = true;
        }

        return hasDelivery && hasFuel;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        printRoute();

        double totalDistance = computeTotalDistance();
        double totalPenalty = computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        if (checkCritical()) {
            System.out.println("Critical Route Check: All required checkpoints present");
        } else {
            System.out.println("Critical Route Check: Missing critical checkpoints");
        }
    }
}