/*

Author: Cameron Whitfield



For the implementation of the interfaces, we have decided to violate the Open Close principle

by getting rid of IWorker interface and instead breaking it up into two separate interfaces.

Namely: IWorkable and IFeedable. Violating this one principle strengthens the case for adhering

to the Interface Segregation principle. Now classes can implement separate interfaces with

different functions without having to worry about implementing functions that won't be used

by that class. E.g. Robot class needing to only implement the IWorkable interface since it won't

need to eat.



 */

package threesolid;

interface IWorkable {

    void work();

}

interface IFeedable {

    void eat();

}

interface IEat {

    void eat();
	
}

interface ISick {

    void sick();
	
}

interface IReboot {

    void reboot();
	
}