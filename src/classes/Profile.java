package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Profile {
    private String phoneNumber;
    private String userName;
    private String password;
    private String image;
    private Status status;
    private List<Contact> contacts;
    private List<Message> messages ;
    public void addContact(Contact contact){
        if(contacts==null){
            contacts=new ArrayList<>();
        }
        contacts.add(contact);
    }

    public Profile(String phoneNumber, String userName, String password, String image, Status status, List<Contact> contacts, List<Message> messages) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.image = image;
        this.status = status;
        this.contacts = contacts;
        this.messages = messages;
    }

    public Profile(String phoneNumber, String userName, String password, String image, Status status) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.image = image;
        this.status = status;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Message> getMessages() {
        return (List<Message>) messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = (List<Message>) messages;
    }

    @Override
    public String toString() {
        return "\nProfile " +
                "\nPhoneNumber='" + phoneNumber +
                "\nUserName='" + userName +
                "\nPassword='" + password +
                "\nImage='" + image +
                "\nStatus=" + status +
                "\nContacts=" + contacts +
                "\nMessages=" + messages +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}

