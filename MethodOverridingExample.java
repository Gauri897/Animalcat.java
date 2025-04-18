class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}