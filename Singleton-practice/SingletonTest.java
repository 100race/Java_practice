package com.race.self.test;

import com.race.self.Normal;
import com.race.self.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Normal n1 = new Normal();
		Normal n2 = new Normal();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(n1.equals(n2))
			System.out.println("n1와 n2는 같은 객체입니다.");
		else
			System.out.println("n1와 n2는 다른 객체입니다.");
		
		if(s1.equals(s2))
			System.out.println("s1와 s2는 같은 객체입니다.");
		else
			System.out.println("s1와 s2는 다른 객체입니다.");
	}

}
