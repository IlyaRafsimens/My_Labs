package ru.vsu.education.lab12.task1;

public class Helmet extends SportsEquipment {
    private final String size;

    public Helmet(String name, int id, double weight, String size) {
        super(name, id, weight);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + " | Размер: " + size + " (Шлем)";
    }
}