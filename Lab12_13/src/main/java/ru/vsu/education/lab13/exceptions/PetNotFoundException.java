package ru.vsu.education.lab13.exceptions;

public class PetNotFoundException extends Exception {
    private final String petName;

    public PetNotFoundException(String message, String petName) {
        super(message + " [Питомец: " + petName + "]");
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }
}