package service.impl;

import classes.Contact;
import classes.Message;
import classes.Profile;
import enums.Status;
import service.WhatsAppService;

import java.util.*;


public class WhatsAppServiceImpl implements WhatsAppService {
    List<Profile> profiles = new ArrayList<>();


    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String installWhatsapp() {
        try {
            System.out.print("Enter a your ID : ");
            long id = new Scanner(System.in).nextLong();

            System.out.print("Enter your phone number : ");
            String phoneNumber = new Scanner(System.in).nextLine();

            System.out.print("Enter your username : ");
            String username = new Scanner(System.in).nextLine().toLowerCase();

            System.out.print("Enter your password : ");
            String password = new Scanner(System.in).nextLine();


            for (Profile profile : profiles) {
                if (profile.getPhoneNumber().equals(phoneNumber)) {
                    throw new Exception("Phone number you've provided is used by someone else.");
                }
                if (profile.getUserName().equals(username))
                    throw new Exception("Username you've provided is used by someone else.");
            }
            List<Contact> newContactList = new ArrayList<>();
            List<Message> newMessages = new ArrayList<>();
            Profile newProfile =
                    new Profile(phoneNumber, username, password, "DEFAULT_IMAGE", Status.I_USE_WHATSAPP, newContactList, newMessages);
            profiles.add(newProfile);
            return "Profile Created Successfully.";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Profile creation FAILED!";
    }

    @Override
    public List<Profile> getAllWhatsApp() {
        return profiles;
    }

    @Override
    public void getWhatsappStatus() {
        Status[] statuses = Status.values();
        int counter = 1;
        for (Status status : statuses) {
            System.out.println(counter++ + "." + status);

        }

    }

    @Override
    public Profile goToProfile() {
        try {
            System.out.print("Enter your username : ");
            String username = new Scanner(System.in).nextLine().toLowerCase();
            System.out.print("Enter your password : ");
            String password = new Scanner(System.in).nextLine();

            if (username.isEmpty() || password.isEmpty())
                throw new Exception("Username || Password Validation Error!");

            for (Profile profile : profiles) {
                if (profile.getUserName().equals(username) && profile.getPassword().equals(password)) {
                    return profile;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String changeStatus() {
        System.out.println("Lets change your status ");
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).next();
        for (Profile profile : profiles) {
            if (profile.getPassword().equals(password)) {
                System.out.println("Current status" + profile.getStatus());
                System.out.println("Enter your new Status ");
                Status newStatus = Status.valueOf(new Scanner(System.in).next());
                profile.setStatus(newStatus);
            }

        }
        return "Status Successful changed";
    }

    @Override
    public String addContact() {
        List<Contact>contacts=new ArrayList<>();
        System.out.println("Add new contact to profile");
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if (username.equalsIgnoreCase(profile.getUserName()) ){
                System.out.println(" Enter your password :");
                String password = scanner.nextLine();
                if (profile.getPassword().equals(password)) {
                    System.out.println("Write contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println(" Write contact user name :");
                    String userName = scanner.nextLine();
                    profile.getContacts().add(new Contact(userName,phoneNumber));
                    System.out.println("Successful new contact added!");
               // } else {
                 //   return "Invalid password !";
                }
            //} else {
            //    return "Invalid user name !";

            }
        }
        return null;
    }


    @Override
    public void sendMessage() throws Exception {
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        for (Profile profile : profiles) {
            if (password.equalsIgnoreCase(profile.getPassword())) {
                System.out.println("Your contact " + profile.getContacts());
                System.out.println("Contact user name which you want send message:");
                String userName = new Scanner(System.in).nextLine();
                if (userName.equalsIgnoreCase(profile.getUserName())) {
                    while (true) {
                        for (Message message : profile.getMessages()) {
                            System.out.println(profile.getUserName() +" :: " + message.getMessage());
                        }
                        System.out.print("Message: ");
                        String message = new Scanner(System.in).next();
                        if (message.equals("exit()")) break;
                        if (message.isEmpty())
                            throw new Exception("Message can't be empty.");
                        else {
                            Message newMessage = new Message(message);
                            profile.getMessages().add(newMessage);
                    }
                }

            }
        }
    }
}
    }







