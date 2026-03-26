public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        // Create queue
        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // Add booking requests (FIFO)
        requestQueue.addRequest(new Reservation("Alice", "Single"));
        requestQueue.addRequest(new Reservation("Bob", "Suite"));
        requestQueue.addRequest(new Reservation("Charlie", "Double"));

        // Display queue
        requestQueue.displayQueue();
    }
}