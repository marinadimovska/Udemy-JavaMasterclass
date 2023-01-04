import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassValidation {
    Pattern pattern;
    Matcher matcher;

    private static final String PassPattern = "[a-zA-z]{11,}";
    public boolean PassValidation(String pass){
        pattern = pattern.compile(PassPattern);
        matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}
