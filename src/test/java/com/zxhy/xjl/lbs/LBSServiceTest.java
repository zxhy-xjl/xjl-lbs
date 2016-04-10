package com.zxhy.xjl.lbs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-lbs.xml"})
public class LBSServiceTest {
	@Autowired
	private LBSService lbsService;
	@Test
	public void iplookup(){
		CityInfo cityInfo  = this.lbsService.iplookup("122.88.5.177");
		Assert.assertEquals("南京市", cityInfo.getCity());
	}
	public void geoCoding(){
		PoiInfo poiInfo = this.lbsService.geoCoding("lat:31.325152,lng:120.558957");
		Assert.assertEquals("苏州市", poiInfo.getCityInfo().getCity());
		Assert.assertEquals("江苏省苏州市虎丘区塔园路318号", poiInfo.getFormattedAddress());
	}
}
