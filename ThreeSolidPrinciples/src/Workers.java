/*

  Author: Nicholas Warren



  Both of these classes implement the two interfaces that are written. 

  It seems that we might have been able to make one interface that combines them.

  However, as shown in the Robot class, that would have forced us to write and empty

  eat method. This would have left open the case of a bug later on.

  

  Using these two interfaces also allows us to utilize the Open-close principle by

  using the same interfaces for both these worker classes, but implementing the work

  method differently. We could also, at a later point, create another worker class that

  implements the two interfaces differently.

  

  The interfaces help us use the single-responsibility principle by implementing the same

  by forcing the classes to have the same behavior, "working", but each class only has to 

  worry about its own implementation. So if at a later point work() in SuperWorker needs

  to change it would not be responsible for what happens in the other classes that also 

  implement IWorkable.

  

 

*/



package threesolid;





class Worker implements IWorkable, IFeedable{

	public void work() {

		// ....working

	}



	public void eat() {

		//.... eating in launch break

	}

}





class SuperWorker implements IWorkable, IFeedable{

	public void work() {

		//.... working much more

	}



	public void eat() {

		//.... eating in launch break

	}

}