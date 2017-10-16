package kr.co.mybatis.ch14;

public class UsingThis {
	void method(int arg){
		int localVar = 40;
		MyFunctionalInterface fi = ()->{
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.method();
	}
}
