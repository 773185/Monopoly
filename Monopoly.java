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
        
        Die d1 = new Die();
        Die d2 = new Die();
        boolean auction;
        
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
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        boolean play = true;
        int turn = 1;
        boolean rollpermission = true;
        int roll;
        
        while (play) {
            while (turn == 1) {
                System.out.println("_______________________________");
                System.out.println("_______________________________");
                int doubles = 0;
                if (rollpermission) {
                    roll = d1.roll() + d2.roll();
                    System.out.println("you rolled a " + d1.getFaceValue() + " and a " + d2.getFaceValue() + ".");
                    rollpermission = false;
                    if (d1.getFaceValue() == d2.getFaceValue()) {
                        //d1.getFaceValue() == d2.getFaceValue()
                        doubles++;
                        System.out.println("Because you rolled doubles, you get to roll again. Grats man. ");
                        rollpermission = true;
                        if (doubles == 3) {
                            System.out.println("GO TO JAIL!");
                            turn++;
                        }
                    }
                    p1.move(d1.getFaceValue(),d2.getFaceValue());
                    System.out.println("You are on square " + p1.getPosition());
                    System.out.println(Board.getSpace(p1.getPosition()));
                    if (Board.whatSpace(p1.getPosition()) instanceof Property) {
                        if (!Board.whatSpace(p1.getPosition()).isowned()) {
                            System.out.println("Would you like to purchase this property for " + Board.whatSpace(p1.getPosition()).getPrice() + "? (y/n)");
                            String purchase = scan.next();
                            if (purchase.equalsIgnoreCase("y")) {
                                if (Board.whatSpace(p1.getPosition()).getPrice() > p1.getMoney()) {
                                    System.out.println("You don't have enough money Chump. ");
                                    auction = true;
                                    Player.changeHighBid(0);
                                    int count = 1;
                                    while (auction) {
                                        System.out.println("Player " + count + " would you like to make a bid? y/n");
                                        if (scan.next().equalsIgnoreCase("y")) {
                                            if (count == 1) {
                                                p1.makebid();
                                                count++;
                                            } else if (count == 2) {
                                                p2.makebid();
                                                count--;
                                            }
                                        } else {
                                            if (count == 1) {
                                                System.out.println("Player 2 has earned the property for " + Player.getHighBid());
                                                p2.changeBank(Player.getHighBid());
                                                auction = false;
                                                Board.whatSpace(p1.getPosition()).switchOwner("p2");
                                            } else if (count == 2) {
                                                System.out.println("Player 1 has earned the property for " + Player.getHighBid());
                                                p1.changeBank(Player.getHighBid());
                                                auction = false;
                                                Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                            }
                                        }
                                    }
                                } else {
                                    p1.buyProperty(Board.whatSpace(p1.getPosition()).getPrice());
                                    Board.whatSpace(p1.getPosition()).setTrue();
                                    Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                }
                            } else {
                                System.out.println("Alright it is going to Auction.");
                                auction = true;
                                Player.changeHighBid(0);
                                int count = 1;
                                while (auction) {
                                    System.out.println("Player " + count + " would you like to make a bid? y/n");
                                    if (scan.next().equalsIgnoreCase("y")) {
                                        if (count == 1) {
                                            p1.makebid();
                                            count++;
                                        } else if (count == 2) {
                                            p2.makebid();
                                            count--;
                                        }
                                    } else {
                                        if (count == 1) {
                                            System.out.println("Player 2 has earned the property for " + Player.getHighBid());
                                            p2.changeBank(-Player.getHighBid());
                                            auction = false;
                                            Board.whatSpace(p1.getPosition()).switchOwner("p2");
                                        } else if (count == 2) {
                                            System.out.println("Player 1 has earned the property for " + Player.getHighBid());
                                            p1.changeBank(-Player.getHighBid());
                                            auction = false;
                                            Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("You have to pay " + Board.whatSpace(p1.getPosition()).getRent());
                            if (Board.whatSpace(p1.getPosition()).getOwner().equalsIgnoreCase("p1")) {
                                if (turn == 2) {
                                    System.out.println("Player one owns this property. ");
                                    p2.changeBank(Board.whatSpace(p2.getPosition()).getRent());
                                    p1.earnrent(Board.whatSpace(p2.getPosition()).getRent());
                                } else {
                                    if (turn == 1) {
                                        System.out.println("Feels like home");
                                    }
                                }
                            }
                        }
                    }else{
                        if(Board.whatSpace(p1.getPosition()) instanceof Chance){
                            p1.chance(Chance.drawcard());
                        }
                        if(Board.whatSpace(p1.getPosition()) instanceof CommunityChest){
                            p1.chance(CommunityChest.drawcommunitycard());
                        }
                        if(Board.whatSpace(p1.getPosition()) instanceof Railroads){
                            if(Board.whatSpace(p1.getPosition()).getOwned()){
                            }
                        }
                        
                        if(Board.whatSpace(p1.getPosition()) instanceof Utilities){
                            if (!Board.whatSpace(p1.getPosition()).isowned()) {
                            System.out.println("Would you like to purchase this utility for " + Board.whatSpace(p1.getPosition()).getPrice() + "? (y/n)");
                            String purchase = scan.next();
                            if (purchase.equalsIgnoreCase("y")) {
                                if (Board.whatSpace(p1.getPosition()).getPrice() > p1.getMoney()) {
                                    System.out.println("You don't have enough money Chump. ");
                                    auction = true;
                                    Player.changeHighBid(0);
                                    int count = 1;
                                    while (auction) {
                                        System.out.println("Player " + count + " would you like to make a bid? y/n");
                                        if (scan.next().equalsIgnoreCase("y")) {
                                            if (count == 1) {
                                                p1.makebid();
                                                count++;
                                            } else if (count == 2) {
                                                p2.makebid();
                                                count--;
                                            }
                                        } else {
                                            if (count == 1) {
                                                System.out.println("Player 2 has earned the utility for " + Player.getHighBid());
                                                p2.changeBank(Player.getHighBid());
                                                auction = false;
                                                Board.whatSpace(p1.getPosition()).switchOwner("p2");
                                                p2.addUtil();
                                                
                                            } else if (count == 2) {
                                                System.out.println("Player 1 has earned the utility for " + Player.getHighBid());
                                                p1.changeBank(Player.getHighBid());
                                                auction = false;
                                                Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                                p1.addUtil();
                                            }
                                        }
                                    }
                                } else {
                                    p1.buyProperty(Board.whatSpace(p1.getPosition()).getPrice());
                                    Board.whatSpace(p1.getPosition()).setTrue();
                                    Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                    p1.getUtil();
                                }
                            } else {
                                System.out.println("Alright it is going to Auction.");
                                auction = true;
                                Player.changeHighBid(0);
                                int count = 1;
                                while (auction) {
                                    System.out.println("Player " + count + " would you like to make a bid? y/n");
                                    if (scan.next().equalsIgnoreCase("y")) {
                                        if (count == 1) {
                                            p1.makebid();
                                            count++;
                                        } else if (count == 2) {
                                            p2.makebid();
                                            count--;
                                        }
                                    } else {
                                        if (count == 1) {
                                            System.out.println("Player 2 has earned the utility for " + Player.getHighBid());
                                            p2.changeBank(-Player.getHighBid());
                                            auction = false;
                                            Board.whatSpace(p1.getPosition()).switchOwner("p2");
                                            p2.addUtil();
                                        } else if (count == 2) {
                                            System.out.println("Player 1 has earned the utility for " + Player.getHighBid());
                                            p1.changeBank(-Player.getHighBid());
                                            auction = false;
                                            Board.whatSpace(p1.getPosition()).switchOwner("p1");
                                            p1.addUtil();
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("You have to pay " + Board.whatSpace(p1.getPosition()).getRent(roll, p2.getUtil()));
                            if (Board.whatSpace(p1.getPosition()).getOwner().equalsIgnoreCase("p1")) {
                                if (turn == 2) {
                                    System.out.println("Player one owns this property. ");
                                    p2.changeBank(Board.whatSpace(p2.getPosition()).getRent(roll, p2.getUtil()));
                                    p1.earnrent(Board.whatSpace(p2.getPosition()).getRent(roll, p2.getUtil()));
                                } else {
                                    if (turn == 1) {
                                        System.out.println("Feels like home");
                                    }
                                }
                            }
                        }
                        }
                        
                        if(Board.whatSpace(p1.getPosition()) instanceof corner){
                            //CORNER THINGS
                        }
                        if(Board.whatSpace(p1.getPosition()) instanceof Fines){
                            //FINES THINGS
                        }
                    }
                }
                if (!rollpermission) {
                    System.out.println("Your turn is over.");
                    turn++;
                }
            }
        }
    }
}
