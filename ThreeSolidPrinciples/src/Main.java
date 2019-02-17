/**
* Author: Rhett Martin

* For the ThreeSolidMain class we feel that the Open Closed principle.

* The Single Responsibility principle is satisfied by the removal of

* all classes from this file. The Interface Segregation Principle does

* apply to the main class.

*/



package threesolid;



import java.awt.*;        // Using AWT container and component classes

import java.awt.event.*;  // Using AWT event classes and listener interfaces

import java.io.*;



import threesolid.Manager;

import threesolid.Worker;

import threesolid.SuperWorker;





class ThreeSolidMain

{   



   public static Manager tsManager = new Manager();



   // The entry main() method

   public static void main(String[] args) 

   {



      try 

      {

         System.out.format("Starting ... \n");               

      } 

      catch (Exception main_except)

      {

         main_except.printStackTrace();

      }



            try 

      {

         System.out.format("Stopping ... \n");               

      } 

      catch (Exception main_except)

      {

         main_except.printStackTrace();

      }



      System.exit(0);



   }

 }
