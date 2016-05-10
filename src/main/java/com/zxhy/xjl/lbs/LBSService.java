package com.zxhy.xjl.lbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;
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
	public PoiInfo geoCoding(String latlng){
		return this.geoService.geoCoding(latlng);
	}
	/**
	 * 检查地址是否存在
	 * @param address
	 * @return
	 */
	public boolean checkAddress(String address){
		return true;
	}
	/**
	 * 根据输入的地址信息查找城市地址列表，给出可能正确的地址列表
	 * 类似于模糊查询
	 * @param address
	 * @return
	 */
	public List<String> findAddress(String address){
		List<String> correctAddressList = new ArrayList<String>();
		if (this.checkAddress(address)){
			correctAddressList.add(address);
		}
		return correctAddressList;
	}
}
