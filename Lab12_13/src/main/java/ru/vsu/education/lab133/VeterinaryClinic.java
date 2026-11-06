package ru.vsu.education.lab133;

import ru.vsu.education.lab13.exceptions.InvalidPetDataException;
import ru.vsu.education.lab13.exceptions.PetNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private String name;
    private final List<Pet> registeredPets = new ArrayList<>();

    public VeterinaryClinic(String name) throws InvalidPetDataException {
        setName(name);
    }

    public void setName(String name) throws InvalidPetDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPetDataException("Название клиники не может быть пустым!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void registerPet(Pet pet) {
        registeredPets.add(pet);
        System.out.println("Питомец " + pet.getName() + " зарегистрирован в клинике \"" + name + "\".");
    }

    public Pet findPetByName(String name) throws PetNotFoundException {
        for (Pet p : registeredPets) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new PetNotFoundException("Питомец отсутствует в картотеке клиники!", name);
    }

    public void showAllPets() {
        System.out.println("\n--- Картотека пациентов клиники \"" + name + "\" ---");
        for (Pet p : registeredPets) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}