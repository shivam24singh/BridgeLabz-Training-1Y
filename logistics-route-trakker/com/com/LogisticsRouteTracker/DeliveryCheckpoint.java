package com.LogisticsRouteTracker;

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "DeliveryCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0;
    }
}