package com.velocity;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		for(Object x:l) {
			System.out.println(x);
		}
		Collections.sort(l);
	}

}
