package classes;

public class Contact {
    private String userName;
    private String phoneNumber;

    public Contact(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact" +
                "\nUserName " + userName +
                "\nPhoneNumber" + phoneNumber +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}