package SchoolWork3;

public class RandomUppercaseLetter {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 26);
        char randomUppercaseLetter = (char)(randomNum + 'A');
        System.out.println("Random Uppercase Letter: " + randomUppercaseLetter);
    }
}