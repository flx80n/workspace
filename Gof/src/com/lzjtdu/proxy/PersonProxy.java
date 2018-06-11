package com.lzjtdu.proxy;

public class PersonProxy implements Person {
	
	private PersonImpl ps = new PersonImpl();
	@Override
	public void f1() {
		
		System.out.println("代理特有的方法1");
		ps.f1();
		

	}

	@Override
	public void f2() {
		System.out.println("代理特有的方法2");
		ps.f2();
	}
}
