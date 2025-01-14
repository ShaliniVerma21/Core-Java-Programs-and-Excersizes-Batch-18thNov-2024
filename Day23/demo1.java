package Day23;
//1. Non-static Inner Class
class Car1 {
    private String model;

    // Non-static inner class
    class Engine {
        private int horsepower;

        Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        void displayInfo() {
            System.out.println("Car1 Model: " + model + 
            		", Engine Horsepower: " + horsepower);
        }
    }

    Car1(String model) {
        this.model = model;
    }

    void createEngine(int horsepower) {
        Engine engine = new Engine(horsepower);
        engine.displayInfo();
    }
}

// Usage
public class demo1{
    public static void main(String[] args) {
        Car1 Car1 = new Car1("Toyota");
        Car1.createEngine(150);
    }
}