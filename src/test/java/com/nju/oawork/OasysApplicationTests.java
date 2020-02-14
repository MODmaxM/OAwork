package com.nju.oawork;

import org.springframework.beans.factory.annotation.Autowired;

import com.nju.oawork.mappers.NoticeMapper;
import com.nju.oawork.services.inform.InformService;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OasysApplicationTests {
	
	@Autowired
	private NoticeMapper nm;
	
	@Autowired
	private InformService informService;
	
	

		
//		List<Map<String, Object>> list=informService.informList(listOne);
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}

	
	

}
