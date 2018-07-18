package com.Catalin;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println("Invalid parameter.");
        } else {
            long days = (minutes / 60) / 24;
            long years = days / 365;
            long reminderYears = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + reminderYears + " d");
        }
    }
}
