public class EconomyRoom extends Room {
    private int bathtub;


    public EconomyRoom(boolean occupied, int amountOfBeds, int price, String description, int bathtub) {
        super(occupied, amountOfBeds, price, description);
        this.bathtub = bathtub;
    }


    public String getInfoEconomyRoom() {
        return "Room{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "Beskrivning: " + getDescription() +
                "Antal badkar: " + bathtub +
                "}";
    }

}
