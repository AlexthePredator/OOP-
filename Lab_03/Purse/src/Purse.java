import java.util.ArrayList;
import java.util.List;

public class Purse {

    static final Coin DOLLAR = new Coin("Dollar", 1.00 );
    static final Coin QUARTER = new Coin("Quarter", 0.25);
    static  final Coin DIME = new Coin("Dime", 0.10);
    static final Coin NICKEL = new Coin("Nickel", 0.05);
    static final Coin CENT = new Coin("Cent", 0.01);

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
               return true;
        }
        return false;
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
        Coin minimo = coins.get(0);
        for(Coin single : coins){
           if(single.getValue() < minimo.getValue())
               minimo = single;
        }
        return minimo;
    }

    public Coin getMaximum() {
        Coin max = coins.get(0);
        for(Coin single : coins){
            if(single.getValue() > max.getValue())
                max = single;
        }
        return max;
    }

    public double getTotal() {
        double tot = 0;
        for(Coin single : coins){
            tot += single.getValue();
        }
        return tot;
    }

    public void remove(Coin coin) {
        for(Coin single : coins){
            if(coin.equals(single))

        }
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