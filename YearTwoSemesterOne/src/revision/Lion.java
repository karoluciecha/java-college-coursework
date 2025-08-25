package revision;

// Concrete class - make Lion objects
public class Lion extends Feline {

//	Forced to override two abstract method - eat() & purr()
	@Override
	void purr() {
		// TODO Auto-generated method stub

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub

	}
	
	// Not forced to implement this method
	@Override // Annotation
	void roam() {
		// TODO Auto-generated method stub
		super.roam();
	}

}
