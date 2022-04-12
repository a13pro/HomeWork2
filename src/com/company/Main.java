package com.company;

public class Main {

    public static void main(String[] args) {
        // задача 1
        int clientOS = 1; // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Install iOS version of the app using the link below");
        } else {
            System.out.println("Install Android version of the app using the link below");
        }

        // задача 2

        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Install the light version of  Android app using the link below ");
            } else {
                System.out.println("Install Android version of the app using the link below");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Install the light version of  iOS app using the link below");
            } else {
                System.out.println("Install iOS version of the app using the link below");
            }
        }
        // задача 3
        int year = 2021;
        if (year % 4 != 0) {
            System.out.println("It`s a normal year");
        } else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("It`s a normal year");
        } else {
            System.out.println("It`s a leap year");
        }

        // Задача 4

        double deliveryDistance = 95;
        double daysForDelivery = 0;
        double additionalDays = (deliveryDistance - 20) / 40;
        double addDaysRoundUp = Math.ceil(additionalDays);
        if (deliveryDistance > 20) {
            daysForDelivery = 1 + addDaysRoundUp;
            System.out.println("Delivery will take " + daysForDelivery);
        } else {
            System.out.println("Delivery will take 1 day");
        }

        // задача 5

        var monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("It`s Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It`s Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It`s Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It`s Autumn");
                break;
            default:
                System.out.println("There is no such month");
        }
    }
}

