package cn.tedu.simpleton;

public class Simpleton1 {
	private Simpleton1(){}
	
	private static Simpleton1 instence = new Simpleton1();
	
	public static synchronized Simpleton1 getIntence(){
		
		if(instence != null){
			return instence;
		}
		
		return instence;
		
		
	}
	
	

}
