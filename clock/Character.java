package clock;

public class Character implements Comparable {
	
	private char ch;

	public Character(char ch) {
		this.ch = ch;
	}

	public char getCharacter() {
		return ch;
	}

	@Override
	public String toString() {
		return "Character: " + ch ;
	}

	@Override
	public boolean less(Comparable u) {
		return ch<((Character)u).ch;
	}

	@Override
	public boolean equal(Comparable u) {
		return ch==((Character)u).ch;
	}

}
