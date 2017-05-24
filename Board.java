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
   
   
   static Property MediterraneanAve = new Property("Mediterranean Avenue", "Brown", 2, 0, 0, 2, 50);
   static Property BalticAve = new Property("Baltic Ave", "Brown", 4, 0, 0, 4, 50);
  static  Property OrientalAve = new Property("Oriental Ave", "Light-Blue", 7,0, 0, 6, 100);
   static Property VermontAve = new Property("Vermont Ave", "Light-Blue", 9,0, 0, 6, 100);
  static  Property ConnecticutAve = new Property("Connecticut Ave", "Light-Blue", 10,0, 8, 50, 120);
   
  static  Property StCharlesPlace = new Property("St. Charles Place", "Violet", 12,0, 0, 10, 140);
  static  Property StatesAve = new Property("States Ave", "Violet", 14, 0, 0, 10, 140);
  static  Property VirginiaAve = new Property("Virginia Ave", "Violet", 15,0, 0, 12, 160);
  static  Property StJamesPlace = new Property("St. James Place", "Orange", 17,0, 0, 14, 180);
   static Property TennesseeAve = new Property("Tennessee Ave", "Orange", 19,0, 0, 14, 180);
  static  Property NewYorkAve = new Property("New York Ave", "Orange", 20,0, 0, 16, 200);
   
 static   Property KentuckyAve = new Property("Kentucky Ave", "Red", 22,0, 0, 18, 220);
  static  Property IndianaAve = new Property("Indiana Ave", "Red", 24,0, 0, 18, 220);
  static  Property IllinoisAve = new Property("Illinois Ave", "Red", 25,0, 0, 20, 240);
  static  Property AtlanticAve = new Property("Atlantic Ave", "Yellow", 27,0, 0, 22, 260);
  static  Property VentnorAve = new Property("Ventnor Ave", "Yellow", 28,0, 0, 22, 260);
  static  Property MarvinGardens = new Property("Marvin Gardens", "Yellow", 30,0, 0, 24, 280);
   
   static Property PacificAvenue = new Property("Pacific Avenue", "Dark-Green", 32,0, 0, 26, 300);
   static Property NorthCarolinaAve = new Property("North Carolina Ave", "Dark-Green", 33, 0, 0, 26, 300);
  static  Property PennsylvaniaAve = new Property("Pennsylvania Ave", "Dark-Green", 35,0, 0, 28, 320);
  static  Property ParkPlace = new Property("Park Place", "Dark-Blue", 38,0, 0, 35, 350);
  static  Property boardwalk = new Property("Boardwalk", "Dark-Blue", 40, 0, 0, 50, 400);
    //public Property(String placename1,String color1, int square1,int row1,int numhouses1,int numhotels1,int rentbasic1, int price){

   
   static CommunityChest chest1 = new CommunityChest();
  static  CommunityChest chest2 = new CommunityChest();
  static  CommunityChest chest3 = new CommunityChest();
   
   static Chance chance1 = new Chance();
  static  Chance chance2 = new Chance();
  static  Chance chance3 = new Chance();
   
  static  Utilities electric = new Utilities("Electric Company");
  static  Utilities water = new Utilities("Water Works");
   
  static  Fines incometax = new Fines(200);
 static   Fines luxurytax = new Fines(100);
  static  Fines GO = new Fines(-200);
   
  static  Railroads BoRail = new Railroads("B & O Railroad");
  static  Railroads Reading = new Railroads("Reading Railroad");
  static  Railroads Pennsylvania = new Railroads("Pennsylvania Railroad");
 static   Railroads Short = new Railroads("Short Line Railroad");
   
   public static ArrayList<BoardSpace> wholeboard = new ArrayList<BoardSpace>(Arrays.asList(GO, MediterraneanAve, chest1, BalticAve, incometax, BoRail, OrientalAve, chance1, VermontAve, ConnecticutAve,StCharlesPlace, StCharlesPlace, electric, StatesAve, 
VirginiaAve, Reading, StJamesPlace, chest2, TennesseeAve, NewYorkAve,VentnorAve, KentuckyAve, chance2, IndianaAve, IllinoisAve, Pennsylvania, AtlanticAve, VentnorAve,
water, MarvinGardens,VentnorAve, PacificAvenue, NorthCarolinaAve, chest3, PennsylvaniaAve, Short, chance3, ParkPlace, luxurytax, boardwalk));


   //ArrayList<String> x = new ArrayList<String>();
   //List<String> x = new ArrayList<>(Arrays.asList("xyz", "abc"));
public Board(){

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

public static BoardSpace whatSpace(int place){
    return wholeboard.get(place);
}

public static String toString(int spot){

return "You have landed on"+ Board.getSpace(spot).toString();
}


}
