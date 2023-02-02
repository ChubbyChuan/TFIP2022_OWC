package workshop.Game;

public class Card {

    // members
        private String suit; 
        private String name;
        private int rank;

        public Card (String suit, String name, int rank) {
        this.suit = suit;
        this.name = name;
        this.rank = rank;
        }

        public String getSuit() {
            return suit;  }

        public void setSuit(String suit) {
            this.suit = suit; }

        public String getName() {
            return name;  }

        public void setName(String name) {
            this.name = name; }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString(){
           
            return "Card{suit=s, name=%s, rank=%s".formatted(this.suit, this.name, this.rank);
        }

        
    
    // // members
    // private String[] suits; 
    // private String[] Index;
    // private int deckcount = 52; // dont need to be expose to user, no get/set
    
    // // constructor
    // public Cards(){
    
    //     String[] suits = new String [4];
    //     suits[0] = "spades";
    //     suits[1] = "hearts";
    //     suits[2] = "clubs";
    //     suits[3] = "diamonds";
    //     String[] Index = new String [13];
    //     Index[0] = "1";
    //     Index[1] = "2";
    //     Index[2] = "3";
    //     Index[3] = "4";    
    //     Index[4] = "5";
    //     Index[5] = "6";
    //     Index[6] = "7";
    //     Index[7] = "8";   
    //     Index[8] = "9";
    //     Index[9] = "10";
    //     Index[10] = "J";
    //     Index[11] = "Q"; 
    //     Index[11] = "K"; 
    // }

    // //getter + setter
    // public String getSuits() {
    //     return suits;
    // }
    // public void setSuits(String suits) {
    //     this.suits = suits;
    // }
    // public String getIndex() {
    //     return Index;
    // }
    // public void setIndex(String index) {
    //     Index = index;
    // }
    // public int getDeckcount() {
    //     return deckcount;
    // }
    // public void setDeckcount(int deckcount) {
    //     this.deckcount = deckcount;
    // }
    

    // public void shuffle(){
        
    //     Random rand = new Random();
    //     int random = rand.nextInt(20) + 1;
    //     suits = 
        
    //     for (int i = 0; i < suits.length; i++) {
	// 		int j = i + random;
    //         suits[i] = suits[j];

    //     }
    // }

    // public void takecards(){
        
    //     Random rand = new Random();
    //     int random = rand.nextInt(52) + 1;
    //     deckcount = deckcount - random;       
    //     }
    // }

    
    
}
