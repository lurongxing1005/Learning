package com.etc._05LockAndConditionDemo;
/**
 * 消费者
 * @author Administrator
 *
 */
public class Consumer  implements Runnable {
	//共享资源的对象
	private ShareResoure share = null;
	public Consumer(ShareResoure share){
		this.share = share;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			share.pop();
		}
	}

}
