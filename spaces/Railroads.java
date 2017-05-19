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
public class Railroads extends BoardSpace {
    public int price=200;
    public int rent=25;
    public String title;
    public Railroads(String name) {
        super(true);
        title=name;
    }
    
}
