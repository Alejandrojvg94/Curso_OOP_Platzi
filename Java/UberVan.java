import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String brand;
    String model;
    private Integer passegenger;

    public UberVan(String license, Account driver) {

        super(license, driver);

    }

    public Integer getPassegenger() {
        return passegenger;
    }

    @Override
    public void setPassenger(Integer passegenger) {

        if (passegenger == 6) {
            this.passegenger = passegenger;
        } else {
            System.out.print("necesitas asignar 6 pasajeros");
        }

    }
}