import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {

        String[] affermazioni = {"OK", "S", "SI", "certo", "perchè no?"};

        for( String s : affermazioni){
            if(input.equalsIgnoreCase(s)){
                 return("OK");
            }
        }
        if(input.equalsIgnoreCase("no") || input.equalsIgnoreCase("N") ){
            return("Fine");
        }
        else
            return("Dato non corretto");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}