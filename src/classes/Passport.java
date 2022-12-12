package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Passport {
    private long Id;
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private Country placeOfBirth;
    private Gender gender;

    public Passport(long id, String name, String lastName, LocalDate birthDay, Country placeOfBirth, Gender gender) {
        Id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
    }



    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Country getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(Country placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " \nPassport " +
                "\nId  " + Id +
                "\nName " + name +
                "\nLastName " + lastName +
                "\nBirthDay " + birthDay +
                "\nPlaceOfBirth " + placeOfBirth +
                "\nGender " + gender +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
