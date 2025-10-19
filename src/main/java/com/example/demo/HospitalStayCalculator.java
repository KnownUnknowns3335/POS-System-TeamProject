package com.example.demo;

public class HospitalStayCalculator {
    public double calculateTotal(double dailyRate, int numDays, double serviceFees, double medicationFees) {
        if (dailyRate < 0 || numDays < 0 || serviceFees < 0 || medicationFees < 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }
        return (dailyRate * numDays) + serviceFees + medicationFees;
    }
}