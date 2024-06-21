
// Jorge Villarreal Soules
public class Car {
    // Fields to store the car's year, model, make, and speed
    private int year;
    private String model;
    private String make;
    private int speed;

    // Constructor to initialize the car's make, model, and year, and set speed to 0
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Getter method for the car's make
    public String getMake() {
        return make;
    }

    // Getter method for the car's model
    public String getModel() {
        return model;
    }

    // Getter method for the car's year
    public int getYear() {
        return year;
    }

    // Getter method for the car's speed
    public int getSpeed() {
        return speed;
    }

    // Method to accelerate the car (increase speed by 5)
    public void accelerate() {
        speed += 5;
    }

    // Method to brake the car (decrease speed by 5, minimum speed is 0)
    public void brake() {
        speed -= 5;
    }

    public static void main(String[] args) {
        // Create a new Car object with make "Toyota", model "Tacoma", and year 2024
        Car myCar = new Car("Toyota", "Tacoma", 2024);

        // Accelerate the car 5 times and display the speed after each acceleration
        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Current Speed after Acceleration " + (i + 1) + ": " + myCar.getSpeed());
        }

        // Brake the car 5 times and display the speed after each braking
        for (int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Current Speed after Braking " + (i + 1) + ": " + myCar.getSpeed());
        }
    }
}
