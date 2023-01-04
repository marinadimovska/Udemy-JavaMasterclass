public class User implements ValidatePhone {
    private String name;
    private String pass;
    private String number;

    public User(String name, String pass, String number) {
        this.name = name;
        this.pass = pass;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
