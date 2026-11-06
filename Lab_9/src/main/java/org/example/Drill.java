package org.example;

public class Drill extends Tool {

    private int speed;

    public Drill(String name, double power, double weight, int speed) {
        super(name, power, weight);
        this.speed = speed;
    }

    public int getSpeed()       { return speed; }
    public void setSpeed(int s) { this.speed = s; }

    @Override
    public void use() {
        System.out.println("Сверлит отверстия со скоростью " + speed + " об/мин.");
    }

    @Override
    public String getSafetyClass() {
        return "Класс I";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Скорость: " + speed + " об/мин");
    }
}