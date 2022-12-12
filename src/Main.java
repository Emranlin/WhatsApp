import service.impl.PersonServiceImpl;
import service.impl.WhatsAppServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonServiceImpl personService=new PersonServiceImpl();
        WhatsAppServiceImpl whatsAppService=new WhatsAppServiceImpl();
        while (true){

            System.out.println("""
                    1.Get all passport
                    2.Find by first name
                    3.Get all city
                    4.Create passport
                    5.See all status
                    6.Get all whatsApp
                    7.Install  whatsapp
                    8.Change Status
                    9.See a profile
                    10.Add contact
                    11.Send Message
                    >>>>>>>>>>>Select your command:1
                    
                    """);
            switch (new Scanner(System.in).nextByte()) {
                case 1 -> System.out.println(personService.getAllPassport());
                case 2 -> System.out.println(personService.findByFirstName());
                case 3 -> personService.getAllCity();
                case 4 -> System.out.println(personService.createPassport());
                case 5-> whatsAppService.getWhatsappStatus();
                case 6-> System.out.println(whatsAppService.getAllWhatsApp());
                case 7-> System.out.println(whatsAppService.installWhatsapp());
                case 8-> System.out.println(whatsAppService.changeStatus());
                case 9-> System.out.println(whatsAppService.goToProfile());
                case 10-> System.out.println(whatsAppService.addContact());
                case 11->whatsAppService.sendMessage();

            }
        }


    }
}