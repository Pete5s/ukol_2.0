import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Booking {

    private Room room;
    private List<Guest> guests;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean typeOfVacation;

    public Booking(Room room, List<Guest> guests, LocalDate startDate, LocalDate endDate, Boolean typeOfVacation) {
        this.room = room;
        this.guests = guests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    public Room getRoom() {
        return room;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Boolean getTypeOfVacation() {
        return typeOfVacation;
    }

    public String getDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. M. yyyy");
        StringBuilder guestsDescription = new StringBuilder();
        for (Guest guest : guests) {
            guestsDescription.append(guest.getDescription()).append(", ");
        }
        return String.format("Rezervace: pokoj %d, hosté: %sod %s do %s, typ: %s",
                room.getRoomNumber(), guestsDescription.toString(), startDate.format(formatter), endDate.format(formatter), typeOfVacation);
    }
}
