package org.example;

import com.example.hotel.Hotel;

public class Main {

    public static void main(String[] args) {

        Hotel h1 = new Hotel("Grand Plaza",    5, 250);
        Hotel h2 = new Hotel("Seaside Resort", 4, 180);
        Hotel h3 = new Hotel("City Inn",       3,  90);
        Hotel h4 = new Hotel("Mountain Lodge", 4, 120);
        Hotel h5 = new Hotel("Budget Stay",    2,  60);

        System.out.println("Список отелей:");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);

        System.out.println();
        System.out.println("Всего отелей: " + Hotel.getTotalHotels());
        System.out.println("Всего номеров: " + Hotel.getTotalRooms());
        System.out.printf("Среднее число номеров на отель: %.2f%n",
                Hotel.getAverageRooms());
    }
}