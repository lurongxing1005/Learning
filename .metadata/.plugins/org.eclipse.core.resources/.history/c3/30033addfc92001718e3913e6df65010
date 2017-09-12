package com.etc._05LockAndConditionDemo;
/**
 * 生产者和消费者
 * @author Administrator
 *
 */

public class AppTest {
	public static void main(String[] args) {
		//共享资源对象
		ShareResoure share = new ShareResoure();
		
		//生产者 ----share
		Producer pro = new Producer(share);
		new Thread(pro).start();
		
		//消费者-----share
		Consumer con = new Consumer(share);
		new Thread(con).start();
		
	}

}
