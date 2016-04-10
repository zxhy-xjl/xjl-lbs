package com.zxhy.xjl.lbs;

public interface LBSGeoService {
	/**
	 * 根据经纬度得到这个经纬度的地名
	 * @param latlng JSON格式的经纬度坐标，如lat:31.325152,lng:120.558957
	 * @return
	 */
	public PoiInfo geoCoding(String latlng);
}
