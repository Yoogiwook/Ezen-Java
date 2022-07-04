package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

		CollectionBean bean = (CollectionBean) factory.getBean("CollectionBean");
		List<String> addressList = bean.getAddressList();
		for (String address : addressList)
			System.out.println(address);
		System.out.println("---List------------");
		Set<String> addressSet = bean.getAddressSet();
		for (String address : addressSet)
			System.out.println(address);
		System.out.println("---Set------------");
		Map<String, String> addressMap = bean.getAddressMap();
		for(String address : addressMap.keySet())
			System.out.println(address + ", " + addressMap.get(address));
		System.out.println("---Map------------");
		Properties addressProp = bean.getAddressProp();
		for(String address : addressProp.stringPropertyNames())
			System.out.println(String.format("key : %s, value : %s", address, addressProp.get(address)));
		System.out.println("---Properties------------");
		factory.close();
	}

}
