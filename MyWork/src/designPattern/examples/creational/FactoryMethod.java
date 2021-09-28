/**
 * 
 */
package designPattern.examples.creational;

/**
 * <b>Factory Method Design Pattern</b>
 * <p>
 * Define an interface for creating an object, but let subclasses decide which
 * class to instantiate. Factory Method lets a class defer instantiation to
 * subclasses. Also known as <b>Virtual Constructor</b>.
 * <p>
 * JVM are the collection building methods on the Collections class, like
 * singleton(), singletonList(), and singletonMap(). These all return instances
 * of the appropriate collection – Set, List, or Map – but the exact type is
 * irrelevant. Additionally, the Stream.of() method and the new Set.of(),
 * List.of(), and Map.ofEntries() methods allow us to do the same with larger
 * collections.
 * <p>
 * 
 * 
 * @author prosannam
 *
 */
public class FactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NotificationFactory getNotification = new NotificationFactory();
		Notification notification = getNotification.createNotification("SMS");
		notification.notifyUser();
		/*
		 * getNotification.createNotification("SMS").notifyUser();
		 * getNotification.createNotification("EMAIL").notifyUser();
		 * getNotification.createNotification("PUSH").notifyUser();
		 */
	}

}

class NotificationFactory {
	public static Notification createNotification(String channel) {
		if (channel == null || channel.isEmpty()) {
			return null;
		}
		if ("SMS".equals(channel)) {
			return new SMSNotification();
		} else if ("EMAIL".equals(channel)) {
			return new EmailNotification();
		} else if ("PUSH".equals(channel)) {
			return new PushNotification();
		}
		return null;

	}
}

interface Notification {
	void notifyUser();
}

class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("This is a SMS Notification.");

	}

}

class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("This is a Email Notification.");

	}

}

class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("This is a Push Notification.");

	}

}
