package com.lzjtdu.proxy;
/**
 * 代理模式的演示
 * 
 * @author zhangBin
 */

public class Test {
	
	public static void main(String[] args) {
		Person p = new PersonProxy();
		p.f1();
		p.f2();
	}

}
