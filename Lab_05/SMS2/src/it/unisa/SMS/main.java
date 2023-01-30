package it.unisa.SMS;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        GregorianCalendar a = new GregorianCalendar(2022, Calendar.OCTOBER, 16, 15, 1);
        SMS sms1 = new SMS("Dario", a, "Ciao");
        GregorianCalendar b = new GregorianCalendar(2022, Calendar.OCTOBER, 16, 15, 2);
        SMS sms2 = new SMS("Anna", b, "Ciao");
        GregorianCalendar c = new GregorianCalendar(2022, Calendar.OCTOBER, 16, 15, 2);
        SMS sms3 = new SMS("Simone", c,  "OnePiece");

        SMSOrganizer org = new SMSOrganizer();
        org.addSMSToOrganizer(sms3);
        org.addSMSToOrganizer(sms2);
        org.addSMSToOrganizer(sms1);

        org.getListBySender();

        for(SMS s : org.getMessages())
            System.out.println(s);

    }
}