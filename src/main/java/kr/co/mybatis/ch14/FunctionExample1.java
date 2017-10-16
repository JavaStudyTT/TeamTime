package kr.co.mybatis.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	/*
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
	
	public static void printString(Function<Student, String> function){
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		for (Student student : list) {
			System.out.println(function.applyAsInt(student)+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t->t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t->t.getEnglishScore());
		
		System.out.println("[수학 점수]");
		printInt(t->t.getMathScore());
	}
	
	public static double avg(ToIntFunction<Student> function){
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
		
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균점수 : " + englishAvg);
	}
	*/
}
