import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {
    private final int[][] square;
    private final int n;

    public MagicSquare(int n) {
        this.n = n;
        square = new int[n][n];
    }

    private boolean find(int x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFull() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void add(int x) {
        boolean temp = true;
    for (int i = 0; i < n && temp; i++) {
            for (int j = 0; j < n && temp; j++) {
                if( square[i][j] == 0){
                    square[i][j] = x;
                    temp = false;
                }
            }
        }
    }

    public boolean isMagic() {
        int magicNumber = 0;
        boolean isMagic = true;
        int sum = 0;
        for (int i = 0; i < n && isMagic; i++) {    //controllo righe
            sum = 0;
            for (int j = 0; j < n; j++) {
                    sum += square[i][j];
                    if(i==0 && j==n-1)
                        magicNumber = sum;
                    if(magicNumber != sum && j==n-1)
                        isMagic = false;
            }
        }
        for (int j = 0; j < n && isMagic; j++) {    //controllo colonne
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += square[i][j];
                if(magicNumber != sum && i==n-1)
                    isMagic = false;
            }
        }
        sum=0;
        for(int i=0; i<n && isMagic; i++){  //controllo diagonale principale
            sum += square[i][i];
            if(magicNumber != sum && i==n-1)
                isMagic = false;
        }
        sum=0;
        for (int i = 0; i < n && isMagic; i++) { //controllo altra diagonale
            for (int j = n; j < n; j--) {
                if(magicNumber != sum && i==n-1)
                    isMagic = false;
            }
        }
        return isMagic;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                toString.append(square[i][j]).append(" ");
            }
            toString.append("\n");
        }
        return toString.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("Inserisci numero lato quadrato n --> ");
        int n = input.nextInt();
        MagicSquare square = new MagicSquare(n);

        while (!square.isFull()) {
            int x;
            do {
                System.out.print("Inserisci un numero --> ");
                x = input.nextInt();

                if (x < 1 || x > n * n) {
                    System.out.println("Devi inserire numeri compresi tra 1 e n^2!");
                } else {
                    if (square.find(x)) {
                        System.out.println("Questo numero lo avevi già inserito!");
                    }
                }
            } while (square.isFull() || x < 1 || x > n * n);
            square.add(x);
            System.out.println(square);
        }

        /*square.add(2);
        square.add(7);
        square.add(6);
        square.add(9);
        square.add(5);
        square.add(1);
        square.add(4);
        square.add(3);
        square.add(8);*/

        boolean magic = square.isMagic();

        if (magic)
            System.out.println("È un quadrato magico!");
        else
            System.out.println("Non è un quadrato magico!");

    }
}