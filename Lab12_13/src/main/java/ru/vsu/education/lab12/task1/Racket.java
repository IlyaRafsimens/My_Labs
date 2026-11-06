package ru.vsu.education.lab12.task1;

public class Racket extends SportsEquipment {
    private final double stringTension;

    public Racket(String name, int id, double weight, double stringTension) {
        super(name, id, weight);
        this.stringTension = stringTension;
    }

    public double getStringTension() {
        return stringTension;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Натяжение струн: %.1f кг (Ракетка)", stringTension);
    }
}