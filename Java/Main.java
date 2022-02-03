class Main {
    public static void main(String[] args) {

        Uberx Uberx = new Uberx("zuk78d", new Account("Andres Villa", "123"), "Chevrolet", "onix");
        Uberx.setPassenger(4);
        Uberx.printDataCar();

        UberVan uberVan = new UberVan("ZUK78F", new Account("Raul Becerra", "109281"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("HBC243", new Account("Filomena Ruiz", "124"));
        // car2.passegenger = 5;
        // car2.printDataCar();

    }
}