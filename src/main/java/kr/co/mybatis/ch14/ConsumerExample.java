package kr.co.mybatis.ch14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = t->System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u)->System.out.println(t + u);
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d-> System.out.println("java" + d);
		doubleConsumer.accept(1.8);
		
		IntSupplier intSupplier = ()-> {
			int num = (int) ((Math.random()*6)+1);
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);
	}
}
