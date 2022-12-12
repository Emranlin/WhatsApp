package service;

import classes.Passport;

import java.util.List;

public interface PersonService {
    String createPassport();
    List<Passport> findByFirstName();
    List<Passport> getAllPassport();
    void getAllCity();




}
