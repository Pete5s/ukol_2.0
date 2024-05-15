import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    public static void main(String[] args) {
        // Vytvoření hostů
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        // Výpis informací o hostech
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        // Vytvoření pokojů
        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        // Výpis informací o pokojích
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        // Vytvoření rezervací
        List<Guest> guests1 = new ArrayList<>();
        guests1.add(adela);
        Booking booking1 = new Booking(room1, guests1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), "rekreační");

        List<Guest> guests2 = new ArrayList<>();
        guests2.add(adela);
        guests2.add(jan);
        Booking booking2 = new Booking(room3, guests2, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "rekreační");

        // Správce rezervací
        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);

        // Výpis všech rezervací
        bookingManager.printAllBookings();
    }
}