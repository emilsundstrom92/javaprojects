

abstract class CoinStack {
    private int coins;

    public CoinStack(int initialCoins) {
        this.coins = initialCoins;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    // Abstract method to be implemented by subclasses
    public abstract void subtractCoins(int amount);
}

class Subclass1 extends CoinStack {
    public Subclass1(int initialCoins) {
        super(initialCoins);
    }

    @Override
    public void subtractCoins(int amount) {
        if (amount <= getCoins()) {
            setCoins(getCoins() - amount);
            System.out.println("Subclass 1 subtracted " + amount + " coins.");
        } else {
            System.out.println("Not enough coins to subtract " + amount);
        }
    }
}

class Subclass2 extends CoinStack {
    public Subclass2(int initialCoins) {
        super(initialCoins);
    }

    @Override
    public void subtractCoins(int amount) {
        if (amount <= getCoins()) {
            setCoins(getCoins() - amount);
            System.out.println("Subclass 2 subtracted " + amount + " coins.");
        } else {
            System.out.println("Not enough coins to subtract " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int initialCoins = 10;

        // Create instances of the subclasses
        Subclass1 subclass1 = new Subclass1(initialCoins);
        Subclass2 subclass2 = new Subclass2(initialCoins);

        // Subclass 1 subtracts 3 coins
        subclass1.subtractCoins(3);
        System.out.println("Remaining coins after Subclass 1: " + subclass1.getCoins());

        // Subclass 2 subtracts 5 coins from the remaining stack
        subclass2.subtractCoins(5);
        System.out.println("Remaining coins after Subclass 2: " + subclass2.getCoins());
    }
}
