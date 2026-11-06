package org.example;

public class Store {
    public String name;
    public String address;
    public int employeeCount;

    public Store(String name, String address, int employeeCount) {
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
    }

    public boolean isLarge() {
        return employeeCount > 50;
    }

    @Override
    public String toString() {
        return "Магазин: \"" + name + "\", Адрес: " + address + ", Сотрудников: " + employeeCount;
    }
}