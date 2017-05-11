package monopoly;

/**
 *
 * @author 761843
 */
public class Board{
    
   private BoardSpace[][]gameBoard1;
   Property MediterraneanAve = new Property("Boardwalk", "Brown", 2, 1, 0, 0, 2, 50);
   Property BalticAve = new Property("Baltic Ave", "Brown", 4, 1, 0, 0, 4, 50);
   Property OrientalAve = new Property("Oriental Ave", "Light-Blue", 7, 1, 0, 0, 6, 100);
   Property VermontAve = new Property("Vermont Ave", "Light-Blue", 9, 1, 0, 0, 6, 100);
   Property ConnecticutAve = new Property("Connecticut Ave", "Light-Blue", 10, 1, 0, 8, 50, 120);
   
   Property StCharlesPlace = new Property("St. Charles Place", "Violet", 2, 2, 0, 0, 10, 140);
   Property StatesAve = new Property("States Ave", "Violet", 4, 2, 0, 0, 10, 140);
   Property VirginiaAve = new Property("Virginia Ave", "Violet", 5, 2, 0, 0, 12, 160);
   Property StJamesPlace = new Property("St. James Place", "Orange", 7, 2, 0, 0, 14, 180);
   Property TennesseeAve = new Property("Tennessee Ave", "Orange", 9, 2, 0, 0, 14, 180);
   Property NewYorkAve = new Property("New York Ave", "Orange", 10, 2, 0, 0, 16, 200);
   
   Property KentuckyAve = new Property("Kentucky Ave", "Red", 2, 3, 0, 0, 18, 220);
   Property IndianaAve = new Property("Indiana Ave", "Red", 4, 3, 0, 0, 18, 220);
   Property IllinoisAve = new Property("Illinois Ave", "Red", 5, 3, 0, 0, 20, 240);
   Property AtlanticAve = new Property("Atlantic Ave", "Yellow", 7, 3, 0, 0, 22, 260);
   Property VentnorAve = new Property("Ventnor Ave", "Yellow", 8, 3, 0, 0, 22, 260);
   Property MarvinGardens = new Property("Marvin Gardens", "Yellow", 10, 3, 0, 0, 24, 280);
   
   Property PacificAvenue = new Property("Pacific Avenue", "Dark-Green", 2, 4, 0, 0, 26, 300);
   Property NorthCarolinaAve = new Property("North Carolina Ave", "Dark-Green", 3, 4, 0, 0, 26, 300);
   Property PennsylvaniaAve = new Property("Pennsylvania Ave", "Dark-Green", 5, 4, 0, 0, 28, 320);
   Property ParkPlace = new Property("Park Place", "Dark-Blue", 8, 4, 0, 0, 35, 350);
   Property boardwalk = new Property("Boardwalk", "Dark-Blue", 10, 4, 0, 0, 50, 400);
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
   
public Board(){
    BoardSpace[] row1 = {GO, MediterraneanAve, chest1, BalticAve, incometax, BoRail, OrientalAve, chance1, VermontAve, ConnecticutAve};
    BoardSpace[] row2 = {null, StCharlesPlace, electric, StatesAve, VirginiaAve, Reading, StJamesPlace, chest2, TennesseeAve, NewYorkAve};
    BoardSpace[] row3 = {null, KentuckyAve, chance2, IndianaAve, IllinoisAve, Pennsylvania, AtlanticAve, VentnorAve, water, MarvinGardens};
    BoardSpace[] row4 = {null, PacificAvenue, NorthCarolinaAve, chest3, PennsylvaniaAve, Short, chance3, ParkPlace, luxurytax, boardwalk};
    BoardSpace [][] gameboard = {row1, row2, row3, row4};
    gameBoard1 = gameboard;
}


public BoardSpace[][] getBoard(){
    return gameBoard1;
}


}


