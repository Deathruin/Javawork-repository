package java9;

public class Five9_6_StopWatch {
	private long startTime, endTime;
	
	public Five9_6_StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElaspsedTime() {
		return this.endTime - this.startTime;
	}
}
