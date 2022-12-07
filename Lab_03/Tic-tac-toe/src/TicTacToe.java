import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("| \n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        //se vince x restituisce player1
        // se vince o restituisce player2

        for(int i=0; i< ROWS; i++) {
            if ((board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) ) &&  ) {   //controlla righe
                if (board[i][1].equals(player1))
                    return player1;
                else
                    return player2;
            }
            else
                return null;
        }
        for(int j=0; j< COLUMNS; j++) {
            if (board[0][j].equals(board[1][j].equals(board[2][j]))) {   //controlla colonne
                if (board[0][j].equals(player1))
                    return player1;
                else
                    return player2;
            }
        }
        if (board[0][0].equals(board[1][1].equals(board[2][2]))) {   //controlla diagonale1
            if (board[0][0].equals(player1))
                return player1;
            else
                return player2;
            }
        if (board[0][2].equals(board[1][1].equals(board[2][0]))) {   //controlla diagonale2
            if (board[0][2].equals(player1))
                return player1;
            else
                return player2;
        }
        return "Nessun Vincitore";
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                game.set(row, column, player);  //set on game tic-tac-toc

                System.out.println(game);   //stampa il tavolo aggiornato

                System.out.println("Ha Vinto: " + game.getWinner());

                if(player.equals(player1))
                    player = player2;
                else
                    player = player1;
            }

        } while (row < ROWS && column < COLUMNS);
    }
}