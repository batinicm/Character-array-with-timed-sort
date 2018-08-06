package clock;

public abstract class Sorter {
	
	private Clock cas;

	public Sorter(Clock cl) {
		this.cas = cl;
	}
	
	public void sort(Comparable[] arr) {
		cas.go();
		workload(arr);
		cas.pause();
	};
	
	protected abstract void workload(Comparable[] u);

}
