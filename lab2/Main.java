import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку #");
        String input2 = scanner.nextLine();
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);
        System.out.println("Результат для abcdefghijklmnopqrstuv18340: " + matcher1.matches());
        System.out.println("Результат для input: " + matcher2.matches());
    }
}
