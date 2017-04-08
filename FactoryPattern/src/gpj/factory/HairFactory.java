package gpj.factory;

import java.util.Map;

/**
 * ���͹���
 * @author gpj
 *
 */
public class HairFactory {

	/**
	 * ��������
	 * @param key
	 * @return
	 */
	public HairInterface getHair(String key){
		if("left".equals(key)){
			return new LeftHair();
		}else if("right".equals(key)) {
			return new RightHair();
		}
		return null;
	}
	
	/**
	 * ��������������������󣨷��䣩
	 * @param className
	 * @return
	 */
	public HairInterface getHairBYClass(String className){
		try {
			HairInterface hair = (HairInterface)Class.forName(className).newInstance();
			return hair;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public HairInterface getHairByClassKey(String key){
		try {
			Map<String,String> map =new PropertiesReader().getProperties();
			HairInterface hair = (HairInterface)Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
