package singletonpattern;

public class SingletonEager {

	public static SingletonEager sc = new SingletonEager();
	
	// Private constructor
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return sc;
	}
}
