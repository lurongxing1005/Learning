package com.etc._BankHomeWork;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankDemo {
	private int money ;
	private String date;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void save(int money, String date) {
		lock.lock();
		try {

			while (!isEmpty) {
				condition.await();
			}

			this.money = money;
			Thread.sleep(1000);
			this.date = date;

			isEmpty = false;

			condition.signalAll();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	public void take() {
		lock.lock();
		try {

			while (isEmpty) {
				condition.await();
			}

			System.out.println(this.money + "-------" + this.date);
			Thread.sleep(1000);

			isEmpty = true;

			condition.signal();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
