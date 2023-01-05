import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practic {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String mail = scanner.nextLine();
        Matcher matcher = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\[a-zA-Z0-9]+$")
                .matcher(mail);
        System.out.println(matcher.matches());
    }
}

