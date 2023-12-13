;public class Main {
    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();

        Room room = roomFactory.createEconomyRoom();
        System.out.println(room.getInfo());


        //LuxuryRoom luxuryRoom = roomFactory.createLuxuryRoom(1, 1300, )






    }
}
