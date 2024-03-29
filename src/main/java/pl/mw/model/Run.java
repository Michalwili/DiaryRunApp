package pl.mw.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Run extends Training {
    private double distance;

    public Run(LocalDate date, LocalTime duration, String description, double distance) {
        super(TrainingType.RUN,date, duration, description);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + ", distance: " + distance + " km";
    }
}

