package org.example;
// Base class
class Vehicle {
    // Method to display vehicle type
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass
class Car extends Vehicle {
    // Method to display car details
    public void displayDetails() {
        System.out.println("This is a car.");
    }
}

// Main class to demonstrate inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Call methods from both Car and Vehicle classes
        myCar.displayType();   // Output: This is a vehicle.
        myCar.displayDetails(); // Output: This is a car.
    }
}
