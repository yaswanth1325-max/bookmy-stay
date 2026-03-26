import java.util.Map;

public class SearchService {

    private RoomInventory inventory;

    // Constructor
    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    // Read-only search method
    public void searchAvailableRooms(Map<String, Room> roomMap) {

        System.out.println("Available Rooms:");

        for (String type : roomMap.keySet()) {

            int available = inventory.getAvailability(type);

            // Show only available rooms
            if (available > 0) {

                Room room = roomMap.get(type);

                System.out.println("Room Type: " + type);
                System.out.println("Price: " + room.getPrice());
                System.out.println("Available: " + available);
                System.out.println("----------------------");
            }
        }
    }
}