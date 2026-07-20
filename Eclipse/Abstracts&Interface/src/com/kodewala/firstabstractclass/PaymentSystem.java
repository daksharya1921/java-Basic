package com.kodewala.firstabstractclass;

public abstract class PaymentSystem {

	abstract void doTxn();

}

abstract class UPISystem extends PaymentSystem {

	abstract void suspendTxn();
}

class TXN extends UPISystem {

	void doTxn() {
		System.out.println(
				"The doTXN is from PaymentSystem UPIPayment extends and \nTXN extends to this ie if abstract class is extended abstract class  till normal class is not there \nits will not force to implements if there is normal class its must be implemented thats we need to write what+how?");
	}

	void suspendTxn() {
		System.out.println(
				"THe suspendTxn() is abstract method in abstract class \nUPIPayment that methods is also inherited and implemplemted in TXN class actully complier force \nits to implements its if don't implements its will give complier error");
	}

	public static void main(String[] args) {
		TXN txn = new TXN();
		System.out.println("*********************abstract class UPISystem extends PaymentSystem.abstract void suspendTxn();;************************************************");
		txn.doTxn();
		
		System.out.println("*********************TXN extends UPISystem.abstract void suspendTxn();************************************************");
		txn.doTxn();
	}

}