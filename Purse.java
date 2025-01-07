import java.util.HashMap;

public class Purse {
    private HashMap<String, Integer> coins;

    public Purse() {
        this.coins = new HashMap<>();
    }

    public void addCoins(String coinType, int count) {
        coins.put(coinType, coins.getOrDefault(coinType, 0) + count);
    }

    public void removeCoins(String coinType, int count) {
        coins.put(coinType, coins.get(coinType) - count);
    }

    public void displayContent() {
        if (coins.isEmpty()) {
            System.out.println("The purse is empty.");
            return;
        }
        System.out.println("Purse contents:");
        coins.forEach((coinType, count) -> System.out.println(coinType + ": " + count + " coins"));
    }

}
