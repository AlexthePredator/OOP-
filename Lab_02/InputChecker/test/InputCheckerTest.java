import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class InputCheckerTest {
    public static void main(String[] args){
        InputChecker checker = new InputChecker();

        System.out.println("Dammi l'input di verifica: ");

        String[] affermazioni = { "No", "n", "sI", "s","perchè no?", "Mario Rossi"};
        InputChecker inputChecker = new InputChecker();

        for( String input : affermazioni){
            System.out.println(inputChecker.checkInput(input));
        }
    }
}