import java.time.LocalDate;

;public class Main {
    public static void main(String[] args) {

        RoomFactory roomFactory = new RoomFactory();


        Room presidentialsuit = roomFactory.createPresidentialsuite();
        Room luxuryRoom = roomFactory.createLuxuryRoom();
        LocalDate bookingDate = LocalDate.of(2023,12,1);
        Room economyRoom = roomFactory.createEconomyRoom(bookingDate);
        //System.out.println(room.getInfo());

        presidentialsuit.bookRoom(LocalDate.of(2023,12,15));

        System.out.println("\n");
        //System.out.println(luxuryRoom.getInfo());
        System.out.println();
        System.out.println(economyRoom.getInfo());
        System.out.println();
        System.out.println(presidentialsuit.getInfo());







    }
}
