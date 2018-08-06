package clock;

public class Clock extends Thread {
	
	private int per;
	private char ch;
	private boolean running=false;
	
	public Clock(int per, char ch) {
		this.per = per;
		this.ch = ch;
		start();
	}
	
	public void run() {
		try {
			while(!interrupted()) {
				synchronized(this) {
					if(!running) wait();
				}
				sleep(per);
				System.out.print(ch);
			}
		}
		catch(InterruptedException i) {}
	}
	
	public synchronized void pause() {
		running=false;
	}
	
	public synchronized void go() {
		running=true;
		notify();
	}
	
	public void abort() {
		interrupt();
	}

}
