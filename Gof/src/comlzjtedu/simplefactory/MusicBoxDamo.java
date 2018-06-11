package comlzjtedu.simplefactory;
/**
 * 简单工厂模式测试
 * @author zhangBin
 *
 */
public class MusicBoxDamo {
	
	public static void main(String[] args) throws Exception {
		playMusicBox(MusicBoxFactory.getIntence("comlzjtedu.simplefactory.PianoBox"));
		playMusicBox(MusicBoxFactory.getIntence("comlzjtedu.simplefactory.ViolinBox"));
	}

	public static void playMusicBox(IMusicBox musicbox){
		musicbox.play();
	}
}
