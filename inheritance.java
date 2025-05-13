public class inheritance {
    public static class InheritanceExample {

        public static void main(String[] args) {

            Vehicle genericVehicle = new Vehicle("Generic", 2023);
            Car myCar = new Car("Toyota", 2024, 4);

            System.out.println("Vehicle Info:");
            genericVehicle.displayInfo();

            System.out.println("\nCar Info:");
            myCar.displayInfo();
            myCar.honk();
        }
    }

    static class Vehicle {
        private final String brand;
        private final int year;

        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Year: " + year);
        }

        public String getBrand() {
            return brand;
        }

        public int getYear() {
            return year;
        }
    }

    static class Car extends Vehicle {
        private final int numberOfDoors;

        public Car(String brand, int year, int numberOfDoors) {
            super(brand, year);
            this.numberOfDoors = numberOfDoors;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of doors: " + numberOfDoors);
        }

        public void honk() {
            System.out.println("Beep beep!");
        }
    }
}
