import clock.*;

public class Test {

	public static void main(String[] args) {
		Clock cas=new Clock(200, '*');
		Sorter izbor=new Choice(cas);
		CharArray niz=new CharArray(75);
		System.out.println(niz + "\n");
		niz.sort(izbor);
		System.out.println("\n\n" + niz);
		cas.abort();
	}

}
