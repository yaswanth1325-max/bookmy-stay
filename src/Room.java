public abstract class Room {

    protected int roomNumber;
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;
    protected boolean isBooked;

    public Room(int roomNumber, int numberOfBeds, int squareFeet, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
    }


        protected int price;   // ✅ ADD THIS

    public double getPrice() {
        return price;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        isBooked = true;
    }

    public void displayRoomDetails() {
        System.out.println("Room No: " + roomNumber);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}