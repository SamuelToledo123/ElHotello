public class RoomFactory {



    public EconomyRoom createEconomyRoom() {
        return new EconomyRoom(false, 2, 500, "Its a room", 1);
    }


    public LuxuryRoom createLuxuryRoom(int amountOfBeds, int price, String description) {
        return new LuxuryRoom(false, 1, 1300, description, 1);
    }


}
