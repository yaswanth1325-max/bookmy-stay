import java.util.LinkedList;
import java.util.Queue;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 2);
        inventory.addRoomType("Double", 1);
        inventory.addRoomType("Suite", 1);

        Queue<Reservation> queue = new LinkedList<>();
        queue.add(new Reservation("Alice", "Single"));
        queue.add(new Reservation("Bob", "Single"));
        queue.add(new Reservation("Charlie", "Single"));
        queue.add(new Reservation("David", "Suite"));

        RoomAllocationService serbookmy-stay
        vice = new RoomAllocationService(inventory);

        service.processBookings(queue);
    }
}