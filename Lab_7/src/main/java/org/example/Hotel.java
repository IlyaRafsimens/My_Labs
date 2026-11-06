package com.example.hotel;

public class Hotel {

    private String name;
    private int stars;
    private int rooms;

    private static int totalHotels = 0;
    private static int totalRooms = 0;

    public Hotel(String name, int stars, int rooms) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;

        totalHotels++;
        totalRooms += rooms;
    }

    public static double getAverageRooms() {
        if (totalHotels == 0) {
            return 0;
        }
        return (double) totalRooms / totalHotels;
    }

    public static int getTotalHotels() {
        return totalHotels;
    }

    public static int getTotalRooms() {
        return totalRooms;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return String.format("Отель{Название='%s', звезд=%d, комнот=%d}",
                name, stars, rooms);
    }
}