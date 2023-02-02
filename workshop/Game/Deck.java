package workshop.Game;

import java.util.LinkedList;
import java.util.List;

public class Deck {


    public String[] SUIT = {"Diamond", "Heart", "Spade", "Club"};
    public String[] NAME = {"Ace", "2", "3", "4","5", "6", "7", "8", "9", "10","Jack", "Queen","King"};

    public int[] RANK = {1,2,3,4,5,6,7,8,9,10,10,10};
    
    //private Card[] cards = new Card[52];
    private List <Card> cards = new LinkedList<>();

    public Deck(){
        for (int s = 0; s < SUIT.length; s++){
            for (int j = 0; j < NAME.length; j++){
                Card c = new Card(SUIT[s], NAME[j], RANK[j]);
                cards.add(c);
            }
            
        }
        for (int s = 0; s < cards.size(); s++){
            System.out.printf("> %s\n", cards.get(s));
        }
    }

    //     int i =0;
    //     int j = 0;
    //     while (s < SUIT.length){
    //         j=0;
    //         while (j<NAME.length){
    //             Card c = new Card(SUIT{i}, NAME[j], RANK[j]);
    //             j++;
    //         }
    //         i++;
    //     }
    // }
    
}
