package com.zxhy.xjl.lbs;
/**
 * LBS信息
 * @author leasonlive
 *
 */
public class PoiInfo {
	
	//格式化地址
	private String formattedAddress;
	//城市信息
	private CityInfo cityInfo;
	//街道
	private String street;
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public CityInfo getCityInfo() {
		return cityInfo;
	}
	public void setCityInfo(CityInfo cityInfo) {
		this.cityInfo = cityInfo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
