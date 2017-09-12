package com.etc._HomeWork;

public class text {
public static void main(String[] args) {
	BankDemo bank = new BankDemo();
	saveMoney sm = new saveMoney(bank);
	takeMoney tm = new takeMoney(bank);
	new Thread(sm).start();
	new Thread(tm).start();
}
}
