package com.polymorphism.runtime.problem;

public class MainApp {
	
	public static void main(String[] args) {
		
		Notification notification;
		
		notification = new PushNotification();
//		notification.sendNotification();
//				
//	
//		notification = new SMSNotification();
//		notification.sendNotification();
//		
//		notification = new EmailNotification();
//		notification.sendNotification();
		
		NotificationProcessor process = new NotificationProcessor();
		
		notification = new WhatsAppNotification();
		
		
		
		process.processNotification(notification);
		
	}

}
