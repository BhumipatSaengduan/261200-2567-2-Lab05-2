public class Lec05 extends User{
    public static void main(String[] args) {
        User john = new User("John", 1954, 12, 18);
        john.displayInfo();
        john.displayHappyBirthday();
        System.out.println("______________________________________");
        
        Admin nicolas = new Admin("Nicolas", 1964, 12, 18);
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();
        System.out.println("______________________________________");

        nicolas.displayInfo(true);
        System.out.println("______________________________________");
        
        nicolas.displayInfo(false);
        System.out.println("______________________________________");
    }
}
