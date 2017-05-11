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
    private String[] card;
    public Chance(){
    String[] cards= new String[3];    
    cards[0]="Get Money";
    cards[1]="Get Taxed";
    cards[2]="Get Reimbursed";
    card=cards;
    }
}
