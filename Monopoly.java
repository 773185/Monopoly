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
import java.util.Scanner;
import java.util.ArrayList;

public class Monopoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Die d1 = new Die();
        Die d2 = new Die();
        
        boolean auction;

        ArrayList<BoardSpace> p1props = new ArrayList<BoardSpace>();
        ArrayList<BoardSpace> p2props = new ArrayList<BoardSpace>();
        ArrayList<BoardSpace> p3props = new ArrayList<BoardSpace>();
        ArrayList<BoardSpace> p4props = new ArrayList<BoardSpace>();
        
       

        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("How many players? (2-4)");
        int playernum = in.nextInt();

        System.out.println("Player " + (1) + ", What is your name?");
        String name = scan.next();

        Player p1 = new Player(name, 1, "Dog");
        System.out.println("Player " + (2) + ", What is your name?");
        name = scan.next();
        Player p2 = new Player(name, 2, "Top Hat");

        /* if(playernum==3){
           System.out.println("Player "+(3)+", What is your name?");
            name = scan.next();
               Player p3 = new Player(name, 3, "Money Bags");
           }

            if(playernum==4){
           System.out.println("Player "+(3)+", What is your name?");
            name = scan.next();
               Player p3 = new Player(name, 3, "Money Bags");
               System.out.println("Player "+(3)+", What is your name?");
            name = scan.next();
           Player p4 = new Player(name, 4, "Race Car");
           }        */
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        boolean play = true;
        int turn = 1;
        boolean rollpermission = true;
        int roll = 0;
        Property test = new Property("test", "test", 1, 1, 1, 1, 1);
        Class aProperty = test.getClass();
        // Board b1 = new Board();   //THIS IS THE PROBLEM
boolean b1,b2,b3,b4;
        while (play) {

            while (turn == 1) {

                int doubles = 0;
                if (rollpermission) {
                    roll = d1.roll() + d2.roll();
                    System.out.println("you rolled a " + d1.getFaceValue() + " and a " + d2.getFaceValue() + ".");
                    rollpermission = false;
                    p1.move(roll);
                    System.out.println("You are on square " + p1.getPosition());
                    System.out.println(Board.getSpace(p1.getPosition()));
                    if (Board.whatSpace(p1.getPosition()) instanceof Property) {
                        if (!Board.whatSpace(p1.getPosition()).isowned()) {
                            System.out.println("Would you like to purchase this property for " + Board.whatSpace(p1.getPosition()).getPrice() + "? (y/n)");
                            String purchase = scan.next();
                            if (purchase.equalsIgnoreCase("y")) {
                                if (Board.whatSpace(p1.getPosition()).getPrice() > p1.getMoney()) {
                                    System.out.println("You don't have enough money Chump. ");
                                    auction=true;
                                    Player.changeHighBid(0);
                                    int count=1;
                                    while(auction){

                                        System.out.println("Player "+count+" would you like to make a bid? y/n");
                                        if(scan.next().equalsIgnoreCase("y")){
                                            if(count==1){
                                            p1.makebid();
                                            count++;
                                            }else{
                                                if(count==2){
                                                p2.makebid();
                                                count--;
                                            }
                                            }
                                           
                                            
                                        }
                                        
                                    }
                                } else {
                                    p1.changemoney(Board.whatSpace(p1.getPosition()).getPrice());
                                    Board.whatSpace(p1.getPosition()).setTrue();
                                    p1props.add(Board.whatSpace(p1.getPosition()));
                                }

                            } else {
                                System.out.println("Alright it is going to Auction.");
                                auction=true;
                                while(auction){
                                    
                                }
                            }

                        } else {
                            System.out.println("You have to pay " + Board.whatSpace(p1.getPosition()).getRent());

                        }

                    }
                    if (d1.getFaceValue() == d2.getFaceValue()) {
                        doubles++;
                        rollpermission = true;
                        if (doubles == 3) {
                            System.out.println("GO TO JAIL!");
                        }
                    }

                }

                if (!rollpermission) {
                    turn++;
                }
            }
        }

    }

}
