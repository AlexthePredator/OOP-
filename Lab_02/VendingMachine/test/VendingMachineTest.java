import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
  public static void main(String[] args){
      int numCans = 10;
      VendingMachine cocaCola = new VendingMachine(numCans);
      System.out.print("Numero di cocaCola: ");
      System.out.println(cocaCola.getNumberOfCans());
      System.out.print("numero di gettoni: ");
      System.out.println(cocaCola.getNumberOfTokens());

      cocaCola.addCans(5);
      System.out.print("Numero di cocaCola: ");
      System.out.println(cocaCola.getNumberOfCans());

      for(int i=0; i<6; i++) {
          cocaCola.takeCan();
      }
      System.out.print("Numero di cocaCola: ");
      System.out.println(cocaCola.getNumberOfCans());
      System.out.print("numero di gettoni: ");
      System.out.println(cocaCola.getNumberOfTokens());

      cocaCola.takeTokens();
      System.out.print("Numero di cocaCola: ");
      System.out.println(cocaCola.getNumberOfCans());
      System.out.print("numero di gettoni: ");
      System.out.println(cocaCola.getNumberOfTokens());

  }
}