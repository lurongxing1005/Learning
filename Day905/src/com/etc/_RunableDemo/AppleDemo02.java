package com.etc._RunableDemo;

class person1 implements Runnable {
	private int num = 50;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			synchronized (this) {

				if (num > 0) {
					System.out.println(Thread.currentThread().getName() + "���˵�"
							+ num + "��ƻ��");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				num--;
			}
		}
	}
}

public class AppleDemo02 {
	public static void main(String[] args) {
		person1 p = new person1();
		new Thread(p, "jdck").start();
		new Thread(p, "rose").start();
		new Thread(p, "tom").start();

	}
}
