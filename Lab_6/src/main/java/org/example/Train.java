package org.example;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void isDelayed(int minutes) {
        if (minutes <= 0) {
            System.out.println("Количество минут задержки должно быть больше 0.");
            return;
        }

        try {
            LocalTime time = LocalTime.parse(this.departureTime, TIME_FORMATTER);
            LocalTime delayedTime = time.plusMinutes(minutes);
            this.departureTime = delayedTime.format(TIME_FORMATTER);
            System.out.println("-> Поезд №" + this.trainNumber + " задержан на " + minutes + " мин.");
        } catch (Exception e) {
            System.err.println("Ошибка обработки времени отправления: " + e.getMessage());
        }
    }

    public void displayInfo() {
        System.out.println(String.format("Поезд №%-6s | Маршрут: %-30s | Отправление: %s",
                trainNumber, destination, departureTime));
    }
}