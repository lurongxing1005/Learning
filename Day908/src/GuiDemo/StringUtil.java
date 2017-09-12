package GuiDemo;
/**
 * 瀛楃涓插伐鍏风被
 * @author Administrator
 *
 */

public class StringUtil {
	
	//涓�埇宸ュ叿绫讳腑鏂规硶閮芥槸闈欐�鏂规硶  鏋勯�鍣ㄤ笉鎻愪緵   绫诲悕.鏂规硶鍚�
	
	private StringUtil(){
		
	}
	
	/**
	 * 鍒ゆ柇瀛楃涓叉槸鍚︿负绌�
	 * @param str
	 * @return
	 */
	public static boolean hasLength(String str){
		return str!=null && !"".equals(str.trim());
	}

}
