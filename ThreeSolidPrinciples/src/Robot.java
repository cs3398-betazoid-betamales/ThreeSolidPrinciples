/**
Author: Tyler Cummings

In the case of the Robot class, we felt that the Open-Closed principle did not apply 

here. This is due to the fact that the robot would be performing the same "work" as 

its presumably human counterparts, thereby not needing any sort of extention of 

capabilities. This class benefits from abiding by the Interface Segregation principle 

in that the Robot object won't need to eat, as do its non-robotic coworkers. It simply 

needs to "work". In this context, our utilization of the Interface Segregation principle 

gives way to the concept of Single Responsibility. Because the interface has been seperated 

into two sub-interfaces, viz. IWorkable and IFeedable, the Robot class is no longer 

required to implement the unnecessary "eat" method.

*/

package threesolid;

class Robot extends BaseWorker implements IReboot {
	public void reboot() {
		System.out.format("TEST\n");
		// .... rebooting
	}

}
