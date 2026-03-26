import java.util.*;

public class RoomAllocationService {

    private RoomInventory inventory;
    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> roomAllocations;

    public RoomAllocationService(RoomInventory inventory) {
        this.inventory = inventory;
        this.allocatedRoomIds = new HashSet<>();
        this.roomAllocations = new HashMap<>();
    }

    // Process queue (FIFO)
    public void processBookings(Queue<Reservation> queue) {

        while (!queue.isEmpty()) {

            Reservation request = queue.poll(); // dequeue

            String roomType = request.getRoomType();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // Generate unique room ID
                String roomId = generateRoomId(roomType);

                // Ensure uniqueness
                while (allocatedRoomIds.contains(roomId)) {
                    roomId = generateRoomId(roomType);
                }

                // Add to set
                allocatedRoomIds.add(roomId);

                // Store in map
                roomAllocations
                        .computeIfAbsent(roomType, k -> new HashSet<>())
                        .add(roomId);

                // Update inventory
                inventory.updateAvailability(roomType, available - 1);

                // Confirm booking
                System.out.println("Booking Confirmed for "
                        + request.getCustomerName()
                        + " | Room Type: " + roomType
                        + " | Room ID: " + roomId);

            } else {
                System.out.println("Booking Failed for "
                        + request.getCustomerName()
                        + " (No availability)");
            }
        }
    }

    // Generate ID
    private String generateRoomId(String roomType) {
        return roomType.substring(0, 2).toUpperCase() + new Random().nextInt(1000);
    }
}