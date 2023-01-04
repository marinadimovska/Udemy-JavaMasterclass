import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone  {
    static void validatePhoneNumber(String number) throws WrongPhoneNumberException{
        boolean check;
        check = phoneValidation.phoneValidation(number);

        if(!check){
            throw new WrongPhoneNumberException();
        }
        else{
            System.out.println("Valid GSM");
        }
    }




}
