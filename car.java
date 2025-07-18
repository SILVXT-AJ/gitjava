class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand ="Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car( "BMW" , 1945);

        c1.show();
        c2.show();
    }
}
