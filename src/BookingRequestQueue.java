import java.util.LinkedList;
import java.util.Queue;

public class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // Add request (enqueue)
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request added: "
                + reservation.getCustomerName()
                + " -> " + reservation.getRoomType());
    }

    // Display all requests (FIFO order)
    public void displayQueue() {
        System.out.println("\nBooking Request Queue:");

        for (Reservation r : queue) {
            System.out.println(r.getCustomerName()
                    + " requested " + r.getRoomType());
        }
    }
}