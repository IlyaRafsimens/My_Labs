package ru.vsu.education.lab133;

import ru.vsu.education.lab13.exceptions.InvalidPetDataException;
import ru.vsu.education.lab13.exceptions.VetException;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;
    private String owner;
    private boolean isSick;

    public Pet(String name, String species, int age, double weight, String owner) throws InvalidPetDataException {
        setName(name);
        setSpecies(species);
        setAge(age);
        setWeight(weight);
        setOwner(owner);
        this.isSick = true;
    }

    public void setName(String name) throws InvalidPetDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPetDataException("Кличка питомца не может быть пустой!");
        }
        this.name = name;
    }

    public void setAge(int age) throws InvalidPetDataException {
        if (age < 0) {
            throw new InvalidPetDataException("Возраст не может быть отрицательным: " + age);
        }
        this.age = age;
    }

    public void setWeight(double weight) throws InvalidPetDataException {
        if (weight <= 0) {
            throw new InvalidPetDataException("Вес должен быть строго больше нуля: " + weight);
        }
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSick(boolean sick) {
        this.isSick = sick;
    }

    public void visitVet() throws VetException {
        System.out.println("-> Ветеринар проводит осмотр питомца: " + name + " (" + species + ")");
        if (weight > 100) {
            throw new VetException("Вес питомца (" + weight + " кг) превышает возможности клиники (>100 кг)!");
        }
        if (!isSick) {
            throw new VetException("Питомец " + name + " уже здоров! Лечение не требуется.");
        }
        this.isSick = false;
        System.out.println("   [Успешно] Питомец " + name + " осмотрен и полностью здоров!");
    }

    public void updateWeight(double newWeight) throws InvalidPetDataException {
        double oldWeight = this.weight;
        setWeight(newWeight);
        System.out.printf("   [Успешно] Вес питомца %s изменен: %.2f кг -> %.2f кг%n", name, oldWeight, newWeight);
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isSick() {
        return isSick;
    }

    @Override
    public String toString() {
        return String.format("Питомец '%s' | Порода: %-7s | Возраст: %d г. | Вес: %.2f кг | Владелец: %-12s | Статус: %s",
                name, species, age, weight, owner, (isSick ? "Болен" : "Здоров"));
    }
}