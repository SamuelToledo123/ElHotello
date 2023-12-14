import java.time.LocalDate;

public class EconomyRoom extends Room {
    private int bathtub;


    public EconomyRoom(LocalDate localdate, boolean occupied, int amountOfBeds, int price, String description, int bathtub) {
        super(occupied, amountOfBeds, price, description, localdate);
        this.bathtub = bathtub;
    }


    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "\nBeskrivning: " + getDescription() +
                "\nAntal badkar: " + bathtub +
                "}";
    }

}
