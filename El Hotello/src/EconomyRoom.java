public class EconomyRoom extends Room {
    private int bathtub;


    public EconomyRoom(boolean occupied, int amountOfBeds, int price, String description, int bathtub) {
        super(occupied, amountOfBeds, price, description);
        this.bathtub = bathtub;
    }

    public String  getInfo() {
        return "lots of bugs in bed";
    }

}
