public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Add room types
        inventory.addRoomType("Single", 10);
        inventory.addRoomType("Double", 5);
        inventory.addRoomType("Suite", 2);

        // Display inventory
        inventory.displayInventory();

        // Check availability
        System.out.println("Available Single Rooms: " + inventory.getAvailability("Single"));

        // Update availability
        inventory.updateAvailability("Single", 8);

        // Display after update
        inventory.displayInventory();
    }
}