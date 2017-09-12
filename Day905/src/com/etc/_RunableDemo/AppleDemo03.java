package com.etc._RunableDemo;

class person2 implements Runnable {
	private int num = 50;

	private synchronized void eat() {
		if (num > 0) {
			System.out.println(Thread.currentThread().getName() + "吃了第" + num
					+ "个苹果");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		num--;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {

			eat();

		}
	}
}

public class AppleDemo03 {
	public static void main(String[] args) {
		person2 p = new person2();
		new Thread(p, "jdck").start();
		new Thread(p, "rose").start();
		new Thread(p, "tom").start();

	}
}
