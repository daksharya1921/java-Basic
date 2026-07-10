package com.samsung;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("-----------------Multilevel Inheritance--------------------------");
		System.out.println();
		FoldableLaptop fl = new FoldableLaptop();
		fl.startButton();
		fl.physicalKeyword();
		fl.webCam();
		fl.three60Rotation();
		fl.stopButton();
		
		System.out.println();
		
		System.out.println("-----------------Hierarchical Inheritance--------------------------");
		System.out.println();
		System.out.println("-----------------Single Inheritance--------------------------");
		System.out.println();
		Phone p = new Phone();
		p.startButton();
		p.touchScreen();
		p.gyroscope();
		p.stopButton();
		System.out.println();
		System.out.println("-------------------------Single Inheritance------------------");
		System.out.println();
		Laptop l = new Laptop();
		l.startButton();
		l.physicalKeyword();
		l.webCam();
		l.stopButton();
		System.out.println();
	}

}
