

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {
    Scanner x = new Scanner(System.in);
    public void addParcels(){
    Scanner scn=new Scanner(System.in);
     Parcel pc1 = new Parcel(scn.nextInt() /*Weight*/, ParcelStatus.SHIPPING/*Status*/ , new Location(scn.nextDouble(), scn.nextDouble()));
    }
    
    
    public FastMoveConsoleApplication(){
        
        System.out.print("Enter new bike :");
        Bike a = new Bike(x.next(),x.nextInt());
}
}

