
package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;


public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("a",100);
        bikes[1] = new Bike("b",200);
        bikes[2] = new Bike("c",300);
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
       parcels[0]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(0, 9));
       parcels[1]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(1, 8));
       parcels[2]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(2, 7));
       parcels[3]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(3, 6));
       parcels[4]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(4, 5));
       parcels[5]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(5, 4));
       parcels[6]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(6, 3));
       parcels[7]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(7, 2));
       parcels[8]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(8, 1));
       parcels[9]=new Parcel(23 ,ParcelStatus.SHIPPING , new Location(9, 0));
//iimjlml
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }
}


