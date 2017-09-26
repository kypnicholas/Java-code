package com.kypnicholas;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Engine is starting";
    }

    public String accelerate(){
        return "Accelerate";
    }

    public String brake(){
        return "Brake car";
    }
}

class VW extends Car{
    public VW(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("VW start engine");
    }

    @Override
    public String accelerate() {
        return ("VW accelerate");
    }

    @Override
    public String brake() {
        return ("VW brake");
    }
}

class Renault extends Car{
    public Renault(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " start engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brake";
    }
}

class Jeep extends Car{
    public Jeep(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return ("Jeep start engine");
    }

    @Override
    public String accelerate() {
        return ("Jeep accelerate");
    }

    @Override
    public String brake() {
        return ("Jeep brake");
    }
}

public class Main {

        public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car(4,"base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake() + "\n");

        VW vw = new VW(6, "Golf");
        System.out.println(vw.startEngine());
        System.out.println(vw.accelerate());
        System.out.println(vw.brake() + "\n");

        Renault renault = new Renault(2, "Clio");
        System.out.println(renault.startEngine());
        System.out.println(renault.accelerate());
        System.out.println(renault.brake() + "\n");

        Jeep jeep = new Jeep(6, "Cherokee");
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake() + "\n");
    }
}
