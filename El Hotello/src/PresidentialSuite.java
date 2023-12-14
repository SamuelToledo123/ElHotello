import java.time.LocalDate;

public class PresidentialSuite extends Room {

    boolean highTechSecuritySystem;
    int wetBar;
    int firePlace;
    int prepKitchen;



    public PresidentialSuite(LocalDate localdate, boolean occupied, int amountOfBeds, int price, String description,
                             boolean highTechSecuritySystem, int wetBar, int firePlace, int prepKitchen) {
        super(occupied, amountOfBeds, price, description, localdate);
        this.highTechSecuritySystem = highTechSecuritySystem;
        this.wetBar = wetBar;
        this.firePlace = firePlace;
        this.prepKitchen = prepKitchen;
    }


    @Override
    public String getInfo() {
        return "Room{" +
                "Upptaget: " + isOccupied() +
                "\nAntal sängar: " + getAmountOfBeds() +
                "\nPris: " + getPrice() +
                "\nBeskrivning: " + getDescription() +
                "\nSecurity System ingår: " + highTechSecuritySystem +
                "\nBar:" + wetBar +
                "\nÖppen spis:" + firePlace +
                "\nKök: " + prepKitchen +
                "}";
    }
}
