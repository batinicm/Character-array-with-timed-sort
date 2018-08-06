package clock;

public class ExcChars extends Exception {

	@Override
	public String toString() {
		return "The characters are not in the correct order! The first one is alphabetically behind the other!\n";
	}

}
