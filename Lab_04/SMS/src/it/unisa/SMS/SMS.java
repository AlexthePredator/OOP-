package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
  private String mittente;
  private GregorianCalendar data;
  private int id;
  private String testo;

    public SMS(String mittente, GregorianCalendar data, int id, String testo) {
        this.mittente = mittente;
        this.data = data;
        this.id = id;
        this.testo = testo;
    }

    public GregorianCalendar getDate(){
      return this.data;
  }

  public String getSender(){
      return  this.mittente;
  }

  public int getId(){
      return id;
  }

  public String getTesto(){
      return testo;
  }

    @Override
    public String toString() {
        return "SMS{" +
                "mittente='" + mittente + '\'' +
                ", data=" + data +
                ", id=" + id +
                ", testo='" + testo + '\'' +
                '}';
    }
}