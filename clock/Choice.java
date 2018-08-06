package clock;

public class Choice extends Sorter {

	public Choice(Clock cl) {
		super(cl);
	}

	@Override
	protected void workload(Comparable[] u) {
		for(int i=0; i<u.length-1; i++) {
			int minPos=i;
			Comparable min=u[i];
			for(int j=i+1;j<u.length; j++ ) {
				if(u[j].less(min)) {
					min=u[j];
					minPos=j;
				}
			}
			Comparable temp=u[i];
			u[i]=min;
			u[minPos]=temp;
		}
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException i) {}
	}

}
