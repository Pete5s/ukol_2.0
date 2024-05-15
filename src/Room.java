public class Room {

    private int roomNumber;
    private int beds;
    private boolean hasBalcony;
    private boolean seaView;
    private int pricePerNight;

    public Room(int roomNumber, int beds, boolean hasBalcony, boolean seaView, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.hasBalcony = hasBalcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public String getDescription() {
        return String.format("Pokoj číslo %d: %d lůžko/lůžka, balkon: %s, výhled na moře: %s, cena: %d Kč/noc",
                roomNumber, beds, hasBalcony ? "ano" : "ne", seaView ? "ano" : "ne", pricePerNight);
    }
}
