import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneValidation{
    Pattern pattern;
    Matcher matcher;
    private static final String phonePattern = "[0-9]{10}";


    public static boolean phoneValidation(String number){

        Pattern pattern = Pattern.compile(phonePattern);

        Matcher matcher = pattern.matcher(number);

        return matcher.matches();

    }
}
