package com.LogisticsRouteTracker;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String name, double dist, int expected, int actual) {
        super(id, name, dist, expected, actual);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}