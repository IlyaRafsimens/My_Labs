package ru.vsu.education.lab12.task1;

public class Ball extends SportsEquipment {
    private final String sportType;

    public Ball(String name, int id, double weight, String sportType) {
        super(name, id, weight);
        this.sportType = sportType;
    }

    public String getSportType() {
        return sportType;
    }

    @Override
    public String toString() {
        return super.toString() + " | Вид спорта: " + sportType + " (Мяч)";
    }
}