;public class Main {
    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();


        Room presidentialsuit = roomFactory.createPresidentialsuite();
        Room luxuryRoom = roomFactory.createLuxuryRoom();
        Room economyRoom = roomFactory.createEconomyRoom();
        //System.out.println(room.getInfo());

        System.out.println("\n");
        //System.out.println(luxuryRoom.getInfo());
        System.out.println(economyRoom.getInfo());







    }
}
