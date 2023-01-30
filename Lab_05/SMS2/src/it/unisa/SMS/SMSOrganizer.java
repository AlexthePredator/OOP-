package it.unisa.SMS;

import java.util.*;

public class SMSOrganizer {
    final private List<SMS> messages;

    public SMSOrganizer() {
        messages = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS sms) {
        this.messages.add(sms);
    }

    public List<SMS> getListByDate() {
        Comparator<SMS> mmm = (s1,s2) -> s1.getDate().compareTo(s2.getDate());
        Collections.sort(messages, mmm);
        return this.messages;
    }

    public List<SMS> getListBySender() {
        Comparator<SMS> mmm = (s1,s2) -> s1.getSender().compareTo(s2.getSender());
        Collections.sort(messages, mmm);
        return this.messages;
    }

    public List<SMS> getMessages() {
        return messages;
    }
}
