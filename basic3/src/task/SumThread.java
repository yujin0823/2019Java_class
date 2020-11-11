package task;

public class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void run() {
		for (int i = 0; i <= 100000; i++) {
			sum += i;
		}

	}
}
