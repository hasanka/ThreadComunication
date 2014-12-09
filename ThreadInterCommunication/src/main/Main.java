package main;

import thread.T1;
import thread.T2;
import util.Chat;

public class Main {

	public static void main(String[] args) {
		Chat c = new Chat();
		new T1(c);
		new T2(c);
	}

}
