package com.springbook.ioc.injection;

import java.util.*;

public class CollectionBean {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProperties;
	
	public CollectionBean() {
		System.out.println("CollectionBean");
	}
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
	public Properties getAddressProperties() {
		return addressProperties;
	}
}
