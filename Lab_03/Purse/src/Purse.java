import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Purse {

    /* TODO */

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin coin) {
        Coin temp;
        for( temp : coins) {
           if(coin.equals(temp))
               return TRUE;
        }
        return FALSE;
    }

    public int count(Coin coin) {
        Coin temp;
        int i=0;
        for(temp : coins ){
            i++;
        }
        return i;
    }

    public Coin getMinimum() {
        /* TODO */
    }

    public Coin getMaximum() {
        /* TODO */
    }

    public double getTotal() {
        /* TODO */
    }

    public void remove(Coin coin) {
        /* TODO */
    }

    public boolean hasCoin(Coin coin) {
        /* TODO */
    }

    @Override
    public String toString() {
        /* TODO */
    }

    @Override
    public boolean equals(Object o) {
        /* TODO */
    }
}