package org.example;

public class Saw extends Tool {

    private double bladeLength;

    public Saw(String name, double power, double weight, double bladeLength) {
        super(name, power, weight);
        this.bladeLength = bladeLength;
    }

    public double getBladeLength()          { return bladeLength; }
    public void setBladeLength(double len)  { this.bladeLength = len; }

    @Override
    public void use() {
        System.out.println("Режет материалы лезвием длиной " + bladeLength + " см.");
    }

    @Override
    public String getSafetyClass() {
        return "Класс II";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Длина лезвия: " + bladeLength + " см");
    }
}