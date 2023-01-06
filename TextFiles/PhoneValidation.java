import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {
    Pattern pattern;
    Matcher matcher;

    private static final String PHONE_PATTERN = "[0-9]{10}";

    public static boolean phoneValidation(String phoneNumber){
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }


}
