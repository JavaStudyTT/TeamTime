package kr.co.mybatis.ch14;

public class RunnableExample {
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}
