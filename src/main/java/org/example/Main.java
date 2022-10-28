package org.example;

public class Main {
    public static void main(String[] args) {
        final int programmerCount = 7;
        final int testersCountForProgrammer = 2;
        final int supportCountForProgrammer = 3;
        final int totalTestersCount = programmerCount * testersCountForProgrammer;
        final int totalSupportCount = programmerCount * supportCountForProgrammer;
        final int totalWorkersCount = programmerCount + totalTestersCount + totalSupportCount;

        System.out.println("переменная programmerCount: " + programmerCount);
        System.out.println("переменная testersCountForProgrammer: " + testersCountForProgrammer);
        System.out.println("переменная supportCountForProgrammer: " + supportCountForProgrammer);
        System.out.println("переменная totalTestersCount: " + totalTestersCount);
        System.out.println("переменная totalSupportCount: " + totalSupportCount);
        System.out.println("переменная totalWorkersCount: " + totalWorkersCount);


    }
}