import javax.naming.NameParser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
    Pattern pattern;
    Matcher matcher;

    private static final String NamePattern ="[a-z0-9-_]{3,15}";
    public boolean NameValidation(String name){
        pattern = pattern.compile(NamePattern);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }


}
