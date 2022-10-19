import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    public static void main(String[] args){
        Car perfetta = new Car(1);
        Car v8 = new Car(5);

        double gas = 100;
        perfetta.addGas(gas);
        v8.addGas(gas);
        System.out.println(perfetta.getGas());
        System.out.println(v8.getGas());
        double km = 20;
        perfetta.drive(km);
        v8.drive(km);
        System.out.println("Gas rimanente: ");
        System.out.println(perfetta.getGas());
        System.out.println(v8.getGas());

    }
}