package ru.vsu.education.lab133;

import ru.vsu.education.lab13.exceptions.InvalidPetDataException;
import ru.vsu.education.lab13.exceptions.PetNotFoundException;
import ru.vsu.education.lab13.exceptions.VetException;

public class Lab13Main {
    public static void main(String[] args) throws InvalidPetDataException {
        System.out.println("ЛАБОРАТОРНАЯ РАБОТА 13 (Вариант 21)\n");

        VeterinaryClinic clinic = new VeterinaryClinic("Айболит");

        System.out.println(">>> ТЕСТ 1: Попытка создания с неверными данными");
        try {
            System.out.println("Создаем питомца с отрицательным возрастом (-2)...");
            Pet wrongPet = new Pet("Барсик", "Кот", -2, 4.5, "Иванов И.");
        } catch (InvalidPetDataException e) {
            System.err.println("[ПЕРЕХВАЧЕНО ИСКЛЮЧЕНИЕ]: " + e.getMessage());
        } finally {
            System.out.println("[FINALLY]: Блок валидации конструктора отработал.\n");
        }

        System.out.println(">>> ТЕСТ 2: Успешная регистрация пациентов");
        try {
            Pet dog = new Pet("Рекс", "Овчарка", 4, 25.5, "Петров А.");
            Pet cat = new Pet("Мурка", "Кошка", 2, 3.8, "Сидорова О.");
            Pet elephant = new Pet("Джамбо", "Слон", 7, 1500.0, "Зоопарк");

            clinic.registerPet(dog);
            clinic.registerPet(cat);
            clinic.registerPet(elephant);
        } catch (InvalidPetDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        clinic.showAllPets();

        System.out.println(">>> ТЕСТ 3: Поиск питомца по имени");
        try {
            System.out.println("Ищем питомца 'Шарик'...");
            clinic.findPetByName("Шарик");
        } catch (PetNotFoundException e) {
            System.out.println("[ПЕРЕХВАЧЕНО ИСКЛЮЧЕНИЕ]: " + e.getMessage());
        } finally {
            System.out.println("[FINALLY]: Операция поиска завершена.\n");
        }

        System.out.println(">>> ТЕСТ 4: Визит к ветеринару");
        try {
            Pet reks = clinic.findPetByName("Рекс");
            reks.visitVet();
            System.out.println("Повторный вызов visitVet для уже здорового питомца:");
            reks.visitVet();
        } catch (PetNotFoundException | VetException e) {
            System.out.println("[ПЕРЕХВАЧЕНО ИСКЛЮЧЕНИЕ]: " + e.getMessage());
        }

        System.out.println("\nОсмотр слона Джамбо (вес > 100 кг):");
        try {
            Pet jumbo = clinic.findPetByName("Джамбо");
            jumbo.visitVet();
        } catch (PetNotFoundException | VetException e) {
            System.out.println("[ПЕРЕХВАЧЕНО ИСКЛЮЧЕНИЕ]: " + e.getMessage());
        }

        System.out.println("\n>>> ТЕСТ 5: Обновление веса питомца");
        try {
            Pet murka = clinic.findPetByName("Мурка");
            murka.updateWeight(4.2);
            murka.updateWeight(-5.0);
        } catch (PetNotFoundException | InvalidPetDataException e) {
            System.out.println("[ПЕРЕХВАЧЕНО ИСКЛЮЧЕНИЕ]: " + e.getMessage());
        } finally {
            System.out.println("\n[FINALLY]: Работа программы полностью завершена!");
        }
    }
}