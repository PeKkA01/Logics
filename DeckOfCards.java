import java.util.*;
public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"spade","heart","club","diamond"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        int index = 0;
        for (int i = 0; i < suits.length ; i++) {
            for (int j = 0; j < rank.length ; j++) {
                deck[index++] = rank[j]+ " of "  +suits[i];
            }
        }
        Random r = new Random();
        for (int i = 0; i < deck.length ; i++) {
            int r1 = r.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[r1];
            deck[r1] = temp;
        }
        String[][] player = new String[4][9];
        int countindex = 0;
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 9 ; j++) {
                player[i][j] = deck[countindex++];
            }

        }
        for (int i = 0; i < 4 ; i++) {
            System.out.println("player "+(i+1)+" cards: ");
            for (int j = 0; j < 9; j++) {
                System.out.println(player[i][j]);
            }
        }

        }

    }

