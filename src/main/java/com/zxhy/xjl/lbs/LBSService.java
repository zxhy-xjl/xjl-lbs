package com.zxhy.xjl.lbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * LBS服务
 * @author leasonlive
 *
 */
@Component
public class LBSService {
	@Autowired
	private LBSIPService ipService;
	@Autowired
	private LBSGeoService geoService;
	/**
	 * 根据IP地址返回所在的城市名称
	 * @param ip
	 * @return
	 */
	public CityInfo iplookup(String ip){
		return this.ipService.lookup(ip);
	}
	/**
	 * 根据经纬度得到这个经纬度的地名
	 * @param latlng JSON格式的经纬度坐标，如lat:31.325152,lng:120.558957
	 * @return
	 */
	public PoiInfo geocode(String latlng){
		return this.geoService.geocode(latlng);
	}
}
