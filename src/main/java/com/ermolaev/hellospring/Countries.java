package com.ermolaev.hellospring;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;


public class Countries {
	
	private List<String> countryList;
	private Set<String> countrySet;
	private Map<Integer, String> countryMap;
	private Properties countryProps;
	
	public List<String> getCountryList() {
		System.out.println("Country List:" + countryList);
		return countryList;
	}
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}
	public Set<String> getCountrySet() {
		System.out.println("Country Set: " + countrySet);
		return countrySet;
	}
	public void setCountrySet(Set<String> countrySet) {
		this.countrySet = countrySet;
	}
	public Map<Integer, String> getCountryMap() {
		System.out.println("Country Map: " + countryMap);
		return countryMap;
	}
	public void setCountryMap(Map<Integer, String> countryMap) {
		this.countryMap = countryMap;
	}
	public Properties getCountryProps() {
		System.out.println("Contry Properties: " + countryProps);
		return countryProps;
	}
	public void setCountryProps(Properties countryProps) {
		this.countryProps = countryProps;
	}
}
