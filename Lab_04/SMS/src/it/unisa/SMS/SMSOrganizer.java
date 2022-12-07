package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    private ArrayList<SMS> messages;

    public void SMSOrganizer(){
        messages = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS newSMS){
        this.messages.add(newSMS);
    }

    public ArrayList<SMS> getListByDate(){
        this.messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS sms, SMS sms2) {
                return ; // ????????
            }
        });
        return this.messages;
    }

    public ArrayList<SMS> getListBySender(){

    }
}
