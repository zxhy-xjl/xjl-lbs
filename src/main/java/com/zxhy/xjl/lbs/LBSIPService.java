package com.zxhy.xjl.lbs;
/**
 * ip地址服务
 * @author leasonlive
 *
 */
public interface LBSIPService {
	/**
	 * 返回所在的城市的名称
	 * @param ip
	 * @return
	 */
	public CityInfo lookup(String ip);
}
