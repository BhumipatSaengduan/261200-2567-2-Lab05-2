import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Admin extends User {
    String name;
    LocalDate dob;

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin");
    }

    public void displayInfo(boolean full) {
        if (full) {
            displayInfo();
            DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MMMM d, YYYY");
            System.out.println("Date: " + dateformatter.format(LocalDate.now()));
        } else {
            System.out.println("Name: " + getName());
        } 
    }

    public void displayHappyBirthday() {
        int age = 2014 - getDob().getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
      }
}
