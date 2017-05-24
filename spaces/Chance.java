/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author 761843
 */
public class Chance extends carddraw{
    private static String[] card;
    public Chance(){
        super("Chance");
    String[] cards= new String[4];    
    cards[0]="Advance to Go";
    cards[1]="Pay poor tax of $15 ";
    cards[2]="You have won a crossword competition - Collect $100";
    cards[3]="Make general repairs on all your property – For each house pay $25";
    card=cards;
    }
    public static String drawcard(){
        int c= (int)(Math.random()*4);
        return card[c];
    }
}
