package Part3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    @Test
    void testAddGuitar() {
        // Arrange
        String serialNumber = "123";
        double price = 1000.0;
        String builder = "Fender";
        String model = "Stratocaster";
        String type = "Electric";
        String backWood = "Maple";
        String topWood = "Maple";

        // Act
        inventory.addGuitar(serialNumber, price, builder, model, type, backWood, topWood);

        // Assert
        Guitar addedGuitar = inventory.getGuitar(serialNumber);
        assertNotNull(addedGuitar);
        assertEquals(serialNumber, addedGuitar.getSerialNumber());
        assertEquals(price, addedGuitar.getPrice());
        assertEquals(builder, addedGuitar.getBuilder());
        assertEquals(model, addedGuitar.getModel());
        assertEquals(type, addedGuitar.getType());
        assertEquals(backWood, addedGuitar.getBackWood());
        assertEquals(topWood, addedGuitar.getTopWood());
    }

    @Test
    void testGetGuitar() {
        // Arrange
        String serialNumber = "456";
        double price = 1200.0;
        String builder = "Gibson";
        String model = "Les Paul";
        String type = "Electric";
        String backWood = "Mahogany";
        String topWood = "Maple";

        // Add guitar to inventory
        inventory.addGuitar(serialNumber, price, builder, model, type, backWood, topWood);

        // Act
        Guitar retrievedGuitar = inventory.getGuitar(serialNumber);

        // Assert
        assertNotNull(retrievedGuitar);
        assertEquals(serialNumber, retrievedGuitar.getSerialNumber());
        assertEquals(price, retrievedGuitar.getPrice());
        assertEquals(builder, retrievedGuitar.getBuilder());
        assertEquals(model, retrievedGuitar.getModel());
        assertEquals(type, retrievedGuitar.getType());
        assertEquals(backWood, retrievedGuitar.getBackWood());
        assertEquals(topWood, retrievedGuitar.getTopWood());
    }

    @Test
    void testSearch() {
        // Arrange
        String serialNumber = "789";
        double price = 1500.0;
        String builder = "Martin";
        String model = "D-28";
        String type = "Acoustic";
        String backWood = "Rosewood";
        String topWood = "Spruce";

        // Add guitar to inventory
        inventory.addGuitar(serialNumber, price, builder, model, type, backWood, topWood);

        // Create a search guitar with the same attributes
        Guitar searchGuitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);

        // Act
        Guitar foundGuitar = inventory.search(searchGuitar);

        // Assert
        assertNotNull(foundGuitar);
        assertEquals(serialNumber, foundGuitar.getSerialNumber());
        assertEquals(price, foundGuitar.getPrice());
        assertEquals(builder, foundGuitar.getBuilder());
        assertEquals(model, foundGuitar.getModel());
        assertEquals(type, foundGuitar.getType());
        assertEquals(backWood, foundGuitar.getBackWood());
        assertEquals(topWood, foundGuitar.getTopWood());
    }

}

