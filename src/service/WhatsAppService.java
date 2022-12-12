package service;

import classes.Profile;

import java.util.List;

public interface WhatsAppService {
    String installWhatsapp();
    List<Profile>getAllWhatsApp();
    void getWhatsappStatus();
    Profile goToProfile();
    String changeStatus();
    String addContact();
    void sendMessage() throws Exception;



}
