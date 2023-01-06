public interface ValidatePhone {
    static void validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException{
        boolean check;
        check = PhoneValidation.phoneValidation(phoneNumber);

        if(!check){
            throw new WrongPhoneNumberException();
        }
        else{
            System.out.println("Valid phone number!");
        }
    }
}
