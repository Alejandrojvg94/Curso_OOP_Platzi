class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    // las variables de aqui son locales, a diferencia de las de arriba que son
    // variables globales
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + " Driver: " + driver.name + " Document: " + driver.document);
    }
}