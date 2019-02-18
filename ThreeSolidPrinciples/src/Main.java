/**
* Author: Rhett Martin

* For the ThreeSolidMain class we feel that the Open Closed principle.

* The Single Responsibility principle is satisfied by the removal of

* all classes from this file. The Interface Segregation Principle does

* apply to the main class.

*/

package threesolid;

import java.awt.*; // Using AWT container and component classes

import java.awt.event.*; // Using AWT event classes and listener interfaces

import java.io.*;

import threesolid.Manager;

import threesolid.Worker;

import threesolid.SuperWorker;

class ThreeSolidMain

{

	public static Manager tsManager = new Manager();
	public static BaseWorker baseWorker = new BaseWorker();
	public static Worker worker = new Worker();
	public static SuperWorker superWorker = new SuperWorker();
	public static TempWorker tempWorker = new TempWorker();
	public static Robot robot = new Robot();
	public static ProjectManager projectManager = new ProjectManager();
	public static ProductManager productManager = new ProductManager();

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

		baseWorker.work();
		worker.eat();
		worker.sick();
		superWorker.work();
		superWorker.eat();
		superWorker.sick();
		tempWorker.work();
		tempWorker.eat();
		tempWorker.sick();
		projectManager.schedulework();
		productManager.defineproduct();
		robot.reboot();

		System.exit(0);

	}

}
