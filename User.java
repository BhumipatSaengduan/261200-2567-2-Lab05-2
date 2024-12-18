import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }
    
    public User(String name, int year, int month, int date) {
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now(); // Get today's date
        return today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayInfo() {
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MMMM d, YYYY");
        System.out.println(getName() + " was born on " + dateformatter.format(getDob()));
    }

    public void displayHappyBirthday() {
        if (isBirthday()) System.out.println("Happy birthday " + this.name + "!");
    }
}
