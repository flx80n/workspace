package cn.tedu.clone;
/**
 * 原型模式
 * @author soft01
 *	1:实现接口Cloneable
 *
 */

public class Person implements Cloneable{
	private int id;
	private String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
