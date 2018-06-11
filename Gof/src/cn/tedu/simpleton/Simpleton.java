package cn.tedu.simpleton;

//饿汉式 
public class Simpleton {
	private Simpleton(){}
	
	private static Simpleton instence = new Simpleton();
	
	public static Simpleton getIntence(){
		return instence;
	}
}
