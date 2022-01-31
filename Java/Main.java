class Main {
    public static void main(String[] args) {

        Car car = new Car("zuk78d", new Account("Andres Villa", "123"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("HBC243", new Account("Filomena Ruiz", "124"));
        car2.passegenger = 5;
        car2.printDataCar();

    }
}