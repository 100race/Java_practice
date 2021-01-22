package com.race.self;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Singleton Instance Creating...");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
