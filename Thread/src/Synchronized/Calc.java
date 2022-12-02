package Synchronized;

public class Calc {
	private int memory;

	public int getMemory() {
		return memory;
	}

	
	//synchronized 메소드 기능 예제
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
	}
	//synchronized 코드 블럭 기능 예제
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ":" + this.memory);
			}
		}
	
	}
	
	
	
	
	
	
}
