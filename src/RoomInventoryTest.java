import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomInventoryTest {

    @Test
    void testAddRoomType() {
        RoomInventory inventory = new RoomInventory();

        inventory.addRoomType("Single", 10);

        assertEquals(10, inventory.getAvailability("Single"));
    }

    @Test
    void testGetAvailabilityForNonExistingRoom() {
        RoomInventory inventory = new RoomInventory();

        assertEquals(0, inventory.getAvailability("Suite"));
    }

    @Test
    void testUpdateAvailability() {
        RoomInventory inventory = new RoomInventory();

        inventory.addRoomType("Double", 5);
        inventory.updateAvailability("Double", 3);

        assertEquals(3, inventory.getAvailability("Double"));
    }

    @Test
    void testUpdateNonExistingRoom() {
        RoomInventory inventory = new RoomInventory();

        inventory.updateAvailability("Luxury", 5);

        assertEquals(0, inventory.getAvailability("Luxury"));
    }
}