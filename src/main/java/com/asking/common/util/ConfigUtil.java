package com.asking.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
	
	/**
	 * 配置文件去key
	 * @param config
	 * @param key
	 * @return
	 */
	public static String getConfigKey(String config,String key){
		Properties prop = new Properties();
		InputStream inputStream = ConfigUtil.class.getClassLoader().getResourceAsStream(config);
		try {
			prop.load(inputStream);
			return prop.getProperty(key);
		} catch (IOException e) {
			throw new RuntimeException("invalid parameters.");
		}
	}
}
