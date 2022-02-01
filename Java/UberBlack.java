import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    String brand;
    String model;

    public UberBlack(String license, Account driver, String brand, String model,
            Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {

        super(license, driver);
        this.brand = brand;
        this.model = model;
        this.typeCarAccepted = typeCarAccepted;

    }
}