public class LuxuryRoom extends Room{


    int jacuzzi;

    public LuxuryRoom(boolean occupied, int amountOfBeds, int price, String description, int jacuzzi) {
        super(occupied, amountOfBeds, price, description);
        this.jacuzzi = jacuzzi;
    }

}
