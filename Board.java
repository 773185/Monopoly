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
import java.util.*;
public class Board{
    //public Property(String placename1,String color1, int square1,int numhouses1,int numhotels1,int rentbasic1, int cost1){
   public static ArrayList <BoardSpace>wholeboard;
   
   Property MediterraneanAve = new Property("Boardwalk", "Brown", 2, 0, 0, 2, 50);
   Property BalticAve = new Property("Baltic Ave", "Brown", 4, 0, 0, 4, 50);
   Property OrientalAve = new Property("Oriental Ave", "Light-Blue", 7,0, 0, 6, 100);
   Property VermontAve = new Property("Vermont Ave", "Light-Blue", 9,0, 0, 6, 100);
   Property ConnecticutAve = new Property("Connecticut Ave", "Light-Blue", 10,0, 8, 50, 120);
   
   Property StCharlesPlace = new Property("St. Charles Place", "Violet", 12,0, 0, 10, 140);
   Property StatesAve = new Property("States Ave", "Violet", 14, 0, 0, 10, 140);
   Property VirginiaAve = new Property("Virginia Ave", "Violet", 15,0, 0, 12, 160);
   Property StJamesPlace = new Property("St. James Place", "Orange", 17,0, 0, 14, 180);
   Property TennesseeAve = new Property("Tennessee Ave", "Orange", 19,0, 0, 14, 180);
   Property NewYorkAve = new Property("New York Ave", "Orange", 20,0, 0, 16, 200);
   
   Property KentuckyAve = new Property("Kentucky Ave", "Red", 22,0, 0, 18, 220);
   Property IndianaAve = new Property("Indiana Ave", "Red", 24,0, 0, 18, 220);
   Property IllinoisAve = new Property("Illinois Ave", "Red", 25,0, 0, 20, 240);
   Property AtlanticAve = new Property("Atlantic Ave", "Yellow", 27,0, 0, 22, 260);
   Property VentnorAve = new Property("Ventnor Ave", "Yellow", 28,0, 0, 22, 260);
   Property MarvinGardens = new Property("Marvin Gardens", "Yellow", 30,0, 0, 24, 280);
   
   Property PacificAvenue = new Property("Pacific Avenue", "Dark-Green", 32,0, 0, 26, 300);
   Property NorthCarolinaAve = new Property("North Carolina Ave", "Dark-Green", 33, 0, 0, 26, 300);
   Property PennsylvaniaAve = new Property("Pennsylvania Ave", "Dark-Green", 35,0, 0, 28, 320);
   Property ParkPlace = new Property("Park Place", "Dark-Blue", 38,0, 0, 35, 350);
   Property boardwalk = new Property("Boardwalk", "Dark-Blue", 40, 0, 0, 50, 400);
    //public Property(String placename1,String color1, int square1,int row1,int numhouses1,int numhotels1,int rentbasic1, int price){

   
   CommunityChest chest1 = new CommunityChest();
   CommunityChest chest2 = new CommunityChest();
   CommunityChest chest3 = new CommunityChest();
   
   Chance chance1 = new Chance();
   Chance chance2 = new Chance();
   Chance chance3 = new Chance();
   
   Utilities electric = new Utilities();
   Utilities water = new Utilities();
   
   Fines incometax = new Fines(200);
   Fines luxurytax = new Fines(100);
   Fines GO = new Fines(-200);
   
   Railroads BoRail = new Railroads("B & O Railroad");
   Railroads Reading = new Railroads("Reading Railroad");
   Railroads Pennsylvania = new Railroads("Pennsylvania Railroad");
   Railroads Short = new Railroads("Short Line Railroad");
   //ArrayList<String> x = new ArrayList<String>();
   //List<String> x = new ArrayList<>(Arrays.asList("xyz", "abc"));
public Board(){
ArrayList<BoardSpace> wholeboard1 = new ArrayList<BoardSpace>(Arrays.asList(GO, MediterraneanAve, chest1, BalticAve, incometax, BoRail, OrientalAve, chance1, VermontAve, ConnecticutAve,null, StCharlesPlace, electric, StatesAve, 
VirginiaAve, Reading, StJamesPlace, chest2, TennesseeAve, NewYorkAve,VentnorAve, KentuckyAve, chance2, IndianaAve, IllinoisAve, Pennsylvania, AtlanticAve, VentnorAve,
water, MarvinGardens,VentnorAve, PacificAvenue, NorthCarolinaAve, chest3, PennsylvaniaAve, Short, chance3, ParkPlace, luxurytax, boardwalk));

wholeboard=wholeboard1;
   // BoardSpace[] row2 = {null, StCharlesPlace, electric, StatesAve, VirginiaAve, Reading, StJamesPlace, chest2, TennesseeAve, NewYorkAve};
   // BoardSpace[] row3 = {null, KentuckyAve, chance2, IndianaAve, IllinoisAve, Pennsylvania, AtlanticAve, VentnorAve, water, MarvinGardens};
    //BoardSpace[] row4 = {null, PacificAvenue, NorthCarolinaAve, chest3, PennsylvaniaAve, Short, chance3, ParkPlace, luxurytax, boardwalk};
    //BoardSpace [][] gameboard = {row1, row2, row3, row4};
    //gameBoard1 = gameboard;
}


public ArrayList getBoard(){
    return wholeboard;
}
public static String getSpace(int place){
return wholeboard.get(place).toString();
}
public static String toString(int spot){

return "You have landed on"+ Board.getSpace(spot).toString();
}


}



