package revision;

public class Equivalence {
	String a = "joe";
	String b = "joe";
	// a, b pointing to same boxes (shorthand for strings)
	// a == b true
	String x = new String("joe");
	String y = new String("joe");
	// x, y pointing to different boxes
	// x == y false
}
