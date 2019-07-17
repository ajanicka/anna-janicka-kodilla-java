package com.kodilla.good.patterns.challenges;

public class MailService implements ProductInformationService {
    @Override
    public void inform(User user) {
        System.out.println("Mail sended");
    }
}
