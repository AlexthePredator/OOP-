package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    private ArrayList<SMS> messages = new ArrayList<>();


    public void addSMSToOrganizer(SMS newSMS){
        this.messages.add(newSMS);
    }

    public ArrayList<SMS> getListByDate(){
        this.messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS sms, SMS sms2) {
                return sms.getDate().compareTo(sms2.getDate());
            }
        });
        return this.messages;
    }

    public ArrayList<SMS> getListBySender(){
        this.messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS sms, SMS sms2) {
                return sms.getSender().compareTo(sms2.getSender());
            }
        });
        return this.messages;
    }

    public ArrayList<SMS> getMessages() {
        return messages;
    }
}
