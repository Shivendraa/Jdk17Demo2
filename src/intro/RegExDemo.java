package intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String email = "Hello, My email is Sania@gmail.com and In case it does not work it is Sania2@gmail.in";
        String pattern = ".*@.*\\..*";
        boolean match = Pattern.matches(pattern, email);
        System.out.println(match ? "Valid email" : "Invalid Email");

        String pattern2 = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(pattern2);
        Matcher matcher = p.matcher(email);
        while (matcher.find()){
            System.out.println("Email is : " + matcher.group());
        }

        String number = "0221345434";
        String numPattern = "\\d{3}-\\d{7}";
        String numPattern2 = "\\d{10}";
        boolean isValid = number.matches(numPattern2);
        System.out.println(isValid ? "Valid number" : "Invalid number");

        String text = "Hello      this    is     world.";
        String rep = text.replaceAll("\\s+"," ");
        System.out.println("String replaced: " + rep);

    }
}
