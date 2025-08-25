package revision;

public abstract class Feline extends Animal {

	abstract void purr();
	
//	@Override - allowed redefine - not override
	static void f() {}
}
