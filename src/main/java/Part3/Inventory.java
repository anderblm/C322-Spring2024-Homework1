package Part3;
import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
        guitar.writeToFile();
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            // Assuming the search is based on all attributes
            if (guitar.getBuilder().equals(searchGuitar.getBuilder())
                    && guitar.getModel().equals(searchGuitar.getModel())
                    && guitar.getType().equals(searchGuitar.getType())
                    && guitar.getBackWood().equals(searchGuitar.getBackWood())
                    && guitar.getTopWood().equals(searchGuitar.getTopWood())) {
                return guitar;
            }
        }
        return null;
    }
}


