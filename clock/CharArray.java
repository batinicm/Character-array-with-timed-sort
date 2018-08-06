package clock;

public class CharArray {

	private Character[] arr;
	
	public CharArray(int k) {
		arr=new Character[k];
		load();
	}
	
	public void load(Character p, Character q) throws ExcChars{
		if(q.less(p)) throw new ExcChars();
		for(int i=0; i<arr.length; i++)
			arr[i]=new Character((char)(p.getCharacter() + Math.random()*(q.getCharacter()-p.getCharacter())));
	}
	
	public void load() {
		try {
		load(new Character('a'), new Character('z'));}
		catch (ExcChars g) {}
	}
	
	public void sort(Sorter u) {
		u.sort(arr);
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		int el=0;
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i].getCharacter());
			sb.append((el==49)?'\n':' ');
			el=(el+1)%50;
		}
		return sb.toString();
	}
}
