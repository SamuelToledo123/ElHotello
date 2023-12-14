import java.time.LocalDate;

public class LuxuryRoom extends Room{


    int jacuzzi;

    public LuxuryRoom(LocalDate localdate,boolean occupied, int amountOfBeds, int price, String description, int jacuzzi) {
        super(occupied, amountOfBeds, price, description, localdate);
        this.jacuzzi = jacuzzi;
    }

    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "\nBeskrivning: " + getDescription() +
                "\nAntal Jacuzzi: " + jacuzzi +
                "}";
    }

}
