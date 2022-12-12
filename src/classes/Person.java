package classes;

import java.util.List;

public class Person {
    private List<Passport> passports;
    private List<Contact> whatsApps;

    public Person(List<Passport> passports, List<Contact> whatsApps) {
        this.passports = passports;
        this.whatsApps = whatsApps;
    }
}