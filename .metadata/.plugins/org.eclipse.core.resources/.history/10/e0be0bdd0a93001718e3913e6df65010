package com.etc._05LockAndConditionDemo;

/**
 * 生产者
 * @author Administrator
 *
 */

public class Producer implements Runnable {
	//共享资源的对象
	private ShareResoure share = null;
	public Producer(ShareResoure share){
		this.share = share;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			if(i%2 == 0){
				share.push("春哥", "男");
			}else{
				share.push("凤姐", "女");
			}
		}
		
	}

}
