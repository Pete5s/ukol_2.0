import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


class Main {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Guest(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getDescription() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. M. yyyy");
        return String.format("%s %s (%s)", firstName, lastName, birthDate.format(formatter));
    }
}





