package org.example;

public abstract class Tool {

    private String name;
    private double power;
    private double weight;

    public Tool(String name, double power, double weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }

    public String getName()    { return name; }
    public double getPower()   { return power; }
    public double getWeight()  { return weight; }

    public void setName(String name)     { this.name = name; }
    public void setPower(double power)   { this.power = power; }
    public void setWeight(double weight) { this.weight = weight; }

    public abstract void use();

    public abstract String getSafetyClass();

    public void displayInfo() {
        System.out.println("Инструмент: " + name);
        System.out.println("Мощность: " + power + " Вт");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Класс безопасности: " + getSafetyClass());
    }
}