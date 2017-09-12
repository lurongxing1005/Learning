package com.etc._homeWork;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ticket implements Runnable {
	private int num = 50;
    Lock thelock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			thelock.lock();
			if (num > 0) {
				try {
					System.out.println(Thread.currentThread().getName() + "������"
							+ num + "��Ʊ");
					Thread.sleep(100);
					num--;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					thelock.unlock();
				}
			}
		}
	}
}

public class HomeWork {
	public static void main(String[] args) {
		ticket t = new ticket();
		new Thread(t, "A").start();
		new Thread(t, "B").start();
		new Thread(t, "C").start();
	}
}
