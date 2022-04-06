package com.company;

public class Main {

    public static void main(String[] args) {
        int clientOS = 0; // 0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Install iOS version of the app using the link below");
        }
        if (clientOS == 1) {
            System.out.println("Install Android version of the app using the link below");
        }
    }
}
