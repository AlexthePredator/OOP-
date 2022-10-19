import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {
    public static void main(String[] args){
        Infected influenza = new Infected("Stagionale", 50);
        Infected covid = new Infected("Covid");

        System.out.print("Nome: "+influenza.getDisease());
        System.out.println("   Infetti: "+ influenza.getNumberOfInfected());

        System.out.print("Nome: "+ covid.getDisease());
        System.out.println("   Infetti: "+ covid.getNumberOfInfected());

        influenza.addInfected(50);
        covid.addInfected(5);
        System.out.print("Nome: "+influenza.getDisease());
        System.out.println("   Infetti: "+ influenza.getNumberOfInfected());
        System.out.print("Nome: "+ covid.getDisease());
        System.out.println("   Infetti: "+ covid.getNumberOfInfected());

        covid.updateInfectedByRt(3);
        System.out.print("Nome: "+influenza.getDisease());
        System.out.println("   Infetti: "+ influenza.getNumberOfInfected()+"  Rt=1");
        System.out.print("Nome: "+ covid.getDisease());
        System.out.println("   Infetti: "+ covid.getNumberOfInfected()+"  Rt=3");
    }
}