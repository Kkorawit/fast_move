/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import base.Bike;

/**
 *
 * @author praisan
 */
import java.util.Scanner;

public class FastMoveConsoleApplication {
    
     Scanner x = new Scanner(System.in);
    
    public FastMoveConsoleApplication(){
        
        System.out.print("Enter new bike :");
        Bike a = new Bike(x.next(),x.nextInt());
      
    }
}
