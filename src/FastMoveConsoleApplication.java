/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import base.Person;

import java.util.Scanner;

/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
//        Person person1 = new Person(sc.next(),sc.next());
        System.out.println("Enter your First name : ");
        String fn = sc.next();
        System.out.println("Enter your Last name : ");
        String ln = sc.next();
        Person ps1 = new Person(fn,ln);
    }


}
