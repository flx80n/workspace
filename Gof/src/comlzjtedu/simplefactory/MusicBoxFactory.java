package comlzjtedu.simplefactory;

public class MusicBoxFactory {
	public static IMusicBox getIntence(String clazz)throws Exception{
		return (IMusicBox)Class.forName(clazz).newInstance();
		
	}

	public static void main(String[] args)throws Exception {
		System.out.println(getIntence("ViolinBox"));
	}
}
