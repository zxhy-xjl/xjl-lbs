package com.zxhy.xjl.lbs;
/**
 * 城市信息
 * @author leasonlive
 *
 */
public class CityInfo {
	//国家，默认中国
	private String country;
	//省份
	private String province;
	//城市
	private String city;
	//区县
	private String district;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
}
