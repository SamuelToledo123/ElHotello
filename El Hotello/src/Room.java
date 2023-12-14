import java.time.LocalDate;

abstract class Room implements RoomTemplate {

    private boolean occupied;
    private int amountOfBeds;
    private int price;
    private String description;
    private LocalDate bookingDate;


    public Room(boolean occupied, int amountOfBeds, int price, String description, LocalDate bookingDate) {
        this.occupied = occupied;
        this.amountOfBeds = amountOfBeds;
        this.price = price;
        this.description = description;
        this.bookingDate = null;
    }

    public Room() {
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void bookRoom(LocalDate date) {
        if (!occupied) {
            occupied = true;
            bookingDate = date;
            System.out.println("rummet är nu bokat" + date);

        } else {
            System.out.println("rummet är redan upptaget");
        }
    }

    public void cancelBooking() {
        if (occupied) {
            occupied = false;
            bookingDate = null;
            System.out.println("Bokningen har avbrutits");

        } else {
            System.out.println("Rummet är inte bokat");
        }
    }

    public boolean isOccupied() {
        return occupied;
    }

    public String getDescription() {
        return description;
    }

    public int getAmountOfBeds() {
        return amountOfBeds;

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + occupied +
                "\nAntal sängar: " + amountOfBeds +
                "\nPris: " + price +
                "}";
    }
}


