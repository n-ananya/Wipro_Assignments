package Project8_CollectAndGroupCards;

import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class CollectAndGroupCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Card>> cardMap = new HashMap<>();

        System.out.print("Enter Number of Cards : ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Collect card details
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter card " + i + " : ");
            String input = sc.nextLine().trim();

            if (input.length() < 2) {
                System.out.println("Invalid input. Try again.");
                i--; 
                continue;
            }

            String symbol = input.substring(0, 1).toLowerCase();
            int number = Integer.parseInt(input.substring(1));

            Card card = new Card(symbol, number);

            // Add card to the map
            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(card);
        }

        // Display all distinct symbols (sorted)
        List<String> symbols = new ArrayList<>(cardMap.keySet());
        Collections.sort(symbols);

        System.out.print("Distinct Symbols are: ");
        for (String sym : symbols) {
            System.out.print(sym + " ");
        }
        System.out.println();

        // Print grouped details
        for (String sym : symbols) {
            List<Card> cards = cardMap.get(sym);
            System.out.println("Cards in " + sym + " Symbol");
            int sum = 0;
            for (Card c : cards) {
                System.out.println(c);
                sum += c.getNumber();
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}

