package Project7_CollectUniqueSymbols;

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

    // To ensure uniqueness in Set based on symbol + number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return number == card.number && symbol.equals(card.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, number);
    }
}

public class CollectUniqueSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Card> cardSet = new HashSet<>();
        Set<String> symbolSet = new HashSet<>();
        int count = 0;

        while (symbolSet.size() < 4) {
            System.out.print("Enter a card : ");
            String input = sc.nextLine().trim();

            if (input.length() < 2) {
                System.out.println("Invalid input, try again.");
                continue;
            }

            String symbol = input.substring(0, 1).toLowerCase();
            int number = Integer.parseInt(input.substring(1));

            Card card = new Card(symbol, number);
            cardSet.add(card);
            symbolSet.add(symbol);
            count++;
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        // Sort the set in alphabetical order by symbol
        List<Card> sortedCards = new ArrayList<>(cardSet);
        sortedCards.sort(Comparator.comparing(Card::getSymbol));

        System.out.println("Cards in Set are :");
        for (Card c : sortedCards) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}

