package thread;

import util.Chat;

public class T1 implements Runnable{

	Chat c;
	String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };
	
	public T1(Chat c){
		this.c = c;
		new Thread(this, "Answer").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < s1.length; i++) {
            c.question(s1[i]);
        }
	}

}
