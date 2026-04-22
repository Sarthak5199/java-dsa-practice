package OOP;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}