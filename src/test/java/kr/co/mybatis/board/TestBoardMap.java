package kr.co.mybatis.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mybatis.mem2.dto.Mem2DTO;
import kr.co.mybatis.service.IMem2Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",	
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})

public class TestBoardMap {
	private static final Logger logger = LoggerFactory.getLogger(TestBoardMap.class);
	@Autowired private IMem2Service mem2Service = null;
	
	@Test
	public void write(){
		logger.debug("===> 드뎌 되냐?");
		
		Mem2DTO dto = new Mem2DTO();
		dto.setName("kim");
		dto.setEmail("a");
		
		mem2Service.view(dto);
	}
}
