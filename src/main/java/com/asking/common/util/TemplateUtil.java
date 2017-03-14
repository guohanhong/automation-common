package com.asking.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import com.google.common.collect.Maps;

public class TemplateUtil {

	public static final Map<String, String> template(String template) {
		
		Map<String, String> keyword = Maps.<String, String> newHashMap();

		Properties prop = new Properties();
		InputStream inputStream = TemplateUtil.class.getClassLoader().getResourceAsStream(template);
		try {
			prop.load(inputStream);
			for(Object key : prop.keySet()){
				keyword.put(key.toString(), prop.getProperty(key.toString()));
			}
			return keyword;
		} catch (IOException e) {
			throw new RuntimeException("invalid parameters.");
		}
	}

}
