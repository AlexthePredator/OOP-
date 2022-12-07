package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
  private final String mittente;
  private final GregorianCalendar data;
  private final int id;
  private final String testo;

  public void SMS(String mittente, GregorianCalendar data, String testo){
      this.mittente = mittente;
      this.data = data;
      this.testo = testo;
  }

  public GregorianCalendar getDate(){
      return this.data;
  }

  public char getSender(){
      return  this.mittente;
  }

  public int getId(){
      return id;
  }

  public String getTesto(){
      return testo;
  }
}