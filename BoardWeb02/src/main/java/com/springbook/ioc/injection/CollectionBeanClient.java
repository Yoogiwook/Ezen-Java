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
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for(String add : addressList) {
			System.out.println(add.toString());
		}
		System.out.println("---List--------------");
		Set<String> addressList2 = bean.getAddressListSet();
		for(String add : addressList2) {
			System.out.println(add.toString());
		}
		System.out.println("---Set--------------");
		Map<String, String> addressList3 = bean.getAddressListMap();
		for(String add : addressList3.keySet()) {
			System.out.println(add+"," + addressList3.values());
		}
		System.out.println("---Map--------------");
		Properties addressList4 = bean.getAddressListProp();
		for(String add : addressList4.stringPropertyNames()) {
			System.out.println(add+","+addressList4.get(add));
		}
		System.out.println("---Properties--------------");
		factory.close();
	}

}
