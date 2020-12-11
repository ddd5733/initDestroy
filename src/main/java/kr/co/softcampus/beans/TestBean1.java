package kr.co.softcampus.beans;

public class TestBean1 {

	public TestBean1() {
		System.out.println("TeestBean1의 생성자 ");
	}
	
	public void init() {
		System.out.println("TestBean1의 init 매소드");
	}
	
	public void destroy() {
		System.out.println("TestBean1의 destroy 매소드");
	}
}
