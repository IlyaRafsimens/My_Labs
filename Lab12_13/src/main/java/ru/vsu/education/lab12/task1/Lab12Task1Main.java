package ru.vsu.education.lab12.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab12Task1Main {
    public static void main(String[] args) {
        System.out.println("========== ЛАБОРАТОРНАЯ РАБОТА 12. ЗАДАНИЕ 1 (Вариант 21) ==========\n");

        Map<String, SportsEquipment> equipmentMap = new LinkedHashMap<>();
        Ball b1 = new Ball("Мяч футбольный Adidas", 101, 0.43, "Футбол");
        Ball b2 = new Ball("Мяч баскетбольный Spalding", 102, 0.62, "Баскетбол");
        Ball b3 = new Ball("Мяч волейбольный Mikasa", 103, 0.27, "Волейбол");
        Racket r1 = new Racket("Ракетка Wilson Pro Staff", 201, 0.31, 25.0);
        Racket r2 = new Racket("Ракетка Head Speed MP", 202, 0.30, 24.5);
        Racket r3 = new Racket("Ракетка бадминтонная Yonex", 203, 0.088, 12.0);

        Helmet h1 = new Helmet("Шлем хоккейный Bauer RE-AKT", 301, 0.85, "L");
        Helmet h2 = new Helmet("Шлем горнолыжный POC Fornix", 302, 0.50, "M");

        equipmentMap.put(b1.getName(), b1);
        equipmentMap.put(b2.getName(), b2);
        equipmentMap.put(b3.getName(), b3);

        equipmentMap.put(r1.getName(), r1);
        equipmentMap.put(r2.getName(), r2);
        equipmentMap.put(r3.getName(), r3);

        equipmentMap.put(h1.getName(), h1);
        equipmentMap.put(h2.getName(), h2);

        System.out.println("Список добавленного инвентаря в Map (Все ключи и значения):\n");
        for (Map.Entry<String, SportsEquipment> entry : equipmentMap.entrySet()) {
            System.out.println("КЛЮЧ:    \"" + entry.getKey() + "\"");
            System.out.println("ОБЪЕКТ:  " + entry.getValue());
        }
    }
}