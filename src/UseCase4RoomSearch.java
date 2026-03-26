import java.util.HashMap;
import java.util.Map;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Step 1: Setup Inventory (from UC3)
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 5);
        inventory.addRoomType("Double", 0);
        inventory.addRoomType("Suite", 2);

        // Step 2: Create Room objects (Domain Model)
        Map<String, Room> roomMap = new HashMap<>();
        roomMap.put("Single", new SingleRoom(101));
        roomMap.put("Double", new DoubleRoom(201));
        roomMap.put("Suite", new SuiteRoom(301));

        // Step 3: Create Search Service
        SearchService searchService = new SearchService(inventory);

        // Step 4: Perform Search (READ ONLY)
        searchService.searchAvailableRooms(roomMap);
    }
}