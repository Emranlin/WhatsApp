package service.impl;

import classes.Passport;
import classes.Person;
import enums.Country;
import enums.Gender;
import service.PersonService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    private List<Passport> passportList = new ArrayList<>();

    public List<Passport> getPassportList() {
        return passportList;
    }

    public void setPassportList(List<Passport> passportList) {
        this.passportList = passportList;
    }

    @Override
    public String createPassport() {

        System.out.print("Id: ");
        long id=new Scanner(System.in).nextLong();
        System.out.print("First name: ");
        String name=new Scanner(System.in).next();
        System.out.print("Last name: ");
        String lastName=new Scanner(System.in).next();
        System.out.print("Date of birth (yy-mm-dd) : ");
        String[] birthDateList = new Scanner(System.in).nextLine().trim().split("-");
        System.out.print("Country : ");
        Country country =Country.valueOf(new Scanner(System.in).next().toUpperCase());
        System.out.print("Gender : ");
        Gender gender = Gender.valueOf(new Scanner(System.in).next().toUpperCase());
        LocalDate dateOfBirth = LocalDate.of(
                Integer.parseInt(birthDateList[0]),
                Integer.parseInt(birthDateList[1]),
                Integer.parseInt(birthDateList[2]));
        Passport passport=new Passport(id,name,lastName,dateOfBirth,country,gender);
        passportList.add(passport);
        return "Passport  successfully saved!";

    }

    @Override
    public List<Passport> findByFirstName() {
        System.out.println("Please enter the first name");
        String firstName=new Scanner(System.in).next();
        List<Passport>firstNameOfPassport=new ArrayList<>();
        for (Passport passport : passportList) {
            if(passport.getName().equals(firstName)) {
                firstNameOfPassport.add(passport);
            }
        }

        return firstNameOfPassport;
    }

    @Override
    public List<Passport> getAllPassport() {
        return passportList;
    }


    @Override
    public void getAllCity() {
        Country[] countries=Country.values();
        int counter=1;
        for (Country country : countries) {
            System.out.println(counter+++"."+country);
        }

    }
}
