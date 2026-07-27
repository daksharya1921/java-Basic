package com.fuctionalinterface;

import java.util.function.Consumer;

public class ConsumerInterface {
	
	public static void main(String[] args) {
		Consumer<String> consumer = (emailTo) -> System.out.println("Email has been sent: "+emailTo);
		consumer.accept("daksh@good.com");
	}

}
