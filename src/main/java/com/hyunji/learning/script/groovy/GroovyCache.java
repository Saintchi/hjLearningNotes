package com.hyunji.learning.script.groovy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class GroovyCache {

	/**
	 * 定义一个变量来存储创建好的类实例
	 */
	private static GroovyCache uniqueInstance = null;

	private static final Map<String, Class<?>> GROOVY_CLS_CACHE = new ConcurrentHashMap<String, Class<?>>();

	private GroovyCache() {
	}

	public static synchronized GroovyCache getInstance() {
		//判断存储实例的变量是否有值
		if (uniqueInstance == null) {
			//如果没有，就创建一个类实例，并把值赋值给存储类实例的变量
			uniqueInstance = new GroovyCache();
		}
		//如果有值，那就直接使用
		return uniqueInstance;
	}

	public Class<?> getClassByScript(String script) {

		return null;
	}
}
