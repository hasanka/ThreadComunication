package thread;

import util.Chat;

public class T2 implements Runnable {
	Chat c;
	String[] s2 = { "Hi", "I am good, what about you?", "Great!" };
	
	public T2(Chat c){
		this.c = c;
		new Thread(this, "Question").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < s2.length; i++) {
            c.answer(s2[i]);
        }
	}
}
