class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    // las variables de aqui son locales, a diferencia de las de arriba que son
    // variables globales
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        if (passegenger != null) {
            System.out.println("License: " + license + " Driver: " + driver.name + " Document: " + driver.document
                    + " Passegenger " + passegenger);
        }
    }

    public Integer getPassenger() {
        return passegenger;
    }

    public void setPassenger(Integer passegenger) {
        if (passegenger == 4) {
            this.passegenger = passegenger;
        } else {
            System.out.print("necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}