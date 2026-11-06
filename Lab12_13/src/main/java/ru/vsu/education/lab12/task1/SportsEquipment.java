package ru.vsu.education.lab12.task1;

public abstract class SportsEquipment {
    private final String name;
    private final int id;
    private final double weight;

    public SportsEquipment(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("[ID: %d] Название: %-26s | Вес: %.2f кг", id, name, weight);
    }
}