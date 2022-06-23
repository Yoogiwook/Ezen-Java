package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> addressList;
	private Set<String> addressListSet;
	private Map<String, String> addressListMap;
	private Properties addressListProp;

	public Properties getAddressListProp() {
		return addressListProp;
	}

	public void setAddressListProp(Properties addressListProp) {
		this.addressListProp = addressListProp;
	}

	public Set<String> getAddressListSet() {
		return addressListSet;
	}

	public void setAddressListSet(Set<String> addressListSet) {
		this.addressListSet = addressListSet;
	}


	public Map<String, String> getAddressListMap() {
		return addressListMap;
	}

	public void setAddressListMap(Map<String, String> addressListMap) {
		this.addressListMap = addressListMap;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
}
