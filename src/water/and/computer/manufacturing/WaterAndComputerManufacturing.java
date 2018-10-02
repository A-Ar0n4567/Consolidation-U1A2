/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package water.and.computer.manufacturing;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class WaterAndComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner keyedInput = new Scanner(System.in);
        
        //variable declaration
        double monitorcombo,total;
        
        final double WATER;
        
        WATER = 1.5;
        
        
        
        System.out.println("Enter The Number Of Computer Monitor Combos");
        monitorcombo = keyedInput.nextInt();
        
        total = WATER*monitorcombo;
        
        System.out.println("It Took "+total+" Tons Of Water To Make The Computer/Monitor Combo.");
        
        
        
    }
    
}
