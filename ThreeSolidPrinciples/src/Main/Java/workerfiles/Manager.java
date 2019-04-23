/* Author: Richard Miller



SINGLE RESPONSIBILITY...To follow the single responsibility principal, the Manager class was moved to its own file. 

						This ensured that the file would handle the definition of only one class, rather than 

						multiple classes. The Manager class itself is solely responsible for running the work() 

						methods of IWorkable objects.



OPEN CLOSE..............The Manager class keeps its internal variables private and its methods public. In this case, 

						the class' instances of IWorkable objects are kept hidden from other classes, and changes 

						to them may only be done using the Manager class' pre-defined public methods. This ensures 

						that any modification to these instances must first be supported by the Manager class.



INTERFACE SEGREGATION...Although this file makes use of interfaces, it does not define them. The interfaces are 

						located within another file.

*/

package threesolid;

class Manager {

	private IWorkable worker;

	public void Manager() {

	}

	public void setWorker(IWorkable w) {

		worker = w;

	}

	public void manage() {

		worker.work();

	}
}

class ProjectManager extends Manager{

	public void schedulework() {
		System.out.format("It matters not how strait the gate,\nHow charged with punishments the scroll,\n");
	}
}

class ProductManager extends Manager{
	
	public void defineproduct() {
		System.out.format("I am the master of my fate,\nI am the captain of my soul.\n");
	}
}
