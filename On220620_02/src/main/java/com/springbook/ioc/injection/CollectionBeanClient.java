package com.springbook.ioc.injection;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext2.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
		 
		List<String> list = bean.getAddressList();
		for(String st : list) System.out.println(st);
		System.out.println();
		
		Set<String> set = bean.getAddressSet();
		for(String str : set) System.out.println(str);
		System.out.println();
		
		Map<String, String> map = bean.getAddressMap();
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "\tValue : " + entry.getValue());
		}
		
		Properties pro = bean.getAddressProperties();
		String str1 = pro.getProperty("경복궁");
		String str2 = pro.getProperty("덕수궁");
		
		System.out.println(pro.keySet());
		for(String key : pro.stringPropertyNames()) System.out.println(key);
		
		factory.close();
	}
}
