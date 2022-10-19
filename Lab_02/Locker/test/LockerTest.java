import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

public class LockerTest {
    public static void main(String[] args){
        Locker armadietto = new Locker();
        Scanner in = new Scanner(System.in);

        if(armadietto.isOpen()) {
            System.out.println("Inserire 3 caratteri maiuscoli come password: ");
            String password = in.nextLine();
            password.toUpperCase();
            armadietto.newComb(password);
        }

        armadietto.lock();
        while(!armadietto.isOpen()) {
            System.out.println("Inserire password per aprire serratura: ");
            String password = in.nextLine();
            password.toUpperCase();
            armadietto.unlock(password);
            if (armadietto.isOpen())
                System.out.println("Armadietto aperto!");
            else
                System.out.println("Armadietto chiuso!");
        }
    }
}