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
        for(Coin temp : coins) {
           if(coin.equals(temp))
               return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int i=0;
        for(Coin temp : coins ){
            if(coin.equals(temp))
                i++;
        }
        return i;
    }

    public Coin getMinimum() {
        if(coins.size() == 0)
            return null;
        Coin minimo = coins.get(0);
        for(Coin single : coins){
           if(single.getValue() < minimo.getValue())
               minimo = single;
        }
        return minimo;
    }

    public Coin getMaximum() {
        if(coins.size() == 0)
            return null;
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
        coins.remove(coin);
        /*
        for(Coin single : coins){
            if(coin.equals(single))
                coins.remove(single);
        }*/
    }

    public boolean hasCoin(Coin coin) {
        for(Coin single : coins){
            if(coin.equals(single))
                return true;
        }
        return false;
        //return coins.contains(coin);  //singola riga per usare arrayList
    }

    @Override
    public String toString() {
        return "Purse[" +
                "Dollar = " + count(DOLLAR) + ", " +
                "Quarter = " + count(QUARTER) + ", " +
                "Dime = " + count(DIME) + ", " +
                "Nickel = " + count(NICKEL) + ", " +
                "Cent = " + count(CENT) + "]";
    }

    @Override   //stiamo "sovrascrivendo" un metodo di un oggetto
    public boolean equals(Object o) {
        if( this == o )
            return true;
        if( o == null || getClass() != o.getClass())
            return false;
        Purse purse = (Purse) o;    //rendo variabile purse uguale a "o" come un oggetto Purse
        return purse.count(DOLLAR) == this.count(DOLLAR) &&
                purse.count(QUARTER) == this.count(QUARTER) &&
                purse.count(DIME) == this.count(DIME) &&
                purse.count(NICKEL) == this.count(NICKEL) &&
                purse.count(CENT) == this.count(CENT) ;
        //questi and restituiscono true solo se tutti true,
        // è come se fosse un if con and e poi return true;
    }
}