package org.example;

public class Insurance {
    private String number;
    private InsuranceType type;

    public Insurance(String number, InsuranceType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public InsuranceType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Полис №: " + number + " | Тип: " + type;
    }
}
