package com.etc._05LockAndConditionDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 共享资源
 * @author Administrator
 *
 */

public class ShareResoure {
	private String name;
	private String gender;
	private boolean isEmpty = true;//表示共享资源是否为空
	private final Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
//	Condition newCondition() 
//    返回绑定到此 Lock 实例的新 Condition 实例。 
	
	//生产者给共享资源数据
	public void push(String name,String gender){
		lock.lock();//加锁
		try {
			//this 生产者
			while(!isEmpty){//false  共享资源不为空  不用生产了
				condition.await();   //生产者睡觉
			}
			//开始生产
			this.name = name;
			Thread.sleep(100);
			this.gender = gender;
			//生产结束
			isEmpty = false;
			
			condition.signalAll();//生产者叫消费者来消费
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			lock.unlock();//释放锁
		}
		
	}
	
	//消费者从共享资源拿数据
	public void pop(){
		lock.lock();//加锁
		try {
			
			//this  是消费者
			while(isEmpty){  //ture  共享资源为空  不用消费了
				condition.await(); //消费者睡觉
			}
			
			//开始消费
			System.out.println(this.name+"-------"+this.gender);
			Thread.sleep(100);
			//消费结束
			isEmpty = true;
			
			condition.signal();//消费者叫生产者来生产
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			lock.unlock();//释放锁
		}
	}
	

}
