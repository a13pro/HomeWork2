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
        }else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("It`s a normal year");
        } else {
            System.out.println("It`s a leap year");
        }
    }
}

