class Vehicle {
    String make, model, fuelType;
    int year;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel Efficiency: Not specified");
    }

    void distanceTraveled(int speed, int time) {
        System.out.println("Distance: " + (speed * time) + " km");
    }

    void maxSpeed() {
        System.out.println("Max speed: Unknown");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 15 km/l");
    }

    void maxSpeed() {
        System.out.println("Car Max Speed: 180 km/h");
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    void fuelEfficiency() {
        System.out.println("Truck Fuel Efficiency: 6 km/l");
    }

    void maxSpeed() {
        System.out.println("Truck Max Speed: 120 km/h");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

  
    void fuelEfficiency() {
        System.out.println("Motorcycle Fuel Efficiency: 40 km/l");
    }

   
    void maxSpeed() {
        System.out.println("Motorcycle Max Speed: 100 km/h");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "City", 2022, "Petrol");
        car.fuelEfficiency();
        car.distanceTraveled(60, 2);
        car.maxSpeed();
    }
}
