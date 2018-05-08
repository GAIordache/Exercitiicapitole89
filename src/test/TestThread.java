package test;

public class TestThread extends Thread {

	public static void main(String[] args) {
		TestThread t1 = new TestThread();
        t1.start();
        System.out.println(t1.getPriority());
	}

}
