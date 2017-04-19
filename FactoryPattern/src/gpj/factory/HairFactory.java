package gpj.factory;

import java.util.Map;

/**
 * 发型工厂
 * @author gpj
 *
 */
public class HairFactory {

	/**
	 * 根据类型
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
	 * 根据类的名称来生产对象（反射）
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
