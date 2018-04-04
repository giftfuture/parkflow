package cn.chinaflame.park.collect;

import java.util.Map;


/**
 * 集合相关工具类，主要用于获得扩展的集合对象.
 * @author  
 */

public class Mapxs {

	/**
	 * 获得一个Map对象
	 * @return Map对象
	 */
	public static Mapx newMapx() {
		return new HashMapx();
	}

	/**
	 * 创建一个Map扩展对象
	 * @return Map扩展对象
	 */
	public static Mapx newMapx(Map<String, Object> map) {
		Mapx mapx = new HashMapx();
		mapx.putAll(map);
		return mapx;
	}
}
